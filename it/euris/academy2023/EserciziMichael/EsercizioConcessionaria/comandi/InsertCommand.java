package it.euris.academy2023.EserciziMichael.EsercizioConcessionaria.comandi;

import it.euris.academy2023.EserciziMichael.EsercizioConcessionaria.concessionaria.Concessionaria;

import java.util.List;
import java.util.Optional;

public class InsertCommand implements Comando {
    private List<Concessionaria> concessionarie;
    private String concessionaria;
    private String tipo;
    private String marca;
    private String nome;
    private int quantità;
    private float prezzo;
    public InsertCommand(List<Concessionaria> concessionarie,
                         String concessionaria,
                         String tipo,
                         String marca,
                         String nome,
                         int quantità,
                         float prezzo){
        this.concessionarie = concessionarie;
        this.concessionaria = concessionaria;
        this.tipo = tipo;
        this.marca = marca;
        this.nome = nome;
        this.quantità = quantità;
        this.prezzo = prezzo;
    }

    @Override
    public String execute() {
        Optional<Concessionaria> conc = this.concessionarie
                .stream()
                .filter(c -> c
                        .getNome()
                        .equalsIgnoreCase(concessionaria))
                .findFirst();
        if (conc.isPresent()) {
            conc.get().addEntryVeicolo(tipo, marca, nome, quantità, prezzo);
        }
        return "Operazione di inserimento eseguita";
    }

    @Override
    public TipologiaComando getComando() {
        return TipologiaComando.insertCommand;
    }
}
