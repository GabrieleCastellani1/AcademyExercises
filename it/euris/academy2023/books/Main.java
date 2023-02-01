package it.euris.academy2023.books;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Library l = new Library();
        l.addBook(new Book("titolo", "autore", 1970, "genere"));
        l.addBook(new Book("titolo", "autore", 2012, "genere"));
        l.addBook(new Book("titolo", "autore", 1990, "genere"));
        l.printAll();
        l.sort(new Comparator<Book>() {
            @Override
            public int compare(Book b1, Book b2) {
                if (b1.getAnno() < b2.getAnno()) {
                    return -1;
                } else if (b1.getAnno() > b2.getAnno()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
        l.printAll();
    }
}
