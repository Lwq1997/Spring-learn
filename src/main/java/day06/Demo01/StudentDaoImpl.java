package day06.Demo01;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.util.List;

/**
 * @author etouch
 * @create 2018-06-07 14:05
 * @desc
 **/
public class StudentDaoImpl extends JdbcDaoSupport implements IStudentDao {
    @Override
    public void insertStudent(Student student) {
        String sql = " insert into user(name,age) values(?,?) ";
        this.getJdbcTemplate().update(sql,student.getName(),student.getAge());
    }

    @Override
    public void deleteStudent(Student student) {
        String sql = "delete from user where id = ?";
        this.getJdbcTemplate().update(sql,student.getId());
    }

    @Override
    public void updateStudent(Student student) {
        String sql = "update user set name = ? , age = ? where id  = ?";
        this.getJdbcTemplate().update(sql,student.getName(),student.getAge(),student.getId());
    }

    @Override
    public List<String> selectAllStudentsNames() {
        String sql = "select name from user ";
        return this.getJdbcTemplate().queryForList(sql,String.class);
    }

    @Override
    public String selectStudentNameById(int id) {
        String sql = "select name from user where id = ?";
        return this.getJdbcTemplate().queryForObject(sql,String.class,id);
    }

    @Override
    public List<Student> selectAllStudents() {
        String sql = "select * from user ";
        return this.getJdbcTemplate().query(sql, new StudentRowMapper());
    }

    @Override
    public Student selectStudentById(int id) {
        String sql = "select * from user where id = ?";
        return (Student) this.getJdbcTemplate().queryForObject(sql,new StudentRowMapper(),id);
    }
}
