package day04.Demo01;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author etouch
 * @create 2018-06-01 15:15
 * @desc
 **/
public class MyTest {
    @Test
    public void test01() {
        ISomeService target = new SomeServiceImpl();
        ISomeService service = (ISomeService) Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        SystemService.doTx();
                        Object result = method.invoke(target,args);
                        SystemService.doLog();
                        return result;
                    }
                }
        );
        service.doFirst();
        System.out.println("------------------------------");
        service.doSecond();
    }
}
