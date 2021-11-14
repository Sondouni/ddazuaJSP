package javaplus.designPattern.behavioral.observer;

public class ObsMain {
    static TemperatureData tempData;
    static AirConditionerMachine air1;
    static AirconditionerMachine2 air2;

    public static void MainController(){
        tempData = new TemperatureData();

        air1 = new AirConditionerMachine(tempData);
        air2 = new AirconditionerMachine2(tempData);
    }

    public static void changeTemperature(float temp){
        tempData.setMeasurements(temp);
    }
    public static void main(String[] args) {
        MainController();

        System.out.println("온도변화");
        changeTemperature(27.7f);
        System.out.println("");
        System.out.println("온도변화");
        changeTemperature(27.1f);
    }
}
/*
    Observable의 addObserver()함수를 이용하여 현재 선언한 Observer 등록
    update함수는 Ovservable 에 값이 변경되면 Observer의 update를 호출하여 변경된 값을 갱신
    update 함수는 Observable에 값이 변경되면 Observer의 update()를 호출하여 변경된 값을 갱신
    변경된 온도 데이ㅓ를 판단하여 powerOn powerOff함수를 호출
 */
