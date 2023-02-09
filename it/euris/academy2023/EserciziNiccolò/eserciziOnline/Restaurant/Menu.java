package it.euris.academy2023.EserciziNiccolò.eserciziOnline.Restaurant;

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
        Eatable obj = null;
        for (Eatable f : food) {
            if(f.getName().equalsIgnoreCase(s)){
                obj = f;
            }
        }
        if(obj == null) {
            for (Eatable d : drink) {
                if (d.getName().equalsIgnoreCase(s)) {
                    obj = d;
                }
            }
        }
        return obj;
    }

    public void addEatable(Eatable eatable){
        if(eatable.isDrink()){
            this.drink.add(eatable);
        }else{
            this.food.add(eatable);
        }
    }
}
