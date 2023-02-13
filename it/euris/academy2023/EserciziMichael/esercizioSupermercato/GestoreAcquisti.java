package it.euris.academy2023.EserciziMichael.esercizioSupermercato;

import it.euris.academy2023.EserciziMichael.esercizioSupermercato.exceptions.EntryNotPresentExceeption;
import it.euris.academy2023.EserciziMichael.esercizioSupermercato.exceptions.MarketNotPresentException;
import it.euris.academy2023.EserciziMichael.esercizioSupermercato.exceptions.ProductNotPresentException;
import it.euris.academy2023.EserciziMichael.esercizioSupermercato.exceptions.TooMuchException;
import it.euris.academy2023.EserciziMichael.esercizioSupermercato.carrello.Carrello;
import it.euris.academy2023.EserciziMichael.esercizioSupermercato.carrello.EntryCarrello;
import it.euris.academy2023.EserciziMichael.esercizioSupermercato.supermercato.EntryReparto;

public class GestoreAcquisti {
    private Carrello c;
    private GestoreSupermercati gestore;

    public GestoreAcquisti(Carrello c, GestoreSupermercati gestore) {
        this.c = c;
        this.gestore = gestore;
    }

    public String acquistaDaSupermercato(String prodotto, String supermercato, int quantità) throws MarketNotPresentException {
        try {
            EntryReparto e = gestore.acquistaDaSupermercato(prodotto, supermercato, quantità);
            c.addProdotto(new EntryCarrello(e, gestore.findMarket(supermercato)));
        } catch (TooMuchException e) {
            return "la quantità richiesta non è disponibile";
        } catch (ProductNotPresentException e){
            return "il prodotto non esiste";
        }
        return "prodotto acquistato";
    }

    public String rimuoviDaCarrello(String prodotto) throws EntryNotPresentExceeption {
        EntryCarrello entry = c.getProdotti()
                .stream()
                .filter(p -> p.getProdotto()
                                .getNome()
                                .equalsIgnoreCase(prodotto))
                                .findFirst()
                                .orElseThrow(() -> new EntryNotPresentExceeption());
        try{
            gestore.putDownProduct(entry.getS(), entry.getR(), entry.getProdotto(), entry.getQuantità());
            c.removeProdotto(entry);
        }catch(Exception e){
            return e.getMessage();
        }
        return "prodotto rimosso";
    }

    public String stampaCarrello(){
        return c.toString();
    }

    public String checkoutCarrello(){
        return c.checkout();
    }
}
