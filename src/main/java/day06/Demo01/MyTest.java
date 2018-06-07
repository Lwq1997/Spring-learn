package day06.Demo01;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author etouch
 * @create 2018-06-07 17:32
 * @desc
 **/
public class MyTest {
    private StudentServiceImpl service;
    @Before
    public void before(){
        ApplicationContext context = new ClassPathXmlApplicationContext("day06/Demo01/applicationContext.xml");
        service = (StudentServiceImpl) context.getBean("studentService");
    }
    @Test
    public void testAdd(){
        Student student = new Student("你好",21);
        service.addStudent(student);
    }
    @Test
    public void testRemove(){
        Student student = new Student("你好",21);
        student.setId(1);
        service.removeStudent(student);
    }
    @Test
    public void testModify(){
        Student student = new Student("李四",21);
        student.setId(3);
        service.modifyStudent(student);
    }

}
