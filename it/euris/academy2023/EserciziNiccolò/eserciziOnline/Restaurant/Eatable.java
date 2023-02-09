package it.euris.academy2023.EserciziNiccolò.eserciziOnline.Restaurant;

public class Eatable {
    private String name;
    private Float price;
    private boolean drink;

    public Eatable(String name){
        this.name = name;
    }

    public Eatable(String name, float price, boolean drink) {
        this.name = name;
        this.price = price;
        this.drink = drink;
    }

    private Eatable(){}

    public float getPrice(){
        return this.price;
    }

    public String getName(){
        return this.name;
    }

    public boolean isDrink(){
        return this.drink;
    }
}
