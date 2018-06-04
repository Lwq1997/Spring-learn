package day02.Demo09;

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
        ApplicationContext context = new ClassPathXmlApplicationContext("day02/Demo09/applicationContext.xml");
        Student student1 = (Student) context.getBean("mystudent1");
        Student student2 = (Student) context.getBean("mystudent2");
//        Student baseStudent = (Student) context.getBean("baseStudent");   //这个抽象的不能被直接拿过来

        System.out.println(student2);
        System.out.println(student1);
    }
}
