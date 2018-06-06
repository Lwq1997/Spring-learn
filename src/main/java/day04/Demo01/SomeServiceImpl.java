package day04.Demo01;

/**
 * @author etouch
 * @create 2018-06-06 17:54
 * @desc
 **/
public class SomeServiceImpl implements ISomeService {
    @Override
    public void doFirst() {
        System.out.println("执行主业务逻辑first");
    }

    @Override
    public void doSecond() {
        System.out.println("执行主业务逻辑second");
    }

}
