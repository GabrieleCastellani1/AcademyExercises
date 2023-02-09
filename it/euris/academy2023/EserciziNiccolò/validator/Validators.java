package it.euris.academy2023.EserciziNiccolò.validator;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public enum Validators implements Validator{
    DATA{
        @Override
        public String getErrorMessage() {
            return "Formato data errato";
        }

        @Override
        public boolean validate(Persona p) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            try {
                sdf.parse(p.getData());
            } catch (ParseException e) {
                return false;
            }
            return true;
        }
    },
    GENERE{
        @Override
        public String getErrorMessage() {
            return "Formato genere errato";
        }

        @Override
        public boolean validate(Persona p) {
            // Se si fa un confronto tra una stringa costante e una stringa variabile (che potrebbe essere NULL),
            // per evitare eccezioni conviene invocare il metodo dalla costante
            return "M".equalsIgnoreCase(p.getGenere()) || "F".equalsIgnoreCase(p.getGenere());
            //return persona.getGenere().equalsIgnoreCase("M") || persona.getGenere().equalsIgnoreCase("F");
        }
    },
    NUMERO{
        @Override
        public String getErrorMessage() {
            return "Formato numero errato";
        }

        @Override
        public boolean validate(Persona p) {
            return p.getNumero() != null && p.getNumero().length() == 10;
        }
    }
}
