package javaplus.designPattern.structure.adapterEx;

import java.util.List;

public class PushAdapterImpl2 implements PushAdapter{
    // 어댑터 클래스의 코드 대부분을 구현해야함
    // Composition을 사용하기때문에 유연함
    private SendMessage sendMSG = new SendMessage();
    @Override
    public void PushMessage(Person personObj) {
        this.sendMSG.sendMessage(personObj);
    }

    @Override
    public void PushMessages(List<Person> list) {
        for(Person person : list){
            this.sendMSG.sendMessage(person);
        }
    }
}
