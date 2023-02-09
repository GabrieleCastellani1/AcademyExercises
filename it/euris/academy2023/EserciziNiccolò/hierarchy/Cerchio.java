package it.euris.academy2023.EserciziNiccolò.hierarchy;

public class Cerchio implements Figura {

    protected int raggio;

    public Cerchio() {
    }

    public Cerchio(int raggio) {
        this.raggio = raggio;
    }

    @Override
    public int compareTo(Object o) {
        Figura r = (Figura) o;
        return this.calcolaArea() - r.calcolaArea();
    }

    public int calcolaPerimetro() {
        return (int) (raggio * 2 * Math.PI);
    }

    public int calcolaArea() {
        return (int) (raggio * raggio * Math.PI);
    }

    public String toString() {
        return "Sono un cerchio con raggio: " + raggio;
    }




}

