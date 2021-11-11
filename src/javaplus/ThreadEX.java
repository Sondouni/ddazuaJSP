package javaplus;

public class ThreadEX {
    public static void main(String[] args) {
        //JVM스레드 요청
        MyThread mt1 = new MyThread();
        mt1.start();
        MyThread2 mt2 = new MyThread2();
        Thread t = new Thread(mt2);
        t.start();

        for(int i = 0;i<10;i++){
            System.out.println("메인함수 진행중!"+i);
        }
    }
}
// 1) thread 클래스를 상속받아 작업을 구현
class MyThread extends Thread{
    //run()메소드 오버라이딩
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("스레드 진행중"+i);
        }
    }
}
// 2) Rannable 인터페이스를 구현하여 작업을 구현
class MyThread2 implements Runnable{

    @Override
    public void run() {
        for(int i = 0;i<10;i++){
            System.out.println("러너블 진행중"+i);
        }
    }
}

