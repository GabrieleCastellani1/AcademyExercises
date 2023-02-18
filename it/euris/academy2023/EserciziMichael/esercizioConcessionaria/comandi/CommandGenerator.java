package it.euris.academy2023.EserciziMichael.esercizioConcessionaria.comandi;

import it.euris.academy2023.EserciziMichael.esercizioConcessionaria.concessionaria.CatalogoConcessionaria;
import it.euris.academy2023.EserciziMichael.esercizioConcessionaria.comandi.parameters.BuyParameters;
import it.euris.academy2023.EserciziMichael.esercizioConcessionaria.comandi.parameters.InsertParameters;
import it.euris.academy2023.EserciziMichael.esercizioConcessionaria.comandi.parameters.SearchParameters;

import java.util.Iterator;

public class CommandGenerator {

    public Comando<InsertParameters> createInsertCommand(CatalogoConcessionaria catalogoConcessionaria, InsertParameters parameters) {
        return new InsertCommand<InsertParameters>(catalogoConcessionaria, parameters);
    }

    public Comando<SearchParameters> createSearchCommand(SearchParameters parameters, CatalogoConcessionaria catalogoConcessionaria) {
        return new SearchSingleCommand<SearchParameters>(parameters, catalogoConcessionaria);
    }

    public Comando<BuyParameters> createBuyCommand(CatalogoConcessionaria catalogoConcessionaria, BuyParameters parameters) {
        return new BuyCommand<BuyParameters>(catalogoConcessionaria, parameters);
    }

    public Comando<SearchParameters> createSearchAllCommand(CommandGenerator generator, Iterator<CatalogoConcessionaria> iterator, SearchParameters parameters ){
        return new SearchAllCommand(generator, iterator, parameters);
    }
}
