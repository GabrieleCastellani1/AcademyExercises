package it.euris.academy2023.EserciziMichael.scuola.Scuola;

public class SchoolClassNotFoundException extends Exception {
    public SchoolClassNotFoundException(SectionEnum section, Scuola scuola) {
        super("la classe " + section + " non è presente tra le classi della scuola " + scuola.getNome());
    }
}
