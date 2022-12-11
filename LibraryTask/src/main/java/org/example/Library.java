package org.example;

import java.util.*;

public class Library extends ArrayList<Book> {
    int size = 0;
    ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
        put(new Book("The Stand", "A new horror story about a virus that killed 99% of the whole world",
                "Stephen King", 1978, true));
        put(new Book("The Stand", "Medicine book by scientist",
                "Roger Waters", 1939, true));
        put(new Book("The Stand", "Book about the war",
                "William Fighters", 1831, true));
    }

    public int size() {
        return size;
    }

    Optional<Book> takeBook(String bookTitle) {
        Book book = null;
        ArrayList<Book> sameBook = new ArrayList<>();
        for (Book value : books) {
            if (value.title.equals(bookTitle) && value.available) {
                sameBook.add(value);
            }
        }
        if (sameBook.size() == 0) {
            return Optional.empty();
        }
        book = showSameBooks(sameBook);
        books.remove(book);
        book.available = false;
        books.add(book);
        return Optional.of(book);
    }

    Book showSameBooks(ArrayList<Book> sameBooks) {
        if (sameBooks.size() > 1) {
            System.out.println("Choose certain book:");
            for (int i = 0; i < sameBooks.size(); i++) {
                System.out.println((i + 1) + " " + sameBooks.get(i));
            }
            Scanner in = new Scanner(System.in);
            int numOfBooks = -1;
            while (numOfBooks < 0 || numOfBooks - 1 > sameBooks.size()) {
                numOfBooks = in.nextInt();
            }
            return sameBooks.get(numOfBooks - 1);
        }
        return sameBooks.get(0);
    }

    void put(Optional<Book> book) {
        Book bookToPut = book.get();
        books.remove(bookToPut);
        bookToPut.available = true;
        books.add(bookToPut);
    }

    void put(Book book) {
        books.remove(book);
        book.available = true;
        books.add(book);
    }

    public boolean isAvailable(Book book) {
        for (Book value : books) {
            if (value.title.equals(book.title)) {
                return true;
            }
        }
        return false;
    }

    public void showBooks() {
        System.out.println("List of books:");
        for (int i = 0; i < books.size(); i++) {
           System.out.println((i + 1) + ". " + books.get(i));
           System.out.println("Available status: " + books.get(i).available);
        }
    }
}
