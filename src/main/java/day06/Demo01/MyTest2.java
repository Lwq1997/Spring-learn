package day06.Demo01;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author etouch
 * @create 2018-06-07 17:32
 * @desc
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "applicationContext.xml")
public class MyTest2 {
    @Autowired
    private StudentServiceImpl service;
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
    @Test
    public void testFindAllStudentNames(){
        List<String> names = service.findAllStudentsNames();
        System.out.println(names);
    }
    @Test
    public void testFindStudentNameById(){
        String name = service.findStudentNameById(3);
        System.out.println(name);
    }
    @Test
    public void testSelectAllStudentNames(){
        List<Student> students = service.findAllStudents();
        for (Student student:students){
            System.out.println(student.toString());
        }
    }
    @Test
    public void testSelectStudentNameById(){
        Student student = service.findStudentById(3);
        System.out.println(student.toString());
    }
}
