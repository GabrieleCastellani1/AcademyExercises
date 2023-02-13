package it.euris.academy2023.EserciziMichael.esercizioSupermercato.exceptions;

public class MarketNotPresentException extends Exception{

    public MarketNotPresentException() {
        super("il supermercato cercato non esiste");
    }
}
