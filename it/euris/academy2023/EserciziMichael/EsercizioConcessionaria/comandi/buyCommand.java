package it.euris.academy2023.EserciziMichael.EsercizioConcessionaria.comandi;

import it.euris.academy2023.EserciziMichael.EsercizioConcessionaria.concessionaria.NotPresentException;
import it.euris.academy2023.EserciziMichael.EsercizioConcessionaria.concessionaria.Concessionaria;

import java.util.List;

public class buyCommand implements Comando {
    private List<Concessionaria> concessionarie;
    private String concessionaria;
    private String tipo;
    private String marca;
    private String nome;
    private int quantità;

    public buyCommand(List<Concessionaria> concessionarie, String concessionaria, String tipo, String marca, String nome, int quantità) {
        this.concessionarie = concessionarie;
        this.concessionaria = concessionaria;
        this.tipo = tipo;
        this.marca = marca;
        this.nome = nome;
        this.quantità = quantità;
    }


    @Override
    public String execute() {
        Concessionaria c = concessionarie.stream().filter(con -> con.getNome().equalsIgnoreCase(concessionaria)).findAny().get();
        try {
            c.acquistaVeicolo(tipo, nome, marca, quantità);
        } catch (NotPresentException e) {
            System.out.println("il veicolo non è presente");
        }
        return "acquisto effettuato";
    }

    @Override
    public TipologiaComando getComando() {
        return TipologiaComando.buyCommand;
    }
}
