package it.euris.academy2023.EserciziMichael.esercizioSupermercato.prodotto.pesce;

import it.euris.academy2023.EserciziMichael.esercizioSupermercato.prodotto.Prodotto;
import it.euris.academy2023.EserciziMichael.esercizioSupermercato.prodotto.TipologiaProdottoEnum;

public abstract class Pesce implements Prodotto {
    protected String nome;
    protected TipologiaProdottoEnum tipo;

    @Override
    public String getNome(){
        return nome;
    }

    @Override
    public TipologiaProdottoEnum getTipo(){
        return tipo;
    }
}
