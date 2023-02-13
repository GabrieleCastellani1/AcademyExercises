package it.euris.academy2023.EserciziMichael.esercizioSupermercato.exceptions;

public class TooMuchException extends Exception{
    public TooMuchException(){
        super("la quantità richiesta non è disponibile");
    }
}
