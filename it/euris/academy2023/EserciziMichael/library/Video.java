package it.euris.academy2023.EserciziMichael.library;

public class Video extends Content {

    private final String type;

    public Video(String title) {
        super(title);
        this.type = "v";
    }

    @Override
    public String getType() {
        return this.type;
    }
}
