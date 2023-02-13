package it.euris.academy2023.EserciziMichael.library;

public class Book extends Content {

    private final String type;

    public Book(String title) {
        super(title);
        this.type = "l";
    }

    @Override
    public String getType() {
        return this.type;
    }
}
