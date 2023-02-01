package it.euris.academy2023.shapes;

public class Main {

    public static void main(String[] args) {
        IShape r = new Rettangolo(10, 5);

        IShape q = new Quadrato(10);

        printDetails(r);
        printDetails(q);

    }


    private static void printDetails(IShape r) {
        System.out.println("--------------------------------------");
        System.out.println("Perimetro: " + r.calcolaPerimetro());
        System.out.println("Descrizione: " + r);
        System.out.println("--------------------------------------");
    }


}
