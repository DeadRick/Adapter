package org.example;

public class Book {
    public String title;
    public String description;
    public String authors;
    public Integer year;
    public boolean available;


    public Book(String title, String description, String authors, Integer year, boolean available) {
        this.title = title;
        this.description = description;
        this.authors = authors;
        this.year = year;
        this.available = available;
    }

    @Override
    public String toString() {
        return  "title='" + title + '\'' +
                ", description='" + description + '\'';
    }
}
