package javaplus.designPattern.creational;

public class FactoryMethodEX {
    public static void main(String[] args) {
        AnimalEX a = AnimalFactory.getAnimal("Dog");
        AnimalEX b = AnimalFactory.getAnimal("Cat");

        System.out.println(a.getName());
        System.out.println(b.getName());
    }
}
abstract class AnimalEX{
    public abstract String getName();
    public abstract String getType();

    @Override
    public String toString() {
        return "Animal Type : "+getType()+"\n"+"Animal Name : "+getName()+"\n";
    }
}
class Dog extends AnimalEX{
    private String type;
    private String name;

    public Dog(String type,String name){
        this.type =type;
        this.name =name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getType() {
        return this.name;
    }
}
class Cat extends AnimalEX{
    private String type;
    private String name;

    public Cat(String type,String name){
        this.type =type;
        this.name =name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getType() {
        return this.type;
    }
}
class AnimalFactory{
    public static AnimalEX getAnimal(String type){
        if("Dog".equals(type)){
            return new Dog("Dog","Mung");
        }else if("Cat".equals(type)){
            return new Cat("Cat", "Miew");
        }else {
            return null;
        }
    }
}
