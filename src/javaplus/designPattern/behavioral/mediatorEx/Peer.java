package javaplus.designPattern.behavioral.mediatorEx;

public abstract class Peer {
    public IMediator mediator;
    public void setMediator(IMediator imed){
        this.mediator = imed;
    }
    public void callEvent(String to,String from,String call){
        this.mediator.sendCall(to,from,call);
    }
    abstract public void call(String to,String call);
    abstract public void receiveCall(String from,String call);
    abstract public String getName();


}

