package it.euris.academy2023.EserciziNiccolò.eserciziOnline.orderedNumberList;

import java.util.ArrayList;

public class VectorNum {

    public int lunarray;
    public int posizione;
    public ArrayList<Integer> vettore;
    public int sup;
    public int inf;
    public ArrayList<Integer> newArray;

    public VectorNum (ArrayList<Integer> vettore){
        this.vettore = vettore;
        this.lunarray = vettore.size();
        this.posizione = -1;
        this.inf = 0;
        this.sup = vettore.size() - 1;
        this.newArray = new ArrayList<Integer>();
    }


    public int getPosizione(){
        return this.posizione;
    }


    public boolean cercaValore (int chiave){

        if((this.sup - this.inf) > 1){
            int m = Math.round((this.sup + this.inf)/2);
            if (chiave < this.vettore.get(m)){
                this.sup = m;
            }
            else {
                this.inf = m;
            }
            cercaValore(chiave);
        }
        if (chiave <= this.vettore.get(this.inf))
            this.posizione = this.inf;
        else if (chiave <= this.vettore.get(this.sup))
            this.posizione = this.sup;
        else
            this.posizione = this.sup + 1;
        return (this.vettore.get(this.inf) == chiave || this.vettore.get(this.sup) == chiave);
    }


    public ArrayList<Integer> inserisciValore (int chiave){

        newArray.clear();
        int i;

        for (i = 0; i < this.lunarray + 1; i++){
            if (i < this.posizione)
                this.newArray.add(this.vettore.get(i));
            else if (i == this.posizione)
                this.newArray.add(chiave);
            else
                this.newArray.add(this.vettore.get(i - 1));
        }
        this.vettore = this.newArray;
        return this.vettore;
    }


    public ArrayList<Integer> rimuoviValore (int chiave){

        vettore.remove(posizione);
        return this.vettore;
    }
}
