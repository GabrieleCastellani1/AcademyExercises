package it.euris.academy2023.EserciziMichael.esercizioSupermercato.exceptions;

public class ProductNotPresentException extends Exception {
    public ProductNotPresentException() {
        super("il prodotto non è presente");
    }
}
