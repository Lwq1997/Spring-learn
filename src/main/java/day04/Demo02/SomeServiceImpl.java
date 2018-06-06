package day04.Demo02;

/**
 * @author etouch
 * @create 2018-06-06 17:54
 * @desc
 **/
public class SomeServiceImpl implements ISomeService {
    @Override
    public String  doFirst() {
        System.out.println("执行主业务逻辑first"+3/0);
        return "abc";
    }

    @Override
    public void doSecond() {
        System.out.println("执行主业务逻辑second");
    }

}
