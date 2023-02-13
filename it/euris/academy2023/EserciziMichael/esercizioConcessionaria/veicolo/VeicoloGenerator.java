package it.euris.academy2023.EserciziMichael.esercizioConcessionaria.veicolo;

public class VeicoloGenerator {

    public Macchina createMacchina(String nome, String marca){
        return new Macchina(nome, marca, tipoEnum.MACCHINA);
    }

    public Moto createMoto(String nome, String marca){
        return new Moto(nome, marca, tipoEnum.MOTO);
    }

    public Aeroplano createAeroplano(String nome, String marca){
        return new Aeroplano(nome, marca, tipoEnum.AEROPLANO);
    }

    public Barca createBarca(String nome, String marca){
        return new Barca(nome, marca, tipoEnum.BARCA);
    }
}
