package day04.Demo02;

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
        ApplicationContext context = new ClassPathXmlApplicationContext("/day04/Demo02/applicationContext.xml");
        ISomeService service = (ISomeService) context.getBean("serviceProxy");
        String res = service.doFirst();
        System.out.println("doFirst的返回值："+res);
        service.doSecond();
    }
}
