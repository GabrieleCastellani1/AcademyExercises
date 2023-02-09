package it.euris.academy2023.EserciziMichael.zoo.comandi;

import it.euris.academy2023.EserciziMichael.zoo.manager.ZooManager;

import java.util.List;

public class CommandCreator {
    private ZooManager manager;
    private String operation;
    private List<String> parameters;
    public CommandCreator(ZooManager manager, String operation, List<String> parameters) {
        this.manager = manager;
        this.operation = operation;
        this.parameters = parameters;
    }

    public Comando createCommand() throws BadCommandFormatException {
        if(operation.equalsIgnoreCase("FindZooByAnimal")){
            return new FindZooByAnimalCommand(Comando.TipologiaComando.FindZooByAnimal, manager, parameters);
        }else if(operation.equalsIgnoreCase("IsOpenNow")){
            return new IsOpenNowCommand(Comando.TipologiaComando.IsOpenNow, manager, parameters);
        }else if(operation.equalsIgnoreCase("FindAnimalInZoo")){
            return new FindAnimalInZooCommand(Comando.TipologiaComando.FindAnimalInZoo, manager, parameters);
        }else if(operation.equalsIgnoreCase("isAnimalVisibleInZoo")){
            return new IsAnimalVisibleInZooCommand(Comando.TipologiaComando.IsAnimalVisible, manager, parameters);
        }else if(operation.equalsIgnoreCase("PrintAnimalsInZoo")){
            return new PrintAnimalsInZooCommand(Comando.TipologiaComando.FindAllAnimalInZoo, manager, parameters);
        }else if(operation.equalsIgnoreCase("PrintAnimalsInZooInSection")){
            return new PrintAnimalsInZooInSectionCommand(Comando.TipologiaComando.FindAllAnimalInZooInSection, manager, parameters);
        }else{
            throw new BadCommandFormatException();
        }
    }
}
