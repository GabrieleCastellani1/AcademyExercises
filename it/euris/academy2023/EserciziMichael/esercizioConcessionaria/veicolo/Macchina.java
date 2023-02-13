package it.euris.academy2023.EserciziMichael.esercizioConcessionaria.veicolo;

public class Macchina extends Veicolo {

    public Macchina(String nome, String marca, tipoEnum tipo) {
        super(nome, marca, tipo);
    }

    @Override
    public int getNUmeroRuote() {
        return 4;
    }

}
