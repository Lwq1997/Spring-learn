package day02.Demo07;


/**
 * @author etouch
 * @create 2018-06-01 18:49
 * @desc
 **/
public class Student {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age + "}";
    }
}
