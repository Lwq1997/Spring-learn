package day04.Demo08;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @author etouch
 * @create 2018-06-06 18:41
 * @desc
 **/
//后置通知
public class MyAfterReturningAdvice implements AfterReturningAdvice {
    //在目标方法执行之前执行
    //method：目标方法
    //objects：方法参数
    //target ： 目标对象
    //returnValue:返回值
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] objects, Object target) throws Throwable {
        System.out.println("我是后置方法");
    }
}
