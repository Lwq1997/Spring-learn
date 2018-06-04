package day01.Demo08;

/**
 * @author etouch
 * @create 2018-06-01 18:49
 * @desc
 **/
public class Student {
    private String name;
    private int age;
    private School school;

    public void setName(String name) {
        System.out.println("容器调用setname方法");
        this.name = name;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public void setAge(int age) {
        System.out.println("容器调用setage方法");
        this.age = age;
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
