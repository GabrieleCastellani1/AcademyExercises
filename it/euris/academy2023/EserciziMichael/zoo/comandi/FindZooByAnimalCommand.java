package it.euris.academy2023.EserciziMichael.zoo.comandi;

import it.euris.academy2023.EserciziMichael.zoo.animali.Animale;
import it.euris.academy2023.EserciziMichael.zoo.exception.ZooNotFoundException;
import it.euris.academy2023.EserciziMichael.zoo.manager.ZooManager;

import java.util.List;

public class FindZooByAnimalCommand implements Comando{
    private TipologiaComando tipo;
    private ZooManager manager;
    private List<String> parameters;
    public FindZooByAnimalCommand(TipologiaComando findZooByAnimal, ZooManager mananger, List<String> parameters) {
        this.manager = mananger;
        this.tipo = findZooByAnimal;
        this.parameters = parameters;
    }

    @Override
    public TipologiaComando getComando() {
        return this.tipo;
    }

    @Override
    public String doCommand() throws BadCommandFormatException {
        try {
            if(!parameters.isEmpty()){
                String s = "";
                List<Animale> animals = manager.findAnimalListByZoo(parameters.get(0));
                for (Animale a: animals) {
                    s += a.getNome();
                }
                return s;
            }else{
                throw new BadCommandFormatException();
            }
        } catch (ZooNotFoundException e) {
            return "non esiste uno zoo con quell'animale";
        }
    }
}
