package day02.Demo03;

import java.util.*;

/**
 * @author etouch
 * @create 2018-06-04 12:31
 * @desc
 **/
public class Some {
    private School[] schools;
    private List<String> myList;
    private Set<String> mySet;
    private Map<String,Object> myMap;
    private Properties myPro;   //键值都是字符串

    public void setSchools(School[] schools) {
        this.schools = schools;
    }

    public void setMyList(List<String> myList) {
        this.myList = myList;
    }

    public void setMySet(Set<String> mySet) {
        this.mySet = mySet;
    }

    public void setMyMap(Map<String, Object> myMap) {
        this.myMap = myMap;
    }

    public void setMyPro(Properties myPro) {
        this.myPro = myPro;
    }

    @Override
    public String toString() {
        return "Some{" +
                "schools=" + Arrays.toString(schools) +
                ", myList=" + myList +
                ", mySet=" + mySet +
                ", myMap=" + myMap +
                ", myPro=" + myPro +
                '}';
    }
}
