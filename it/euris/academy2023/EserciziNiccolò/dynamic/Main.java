package it.euris.academy2023.EserciziNiccolò.dynamic;

import it.euris.academy2023.EserciziNiccolò.frazione.Frazione;

public class Main {

    // Creare una classe DynamicArray con le seguenti caratteristiche:
    // - basato su un array di interi
    // - avrà una dimensione iniziale
    // - avrà un metodo per aggiungere un nuovo intero
    // - se la dimensione dell'array supera quella iniziale, dovrà in qualche modo espandersi
    // - un metodo per la stampa

    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray(2);

        //dynamicArray.add("testo 1");
        dynamicArray.add(new Frazione());
        //dynamicArray.add("testo 2");
        //.add("testo 3");

        Frazione res = (Frazione) dynamicArray.get(0);



        System.out.println(dynamicArray);
    }
}
