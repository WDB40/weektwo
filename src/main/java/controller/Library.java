package controller;

import model.Book;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books = new ArrayList<>();

    public Library() {
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public boolean hasBook(Book book) {
        return books.contains(book);
    }

    public boolean checkOut(Book book) {
        if(hasBook(book)){
            books.remove(book);
            return true;
        } else {
            return false;
        }
    }
}
