package javaplus.designPattern.behavioral.iteratorEx;
// Book클래스를 선언하여 데이터로 이용
public class Book {
    private String name;
    public Book(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}