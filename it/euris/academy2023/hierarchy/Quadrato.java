package it.euris.academy2023.hierarchy;

public class Quadrato extends Rettangolo {

    public Quadrato() {}

    public Quadrato(int lato) {
        super(lato, lato);
    }

    public String toString() {
        return "Sono un quadrato con lato " + super.base;
    }

    public static void main(String[] args) {
        Quadrato q = new Quadrato(5);
        System.out.println(q.calcolaArea());
        System.out.println(q.calcolaPerimetro());
    }
}






