package day01.Demo05;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author etouch
 * @create 2018-06-01 15:15
 * @desc
 **/
public class MyTest {
    @Test
    public void test01() {
        ApplicationContext context = new ClassPathXmlApplicationContext("day01/Demo05/applicationContext.xml");
        ISomeService service1 = (ISomeService) context.getBean("someService1");
        String result1 = service1.doFirst();
        System.out.println(result1);
        service1.doSecond();
        System.out.println("----------------------");
        ISomeService service2 = (ISomeService) context.getBean("someService2");
        String result2 = service2.doFirst();
        System.out.println(result2);
        service2.doSecond();
    }
}
