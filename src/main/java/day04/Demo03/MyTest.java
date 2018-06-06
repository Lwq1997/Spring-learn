package day04.Demo03;

import day04.Demo02.ISomeService;
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
        ApplicationContext context = new ClassPathXmlApplicationContext("/day04/Demo03/applicationContext.xml");
        SomeServiceImpl service = (SomeServiceImpl) context.getBean("serviceProxy");
        String res = service.doFirst();
        System.out.println("doFirst的返回值："+res);
        service.doSecond();
    }
}
