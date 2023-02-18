package it.euris.academy2023.EserciziMichael.esercizioConcessionaria.concessionaria;

import it.euris.academy2023.EserciziMichael.esercizioConcessionaria.veicolo.Veicolo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CatalogoConcessionaria {
    private final String nomeConcessionaria;
    private final List<VeicoliEntry> listaEntryVeicoli;

    public CatalogoConcessionaria(String nome, List<VeicoliEntry> listaEntryVeicoli) {
        this.nomeConcessionaria = nome;
        this.listaEntryVeicoli = listaEntryVeicoli;
    }

    public CatalogoConcessionaria(String nome) {
        this.nomeConcessionaria = nome;
        this.listaEntryVeicoli = new ArrayList<>();
    }

    public void aumentaQuantitàVeicolo(VeicoliEntry entry, int quantità){
        entry.aumentaQuantità(quantità);
    }

    public void addEntry(Veicolo v, int quantità, float prezzo){
        this.listaEntryVeicoli.add(new VeicoliEntry(v, quantità, prezzo));
    }

    public VeicoliEntry cercaEntryVeicolo(Veicolo v) throws NotPresentException {
        return this.listaEntryVeicoli
                .stream()
                .filter(a -> a.containsVehicle(v))
                .findFirst()
                .orElseThrow(() -> new NotPresentException("il veicolo richiesto non è presente"));
    }

    public VeicoliEntry cercaEntryVeicolo(String tipo, String marca, String nome) throws NotPresentException {
        return this.listaEntryVeicoli.stream()
                .filter(a -> a.containsVehicle(tipo, marca, nome))
                .findFirst()
                .orElseThrow(() -> new NotPresentException("il veicolo richiesto non è presente"));
    }

    public int countVeicolo(Veicolo v){
        Optional<VeicoliEntry> entry = this.listaEntryVeicoli
                                            .stream()
                                            .filter(a -> a.containsVehicle(v))
                                            .findFirst();
        return entry.map(VeicoliEntry::getQuantità).orElse(0);
    }

    public void acquistaVeicolo(String tipo, String nome, String marca, int quantità) throws NotPresentException {
        VeicoliEntry entry = cercaEntryVeicolo(tipo, marca, nome);
        entry.diminuisciQuantità(quantità);
        if(entry.getQuantità() == 0){
            listaEntryVeicoli.remove(entry);
        }
    }

    public String getNomeConcessionaria(){
        return this.nomeConcessionaria;
    }
}
