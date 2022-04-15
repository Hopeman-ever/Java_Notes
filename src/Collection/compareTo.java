package Collection;

import java.util.Set;
import java.util.TreeMap;

public class compareTo {
    public static void main(String[] args) {
        TreeMap<Person, String> pdata = new TreeMap<>();
        pdata.put(new Person("张三", 30), "zhangsan");
        pdata.put(new Person("李四", 20), "lisi");
        pdata.put(new Person("王五", 10), "wangwu");
        pdata.put(new Person("小红", 5), "xiaohong");
        Set<Person> keys = pdata.keySet();
        for (Person key :
                keys) {
            System.out.println(key.getAge() + "_" + key.getName());
        }
    }
}
