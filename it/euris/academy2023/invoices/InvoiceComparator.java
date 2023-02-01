package it.euris.academy2023.invoices;

import it.euris.academy2023.dynamic.Comparatore;

public class InvoiceComparator implements Comparatore {

    @Override
    public int confronta(Object o1, Object o2) {
        Invoice i1 = (Invoice) o1;
        Invoice i2 = (Invoice) o2;

        return i1.getProgressivo() - i2.getProgressivo();


    }
}
