package javaplus.designPattern.structure.adapterEx;

import java.util.List;

public class PushAdapterImpl extends SendMessage implements PushAdapter{
    //상속을 활용해 유연하지 못함
    //Adapter 전체를 다시 구현할 필요가 없음
    @Override
    public void PushMessage(Person personObj) {
        this.sendMessage(personObj);
    }

    @Override
    public void PushMessages(List<Person> list) {
        for(Person personObj : list){
            this.sendMessage(personObj);
        }
    }
}
class SendMessage{ //Person 1명에게만 메세지 보내는 함수
    public void sendMessage(Person personObj){
        System.out.println("To: "+personObj.getPhone()+"\n"+"Message: Hello "+personObj.getName()+"\n");
    }
}
interface PushAdapter{ //message를 보내는 인터페이스 선언
    public void PushMessage(Person personObj);
    public void PushMessages(List<Person> list);
}
