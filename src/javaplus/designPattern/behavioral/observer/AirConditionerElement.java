package javaplus.designPattern.behavioral.observer;

public interface AirConditionerElement {
    public void powerOn();
    public void powerOff();
}
/*
        Observer클래스에서 사용할 함수를 선언
        Observer클래스에서 온도 데이터를 전달받으면, 온도값에 의해 호출될 함수 선언(power On(),power Off())
 */
