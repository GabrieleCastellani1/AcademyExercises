package it.euris.academy2023.EserciziMichael.esercizioConcessionaria.veicolo;

import it.euris.academy2023.EserciziMichael.esercizioConcessionaria.commandFormatException;

public class VeicoloFactory {

    public Veicolo createVeicolo(String tipo, String marca, String nome) throws commandFormatException {
        switch (tipoEnum.valueOf(tipo)){
            case MACCHINA : return new Macchina(nome, marca, tipoEnum.MACCHINA);
            case MOTO : return new Moto(nome, marca, tipoEnum.MOTO);
            case BARCA: return new Barca(nome, marca, tipoEnum.BARCA);
            case AEROPLANO: return new Aeroplano(nome, marca, tipoEnum.AEROPLANO);
            default: throw new commandFormatException("la tipologia di veicolo richiesta non esiste");
        }
    }
}
