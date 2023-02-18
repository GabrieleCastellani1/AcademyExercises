package it.euris.academy2023.EserciziMichael.esercizioSupermercato;

import it.euris.academy2023.EserciziMichael.esercizioSupermercato.exceptions.*;
import it.euris.academy2023.EserciziMichael.esercizioSupermercato.prodotto.Prodotto;
import it.euris.academy2023.EserciziMichael.esercizioSupermercato.supermercato.EntryReparto;
import it.euris.academy2023.EserciziMichael.esercizioSupermercato.supermercato.Reparto;
import it.euris.academy2023.EserciziMichael.esercizioSupermercato.supermercato.Supermercato;

import java.util.List;

public class GestoreSupermercati {
    private List<Supermercato> supermercati;

    public String findProdotto(String prodotto, String supermercato) throws MarketNotPresentException {
        Supermercato s = supermercati.stream()
                .filter(sup -> sup.getNome().equalsIgnoreCase(supermercato))
                .findAny()
                .orElseThrow(() -> new MarketNotPresentException());
        try {
            return s.findProdotto(prodotto).toString();
        }catch(ProductNotPresentException e){
                return "il prodotto non è presente";
        }
    }

    public String findAllProdotti(String supermercato) throws MarketNotPresentException {
        Supermercato s = supermercati.stream()
                .filter(sup -> sup.getNome().equalsIgnoreCase(supermercato))
                .findAny()
                .orElseThrow((() -> new MarketNotPresentException()));
        List<Prodotto> prodotti = s.findAllProdotti();
        String result = "";
        for (Prodotto p : prodotti) {
            result += p.toString();
        }
        return result;
    }

    public String isPresent(String supermercato, String nomeReparto) throws MarketNotPresentException {
        Supermercato s =  supermercati
                        .stream()
                        .filter(sup -> sup.getNome().equalsIgnoreCase(supermercato))
                        .findFirst()
                        .orElseThrow(() -> new MarketNotPresentException());
        return s.isPresent(nomeReparto) + "";
    }

    public EntryReparto acquistaDaSupermercato(String prodotto, String supermercato, int quantità) throws ProductNotPresentException, TooMuchException, MarketNotPresentException{
        Supermercato s =  supermercati
                .stream()
                .filter(sup -> sup.getNome().equalsIgnoreCase(supermercato))
                .findFirst()
                .orElseThrow(() -> new MarketNotPresentException());
            s.acquistaProdotto(prodotto, quantità);
        return s.findProdotto(prodotto);
    }

    public Supermercato findMarket(String nome) throws MarketNotPresentException {
        Supermercato s = supermercati.stream()
                .filter(sup -> sup.getNome().equalsIgnoreCase(nome))
                .findFirst()
                .orElseThrow(() -> new MarketNotPresentException());
        return s;
    }

    public void putDownProduct(Supermercato s, Reparto r, Prodotto prodotto, int quantità) throws RepartoNotPresentException, ProductNotPresentException {
        s.aggiungiProdottoAReparto(r, prodotto, quantità);
    }
}
