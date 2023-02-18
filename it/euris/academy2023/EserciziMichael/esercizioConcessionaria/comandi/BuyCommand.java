package it.euris.academy2023.EserciziMichael.esercizioConcessionaria.comandi;

import it.euris.academy2023.EserciziMichael.esercizioConcessionaria.concessionaria.NotPresentException;
import it.euris.academy2023.EserciziMichael.esercizioConcessionaria.concessionaria.CatalogoConcessionaria;
import it.euris.academy2023.EserciziMichael.esercizioConcessionaria.comandi.parameters.BuyParameters;

public class BuyCommand<T extends BuyParameters> implements Comando<T> {
    private final CatalogoConcessionaria catalogoConcessionaria;
    private final String tipo;
    private final String marca;
    private final String nome;
    private final int quantità;

    public BuyCommand(CatalogoConcessionaria catalogoConcessionaria, T parameters) {
        this.catalogoConcessionaria = catalogoConcessionaria;
        this.tipo = parameters.getTipo();
        this.marca = parameters.getMarca();
        this.nome = parameters.getNome();
        this.quantità = parameters.getQuantità();
    }


    @Override
    public String doCommand() {
        CatalogoConcessionaria c = null;
        try {
            catalogoConcessionaria.acquistaVeicolo(tipo, nome, marca, quantità);
        } catch (NotPresentException e) {
            System.out.println("il veicolo non è presente");
        }
        return "acquisto effettuato";
    }

    @Override
    public TipologiaComando getComando() {
        return TipologiaComando.buyCommand;
    }

    @Override
    public T getParameters() {
        return null;
    }
}
