package day03.Demo02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author etouch
 * @create 2018-06-01 18:49
 * @desc
 **/
@Component("myStudent")
public class Student {
    @Value("张三")
    private String name;
    @Value("23")
    private int age;

    @Autowired
    @Qualifier("mySchool")      // byName自动注入,两个注解要一起用
    private School school;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}
