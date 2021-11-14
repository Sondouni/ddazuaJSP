package javaplus.designPattern.structure.composite;

public class ComponentInstant {
}
class TV implements ElectronicProductCompenent{
    private String name;
    public TV(String name){
        this.name = name;
    }

    @Override
    public void powerOn() {
        System.out.println("TV power on -"+this.name);
    }

    @Override
    public void powerOff() {
        System.out.println("TV power off -"+this.name);
    }
}
class Audio implements ElectronicProductCompenent{
    private String name;
    public Audio(String name){
        this.name = name;
    }

    @Override
    public void powerOn() {
        System.out.println("Audio power on -"+this.name);
    }

    @Override
    public void powerOff() {
        System.out.println("Audio power off -"+this.name);
    }
}
