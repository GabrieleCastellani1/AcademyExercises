package it.euris.academy2023.EserciziMichael.zoo.comandi;

import it.euris.academy2023.EserciziMichael.zoo.exception.AnimalNotFoundException;
import it.euris.academy2023.EserciziMichael.zoo.exception.RecintoNotFoundException;
import it.euris.academy2023.EserciziMichael.zoo.exception.TipologiaRecintoNotFoundException;
import it.euris.academy2023.EserciziMichael.zoo.exception.ZooNotFoundException;
import it.euris.academy2023.EserciziMichael.zoo.manager.ZooManager;

import java.util.List;

public class PrintAnimalsInZooInSectionCommand implements Comando {
    private TipologiaComando tipo;
    private ZooManager manager;
    private List<String> parameters;

    public PrintAnimalsInZooInSectionCommand(TipologiaComando tipo, ZooManager manager, List<String> parameters) {
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
        if(parameters.size() == 3){
            try {
                return manager.isAnimalVisibleInZooInRecintoNow(parameters.get(0), parameters.get(1), parameters.get(2)) + "";
            } catch (ZooNotFoundException e) {
                return "lo zoo cercato non esiste";
            } catch (TipologiaRecintoNotFoundException e) {
                return "la tipologia di animale cercata non esiste";
            } catch (RecintoNotFoundException e) {
                return "il recinto cercato in questo zoo non esiste";
            } catch (AnimalNotFoundException e) {
                return "l'animale cercato non esiste";
            }
        }else{
            throw new BadCommandFormatException();
        }
    }
}
