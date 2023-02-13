package it.euris.academy2023.EserciziMichael.zoo.exception;

public class BadCommandFormatException extends Exception {
    public BadCommandFormatException() {
        super("i parametri di questo comando sono errati");
    }
}
