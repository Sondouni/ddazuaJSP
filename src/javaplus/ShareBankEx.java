package javaplus;

public class ShareBankEx {
    public static void main(String[] args) {
        ATM atm = new ATM();
        Thread mom = new Thread(atm,"엄마");
        Thread son = new Thread(atm,"아들");

        mom.start();
        son.start();
    }
}
class ATM implements Runnable{
    int money = 100000;

    @Override
    public void run() {
        for(int i=0;i<50;i++){
            withdraw(1000);
            printInfo();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    synchronized void withdraw(int money){
        Thread.yield();
        this.money -= money;
        System.out.println(Thread.currentThread().getName()+"");
    }
    void printInfo(){
        System.out.println("현재잔액: "+money);
    }
}
