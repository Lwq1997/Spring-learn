package day01.Demo09;

/**
 * @author etouch
 * @create 2018-06-01 18:49
 * @desc
 **/
public class Student {
    private String name;
    private int age;
    private School school;

    public Student(String name, int age, School school) {
        this.name = name;
        this.age = age;
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}
