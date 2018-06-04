package day02.Demo08;

import day02.Demo07.Person;
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
        ApplicationContext context = new
                ClassPathXmlApplicationContext("day02/Demo08/applicationContext.xml");
        Student student = (Student) context.getBean("mystudent");
        System.out.println(student);
    }
}
