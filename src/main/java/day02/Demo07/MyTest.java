package day02.Demo07;

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
        ApplicationContext context = new ClassPathXmlApplicationContext("day02/Demo07/applicationContext.xml");
        Student student = (Student) context.getBean("mystudent");
        Person person = (Person) context.getBean("person");
        System.out.println(person);
        System.out.println(student);
    }
}
