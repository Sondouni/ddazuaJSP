package javaplus.designPattern.behavioral.iteratorEx;

import java.util.Iterator;

public class IteratorMain {
    public static void main(String[] args) {
        Library lib = new Library();
        lib.addBook(new Book("A"));
        lib.addBook(new Book("B"));
        lib.addBook(new Book("C"));
        lib.addBook(new Book("1"));
        lib.addBook(new Book("2"));
        lib.addBook(new Book("3"));

        System.out.println(lib.getBook(1).getName());

        Iterator it = lib.createIterator();
        while (it.hasNext()){
            Book book = (Book)it.next();
            System.out.println(book.getName());
        }
    }
}
