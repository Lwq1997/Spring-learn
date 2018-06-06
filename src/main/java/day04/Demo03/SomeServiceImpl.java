package day04.Demo03;


/**
 * @author etouch
 * @create 2018-06-06 17:54
 * @desc
 **/
public class SomeServiceImpl{
    public String  doFirst() {
        System.out.println("执行主业务逻辑first");
        return "abc";
    }

    public void doSecond() {
        System.out.println("执行主业务逻辑second");
    }

}
