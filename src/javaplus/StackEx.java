package javaplus;

import java.util.Stack;

public class StackEx {
    public static void main(String[] args) {
        Stack<String> s = new Stack<>();
        //push 데이터 삽입
        s.push("apple");
        s.push("banana");
        s.push("cherry");
        s.push("apfel");
        System.out.println(s);
        //pop : top의 데이터 삭제
        System.out.println("pop: "+ s.pop());
        System.out.println(s);
        //peek : top의 데이터 보기
        System.out.println("peek: "+s.peek());
        //search
        s.push("apfel");
        System.out.println(s.search("apfel"));
        System.out.println(s.search("a"));
    }
}
