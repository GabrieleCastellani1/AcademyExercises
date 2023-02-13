package it.euris.academy2023.EserciziMichael.esercizioConcessionaria.veicolo;

public class Barca extends Veicolo{


    public Barca(String nome, String marca, tipoEnum tipo) {
        super(nome, marca, tipo);
    }

    @Override
    public int getNUmeroRuote() {
        return 0;
    }
}
