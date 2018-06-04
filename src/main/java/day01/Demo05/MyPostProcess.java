package day01.Demo05;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author etouch
 * @create 2018-06-01 16:17
 * @desc
 **/
public class MyPostProcess implements BeanPostProcessor {

    //Object：当前调用我这个Bean后处理器的Bean对象
    //String：上面这个bean对象的id
    //这个类的作用就是加强Bean对象，加强之后需要return回去，否则之后就引用不到这个对象了
    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println("我之前执行");
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println("我之后执行");
        Object proxy = null;
        if("someService1".equals(s)){
            proxy =Proxy.newProxyInstance(o.getClass().getClassLoader(), o.getClass().getInterfaces(), new InvocationHandler() {
                @Override
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    Object result = method.invoke(o,args);
                    if(result!=null){
                        result = ((String)result).toUpperCase();
                    }
                    return result;
                }
            });
            return proxy;
        }
       return o;
    }
}
