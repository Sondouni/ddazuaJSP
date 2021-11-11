package javaplus;

public class MainThread {
    public static void main(String[] args) {
        System.out.println("스레드의 이름"+Thread.currentThread().getName());
        System.out.println("스레드의 상태"+Thread.currentThread().getState());
        System.out.println("스레드의 우선순위"+Thread.currentThread().getPriority());
        ThreadTest tt = new ThreadTest();
        tt.start();

    }
}
class ThreadTest extends Thread{
    public void run(){
        this.setName("Thread테스트");
        System.out.println("스레드의 이름"+Thread.currentThread().getName());
        System.out.println("스레드의 상태"+Thread.currentThread().getState());
        System.out.println("스레드의 우선순위"+Thread.currentThread().getPriority());
    }
}
