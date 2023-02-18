package it.euris.academy2023.EserciziMichael.esercizioConcessionaria.comandi;

import it.euris.academy2023.EserciziMichael.esercizioConcessionaria.concessionaria.NotPresentException;
import it.euris.academy2023.EserciziMichael.esercizioConcessionaria.concessionaria.CatalogoConcessionaria;
import it.euris.academy2023.EserciziMichael.esercizioConcessionaria.comandi.parameters.SearchParameters;

public class SearchSingleCommand<T extends SearchParameters> implements Comando<T> {
    private final String tipo;
    private final String marca;
    private final String nome;
    private final CatalogoConcessionaria catalogoConcessionaria;
    public SearchSingleCommand(T parameters , CatalogoConcessionaria catalogoConcessionaria) {
        this.tipo = parameters.getTipo();
        this.marca = parameters.getMarca();
        this.nome = parameters.getNome();
        this.catalogoConcessionaria = catalogoConcessionaria;
    }

    @Override
    public String doCommand() {
            try {
                System.out.println("in " + catalogoConcessionaria.getNomeConcessionaria() + " " + catalogoConcessionaria.cercaEntryVeicolo(tipo, marca, nome).toString() + "\n");
            } catch (NotPresentException e) {
                throw new RuntimeException(e);
            }
        return "Operazione di inserimento eseguita";
    }

    @Override
    public TipologiaComando getComando() {
        return TipologiaComando.searchCommand;
    }

    @Override
    public T getParameters() {
        return null;
    }
}
