package it.euris.academy2023.EserciziMichael.esercizioSupermercato.supermercato;

import it.euris.academy2023.EserciziMichael.esercizioSupermercato.prodotto.Prodotto;
import it.euris.academy2023.EserciziMichael.esercizioSupermercato.prodotto.TipologiaProdottoEnum;

import java.util.List;

public class Reparto {

    private String nome;
    private TipologiaProdottoEnum tipo;
    private final List<EntryReparto> EntryProdotti;

    public Reparto(List<EntryReparto> entryProdotti) {
        EntryProdotti = entryProdotti;
    }

    public List<EntryReparto> getEntryProdotti() {
        return EntryProdotti;
    }

    public String getNome() {
        return nome;
    }

    public TipologiaProdottoEnum getTipo(){
        return tipo;
    }
}
