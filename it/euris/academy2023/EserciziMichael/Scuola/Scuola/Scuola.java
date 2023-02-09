package it.euris.academy2023.EserciziMichael.Scuola.Scuola;

import java.util.*;

public class Scuola {
    private final Map<SectionEnum, List<Classe>> classi;
    private final String nomeScuola;

    public Classe getClasse(SectionEnum sezione, int anno) throws SchoolClassNotFoundException, NoSuchElementException {
        if(this.classi.containsKey(sezione)){
            List<Classe> classi = this.classi.get(sezione);
            return classi.stream().filter(c -> c.getAnno() == anno).findFirst().get();
        }else{
            throw new SchoolClassNotFoundException(sezione, this);
        }
    }

    public List<Classe> getClassesBySection(SectionEnum sezione) throws SchoolClassNotFoundException {
        if(this.classi.containsKey(sezione)){
            return this.classi.get(sezione);
        }else{
            throw new SchoolClassNotFoundException(sezione, this);
        }
    }

    public List<Classe> getAllClasses(){
        List<Classe> risultato = new ArrayList<>();
        for (SectionEnum sezione : classi.keySet()) {
            risultato.addAll(classi.get(sezione));
        }
        return risultato;
    }

    public void addClasse(Classe c) throws SchoolClassNotFoundException {
        if(c == null){
            throw new SchoolClassNotFoundException(null, this);
        }
        if(this.classi.containsKey(c.getSection())){
            this.classi.get(c.getSection()).add(c);
        }else{
            List<Classe> classe = new ArrayList<>();
            classe.add(c);
            this.classi.put(c.getSection(), classe);
        }
    }

    public String getNome(){
        return this.nomeScuola;
    }

    public Scuola(String nome){
        this.nomeScuola = nome;
        this.classi = new HashMap<>();
    }

    public Scuola(String nome, Map<SectionEnum, List<Classe>> classi){
        this.nomeScuola = nome;
        this.classi = classi;
    }
}
