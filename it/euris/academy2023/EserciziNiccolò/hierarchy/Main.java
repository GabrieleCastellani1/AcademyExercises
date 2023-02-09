package it.euris.academy2023.EserciziNiccolò.hierarchy;

import java.util.ArrayList;
import java.util.Collections;

public class Main {



    public static void main(String[] args) {
        try {
            System.out.println("do something");
            System.exit(0);
        } catch (Exception e) {

        } finally {
            System.out.println("finally");
        }


        ArrayList<Figura> figure = new ArrayList<>();
        figure.add(new Rettangolo(10, 5));
        figure.add(new Rettangolo(5, 3));
        figure.add(new Quadrato(5));
        figure.add(new Cerchio(2));

        Figura figuraGigantesca = new Figura() {
            @Override
            public int calcolaPerimetro() {
                return Integer.MAX_VALUE;
            }

            @Override
            public int calcolaArea() {
                return Integer.MAX_VALUE;
            }

            @Override
            public int compareTo(Object o) {
                return 1; // ha sempre l'area maggiore rispetto alle altre
            }
        };

        figure.add(figuraGigantesca);

        Collections.sort(figure);

        for (Figura r : figure) {
            System.out.println(r.calcolaArea());
        }
    }


    private static void stampaPerimetro(Figura f) {
        System.out.println(f.calcolaPerimetro()); // NOSONAR
    }
}
