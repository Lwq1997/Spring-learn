package day04.Demo06;

/**
 * @author etouch
 * @create 2018-06-06 20:54
 * @desc
 **/
public class Test {
    public static void main(String[] args) {
        BookFacadeCglib cglib = new BookFacadeCglib();
        BookFacadeImpl bookFacade = (BookFacadeImpl) cglib.getInstance(new BookFacadeImpl());
        bookFacade.addBook();
    }
}
