package it.euris.academy2023.EserciziMichael.zoo;

import it.euris.academy2023.EserciziMichael.zoo.comandi.BadCommandFormatException;
import it.euris.academy2023.EserciziMichael.zoo.comandi.CommandCreator;
import it.euris.academy2023.EserciziMichael.zoo.manager.ZooManager;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Executor {

    private ZooManager manager;
    public Executor(ZooManager manager){
        this.manager = manager;
    }

    public String execute(String command){
        String operation;
        operation = command.substring(0, command.indexOf(":"));

        List<String> parameters = Arrays.stream(command.substring(0, command.indexOf(":")+1).split(",")).collect(Collectors.toList());
        try {
            return new CommandCreator(manager, operation, parameters).createCommand().doCommand();
        } catch (BadCommandFormatException e) {
            return e.getMessage();
        }

    }
}
