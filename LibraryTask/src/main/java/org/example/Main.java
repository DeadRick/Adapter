package org.example;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Library library = new Library();
        ArrayList<Optional<Book>> myBooks = new ArrayList<>();

        String cond = "ENTER";
        System.out.println("Welcome to THE LIBRARY!");
        System.out.println("get <book name> - to get certain book.");
        System.out.println("put - return book to the library.");
        System.out.println("list - show all of your books.");
        System.out.println("all - show the whole list in library.");
        System.out.println("EXIT - to exit.");

        while (!cond.equals("EXIT")) {
            cond = in.nextLine();
            String[] splCond = cond.split(" {1}", 2);
            switch (splCond[0]) {
                case "get":
                    Optional<Book> book = library.takeBook(splCond[1]);
                    if (book.isEmpty()) {
                        System.out.println("Sorry, we don't have book " + "\'" + splCond[1] + "\'");
                    } else {
                        myBooks.add(book);
                        System.out.println("You take " + book.get().title + " by " + book.get().authors);
                    }
                    break;
                case "put":
                    System.out.println("What book you want to return?");
                    for (int i = 0; i < myBooks.size(); i++) {
                        System.out.println((i + 1) + ". " + myBooks.get(i).get());
                    }
                    int numOfBooks = -1;
                    while (numOfBooks < 0 || numOfBooks - 1 > myBooks.size()) {
                        numOfBooks = in.nextInt();
                    }
                    Optional<Book> bookToReturn = myBooks.get(numOfBooks - 1);
                    library.put(myBooks.get(numOfBooks - 1));
                    myBooks.remove(bookToReturn);
                    break;
                case "list":
                    for (int i = 0; i < myBooks.size(); i++) {
                        System.out.println((i + 1) + ". " + myBooks.get(i).get());
                    }
                    break;
                case "all":
                    library.showBooks();
                    break;
            }
        }
        System.out.println("Goodbye!");
    }
}