package it.euris.academy2023.EserciziMichael.esercizioConcessionaria.comandi;

import it.euris.academy2023.EserciziMichael.esercizioConcessionaria.comandi.parameters.SearchParameters;
import it.euris.academy2023.EserciziMichael.esercizioConcessionaria.concessionaria.CatalogoConcessionaria;

import java.util.Iterator;

public class SearchAllCommand implements Comando<SearchParameters>{
    private CommandGenerator generator;
    private Iterator<CatalogoConcessionaria> iterator;
    private SearchParameters parameters;

    public SearchAllCommand(CommandGenerator generator, Iterator<CatalogoConcessionaria> iterator, SearchParameters params) {
        this.generator = generator;
        this.iterator = iterator;
        this.parameters = params;
    }

    @Override
    public String doCommand() {
        StringBuilder result = new StringBuilder();
        for (Iterator<CatalogoConcessionaria> iterator = this.iterator; iterator.hasNext();){
            result.append(generator.createSearchCommand(parameters, iterator.next()));
        }
        return result.toString();
    }

    @Override
    public TipologiaComando getComando() {
        return TipologiaComando.insertCommand;
    }

    @Override
    public SearchParameters getParameters() {
        return parameters;
    }
}
