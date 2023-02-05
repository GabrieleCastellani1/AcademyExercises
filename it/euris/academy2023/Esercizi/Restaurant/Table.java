package it.euris.academy2023.Esercizi.Restaurant;

import java.util.HashMap;

public class Table {
    public boolean libero;
    public int tavoloID;
    public int coperti;
    HashMap<Integer, Integer> ordineAttuale;

    public Table (int numero, int posti){
        this.libero = true;
        this.tavoloID = numero;
        this.coperti = posti;
        this.ordineAttuale = new HashMap<Integer, Integer>();
    }

    // table not available
    public void setOccupato(){
        libero = false;
    }

    // available table
    public void setLibero(){
        libero = true;
    }

    // check the state of the table:
    public boolean getStato(){
        return this.libero;
    }

    //
    public void setOrdineAttuale(int uno, int due){
        ordineAttuale.put(uno, due);
    }
}
