package it.euris.academy2023.Esercizi.Restaurant;

import java.util.Objects;

public class Eatable {
    private String name;
    private Float price;
    private boolean drink;

    public Eatable(String name, float price, boolean drink) {
        this.name = name;
        this.price = price;
        this.drink = drink;
    }

    private Eatable(){}

    public float getPrice(){
        return this.price;
    }

    public boolean isDrink(){
        return this.drink;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (!(o instanceof Eatable)){ return false;}
        return this.name.equalsIgnoreCase(((Eatable)o).name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
