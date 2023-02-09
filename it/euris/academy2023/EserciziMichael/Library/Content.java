package it.euris.academy2023.EserciziMichael.Library;

public abstract class Content {
    private final String title;

    public Content(String title){
        this.title = title;
    }

    public abstract String getType();

    public String getTitle(){
        return title;
    }
}
