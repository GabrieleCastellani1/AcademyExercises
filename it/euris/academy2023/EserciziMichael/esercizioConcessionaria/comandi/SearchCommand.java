package it.euris.academy2023.EserciziMichael.esercizioConcessionaria.comandi;

import it.euris.academy2023.EserciziMichael.esercizioConcessionaria.concessionaria.NotPresentException;
import it.euris.academy2023.EserciziMichael.esercizioConcessionaria.concessionaria.Concessionaria;
import it.euris.academy2023.EserciziMichael.esercizioConcessionaria.comandi.parameters.SearchParameters;

import java.util.List;

public class SearchCommand <T extends SearchParameters> implements Comando<T> {
    private final String tipo;
    private final String marca;
    private final String nome;
    private final List<Concessionaria> concessionarie;

    public SearchCommand(T parameters , List<Concessionaria> concessionarie) {
        this.tipo = parameters.getTipo();
        this.marca = parameters.getMarca();
        this.nome = parameters.getNome();
        this.concessionarie = concessionarie;
    }


    @Override
    public String doCommand() {
        this.concessionarie.forEach(a -> {
            try {
                System.out.println(a.cercaVeicolo(tipo, marca, nome).toString() + "\n");
            } catch (NotPresentException e) {
                throw new RuntimeException(e);
            }
        });
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
