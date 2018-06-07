package day04.Demo09;


/**
 * @author etouch
 * @create 2018-06-06 17:54
 * @desc
 **/
public class SomeServiceImpl implements ISomeService {
    public void doFirst() {
        System.out.println("执行主业务逻辑first");
    }

    public void doSecond() {
        System.out.println("执行主业务逻辑second");
    }

    @Override
    public void doThird() {
        System.out.println("执行主业务逻辑third");
    }

}
