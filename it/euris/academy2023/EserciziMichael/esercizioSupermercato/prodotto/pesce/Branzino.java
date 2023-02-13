package it.euris.academy2023.EserciziMichael.esercizioSupermercato.prodotto.pesce;

import it.euris.academy2023.EserciziMichael.esercizioSupermercato.prodotto.TipologiaProdottoEnum;

public class Branzino extends Pesce{


    @Override
    public String getNome() {
        return null;
    }

    @Override
    public TipologiaProdottoEnum getTipo() {
        return null;
    }

    @Override
    public String getDescrizione() {
        return "è un branzino";
    }

    @Override
    public String toString() {
        return "Branzino{" +
                "nome='" + nome + '\'' +
                ", tipo=" + tipo +
                '}';
    }
}
