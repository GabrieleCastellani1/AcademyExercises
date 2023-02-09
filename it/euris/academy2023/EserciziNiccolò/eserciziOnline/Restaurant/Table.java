package it.euris.academy2023.EserciziNiccolò.eserciziOnline.Restaurant;

import java.util.HashMap;
import java.util.Map;

public class Table {
    private boolean free;
    private int ID;
    private int places;
    private Map<Eatable, Float> tableOrder;

    public Table (int num, int places){
        this.free = true;
        this.ID = num;
        this.places = places;
        this.tableOrder = new HashMap<Eatable, Float>();
    }

    private Table(){}

    public void addOrder(Eatable ... ordered){
        for (Eatable ord : ordered) {
            tableOrder.put(ord, ord.getPrice());
        }
    }

    public float getBill(){
        float bill = 0;
        for (Eatable f : tableOrder.keySet()) {
            bill += tableOrder.get(f);
        }
        return bill;
    }
}
