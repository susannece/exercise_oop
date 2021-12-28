package se.lexicon.susanne;

import java.util.Arrays;

public class Author {
    private String name;
    private String[] books = new String[0];

    public void printBooks(String name){
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);
        }
    }

    public Author(String name) {
        this.name = name;
    }

    public void setBooks(String title){
        this.books = Arrays.copyOf(books, books.length + 1);
        this.books[books.length-1] = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
