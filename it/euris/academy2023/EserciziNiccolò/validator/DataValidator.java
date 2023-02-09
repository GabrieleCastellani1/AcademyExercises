package it.euris.academy2023.EserciziNiccolò.validator;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DataValidator {

    public String getErrorMessage() {
        return "Formato data errato";
    }

    public boolean validate(Persona persona) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            sdf.parse(persona.getData());
        } catch (ParseException e) {
            return false;
        }
        return true;
    }
}
