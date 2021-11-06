package javaplus;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add("demon");
        hs.add("demon");
        hs.add("demon");
        System.out.println(hs.add("demon"));;//false가 나옴
        hs.add("banana");
        hs.add("banana");
        hs.add("tomato");
        hs.add("apple");
        hs.add("cargoo");

        TreeSet ts = new TreeSet();
        ts.add("demon");
        ts.add("banana");
        ts.add("tomato");
        ts.add("apple");
        ts.add("cargoo");

        Iterator it = hs.iterator();
        System.out.println("<HashSet출력>");
        while (it.hasNext()){
            System.out.print(" "+it.next());
        }
        System.out.println();
        Iterator it2 = ts.iterator();
        System.out.println("<TreeSET출력>");
        while (it2.hasNext()){
            System.out.print(" "+it2.next());
        }
        System.out.println();
        System.out.println("현재 TreeSet의 크기: "+ts.size());
    }
}
