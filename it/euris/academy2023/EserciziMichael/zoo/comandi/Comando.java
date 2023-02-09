package it.euris.academy2023.EserciziMichael.zoo.comandi;

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


