package it.euris.academy2023.EserciziNiccolò.htmlrenderer;

import java.util.ArrayList;

public class Main {

    public static final ArrayList<String> CSV_DATA;
    public static final ArrayList<String> COLORS;

    static {
        CSV_DATA = new ArrayList<>();
        CSV_DATA.add("Azioni;20");
        CSV_DATA.add("Obbligazioni;15");
        CSV_DATA.add("Monetario EUR;10");
        CSV_DATA.add("Monetario Altro;5");
        CSV_DATA.add("Commodities;2");
        CSV_DATA.add("Polizze;8");
        CSV_DATA.add("Real Estate;15");
        CSV_DATA.add("Liquidi;25");

        COLORS = new ArrayList<>();
        COLORS.add("#FF0000");
        COLORS.add("#55AAFF");

    }

    public static void main(String[] args) {



        // Creo il sistema principale di stampa dell'html, usando una lista di stringhe rappresentante le asset class e
        // la lista dei colori
        AssetClassHTMLRenderer renderer = new AssetClassHTMLRenderer(CSV_DATA, COLORS.toArray(new String[2]));

        // Stampo l'html generato
        System.out.println(renderer.render());



    }
}
