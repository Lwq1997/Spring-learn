package day01.Demo03;


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
        System.out.println("damo03执行first");
        return "abcde";
    }

    @Override
    public String doSecond() {
        System.out.println("damo03执行second");
        return "abcde";
    }
}
