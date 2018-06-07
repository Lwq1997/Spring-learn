package day04.Demo10;

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
        ApplicationContext context = new ClassPathXmlApplicationContext("/day04/Demo10/applicationContext.xml");
        ISomeService service = (ISomeService) context.getBean("someService");
        service.doFirst();
        System.out.println("-----------------");
        service.doSecond();
        System.out.println("------------------");
        service.doThird();
        System.out.println("##############################");
        ISomeService service2 = (ISomeService) context.getBean("someService2");
        service2.doFirst();
        System.out.println("-----------------");
        service2.doSecond();
        System.out.println("------------------");
        service2.doThird();
    }
}
