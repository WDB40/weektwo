package controller;

import model.Book;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LibraryTest {

    private Library library;
    private Book book1 = new Book("Alexander Hamilton", "Ron Chernow");
    private Book book2 = new Book("Educated", "Tara Westover");

    @Before
    public void setUp(){
        library = new Library();
        library.addBook(book1);
        library.addBook(book2);
    }

    @Test
    public void testHasBook(){
        assertTrue(library.hasBook(book1));
    }

    @Test
    public void testDoesNotHaveBook(){
        Book notInLibrary = new Book("Leonardo da Vinci", "Walter Isaacson");

        assertFalse(library.hasBook(notInLibrary));
    }

    @Test
    public void testCanCheckOut(){
        assertTrue(library.checkOut(book1));
        assertFalse(library.hasBook(book1));
    }

    @Test
    public void testCannotCheckOut(){
        Book notInLibrary = new Book("Leonardo da Vinci", "Walter Isaacson");

        assertFalse(library.checkOut(notInLibrary));
    }

    @Test
    public void testCanAddBook(){
        Book newBook = new Book("Shoe Dog", "Phil Knight");

        library.addBook(newBook);

        assertTrue(library.hasBook(newBook));
    }
}