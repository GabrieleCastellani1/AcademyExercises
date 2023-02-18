package it.euris.academy2023.EserciziMichael.esercizioConcessionaria.comandi.parameters;

import it.euris.academy2023.EserciziMichael.esercizioConcessionaria.veicolo.Veicolo;

public class ParametersCreator {
    public SearchParameters createSearchParameters(String tipo, String marca, String nome) {
        return new SearchParameters(tipo, marca, nome);
    }

    public BuyParameters createBuyParameters(String concessionaria, String tipo, String marca, String nome, int quantità) {
        return new BuyParameters(concessionaria, tipo, marca, nome, quantità);
    }

    public InsertParameters createInsertParameters(String concessionaria, Veicolo veicolo, int quantità, float prezzo) {
        return new InsertParameters(concessionaria, veicolo, quantità, prezzo);
    }
}