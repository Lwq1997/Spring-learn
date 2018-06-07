package day05.Demo01;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * @author etouch
 * @create 2018-06-07 10:33
 * @desc
 **/
//标志当前类是切面
@Aspect
public class MyAspect {
    //切入点表达式
    //前置通知
    @Before("execution(* *..ISomeService.doFirst(..))")
    public void before(){
        System.out.println("前置通知方法");
    }
    @Before("execution(* *..ISomeService.doFirst(..))")
    public void before(JoinPoint joinPoint){
        System.out.println("前置通知方法 jp" + joinPoint);
    }
//    后置通知
    @AfterReturning("execution(* *..ISomeService.doSecond(..))")
    public void after(JoinPoint joinPoint){
        System.out.println("后置通知方法 jp" + joinPoint);
    }
    @AfterReturning(value = "execution(* *..ISomeService.doSecond(..))",returning="result")
    public void after(String result){
        System.out.println("后置通知方法 result " + result.toUpperCase());
    }

    //环绕通知
    @Around("execution(* *..ISomeService.doThird(..))")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        System.out.println("环绕通知方法   目标方法执行之前" );
        //执行目标方法
        Object result = point.proceed();
        System.out.println("环绕通知方法   目标方法执行之后" );
        return result.toString().toUpperCase();
    }

    //异常通知
    @AfterThrowing(value = "execution(* *..ISomeService.doFourth(..))",throwing = "ex")
    public void afterThrowing(Exception ex) {
        System.out.println("异常通知方法 ex : " + ex.getMessage() );
    }

    //最终通知
    @After("execution(* *..ISomeService.doFifth(..))")
    public void after1(){
        System.out.println("最终通知方法");
    }

    //定义切入点,可以用来替代表达式
    @Pointcut("execution(* *..ISomeService.doThird(..))")
    public void doThridPointcut(){}

    //最终通知
    @After("doThridPointcut()")
    public void after2(){
        System.out.println("最终通知方法");
    }
}
