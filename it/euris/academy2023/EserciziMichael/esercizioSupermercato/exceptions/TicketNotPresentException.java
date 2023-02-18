package it.euris.academy2023.EserciziMichael.esercizioSupermercato.exceptions;

public class TicketNotPresentException extends Exception {
    public TicketNotPresentException(){
        super("è richiesto un ticket per accedere a questo reparto");
    }
}
