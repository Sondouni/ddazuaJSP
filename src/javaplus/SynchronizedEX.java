package javaplus;

public class SynchronizedEX {
    public static void main(String[] args) {
        MyTHreadA s1 = new MyTHreadA();
        Thread t1 = new Thread(s1,"A");
        Thread t2 = new Thread(s1,"B");
        Thread t3 = new Thread(s1,"C");

        t1.start();
        t2.start();
        t3.start();
    }
}
class MyTHreadA implements Runnable{
    Ticketing ticket = new Ticketing();
    @Override
    public void run() {
        ticket.ticketing();
    }
}
class Ticketing{
    int ticketingNum = 1;
    public void ticketing(){
        synchronized (this) {
            if (ticketingNum > 0) {
                System.out.println(Thread.currentThread().getName() + "가 티켓팅 성공");
                ticketingNum--;
            } else {
                System.out.println(Thread.currentThread().getName() + "가 티켓팅 실패");
            }
            System.out.println(Thread.currentThread().getName() + "가 티켓팅 시도후 티켓수:" + ticketingNum);
        }
    }
}
