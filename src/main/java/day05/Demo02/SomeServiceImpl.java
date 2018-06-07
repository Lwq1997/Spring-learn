package day05.Demo02;


/**
 * @author etouch
 * @create 2018-06-06 17:54
 * @desc
 **/
public class SomeServiceImpl implements ISomeService {
    public void doFirst() {
        System.out.println("执行主业务逻辑first");
    }

    @Override
    public String doSecond() {
        System.out.println("执行主业务逻辑second");
        return "abc";
    }


    @Override
    public String doThird() {
        System.out.println("执行主业务逻辑third");
        return "def";
    }

    @Override
    public void doFourth() {
//        System.out.println("执行主业务逻辑fourth"+3/0);
        System.out.println("执行主业务逻辑fourth");
    }

    @Override
    public void doFifth() {
        System.out.println("执行主业务逻辑fifth");
}

}
