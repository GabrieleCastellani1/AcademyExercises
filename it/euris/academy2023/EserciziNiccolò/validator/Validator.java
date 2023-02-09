package it.euris.academy2023.EserciziNiccolò.validator;

public interface Validator {
    String getErrorMessage();

    boolean validate(Persona p);
}
