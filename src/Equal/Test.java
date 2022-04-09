package Equal;

public class Test {
    public static void main(String[] args) {
       // 基本数据类型
        int a = 3;
        int c = 3;
        System.out.println(a == c);//(true)
        String s1 = new String("adcs");
        String s2 = new String("adcs");
        System.out.println(s1 == s2); //(false)
        System.out.println(s1.equals(s2));//true
        //equals未重写 类似于==
        Person p1 = new Person(3, 3, "adcs", "adcs");
        Person p2 = new Person(3, 3, "adcs", "adcs");
        System.out.println(p1.equals(p2));//false
        //equals重写
        String a1 = "adad"; //放在常量池
        String a2 = "adad"; //从常量池查找，存在相同，地址
        System.out.println(a1.equals(a2));//true
        System.out.println(a1==a2);
    }
}
