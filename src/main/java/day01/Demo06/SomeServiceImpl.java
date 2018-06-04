package day01.Demo06;


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
        System.out.println("damo06执行first");
        return "abcde";
    }

    @Override
    public void doSecond() {
        System.out.println("damo06执行second");
    }

    public void initAfter(){
        System.out.println("初始化之后");
    }

    public void preDestory(){
        System.out.println("销毁之前");
    }
}
