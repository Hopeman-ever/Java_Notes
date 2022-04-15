package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class Comparator {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(-1);
        list.add(3);
        list.add(3);
        list.add(-5);
        list.add(7);
        list.add(4);
        list.add(-9);
        list.add(-7);
        System.out.println("原始数组：");
        System.out.println(list);
        Collections.reverse(list);
        System.out.println("逆序：");
        System.out.println(list);
        Collections.sort(list);
        System.out.println("自然排序：");
        System.out.println(list);
        Collections.sort(list, new java.util.Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println("定制排序：");
        System.out.println(list);
    }
}
