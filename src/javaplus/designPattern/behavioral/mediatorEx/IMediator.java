package javaplus.designPattern.behavioral.mediatorEx;

import java.util.ArrayList;
import java.util.List;

public interface IMediator {
    public void sendCall(String to,String from,String call);
}
/*
        Mediator클래스를 이용하여 처리하는 구조
        sendCall()을 통해 들어오는 요청을 해당 Peer클래스로 수행
        Mediator는 싱글톤 패턴을 이용하여 하나의 객체를 사용
 */
class Mediator implements IMediator{
    private Mediator(){}

    private static class SingletonHolder{
        public static final Mediator singletonInstance = new Mediator();
    }
    public static Mediator getInstance(){
        return SingletonHolder.singletonInstance;
    }
    private List<Peer> list = new ArrayList();

    public void addPeer(Peer peer){
        peer.setMediator(this);
        list.add(peer);
    }
    @Override
    public void sendCall(String to, String from, String call) {
        for(Peer peer : list){
            if(peer.getName().equals(to)){
                peer.receiveCall(from,call);
            }
        }
    }
}
