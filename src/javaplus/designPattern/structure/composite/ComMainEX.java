package javaplus.designPattern.structure.composite;

public class ComMainEX {
    public static void main(String[] args) {
        TV tv1 = new TV("TV1");
        TV tv2 = new TV("TV2");
        Audio audio1 = new Audio("Audio1");
        Audio audio2 = new Audio("Audio2");

        ElectionProductComposite composite = new ElectionProductComposite();

        composite.addProductList(tv1);
        composite.addProductList(audio1);
        composite.addProductList(tv2);
        composite.addProductList(audio2);

        composite.powerOn();
        composite.powerOff();
    }
}

interface ElectronicProductCompenent{ // 객체와 복합객체가 구현해야할 메소드를 정의한 인터페이스
    public void powerOn();
    public void powerOff();
}
