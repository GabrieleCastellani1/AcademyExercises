package it.euris.academy2023.EserciziMichael.esercizioConcessionaria.comandi.parameters;

public class ParametersCreator {
    public SearchParameters createSearchParameters(String tipo, String marca, String nome) {
        return new SearchParameters(tipo, marca, nome);
    }

    public BuyParameters createBuyParameters(String concessionaria, String tipo, String marca, String nome, int quantità) {
        return new BuyParameters(concessionaria, tipo, marca, nome, quantità);
    }

    public InsertParameters createInsertParameters(String concessionaria, String tipo, String marca, String nome, int quantità, float prezzo) {
        return new InsertParameters(concessionaria, tipo, marca, nome, quantità, prezzo);
    }
}