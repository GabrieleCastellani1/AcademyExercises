package it.euris.academy2023.EserciziMichael.esercizioConcessionaria.veicolo;

public class Aeroplano extends Veicolo{

    public Aeroplano(String nome, String marca, tipoEnum tipo){
        super(nome, marca, tipo);
    }

    @Override
    public int getNUmeroRuote() {
        return 12;
    }
}
