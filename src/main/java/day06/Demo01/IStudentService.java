package day06.Demo01;

import java.util.List;

/**
 * @author etouch
 * @create 2018-06-07 13:05
 * @desc
 **/
public interface IStudentService {
    void addStudent(Student student);
    void removeStudent(Student student);
    void modifyStudent(Student student);

    List<String> findAllStudentsNames();
    String findStudentNameById(int id);

    List<Student> findAllStudents();
    Student findStudentById(int id);
}
