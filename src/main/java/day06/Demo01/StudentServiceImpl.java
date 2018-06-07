package day06.Demo01;

import java.util.List;

/**
 * @author etouch
 * @create 2018-06-07 13:08
 * @desc
 **/
public class StudentServiceImpl implements IStudentService {

    private IStudentDao dao;

    public void setDao(IStudentDao dao) {
        this.dao = dao;
    }

    @Override
    public void addStudent(Student student) {
        dao.insertStudent(student);
    }

    @Override
    public void removeStudent(Student student) {
        dao.deleteStudent(student);
    }

    @Override
    public void modifyStudent(Student student) {
        dao.updateStudent(student);
    }

    @Override
    public List<String> findAllStudentsNames() {
        return dao.selectAllStudentsNames();
    }

    @Override
    public String findStudentNameById(int id) {
        return dao.selectStudentNameById(id);
    }

    @Override
    public List<Student> findAllStudents() {
        return dao.selectAllStudents();
    }

    @Override
    public Student findStudentById(int id) {
        return dao.selectStudentById(id);
    }
}
