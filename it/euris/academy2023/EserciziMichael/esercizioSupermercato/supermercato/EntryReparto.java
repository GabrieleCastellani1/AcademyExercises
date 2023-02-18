package it.euris.academy2023.EserciziMichael.esercizioSupermercato.supermercato;

import it.euris.academy2023.EserciziMichael.esercizioSupermercato.exceptions.TooMuchException;
import it.euris.academy2023.EserciziMichael.esercizioSupermercato.prodotto.Prodotto;

public class EntryReparto {
    private final Prodotto prodotto;
    private int quantità;
    private final float prezzo;
    private final Reparto r;

    public Prodotto getProdotto() {
        return prodotto;
    }

    public int getQuantità() {
        return quantità;
    }

    public float getPrezzo() {
        return prezzo;
    }

    public Reparto getReparto() {
        return r;
    }

    public EntryReparto(Prodotto prodotto, int quantità, float prezzo, Reparto r) {
        this.prodotto = prodotto;
        this.quantità = quantità;
        this.prezzo = prezzo;
        this.r = r;
    }

    @Override
    public String toString() {
        return "EntryReparto{" +
                "prodotto=" + prodotto +
                ", quantità=" + quantità +
                ", prezzo=" + prezzo +
                '}';
    }

    public void diminuisciQuantità(int quantità) throws TooMuchException {
        if(this.quantità > quantità){
            this.quantità -= quantità;
        }else{
            throw new TooMuchException();
        }
    }

    public void aumentaQuantità(int quantità){
        this.quantità += quantità;
    }
}
