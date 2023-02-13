package it.euris.academy2023.EserciziMichael.esercizioSupermercato.carrello;

import it.euris.academy2023.EserciziMichael.esercizioSupermercato.prodotto.Prodotto;
import it.euris.academy2023.EserciziMichael.esercizioSupermercato.supermercato.EntryReparto;
import it.euris.academy2023.EserciziMichael.esercizioSupermercato.supermercato.Reparto;
import it.euris.academy2023.EserciziMichael.esercizioSupermercato.supermercato.Supermercato;

public class EntryCarrello {
    private Reparto r;
    private Prodotto prodotto;
    private int quantità;
    private float prezzo;
    private Supermercato s;

    public EntryCarrello(EntryReparto entryReparto, Supermercato s) {
        this.r = entryReparto.getR();
        this.prodotto = entryReparto.getProdotto();
        this.quantità = entryReparto.getQuantità();
        this.prezzo = entryReparto.getPrezzo();
        this.s = s;
    }

    public Reparto getR() {
        return r;
    }

    public Prodotto getProdotto() {
        return prodotto;
    }

    public int getQuantità() {
        return quantità;
    }

    public float getPrezzo() {
        return prezzo;
    }

    public Supermercato getS() {
        return s;
    }

    @Override
    public String toString() {
        return "EntryCarrello{" +
                "r=" + r +
                ", prodotto=" + prodotto +
                ", quantità=" + quantità +
                ", prezzo=" + prezzo +
                ", s=" + s +
                '}';
    }
}
