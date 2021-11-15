package javaplus.designPattern.behavioral.mediatorEx;

public class MediatorMain {
    public static void main(String[] args) {
        Peer pA = new PeerChild();
        Peer pB = new PeerChild2();
        Peer pC = new PeerChild3();

        Mediator med = Mediator.getInstance();
        med.addPeer(pA);
        med.addPeer(pB);
        med.addPeer(pC);


        //pC -> pA 문자
        med.sendCall(pA.getName(),pC.getName(),"Hello");
        //pA -> pB 전화
        pA.call(pB.getName(),"HI");
    }
}
/*
        Peer객체를 생성하여 Mediator에 추가
        pC객체가 pA에게 Mediator의 sendCall()을 이용해서 Hello메세지 전송
        pA객체에서 Call()함수를 호출, Mediator의 sendCall()을 이용하여 PeerB에게 메시지 전송송
 */