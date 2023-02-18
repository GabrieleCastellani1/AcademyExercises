package it.euris.academy2023.EserciziMichael.esercizioConcessionaria.comandi;

import it.euris.academy2023.EserciziMichael.esercizioConcessionaria.commandFormatException;
import it.euris.academy2023.EserciziMichael.esercizioConcessionaria.concessionaria.CatalogoConcessionaria;
import it.euris.academy2023.EserciziMichael.esercizioConcessionaria.concessionaria.NotPresentException;
import it.euris.academy2023.EserciziMichael.esercizioConcessionaria.comandi.parameters.InsertParameters;
import it.euris.academy2023.EserciziMichael.esercizioConcessionaria.concessionaria.VeicoliEntry;
import it.euris.academy2023.EserciziMichael.esercizioConcessionaria.veicolo.Veicolo;
import it.euris.academy2023.EserciziMichael.esercizioConcessionaria.veicolo.VeicoloFactory;

public class InsertCommand <T extends InsertParameters> implements Comando<T> {

    private final CatalogoConcessionaria catalogoConcessionaria;
    private final Veicolo veicolo;
    private final int quantità;
    private final float prezzo;
    public InsertCommand(CatalogoConcessionaria catalogoConcessionaria,
                         InsertParameters parameters){
        this.catalogoConcessionaria = catalogoConcessionaria;
        this.veicolo = parameters.getVeicolo();
        this.quantità = parameters.getQuantità();
        this.prezzo = parameters.getPrezzo();
    }


    public String doCommand(){
        try {
            catalogoConcessionaria
                    .aumentaQuantitàVeicolo(
                            catalogoConcessionaria.cercaEntryVeicolo(veicolo),
                            quantità);
            return "inserimento effettuato";
        } catch (NotPresentException e) {
            catalogoConcessionaria
                    .addEntry(veicolo, quantità, prezzo);
            return "inserimento effettuato";
        }
    }

    @Override
    public TipologiaComando getComando() {
        return TipologiaComando.insertCommand;
    }

    @Override
    public T getParameters() {
        return null;
    }
}
