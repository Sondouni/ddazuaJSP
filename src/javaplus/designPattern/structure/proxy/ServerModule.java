package javaplus.designPattern.structure.proxy;



public class ServerModule implements IserverModule {
    @Override
    public void excute() {
        System.out.println("Run Server Module");
    }
}
interface IserverModule{
    public void excute();
}
