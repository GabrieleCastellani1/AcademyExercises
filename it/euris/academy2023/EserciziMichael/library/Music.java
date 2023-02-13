package it.euris.academy2023.EserciziMichael.library;

public class Music extends Content {

    private String type;

    public Music(String title) {
        super(title);
        this.type = "m";
    }

    @Override
    public String getType() {
        return type;
    }
}
