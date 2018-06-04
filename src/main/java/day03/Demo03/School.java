package day03.Demo03;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author etouch
 * @create 2018-06-01 18:53
 * @desc
 **/

//和Component具有相同功能的，不同意义的注解还有三个
//    1.@Repository:注解在Dao实现类上
//    2.@Service:注解在Service实现类上
//    3.@Controller:直接在处理器上
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
