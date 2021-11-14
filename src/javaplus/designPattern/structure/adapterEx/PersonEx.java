package javaplus.designPattern.structure.adapterEx;

import java.util.ArrayList;
import java.util.List;

class Person {
    private String name;
    private String phone;

    public Person(String name, String phone){
        this.phone = phone;
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public String getPhone(){
        return phone;
    }
}
public class PersonEx{
    public static void main(String[] args) {
        List<Person> list = new ArrayList();
        list.add(new Person("A","010-1234-0001"));
        list.add(new Person("B","010-1234-0002"));
        list.add(new Person("C","010-1234-0003"));

        PushAdapterImpl adapter1 = new PushAdapterImpl();
        adapter1.PushMessage(list.get(0));
        adapter1.PushMessages(list);

        System.out.println();

        PushAdapterImpl2 adapter2 = new PushAdapterImpl2();
        adapter2.PushMessage(list.get(1));
        adapter2.PushMessages(list);
    }
}

