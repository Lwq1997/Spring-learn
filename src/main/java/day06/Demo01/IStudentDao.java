package day06.Demo01;

import java.util.List;

/**
 * @author etouch
 * @create 2018-06-07 13:09
 * @desc
 **/
public interface IStudentDao {
    void insertStudent(Student student);
    void deleteStudent(Student student);
    void updateStudent(Student student);

    List<String> selectAllStudentsNames();
    String selectStudentNameById(int id);

    List<Student> selectAllStudents();
    Student selectStudentById(int id);
}
