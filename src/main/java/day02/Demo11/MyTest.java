package day02.Demo11;

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

//        ApplicationContext context = new
//                ClassPathXmlApplicationContext("day02/Demo11/Spring-*.xml");
        ApplicationContext context = new
                ClassPathXmlApplicationContext("day02/Demo11/Spring-base.xml","day02/Demo11/Spring-beans.xml");
        Student student = (Student) context.getBean("mystudent");
        Teacher teacher = (Teacher) context.getBean("myteacher");

        System.out.println(teacher);
        System.out.println(student);
    }
}
