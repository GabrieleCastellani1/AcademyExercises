package it.euris.academy2023.EserciziMichael.esercizioConcessionaria.concessionaria;

import it.euris.academy2023.EserciziMichael.esercizioConcessionaria.veicolo.Veicolo;

public class VeicoliEntry {
    private final Veicolo veicolo;
    private int quantità;
    private final float prezzo;

    public VeicoliEntry(Veicolo veicolo, int quantità, float prezzo) {
        this.veicolo = veicolo;
        this.quantità = quantità;
        this.prezzo = prezzo;
    }

    public Veicolo getVeicolo() {
        return veicolo;
    }

    public int getQuantità() {
        return quantità;
    }

    public float getPrezzo() {
        return prezzo;
    }

    public void aumentaQuantità(int num){
        this.quantità += num;
    }

    public void diminuisciQuantità(int num){
        this.quantità -= num;
    }

    @Override
    public String toString() {
        return "VeicoliEntry{" +
                "veicolo=" + veicolo +
                ", quantità=" + quantità +
                ", prezzo=" + prezzo +
                '}';
    }
}
