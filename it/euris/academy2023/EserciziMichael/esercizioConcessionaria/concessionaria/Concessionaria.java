package it.euris.academy2023.EserciziMichael.esercizioConcessionaria.concessionaria;

import it.euris.academy2023.EserciziMichael.esercizioConcessionaria.veicolo.Veicolo;
import it.euris.academy2023.EserciziMichael.esercizioConcessionaria.veicolo.VeicoloGenerator;
import it.euris.academy2023.EserciziMichael.esercizioConcessionaria.veicolo.tipoEnum;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Concessionaria {
    private final String nome;
    private final List<VeicoliEntry> listaEntryVeicoli;

    public Concessionaria(String nome, List<VeicoliEntry> listaEntryVeicoli) {
        this.nome = nome;
        this.listaEntryVeicoli = listaEntryVeicoli;
    }

    public Concessionaria(String nome) {
        this.nome = nome;
        this.listaEntryVeicoli = new ArrayList<>();
    }

    public void addEntryVeicolo(String tipo, String marca, String nome, int quantità, float prezzo){
        VeicoloGenerator generator = new VeicoloGenerator();
        Veicolo v;
        switch (tipoEnum.valueOf(tipo)){
            case MACCHINA : v = generator.createMacchina(nome, marca);
                            break;
            case MOTO : v = generator.createMoto(nome, marca);
                        break;
            case BARCA : v = generator.createBarca(nome, marca);
                        break;
            case AEROPLANO : v = generator.createAeroplano(nome, marca);
                            break;
            default : v = null;
                            break;
        }
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
        VeicoliEntry entry = this.listaEntryVeicoli
                                            .stream()
                                            .filter(a -> a.getVeicolo().equals(v))
                                            .findFirst()
                                            .orElseThrow(() -> new NotPresentException("il veicolo richiesto non è presente"));
        return entry;
    }

    public VeicoliEntry cercaVeicolo(String tipo, String marca, String nome) throws NotPresentException {
        VeicoliEntry entry = this.listaEntryVeicoli.stream()
                .filter(a -> a.getVeicolo().getTipo().equals(tipoEnum.valueOf(tipo))
                        && a.getVeicolo().getMarca().equalsIgnoreCase(marca)
                        && a.getVeicolo().getNome().equalsIgnoreCase(nome))
                .findFirst()
                .orElseThrow(() -> new NotPresentException("il veicolo richiesto non è presente"));
        return entry;
    }

    public int countVeicolo(Veicolo v){
        Optional<VeicoliEntry> entry = this.listaEntryVeicoli
                                            .stream()
                                            .filter(a -> a.getVeicolo().equals(v))
                                            .findFirst();
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
