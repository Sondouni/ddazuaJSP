package javaplus.designPattern.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

public class AirconditionerMachine2 implements AirConditionerElement, Observer {
            Observable observable;

            private final float BaseTemperature = 28.0f;
            private float currentTemperature = 0.0f;
            public AirconditionerMachine2(Observable observable){
                this.observable = observable;
                this.observable.addObserver(this);
            }
            @Override
            public void update(Observable obs, Object arg) {
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
                System.out.println("에어콘 2번");
                System.out.println("설정온도 : "+this.BaseTemperature+"도 ||"+"현재온도 : "+this.currentTemperature+" 도");
                System.out.println("에어컨 가동시작");
                System.out.println("-------------------");
            }

            @Override
            public void powerOff() {
                System.out.println("-------------------");
                System.out.println("에어콘 2번");
                System.out.println("설정온도 : "+this.BaseTemperature+"도 ||"+"현재온도 : "+this.currentTemperature+" 도");
                System.out.println("에어컨 가동중지");
                System.out.println("-------------------");
            }
}

