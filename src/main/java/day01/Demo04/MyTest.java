package day01.Demo04;

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
        ApplicationContext context = new ClassPathXmlApplicationContext("day01/Demo04/applicationContext.xml");
        ISomeService service = (ISomeService) context.getBean("someService");
        service.doFirst();
        service.doSecond();
    }

    @Test
    //原型模式下   scope="prototype"        真正使用的时候创建，每获取一次,就创建一次
    public void test02(){
        ApplicationContext context = new ClassPathXmlApplicationContext("day01/Demo04/applicationContext.xml");
        ISomeService service1 = (ISomeService) context.getBean("someService");
        ISomeService service2 = (ISomeService) context.getBean("someService");
        System.out.println(service1);
        System.out.println(service2);
    }

    @Test
    //单例模式下         scope="singleton"   容器初始化的时候创建
    public void test03(){
        ApplicationContext context = new ClassPathXmlApplicationContext("day01/Demo04/applicationContext.xml");
        ISomeService service1 = (ISomeService) context.getBean("someService");
        ISomeService service2 = (ISomeService) context.getBean("someService");
        System.out.println(service1);
        System.out.println(service2);
    }

}
