package day04.Demo02;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author etouch
 * @create 2018-06-06 18:41
 * @desc
 **/
//环绕通知
    //可以获取到目标方法的返回值
public class MyMethodInterceptor implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("执行环绕通知，目标方法之前");
        Object result = methodInvocation.proceed();
        if(result!=null){
            result = result.toString().toUpperCase();
        }
        System.out.println("执行环绕通知，目标方法之后");
        return result;
    }
}
