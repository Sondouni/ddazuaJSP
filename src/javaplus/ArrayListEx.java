package javaplus;

import java.util.ArrayList;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(10);
        list1.add("A");
        list1.add("C");
        list1.add("E");
        list1.add("D");
        list1.add("F");
        list1.add("G");
        list1.add("H");
        System.out.println("초기상태");
        System.out.println(list1);

        System.out.println("인덱스1위치에 B추가");
        list1.add(1,"B");
        System.out.println(list1);

        System.out.println("인덱스 2위치의 값 삭제");
        list1.remove(2);
        System.out.println(list1);

        System.out.println("인덱스 2위치의값  :"+list1.get(2));
    }
}
