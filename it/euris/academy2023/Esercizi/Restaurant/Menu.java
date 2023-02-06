package it.euris.academy2023.Esercizi.Restaurant;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Eatable> food;
    private List<Eatable> drink;

    public Menu(List<Eatable> food, List<Eatable> drink) {
        this.food = food;
        this.drink = drink;
    }

    public Menu(){
        this.food = new ArrayList<>();
        this.drink = new ArrayList<>();
    }

    public Eatable get(String s){
        if(this.food.contains(s)){
            return this.food.get(food.indexOf(s));
        }else if(this.drink.contains(s)){
            return this.drink.get(drink.indexOf(s));
        }else{
            return null;
        }
    }

    public void addEatable(Eatable eatable){
        if(eatable.isDrink()){
            this.drink.add(eatable);
        }else{
            this.food.add(eatable);
        }
    }
}
