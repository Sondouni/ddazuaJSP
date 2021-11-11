package javaplus;

public class ThreadSleepEx {
    public static void main(String[] args) {
        SleepThread t = new SleepThread();
        t.start();
    }
}
class SleepThread extends Thread{
    public void run(){
        System.out.println("카운트 다운 5초");
        for(int i=5;i>=0;i--){
            System.out.println(i);
            if(i!=0){
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                }
            }
        }
        System.out.println("종료");
    }
}
