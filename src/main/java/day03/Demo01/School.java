package day03.Demo01;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author etouch
 * @create 2018-06-01 18:53
 * @desc
 **/
@Component("mySchool")
public class School {
    @Value("清华大学")
    private String name;

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
