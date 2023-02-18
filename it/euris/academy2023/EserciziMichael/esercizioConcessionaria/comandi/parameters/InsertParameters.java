package it.euris.academy2023.EserciziMichael.esercizioConcessionaria.comandi.parameters;

import it.euris.academy2023.EserciziMichael.esercizioConcessionaria.veicolo.Veicolo;

public class InsertParameters implements CommandParameters{
    private final String concessionaria;
    private final Veicolo veicolo;
    private final int quantità;
    private final float prezzo;

    public InsertParameters(String concessionaria, Veicolo veicolo, int quantità, float prezzo) {
        this.concessionaria = concessionaria;
        this.veicolo = veicolo;
        this.quantità = quantità;
        this.prezzo = prezzo;
    }

    @Override
    public String[] getParameters() {
        return new String[]{concessionaria, veicolo.toString(), quantità + "", prezzo + ""};
    }

    public String getConcessionaria() {
        return concessionaria;
    }

    public int getQuantità() {
        return quantità;
    }

    public float getPrezzo() {
        return prezzo;
    }

    public Veicolo getVeicolo() {
        return this.veicolo;
    }
}
