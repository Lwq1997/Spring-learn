package day06.Demo01;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author etouch
 * @create 2018-06-07 19:17
 * @desc
 **/
public class StudentRowMapper implements RowMapper {
    //resultSet：不是select查询的所有结果集，而是这个结果集中的一行
    @Override
    public Student mapRow(ResultSet resultSet, int roeNum) throws SQLException {
        Student student = new Student();
        student.setId(resultSet.getInt("id"));
        student.setName(resultSet.getString("name"));
        student.setAge(resultSet.getInt("age"));
        return student;
    }
}
