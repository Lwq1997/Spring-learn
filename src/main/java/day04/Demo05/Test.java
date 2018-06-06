package day04.Demo05;

/**
 * @author etouch
 * @create 2018-06-06 20:41
 * @desc
 **/
public class Test {
    public static void main(String[] args) {
        //实例化目标对象
        UserService userService = new UserServiceImpl();
        MyInvocationHandler invocationHandler = new MyInvocationHandler(userService);
        //动态生成的代理对象
        UserService proxy = (UserService) invocationHandler.getProxy();
        proxy.add();
    }
}
