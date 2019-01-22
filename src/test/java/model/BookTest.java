package model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {

    private Book book;
    private String author = "Ron Chernow";
    private String title = "Alexander Hamilton";

    @Before
    public void setUp() throws Exception {
        book = new Book(title, author);
    }

    @Test
    public void testGetTitle() {
        assertEquals(title, book.getTitle());
    }

    @Test
    public void testSetTitle() {
        String newTitle = "George Washington";
        book.setTitle(newTitle);

        assertEquals(newTitle, book.getTitle());
    }

    @Test
    public void testGetAuthor(){
        assertEquals(author, book.getAuthor());
    }

    @Test
    public void testSetAuthor() {
        String newAuthor = "Walter Isaacson";
        book.setAuthor(newAuthor);

        assertEquals(newAuthor, book.getAuthor());
    }


    @Test
    public void testEquals(){
        Book sameBook = new Book(title, author);

        assertEquals(book, sameBook);
    }

    @Test
    public void testNotEquals(){
        Book differentBook = new Book("The Snowball", "Alice Schroeder");

        assertNotEquals(book, differentBook);
    }
}