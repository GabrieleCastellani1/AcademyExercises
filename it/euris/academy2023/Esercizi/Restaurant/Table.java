package it.euris.academy2023.Esercizi.Restaurant;

import java.util.HashMap;
import java.util.List;

public class Table {
    private boolean free;
    private int ID;
    private int places;

    private List<Eatable> ordered;
    HashMap<Eatable, Float> tableOrder;

    public Table (int num, int places){
        this.free = true;
        this.ID = num;
        this.places = places;
        this.tableOrder = new HashMap<Eatable, Float>();
    }

    public void addOrder(Eatable ... ordered){
        for (Eatable ord : ordered) {
            tableOrder.put(ord, ord.getPrice());
        }
    }

    public float getBill(){
        float bill = 0;
        for (Eatable f : ordered) {
            bill += f.getPrice();
        }
        return bill;
    }
}
