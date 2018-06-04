package day03.Demo05;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author etouch
 * @create 2018-06-04 20:07
 * @desc
 **/
@Configuration
public class MyJavaConfig {

    //这个Bean的name要和Student中的School属性的属性名一样
    @Bean(name = "school")
    public School mySchoolCreator(){
        return new School("北京大学");
    }
    @Bean(name = "myStudent",autowire = Autowire.BY_NAME)
    public Student myStudentCreator(){
        return new Student("李四",24);
    }
}
