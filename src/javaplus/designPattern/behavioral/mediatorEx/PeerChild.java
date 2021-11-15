package javaplus.designPattern.behavioral.mediatorEx;

public class PeerChild extends Peer{
    private String name = "A";
    private Mediator med = Mediator.getInstance();
    public PeerChild(){}
    @Override
    public void call(String to, String call) {
        med.sendCall(to,name,call);
    }

    @Override
    public void receiveCall(String from, String call) {
        System.out.println("To peer : "+name+"\t From peer: "+from+"\tcall : "+call);
    }

    @Override
    public String getName() {
        return this.name;
    }
}
class PeerChild2 extends Peer{
    private String name = "B";
    private Mediator med = Mediator.getInstance();
    public PeerChild2(){}
    @Override
    public void call(String to, String call) {
        med.sendCall(to,name,call);
    }

    @Override
    public void receiveCall(String from, String call) {
        System.out.println("To peer : "+name+"\t From peer: "+from+"\tcall : "+call);
    }

    @Override
    public String getName() {
        return this.name;
    }
}
class PeerChild3 extends Peer{
    private String name = "C";
    private Mediator med = Mediator.getInstance();
    public PeerChild3(){}
    @Override
    public void call(String to, String call) {
        med.sendCall(to,name,call);
    }

    @Override
    public void receiveCall(String from, String call) {
        System.out.println("To peer : "+name+"\t From peer: "+from+"\tcall : "+call);
    }

    @Override
    public String getName() {
        return this.name;
    }
}
