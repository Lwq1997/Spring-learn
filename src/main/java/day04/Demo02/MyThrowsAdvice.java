package day04.Demo02;

import org.springframework.aop.ThrowsAdvice;

/**
 * @author etouch
 * @create 2018-06-06 19:10
 * @desc
 **/
//异常通知
public class MyThrowsAdvice implements ThrowsAdvice {
    public void afterThrowing(Exception ex){
        System.out.println("执行异常通知"+ex.getMessage());
    }
}
