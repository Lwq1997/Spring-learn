package day01.Demo01;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * @author etouch
 * @create 2018-06-01 15:15
 * @desc
 **/
public class MyTest {
    @Test
    public void test01() {
        ISomeService service = new SomeServiceImpl();
        service.doFirst();
        service.doSecond();
    }

    @Test
    public void test02(){
        //创建spring配置文件，这里的配置文件默认存放在src下
        ApplicationContext context = new ClassPathXmlApplicationContext("day01/Demo01/applicationContext.xml");
        //从容器中得到指定对象
        ISomeService servic = (ISomeService) context.getBean("someService");
        servic.doFirst();
        servic.doSecond();
    }

    @Test
    public void test03(){
        //这里的配置文件默认存放在项目下
        ApplicationContext context = new FileSystemXmlApplicationContext("");

    }

    @Test
    public void test04(){
        //加载配置文件之后，没有new出bean对象，而是在真正使用的时候才创建的（延迟加载）
        BeanFactory factory = new XmlBeanFactory(new ClassPathResource("day01/Demo01/applicationContext.xml"));
        ISomeService service = (ISomeService) factory.getBean("someService");
        service.doSecond();
        service.doFirst();
    }

    @Test
    public void test05(){

    }
}
