package day03.Demo05;

/**
 * @author etouch
 * @create 2018-06-01 18:49
 * @desc
 **/
public class Student {
    private String name;
    private int age;
    private School school;

    public Student(String name, int age) {
        this.name=name;
        this.age = age;
    }

    public Student() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSchool(School school) {
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