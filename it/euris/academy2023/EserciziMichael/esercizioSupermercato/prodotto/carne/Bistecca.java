package it.euris.academy2023.EserciziMichael.esercizioSupermercato.prodotto.carne;

import it.euris.academy2023.EserciziMichael.esercizioSupermercato.prodotto.TipologiaProdottoEnum;

public class Bistecca extends Carne {
    @Override
    public String getDescrizione() {
        return "è una bistecca";
    }

    public Bistecca(String nome, TipologiaProdottoEnum tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Bistecca{" +
                "nome='" + nome + '\'' +
                ", tipo=" + tipo +
                '}';
    }
}
