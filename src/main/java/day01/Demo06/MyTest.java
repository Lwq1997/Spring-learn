package day01.Demo06;

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
        ApplicationContext context = new ClassPathXmlApplicationContext("day01/Demo06/applicationContext.xml");
        ISomeService service1 = (ISomeService) context.getBean("someService");
        ISomeService service2 = (ISomeService) context.getBean("someService");
        System.out.println(service1);
        System.out.println(service2);
        String result1 = service1.doFirst();
        System.out.println(result1);
        service1.doSecond();
        //销毁方法的执行有俩要求：
        //1.被销毁的对象是单例的
        //2.容器被显示的关闭
        ((ClassPathXmlApplicationContext) context).close();
    }
}
