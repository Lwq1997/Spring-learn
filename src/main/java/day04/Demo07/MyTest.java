package day04.Demo07;

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
        ApplicationContext context = new ClassPathXmlApplicationContext("/day04/Demo07/applicationContext.xml");
        ISomeService service = (ISomeService) context.getBean("serviceProxy");
        service.doFirst();
        System.out.println("-----------------");
        service.doSecond();
        System.out.println("------------------");
        service.doThird();
    }
}
