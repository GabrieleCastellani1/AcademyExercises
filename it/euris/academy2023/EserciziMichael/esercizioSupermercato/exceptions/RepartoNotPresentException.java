package it.euris.academy2023.EserciziMichael.esercizioSupermercato.exceptions;

public class RepartoNotPresentException extends Exception{
    public RepartoNotPresentException() {
        super("non esiste un simile reparto nel supermercato");
    }
}
