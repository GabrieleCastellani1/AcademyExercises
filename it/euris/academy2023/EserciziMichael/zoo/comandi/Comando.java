package it.euris.academy2023.EserciziMichael.zoo.comandi;

import it.euris.academy2023.EserciziMichael.zoo.exception.BadCommandFormatException;

public interface Comando {

    TipologiaComando getComando();

    String doCommand() throws BadCommandFormatException;


    public enum TipologiaComando{

        FindZooByAnimal,
        IsOpenNow,
        FindAnimalInZoo,
        IsAnimalVisible,
        FindAllAnimalInZoo,
        FindAllAnimalInZooInSection
    }
}


