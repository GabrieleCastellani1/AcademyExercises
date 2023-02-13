package it.euris.academy2023.EserciziMichael.esercizioSupermercato.supermercato;

import it.euris.academy2023.EserciziMichael.esercizioSupermercato.exceptions.ProductNotPresentException;
import it.euris.academy2023.EserciziMichael.esercizioSupermercato.exceptions.RepartoNotPresentException;
import it.euris.academy2023.EserciziMichael.esercizioSupermercato.exceptions.TooMuchException;
import it.euris.academy2023.EserciziMichael.esercizioSupermercato.prodotto.Prodotto;

import java.util.List;
import java.util.stream.Collectors;

public class Supermercato {
    private String nome;
    private List<Reparto> reparti;

    public EntryReparto findProdotto(String nome) throws ProductNotPresentException {
        EntryReparto entry = reparti
                .stream()
                .flatMap(e -> e.getEntryProdotti().stream())
                .filter(p -> p.getProdotto().getNome().equalsIgnoreCase(nome))
                .findFirst()
                .orElseThrow(() -> new ProductNotPresentException());
        return entry;
    }

    public List<Prodotto> findAllProdotti(){
        return reparti
                .stream()
                .flatMap(r -> r.getEntryProdotti().stream())
                .map(e -> e.getProdotto())
                .collect(Collectors.toList());
    }

    public boolean isPresent(String nome){
        return reparti
                .stream()
                .anyMatch(r -> r.getNome().equalsIgnoreCase(nome));
    }

    public String getNome() {
        return nome;
    }

    public void acquistaProdotto(String nome, int quantità) throws ProductNotPresentException, TooMuchException {
        EntryReparto entry = findProdotto(nome);
        entry.diminuisciQuantità(quantità);
    }

    public void aggiungiProdottoAReparto(Reparto r, Prodotto prodotto, int quantità) throws RepartoNotPresentException, ProductNotPresentException {
        Reparto reparto = this.reparti.stream()
                                        .filter(rep -> rep.equals(r))
                                        .findFirst()
                                        .orElseThrow(() -> new RepartoNotPresentException());

        EntryReparto entry = r.getEntryProdotti()
                .stream()
                .filter(e -> e.getProdotto().equals(prodotto))
                .findFirst()
                .orElseThrow(() -> new ProductNotPresentException());

        entry.aumentaQuantità(quantità);
    }
}
