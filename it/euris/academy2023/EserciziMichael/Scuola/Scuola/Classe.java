package it.euris.academy2023.EserciziMichael.Scuola.Scuola;

import it.euris.academy2023.EserciziMichael.Scuola.Persone.Persona;
import it.euris.academy2023.EserciziMichael.Scuola.Persone.Professore;
import it.euris.academy2023.EserciziMichael.Scuola.Persone.Studente;
import it.euris.academy2023.EserciziMichael.Scuola.Persone.maxPersoneException;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Classe {
    private final SectionEnum sezione;
    private final int anno;
    private final List<Studente> studenti;
    private final List<Professore> professori;
    private int studentiCount;
    private int professoriCount;
    private final int numMaxPersone;

    public Classe(SectionEnum sezione, int anno, int numMaxPersone) {
        this.sezione = sezione;
        this.anno = anno;
        this.numMaxPersone = numMaxPersone;
        this.professori = new ArrayList<>();
        this.studenti = new ArrayList<>();
    }

    public Classe(SectionEnum sezione, int anno, List<Studente> studenti, List<Professore> professori, int numMaxPersone) {
        this.sezione = sezione;
        this.anno = anno;
        this.studenti = studenti;
        this.professori = professori;
        this.numMaxPersone = numMaxPersone;
    }

    public SectionEnum getSection() {
        this.professori.contains(null);
        return this.sezione;
    }

    public int getAnno(){
        return anno;
    }

    public int getCount(){
        return studentiCount + professoriCount;
    }

    public void addStudente(Studente s) throws maxPersoneException {
        if(studentiCount == numMaxPersone){
            throw new maxPersoneException("la classe è già piena di studenti");
        }
        this.studenti.add(s);
        studentiCount++;
    }

    public void addProfessore(Professore p) throws maxPersoneException {
        if(professoriCount == numMaxPersone){
            throw new maxPersoneException("la classe è già piena di professori");
        }
        this.professori.add(p);
        professoriCount++;
    }

    public List<Persona> searchPersona(String nome, String cognome){
        List<Persona> risultato = this.professori.stream()
                            .filter(p -> p.getNome().equalsIgnoreCase(nome)
                                    && p.getCognome().equalsIgnoreCase(cognome))
                            .collect(Collectors.toList());
        risultato.addAll(this.studenti.stream().filter(p -> p.getNome().equalsIgnoreCase(nome)
                                                            && p.getCognome().equalsIgnoreCase(cognome))
                                                .collect(Collectors.toList()));
        return risultato;
    }


}
