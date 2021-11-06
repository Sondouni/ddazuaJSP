package javaplus;

public class MyStrudy {
    public static void main(String[] args) {
        Animal ani = new Animal();
        Lion a = (Lion)ani;
        Lion asd = (Lion)(new Animal());
//        Integer aa = new Integer(10);
        ani = new Lion();
        new Lion().roar();

    }
}
class Animal{
    private double weight;
    String picture;
//    public Animal(int a){
//
//    }
    void eat() {System.out.println("먹는다 냠냠");}
    void sleep() {System.out.println("잔다 쿨쿨");}

}
class Lion extends Animal{
    private int legs=4;
    void roar() { System.out.println("크아아앙");	}
}
class Eagle extends Animal{
    private int wings =2;
    void fly() { System.out.println("훠루허룰훨훠루러ㅜ러ㅜ훨");	}
}