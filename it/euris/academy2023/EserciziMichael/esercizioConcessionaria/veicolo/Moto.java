package it.euris.academy2023.EserciziMichael.esercizioConcessionaria.veicolo;

public class Moto extends Veicolo {
    public Moto(String nome, String marca, tipoEnum tipo) {
        super(nome, marca, tipo);
    }

    @Override
    public int getNUmeroRuote() {
        return 2;
    }
}
