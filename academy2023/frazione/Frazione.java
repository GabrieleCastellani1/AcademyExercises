package it.euris.academy2023.frazione;

import it.euris.academy2023.dynamic.OggettoOrdinabile;

import java.text.DecimalFormat;
import java.util.Objects;

/**
 * Classe rappresentante una generica frazione.
 *
 * @author greppi
 */
public class Frazione implements OggettoOrdinabile {

    private int numeratore;
    private int denominatore;

    private static int precisione;
    private static int instanceCounter;

    /**
     * Permette di modificare la precisione di calcolo.
     *
     * @param precisione la precisione
     */
    public static void setPrecisione(int precisione) {
        Frazione.precisione = precisione;
        instanceCounter = 0;
    }

    /**
     * Crea una frazione partendo da un numeratore e da un denominatore.
     *
     * @param numeratore   il numeratore
     * @param denominatore il denominatore
     */
    public Frazione(int numeratore, int denominatore) {
        this.numeratore = numeratore;
        this.denominatore = denominatore;
    }

    /**
     * Crea una frazione rappresentante un numero intero
     *
     * @param numeratore il numeratore
     */
    public Frazione(int numeratore) {
        this(numeratore, 1);
    }

    /**
     * Crea una frazione rappresentante 1
     */
    public Frazione() {
        this(1, 1);
    }


    /**
     * Crea una frazione con istanza controllata, partendo da una sua rappresentazione alfanumerica (es: 3/4)
     *
     * @param frazione la stringa
     * @return un'istanza di frazione
     * @throws RuntimeException dopo aver creato 4 istanze
     */
    public static Frazione newInstance(String frazione) {
        String f = frazione.trim();
        String[] tokens = f.split("/");
        return newInstance(Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]));

    }

    /**
     * Crea una frazione con istanza controllata.
     *
     * @param numeratore   il numeratore
     * @param denominatore il denominatore
     * @return un'istanza di frazione
     * @throws RuntimeException dopo aver creato 4 istanze
     */
    public static Frazione newInstance(int numeratore, int denominatore) {
        if (instanceCounter++ < 4) {
            return new Frazione(numeratore, denominatore);
        }
        throw new RuntimeException("Non è possibile creare più di 4 istanze");
    }

    /**
     * Moltiplica l'istanza per un numero intero
     * @param intero l'intero da moltiplicare
     */
    public void moltiplica(int intero) {
        this.numeratore *= intero;
    }

    public void moltiplica(Frazione frazione) {
        this.numeratore *= frazione.numeratore;
        this.denominatore *= frazione.denominatore;
    }

    public void moltiplica(int numeratore, int denominatore) {
        this.numeratore *= numeratore;
        this.denominatore *= denominatore;
    }

    /**
     * Fornisce una rappresentazione testuale della frazione.
     * @return la stringa
     */
    public String stampa() {
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(precisione);
        return df.format((double) this.numeratore / this.denominatore);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Frazione)) return false;
        Frazione frazione = (Frazione) o;
        return this.numeratore / this.denominatore == frazione.numeratore / frazione.denominatore;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeratore / denominatore);
    }

    @Override
    public String toString() {
        return numeratore + "/" + denominatore;
    }

    /**
     * Metodo di utility per ordinare le frazioni in ordine crescente.
     * @param frazioni l'array di frazioni da ordinare
     */
    public static void ordina(Frazione[] frazioni) {

    }



    public static void main(String[] args) {
        Frazione.precisione = 4;
        Frazione f1 = Frazione.newInstance(1, 1);
        System.out.println(f1.hashCode());
        Frazione f2 = Frazione.newInstance(2, 4);
        System.out.println(f2.hashCode());
        Frazione f3 = Frazione.newInstance(10, 1);
        System.out.println(f3.hashCode());
        Frazione f4 = Frazione.newInstance(12, 4);
        System.out.println(f4.hashCode());
        Frazione f5 = Frazione.newInstance(55, 1);
        System.out.println(f5.hashCode());
        Frazione f6 = Frazione.newInstance(125, 4);
        System.out.println(f6.hashCode());




        int x = 0;
        Integer x1 = 0;
    }


    @Override
    public boolean precede(OggettoOrdinabile altro) {
        Frazione f = (Frazione) altro;
        return (this.numeratore / this.denominatore) < (f.numeratore / f.denominatore);
    }
}


