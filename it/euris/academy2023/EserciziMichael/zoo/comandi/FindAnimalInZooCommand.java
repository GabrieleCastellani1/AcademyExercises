package it.euris.academy2023.EserciziMichael.zoo.comandi;

import it.euris.academy2023.EserciziMichael.zoo.exception.AnimalNotFoundException;
import it.euris.academy2023.EserciziMichael.zoo.exception.BadCommandFormatException;
import it.euris.academy2023.EserciziMichael.zoo.exception.ZooNotFoundException;
import it.euris.academy2023.EserciziMichael.zoo.manager.ZooManager;

import java.util.List;

public class FindAnimalInZooCommand implements Comando {

    private TipologiaComando tipo;
    private ZooManager manager;
    private List<String> parameters;

    public FindAnimalInZooCommand(TipologiaComando tipo, ZooManager manager, List<String> parameters) {
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
        try {
            if(parameters.size() == 2) {
                return manager.findAnimalByNameAndZoo(parameters.get(0), parameters.get(1)).toString();
            }else {
                throw new BadCommandFormatException();
            }
        } catch (ZooNotFoundException e) {
            return "lo zoo cercato non esiste";
        } catch (AnimalNotFoundException e) {
            return "l'animale cercato non esiste";
        }
    }
}
