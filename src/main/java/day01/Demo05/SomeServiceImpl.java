package day01.Demo05;


/**
 * @author etouch
 * @create 2018-06-01 15:13
 * @desc
 **/
public class SomeServiceImpl implements ISomeService {

    public SomeServiceImpl() {
        System.out.println("--------------");
    }

    @Override
    public String doFirst() {
        System.out.println("damo05执行first");
        return "abcde";
    }

    @Override
    public void doSecond() {
        System.out.println("damo05执行second");
    }
}
