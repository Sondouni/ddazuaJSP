package javaplus.designPattern;

public class SingleTon { // 기본 싱글톤 패턴
    private static SingleTon singleTon;
    private SingleTon(){}
    public static SingleTon getInstance(){
        if(singleTon == null){
            singleTon = new SingleTon();
        }
        return singleTon;
    }
}
class Singleton1{ // synchronized를 이용한 싱글톤 패턴
    private static Singleton1 singleton1;
    private Singleton1(){}
    public static synchronized Singleton1 getInstance(){
        if(singleton1 == null){
            singleton1 = new Singleton1();
        }
        return singleton1;
    }
}
class Singleton2{ // DCL을 이용한 싱글톤 패턴
    private static Singleton2 singleton2;
    private Singleton2(){}
    public static Singleton2 getInstance(){
        if(singleton2 == null){
            synchronized (Singleton2.class) {
                if (singleton2 == null) {
                    singleton2 = new Singleton2();
                }
            }
        }
        return singleton2;
    }
}
class Singleton3 { // Eager Initialization방법
    private static volatile Singleton3 single3 = new Singleton3(); // 클래스 로딩하면서 생성후 반환
    private Singleton3(){}
    public static Singleton3 getInstance(){
        return single3;
    }
}
class Singleton4 { //innerClass를 이용한 Holder선선 (lazyInitialization기법)
    private Singleton4(){}
    private static class SingletonHolder{
        public static final Singleton4 single4 = new Singleton4();
    }
    public static Singleton4 getInstance(){
        return SingletonHolder.single4;
    }
}

