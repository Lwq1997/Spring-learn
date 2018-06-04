package day02.Demo07;

/**
 * @author etouch
 * @create 2018-06-04 14:46
 * @desc
 **/
public class Person {
    private String pname;
    private int page;

    public void setPname(String pname) {
        this.pname = pname;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getPname() {
        return pname;
    }

    public int getPage() {
        return page;
    }

    public int computeAge(){
        return page>25?25:page;
    }
    @Override
    public String toString() {
        return "Person{" +
                "pname='" + pname + '\'' +
                ", page=" + page +
                '}';
    }
}
