package javaplus.designPattern.behavioral.observer;

import java.util.Observable;
/*
        자바 내장 API observable 클래스 사용
        등록된 옵저버들을 관리
        새로운 데이터가 들어오면, 옵저버에게 데이터 전달
 */
public class TemperatureData extends Observable {
    private float temperature;
    public TemperatureData(){

    }
    public void setMeasurements(float temperature){
        this.temperature = temperature;
        measurementsChanged();
    }
    public void measurementsChanged(){
        setChanged();           // 전달할 새로운 데이터가 있음을 설정
        notifyObservers();      // notifyObservers()합수는 등록된 Observer클래스에게 순차적으로 데이터가 변경되었음을 전달
    }
    public float getTemperature(){
        return temperature;
    }
}
