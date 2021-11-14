package javaplus.designPattern.structure.composite;

import java.util.ArrayList;

public class ElectionProductComposite implements ElectronicProductCompenent{
    private ArrayList<ElectronicProductCompenent> list = new ArrayList();
    public ElectionProductComposite(){}

    public void addProductList(ElectronicProductCompenent product){
        list.add(product);
    }
    public void removeProductList(ElectronicProductCompenent product){
        list.remove(product);
    }

    @Override
    public void powerOn() {
        System.out.println("Power on...");
        for(ElectronicProductCompenent ep : list){
            ep.powerOn();
        }
    }

    @Override
    public void powerOff() {
        System.out.println("Power off...");
        for(ElectronicProductCompenent ep : list){
            ep.powerOff();
        }
    }
}
