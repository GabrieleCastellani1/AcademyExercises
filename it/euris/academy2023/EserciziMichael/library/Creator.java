package it.euris.academy2023.EserciziMichael.library;

public class Creator {

    public Creator(){}

    public static Content createContent(String type, String title){
        switch(type){
            case "l" : return new Book(title);
            case "v" : return new Video(title);
            case "m" : return new Music(title);
            default : return null;
        }
    }
}
