package task3;//Question1

import java.util.ArrayList;
import java.util.List;

public class Library {
    //List declare
    private List<Book> books;
    //constructor
    public Library() {
        this.books = new ArrayList<>();
    }

    // add book in List
    public void addBook(Book book) {
    System.out.println("Adding book with ID: " + book.getBookID());
    books.add(book);
    }

    //remove book
    public void removeBook(int bookID) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getBookID() == bookID) {
                books.remove(i);
                break;
            }
        }
    }
    //display books
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available in the library.");
        } else {
            for (Book book : books) {
                System.out.println("Book ID: " + book.getBookID());
                System.out.println("Title: " + book.getTitle());
                System.out.println("Author: " + book.getAuthor());
                System.out.println("Available: " + book.isAvailable());
                System.out.println("---------------------------");
            }
        }
    }
    //search book
    public Book searchBook(int bookID) {
        for (Book book : books) {
            if (book.getBookID() == bookID) {
                return book;
            }
        }
        return null;
    }

    //replace book
    public void replaceBook(int bookID, Book newBook) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getBookID() == bookID) {
                books.set(i, newBook);
                break;
            }
        }
    }

}
