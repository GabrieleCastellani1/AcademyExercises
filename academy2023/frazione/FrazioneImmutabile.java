package it.euris.academy2023.frazione;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

/**
 * Classe rappresentante una generica frazione.
 *
 * @author greppi
 */
public class FrazioneImmutabile {

    private final int numeratore;
    private final int denominatore;

    private static HashMap<String, FrazioneImmutabile> frazioniPool;
    private static int instanceNumber;
    private static int precisione;

    static {
        frazioniPool = new HashMap<>();
    }

    /**
     * Permette di modificare la precisione di calcolo.
     *
     * @param precisione la precisione
     */
    public static void setPrecisione(int precisione) {
        FrazioneImmutabile.precisione = precisione;
    }

    /**
     * Crea una frazione partendo da un numeratore e da un denominatore.
     *
     * @param numeratore   il numeratore
     * @param denominatore il denominatore
     */
    public FrazioneImmutabile(int numeratore, int denominatore) {
        this.numeratore = numeratore;
        this.denominatore = denominatore;
    }

    /**
     * Crea una frazione rappresentante un numero intero
     *
     * @param numeratore il numeratore
     */
    public FrazioneImmutabile(int numeratore) {
        this(numeratore, 1);
    }

    /**
     * Crea una frazione rappresentante 1
     */
    public FrazioneImmutabile() {
        this(1, 1);
    }


    /**
     * Crea una frazione con istanza controllata, partendo da una sua rappresentazione alfanumerica (es: 3/4)
     *
     * @param frazione la stringa
     * @return un'istanza di frazione
     * @throws RuntimeException dopo aver creato 4 istanze
     */
    public static FrazioneImmutabile newInstance(String frazione) {
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
     */
    public static FrazioneImmutabile newInstance(int numeratore, int denominatore) {
        String key = "_" + (double) numeratore / denominatore;
        if (!frazioniPool.containsKey(key)) {
            frazioniPool.put(key, new FrazioneImmutabile(numeratore, denominatore));
            instanceNumber++;
        }
        return frazioniPool.get(key);
    }

    /**
     * Moltiplica l'istanza per un numero intero
     *
     * @param intero l'intero da moltiplicare
     */
    public FrazioneImmutabile moltiplica(int intero) {
        return new FrazioneImmutabile(this.numeratore * intero);
    }

    public FrazioneImmutabile moltiplica(FrazioneImmutabile frazione) {
        return new FrazioneImmutabile(this.numeratore * frazione.numeratore, this.denominatore * frazione.denominatore);
    }

    public FrazioneImmutabile moltiplica(int numeratore, int denominatore) {
        return new FrazioneImmutabile(this.numeratore * numeratore, this.denominatore * denominatore);
    }

    /**
     * Fornisce una rappresentazione testuale della frazione.
     *
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
        if (!(o instanceof FrazioneImmutabile)) return false;
        FrazioneImmutabile frazione = (FrazioneImmutabile) o;
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
     *
     * @param frazioni l'array di frazioni da ordinare
     */
    public static void ordina(FrazioneImmutabile[] frazioni) {

    }

    public static int getInstanceNumber() {
        return instanceNumber;
    }

    public static void main(String[] args) {
        FrazioneImmutabile.precisione = 4;
        FrazioneImmutabile f1 = FrazioneImmutabile.newInstance(1, 1);
        System.out.println(f1.hashCode());
        FrazioneImmutabile f2 = FrazioneImmutabile.newInstance(2, 4);
        System.out.println(f2.hashCode());
        FrazioneImmutabile f3 = FrazioneImmutabile.newInstance(1, 2);
        System.out.println(f3.hashCode());
        FrazioneImmutabile f4 = FrazioneImmutabile.newInstance(12, 4);
        System.out.println(f4.hashCode());
        FrazioneImmutabile f5 = FrazioneImmutabile.newInstance(1, 2);
        System.out.println(f5.hashCode());
        FrazioneImmutabile f6 = FrazioneImmutabile.newInstance(125, 4);
        System.out.println(f6.hashCode());

        System.out.println("Num istanze: " + FrazioneImmutabile.getInstanceNumber());
    }


}


