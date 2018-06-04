package day01.Demo07;

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
        ApplicationContext context = new ClassPathXmlApplicationContext("day01/Demo07/applicationContext.xml");
        ISomeService service1 = (ISomeService) context.getBean("someService");
        service1.doFirst();
        ((ClassPathXmlApplicationContext) context).close();
    }
}
