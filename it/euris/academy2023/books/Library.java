package it.euris.academy2023.books;

import java.util.*;

public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public Library(List<Book> books) {
        this.books = books;
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public void sort(Comparator<Book> c) {
        //Collections.sort(this.books, c);
        books.sort(null);
    }

    public void printAll() {
        for (Book book : books) {
            System.out.println(book.toString());
        }
    }
}
