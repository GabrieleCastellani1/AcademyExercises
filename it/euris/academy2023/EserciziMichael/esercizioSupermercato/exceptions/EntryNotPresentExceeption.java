package it.euris.academy2023.EserciziMichael.esercizioSupermercato.exceptions;

public class EntryNotPresentExceeption extends Exception{
    public EntryNotPresentExceeption() {
        super("non esiste un simile prodotto nel tuo carrello");
    }
}
