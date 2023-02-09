package it.euris.academy2023.EserciziNiccolò.validator;

public class GenereValidator {

    public String getErrorMessage() {
        return "Formato genere errato";
    }

    public boolean validate(Persona persona) {
        // Se si fa un confronto tra una stringa costante e una stringa variabile (che potrebbe essere NULL),
        // per evitare eccezioni conviene invocare il metodo dalla costante
        return "M".equalsIgnoreCase(persona.getGenere()) || "F".equalsIgnoreCase(persona.getGenere());
        //return persona.getGenere().equalsIgnoreCase("M") || persona.getGenere().equalsIgnoreCase("F");
    }
}
