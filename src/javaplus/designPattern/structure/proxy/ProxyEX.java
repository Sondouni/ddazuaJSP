package javaplus.designPattern.structure.proxy;

public class ProxyEX implements IserverModule{
    IserverModule server;

    @Override
    public void excute() {
        System.out.println("ServerModule의 excute()실행전에 proxy에서 무언가를 할수있음");

        server = new ServerModule();
        server.excute();

    }

    public static void main(String[] args) {
        System.out.println("직접 호출");
        ServerModule svm = new ServerModule();
        svm.excute();

        System.out.println("\n"+"Proxy를 통한 호출");
        IserverModule proxy =new ProxyEX();
        proxy.excute();
    }
}
/*
    실제 서비스와 proxy를 구분시켜놓고, proxy에도 같은 이름의 메소드를 구현시키고(인터페이스를 이용),
    서비스의 메소드를 호출하는 방법

    실제 서비스를 클라이언트(메인)에서 구현가능하고, 프록시를 껴서 캡슐화 시켜 다른 기능과 함께 구현또한 가능
 */
