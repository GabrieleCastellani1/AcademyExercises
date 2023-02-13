package it.euris.academy2023.EserciziMichael.esercizioConcessionaria.comandi;

import it.euris.academy2023.EserciziMichael.esercizioConcessionaria.concessionaria.Concessionaria;
import it.euris.academy2023.EserciziMichael.esercizioConcessionaria.comandi.parameters.BuyParameters;
import it.euris.academy2023.EserciziMichael.esercizioConcessionaria.comandi.parameters.InsertParameters;
import it.euris.academy2023.EserciziMichael.esercizioConcessionaria.comandi.parameters.SearchParameters;

import java.util.List;

public class CommandGenerator {

    public Comando<InsertParameters> createInsertCommand(List<Concessionaria> concessionarie, InsertParameters parameters) {
        return new InsertCommand<InsertParameters>(concessionarie, parameters);
    }

    public Comando<SearchParameters> createSearchCommand(SearchParameters parameters, List<Concessionaria> concessionarie) {
        return new SearchCommand<SearchParameters>(parameters, concessionarie);
    }

    public Comando<BuyParameters> createBuyCommand(List<Concessionaria> concessionarie, BuyParameters parameters) {
        return new BuyCommand<BuyParameters>(concessionarie, parameters);
    }
}
