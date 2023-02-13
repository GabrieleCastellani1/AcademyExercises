package it.euris.academy2023.EserciziMichael.esercizioSupermercato.carrello;

import java.util.List;

public class Carrello {
    private List<EntryCarrello> prodotti;

    public void removeProdotto(EntryCarrello entry){
        this.prodotti.remove(entry);
    }

    public void addProdotto(EntryCarrello entry){
        this.prodotti.add(entry);
    }

    public List<EntryCarrello> getProdotti() {
        return prodotti;
    }

    public String checkout(){
        String checkout =  "";
        for (EntryCarrello entry : prodotti) {
            checkout += entry.getProdotto().toString() + entry.getQuantità() + "\n";
        }
        return checkout;
    }

    @Override
    public String toString() {
        return "Carrello{" +
                "prodotti=" + prodotti +
                '}';
    }
}
