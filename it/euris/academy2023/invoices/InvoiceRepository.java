package it.euris.academy2023.invoices;

import it.euris.academy2023.dynamic.Comparatore;
import it.euris.academy2023.dynamic.DynamicArrayV2;

public class InvoiceRepository {

    private DynamicArrayV2 repository;

    public static int capacity;

    // eseguito automaticamente quando la classe viene caricata
    static {
        capacity = 10;
    }

    // COSTRUTTORE
    public InvoiceRepository() {
        // inizializzo le variabili di istanza
        this.repository = new DynamicArrayV2(capacity);
    }

    public void add(Invoice invoice) {
        // delego al repository l'aggiunta di un nuovo oggetto.
        // Essendo Invoice sottoclasse di Object (come tutte le classi) non necessita di cast
        this.repository.add(invoice);
    }

    public void sort() {
        //Comparatore comp = new InvoiceComparator();
        this.repository.sort(new Comparatore() {
            @Override
            public int confronta(Object o1, Object o2) {
                Invoice i1 = (Invoice) o1;
                Invoice i2 = (Invoice) o2;

                return i1.getProgressivo() - i2.getProgressivo();
            }
        });
    }

    public String toString() {
        return this.repository.toString();
    }


    public int confronta(Object o1, Object o2) {
        Invoice i1 = (Invoice) o1;
        Invoice i2 = (Invoice) o2;

        return i1.getProgressivo() - i2.getProgressivo();
    }
}
