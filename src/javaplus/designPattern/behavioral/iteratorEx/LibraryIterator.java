package javaplus.designPattern.behavioral.iteratorEx;

import java.util.Iterator;
import java.util.function.Consumer;

public class LibraryIterator implements Iterator {
    private Library lib;
    private int index;

    public LibraryIterator(Library lib){
        this.lib = lib;
        this.index = 0;
    }
    @Override
    public boolean hasNext() {
        if(index<lib.getSize()){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public Object next() {
        Book book = lib.getBook(index);
        index++;
        return book;
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }

    @Override
    public void forEachRemaining(Consumer action) {
        Iterator.super.forEachRemaining(action);
    }
}
