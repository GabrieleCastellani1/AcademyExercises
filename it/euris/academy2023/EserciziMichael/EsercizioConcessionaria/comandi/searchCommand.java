package it.euris.academy2023.EserciziMichael.EsercizioConcessionaria.comandi;

import it.euris.academy2023.EserciziMichael.EsercizioConcessionaria.concessionaria.NotPresentException;
import it.euris.academy2023.EserciziMichael.EsercizioConcessionaria.concessionaria.Concessionaria;

import java.util.ArrayList;
import java.util.List;

public class searchCommand implements Comando {
    private String tipo;
    private String marca;
    private String nome;
    private List<Concessionaria> concessionarie;

    public searchCommand(String tipo, String marca, String nome, List<Concessionaria> concessionarie) {
        this.tipo = tipo;
        this.marca = marca;
        this.nome = nome;
        this.concessionarie = concessionarie;
    }


    @Override
    public String execute() {
        List<String> veicoli = new ArrayList<>();
        try {
            for (Concessionaria c : concessionarie) {
                veicoli.add(c.cercaVeicolo(tipo, marca, nome).toString());
            }
        } catch (NotPresentException e) {
            return "il veicolo non è presente";
        }
        String s = "Operazione di ricerca eseguita, sono stati trovati: ";
        for (String v : veicoli) {
            s += v + "\n";
        }
        return s;
    }

    @Override
    public TipologiaComando getComando() {
        return TipologiaComando.searchCommand;
    }
}
