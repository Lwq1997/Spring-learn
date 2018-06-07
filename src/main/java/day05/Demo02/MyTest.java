package day05.Demo02;

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
        ApplicationContext context = new ClassPathXmlApplicationContext("/day05/Demo02/applicationContext.xml");
        ISomeService service = (ISomeService) context.getBean("someService");
        service.doFirst();
        System.out.println("-----------------");
        service.doSecond();
        System.out.println("------------------");
        String result = service.doThird();
        System.out.println("执行环绕之后third方法的结果是：" + result);
        System.out.println("------------------");
        service.doFourth();
        System.out.println("------------------");
        System.out.println("如果第四个方法抛出异常，则最终方法不执行");
        service.doFifth();
    }
}
