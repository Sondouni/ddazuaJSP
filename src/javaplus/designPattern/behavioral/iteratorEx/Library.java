package javaplus.designPattern.behavioral.iteratorEx;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Library implements Aggregate{
    private List<Book> list;
    public Library(){
        this.list = new ArrayList();
    }
    public int getSize(){
        return list.size();
    }
    public void addBook(Book book){
        this.list.add(book);
    }
    public Book getBook(int index){
        return list.get(index);
    }
    @Override
    public Iterator createIterator() {
        return new LibraryIterator(this);
    }
}
