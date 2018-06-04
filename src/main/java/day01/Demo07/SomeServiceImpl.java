package day01.Demo07;


import com.sun.media.jfxmediaimpl.MediaDisposer;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

/**
 * @author etouch
 * @create 2018-06-01 15:13
 * @desc
 **/
public class SomeServiceImpl implements DisposableBean,ISomeService,BeanNameAware,BeanFactoryAware,InitializingBean {

    private String adao;
    private String bdao;

    public void setAdao(String adao) {

        System.out.println("step 2 : 执行seta");
        this.adao = adao;
    }

    public void setBdao(String bdao) {

        System.out.println("step 2 : 执行setb");
        this.bdao = bdao;
    }

    public SomeServiceImpl() {
        System.out.println("step 1 : 对象的创建");
    }

    @Override
    public String doFirst() {
        System.out.println("step 9 ： damo07执行first，主业务方法");
        return "abcde";
    }

    @Override
    public void doSecond() {
        System.out.println("damo07执行second");
    }

    public void initAfter(){
        System.out.println("step 7 ： 初始化之后");
    }

    public void preDestory(){
        System.out.println("step 11 ：销毁之前");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("step 3 : beanName : "+s);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("step 4 : 获取到BeanFactory容器： "+beanFactory);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("step 6 : bean初始化完毕 ");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("step 10 ： 准备开始销毁");
    }
}
