package it.euris.academy2023.EserciziNiccolò.hierarchy;

public class Rettangolo implements Figura, Comparable {

    protected int base;
    protected int altezza;

    public Rettangolo() {
    }

    public Rettangolo(int base, int altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public int compareTo(Object o) {
        Rettangolo r = (Rettangolo) o;
        return this.calcolaArea() - r.calcolaArea();
    }

    public int calcolaPerimetro() {
        return (base + altezza) * 2;
    }

    public int calcolaArea() {
        return base * altezza;
    }

    public String toString() {
        return "Sono un rettangolo con base " + base + " e altezza " + altezza;
    }


}

