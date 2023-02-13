package it.euris.academy2023.EserciziMichael.esercizioConcessionaria.comandi;

import it.euris.academy2023.EserciziMichael.esercizioConcessionaria.concessionaria.NotPresentException;
import it.euris.academy2023.EserciziMichael.esercizioConcessionaria.concessionaria.Concessionaria;
import it.euris.academy2023.EserciziMichael.esercizioConcessionaria.comandi.parameters.BuyParameters;

import java.util.List;

public class BuyCommand<T extends BuyParameters> implements Comando<T> {
    private final List<Concessionaria> concessionarie;
    private final String concessionaria;
    private final String tipo;
    private final String marca;
    private final String nome;
    private final int quantità;

    public BuyCommand(List<Concessionaria> concessionarie, T parameters) {
        this.concessionarie = concessionarie;
        this.concessionaria = parameters.getConcessionaria();
        this.tipo = parameters.getTipo();
        this.marca = parameters.getMarca();
        this.nome = parameters.getNome();
        this.quantità = parameters.getQuantità();
    }


    @Override
    public String doCommand() {
        Concessionaria c = null;
        try {
            concessionarie.stream()
                    .filter(con -> con.getNome().equalsIgnoreCase(concessionaria))
                    .findAny()
                    .orElseThrow(() -> new NotPresentException("la concessionaria non è presente"))
                    .acquistaVeicolo(tipo, nome, marca, quantità);
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
