package it.euris.academy2023.Library;

public abstract class Content {
    private final String type;
    private final String title;

    public Content(String type, String title){
        this.title = title;
        this.type = type;
    }

    public String getType(){
        return type;
    }

    public String getTitle(){
        return title;
    }
}
