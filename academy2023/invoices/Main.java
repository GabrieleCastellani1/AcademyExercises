package it.euris.academy2023.invoices;

public class Main {

    public static void main(String[] args) {
        InvoiceRepository repository = new InvoiceRepository();

        repository.add(new Invoice(2, "Ordine A", 3500, "25/06/2022"));
        repository.add(new Invoice(1, "Ordine X", 1200.0f, "30/05/2022"));
        repository.add(new Invoice(3, "Ordine B", 8250.3f, "05/07/2022"));
        repository.add(new Invoice(4, "Ordine C", 833f, "22/07/2022"));

        System.out.println(repository);

        repository.sort();
        System.out.println(repository);

    }
}
