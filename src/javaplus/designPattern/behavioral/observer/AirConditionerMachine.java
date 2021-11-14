package javaplus.designPattern.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

public class AirConditionerMachine implements AirConditionerElement, Observer {
    Observable observable;

    private final float BaseTemperature = 26.5f;
    private float currentTemperature = 0.0f;
    public AirConditionerMachine(Observable observable){
        this.observable = observable;
        this.observable.addObserver(this);
    }
    @Override
    public void update(Observable obs, Object arg) { // Observable의 값이 변경되면 Observer의 update를 호출해서 변경된 값을 갱신
        if(obs instanceof TemperatureData){
            TemperatureData tempData = (TemperatureData) obs;
            currentTemperature = tempData.getTemperature();
            if(BaseTemperature<currentTemperature){
                this.powerOn();
            }else {
                this.powerOff();
            }
        }
    }

    @Override
    public void powerOn() {
        System.out.println("-------------------");
        System.out.println("에어콘 1번");
        System.out.println("설정온도 : "+this.BaseTemperature+"도 ||"+"현재온도 : "+this.currentTemperature+" 도");
        System.out.println("에어컨 가동시작");
        System.out.println("-------------------");
    }

    @Override
    public void powerOff() {
        System.out.println("-------------------");
        System.out.println("에어콘 1번");
        System.out.println("설정온도 : "+this.BaseTemperature+"도 ||"+"현재온도 : "+this.currentTemperature+" 도");
        System.out.println("에어컨 가동중지");
        System.out.println("-------------------");
    }
}
