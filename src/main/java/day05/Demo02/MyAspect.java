package day05.Demo02;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @author etouch
 * @create 2018-06-07 10:33
 * @desc
 **/
//标志当前类是切面
public class MyAspect {
    //切入点表达式
    //前置通知
    public void before(){
        System.out.println("前置通知方法");
    }
    public void before(JoinPoint joinPoint){
        System.out.println("前置通知方法 jp :" + joinPoint);
    }

//    后置通知
    public void afterReturning(JoinPoint joinPoint){
        System.out.println("后置通知方法 jp" + joinPoint);
    }
    public void afterReturning(String result){
        System.out.println("后置通知方法 result " + result.toUpperCase());
    }

    //环绕通知
    public Object around(ProceedingJoinPoint point) throws Throwable {
        System.out.println("环绕通知方法   目标方法执行之前" );
        //执行目标方法
        Object result = point.proceed();
        System.out.println("环绕通知方法   目标方法执行之后" );
        return result.toString().toUpperCase();
    }

    //异常通知
    public void afterThrowing(Exception ex) {
        System.out.println("异常通知方法 ex : " + ex.getMessage() );
    }

    //最终通知
    public void after(){
        System.out.println("最终通知方法");
    }

}
