package day01.Demo02;

/**
 * @author etouch
 * @create 2018-06-01 15:53
 * @desc
 **/
public class ServiceFactory {
    public ISomeService getSomeService(){
        return new SomeServiceImpl();
    }
}
