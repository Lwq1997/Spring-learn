package day03.Demo05;


/**
 * @author etouch
 * @create 2018-06-01 18:53
 * @desc
 **/


public class School {
    private String name;

    public School() {
    }

    public School(String name) {
        this.name=name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                '}';
    }
}
