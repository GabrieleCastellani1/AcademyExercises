package it.euris.academy2023.validator;

public interface Validator {
    String getErrorMessage();

    boolean validate(Persona p);
}
