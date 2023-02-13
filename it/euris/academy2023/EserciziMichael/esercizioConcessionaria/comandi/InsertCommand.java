package it.euris.academy2023.EserciziMichael.esercizioConcessionaria.comandi;

import it.euris.academy2023.EserciziMichael.esercizioConcessionaria.concessionaria.Concessionaria;
import it.euris.academy2023.EserciziMichael.esercizioConcessionaria.concessionaria.NotPresentException;
import it.euris.academy2023.EserciziMichael.esercizioConcessionaria.comandi.parameters.InsertParameters;

import java.util.List;
import java.util.Optional;

public class InsertCommand <T extends InsertParameters> implements Comando<T> {
    private final List<Concessionaria> concessionarie;
    private final String concessionaria;
    private final String tipo;
    private final String marca;
    private final String nome;
    private final int quantità;
    private final float prezzo;
    public InsertCommand(List<Concessionaria> concessionarie,
                         InsertParameters parameters){
        this.concessionarie = concessionarie;
        this.concessionaria = parameters.getConcessionaria();
        this.tipo = parameters.getTipo();
        this.marca = parameters.getMarca();
        this.nome = parameters.getNome();
        this.quantità = parameters.getQuantità();
        this.prezzo = parameters.getPrezzo();
    }

    @Override
    public String doCommand() {
        Optional<Concessionaria> conc = null;
        try {
            this.concessionarie
                    .stream()
                    .filter(c -> c
                            .getNome()
                            .equalsIgnoreCase(concessionaria))
                    .findFirst()
                    .orElseThrow(() -> new NotPresentException("la concessionaria non è presente"))
                    .addEntryVeicolo(tipo, marca, nome, quantità, prezzo);
        } catch (NotPresentException e) {
            throw new RuntimeException(e);
        }

        return "Operazione di inserimento eseguita";
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
