package javaplus;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
    public static void main(String[] args) {
        Queue<String>q = new LinkedList();
        //add 삽입
        q.add("apple");
        q.add("banana");
        q.add("tomato");
        q.add("grape");
        q.add("orange");
        //element 첫번째 (front)데이터 반환
        System.out.println(q.element());
        //remove 첫번째(front) 데이터 삭제후 반환
        System.out.println(q.remove());
        System.out.println(q);
        //offer == add
        q.offer("apple");
        q.offer("peach");
        System.out.println(q);
        //peak 첫번째(front) 데이터 반환
        System.out.println(q.peek());
        System.out.println(q);
        //poll 첫번째(front) 데이터 삭제후 반환
        System.out.println(q.poll());
    }
}
