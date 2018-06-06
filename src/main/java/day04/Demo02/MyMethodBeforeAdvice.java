package day04.Demo02;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author etouch
 * @create 2018-06-06 18:41
 * @desc
 **/
//前置通知
public class MyMethodBeforeAdvice implements MethodBeforeAdvice {
    //在目标方法执行之前执行
    //method：目标方法
    //objects：方法参数
    //o ： 目标对象
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("执行前置通知方法");
    }
}
