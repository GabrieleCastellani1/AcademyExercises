package it.euris.academy2023.EserciziMichael.EsercizioConcessionaria.concessionaria;

import it.euris.academy2023.EserciziMichael.EsercizioConcessionaria.veicolo.Veicolo;
import it.euris.academy2023.EserciziMichael.EsercizioConcessionaria.veicolo.tipoEnum;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Concessionaria {
    private String nome;
    private List<VeicoliEntry> listaEntryVeicoli;

    public Concessionaria(String nome, List<VeicoliEntry> listaEntryVeicoli) {
        this.nome = nome;
        this.listaEntryVeicoli = listaEntryVeicoli;
    }

    public Concessionaria(String nome) {
        this.nome = nome;
        this.listaEntryVeicoli = new ArrayList<>();
    }

    public void addEntryVeicolo(String tipo, String marca, String nome, int quantità, float prezzo){
        Veicolo v = new Veicolo(nome, marca, tipoEnum.valueOf(tipo));
        if(this.listaEntryVeicoli.stream().anyMatch(e -> e.getVeicolo().equals(v))){
            this.listaEntryVeicoli
                .stream()
                .filter(e -> e.getVeicolo().equals(v))
                .findFirst()
                .ifPresent(a -> a.aumentaQuantità(quantità));
        }else{
            this.listaEntryVeicoli.add(new VeicoliEntry(v, quantità, prezzo));
        }
    }

    public VeicoliEntry cercaVeicolo(Veicolo v) throws NotPresentException {
        Optional<VeicoliEntry> entry = this.listaEntryVeicoli.stream().filter(a -> a.getVeicolo().equals(v)).findFirst();
        if(entry.isPresent()){
            return entry.get();
        }else{
            throw new NotPresentException("il veicolo richiesto non è presente");
        }
    }

    public VeicoliEntry cercaVeicolo(String tipo, String marca, String nome) throws NotPresentException {
        Optional<VeicoliEntry> entry = this.listaEntryVeicoli.stream()
                .filter(a -> a.getVeicolo().getTipo().equals(tipoEnum.valueOf(tipo))
                        && a.getVeicolo().getMarca().equalsIgnoreCase(marca)
                        && a.getVeicolo().getNome().equalsIgnoreCase(nome))
                .findFirst();
        if(entry.isPresent()){
            return entry.get();
        }else{
            throw new NotPresentException("il veicolo richiesto non è presente");
        }
    }

    public int countVeicolo(Veicolo v){
        Optional<VeicoliEntry> entry = this.listaEntryVeicoli.stream().filter(a -> a.equals(v)).findFirst();
        if(entry.isPresent()){
            return entry.get().getQuantità();
        }else{
            return 0;
        }
    }

    public void acquistaVeicolo(String tipo, String nome, String marca, int quantità) throws NotPresentException {
        VeicoliEntry entry = cercaVeicolo(tipo, marca, nome);
        entry.diminuisciQuantità(quantità);
        if(entry.getQuantità() == 0){
            listaEntryVeicoli.remove(entry);
        }
    }

    public String getNome(){
        return this.nome;
    }
}
