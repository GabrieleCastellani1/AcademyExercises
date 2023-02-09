package it.euris.academy2023.EserciziMichael.zoo.comandi;

import it.euris.academy2023.EserciziMichael.zoo.exception.ZooNotFoundException;
import it.euris.academy2023.EserciziMichael.zoo.manager.ZooManager;

import java.util.List;

public class PrintAnimalsInZooCommand implements Comando {
    private TipologiaComando tipo;
    private ZooManager manager;
    private List<String> parameters;

    public PrintAnimalsInZooCommand(TipologiaComando tipo, ZooManager manager, List<String> parameters) {
        this.tipo = tipo;
        this.manager = manager;
        this.parameters = parameters;
    }

    @Override
    public TipologiaComando getComando() {
        return tipo;
    }

    @Override
    public String doCommand() throws BadCommandFormatException {
        if(!parameters.isEmpty()) {
            try {
                return this.manager.findAnimalListByZoo(parameters.get(0)).toString();
            } catch (ZooNotFoundException e) {
                return "lo zoo cercato non esiste";
            }
        }else{
            throw new BadCommandFormatException();
        }
    }
}
