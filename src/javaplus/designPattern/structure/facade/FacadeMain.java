package javaplus.designPattern.structure.facade;

public class FacadeMain {
    public static void main(String[] args) {
        LoginProcess login = new LoginProcess();
        login.login("id","pw");
    }
}
/*
    클라이언트에서는 전체 로그인 과정을 직접 수행하지 않음
    복잡한 순서를 단순하게 사용할수잇는 login 인터페이스를 생성
    클라이언트: login 을 이용하여 작업진행
 */