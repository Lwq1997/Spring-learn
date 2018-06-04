package day01.Demo03;

/**
 * @author etouch
 * @create 2018-06-01 15:53
 * @desc
 **/
public class ServiceFactory {
    public static ISomeService getSomeService(){
        return new SomeServiceImpl();
    }
}
