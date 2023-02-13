package it.euris.academy2023.EserciziMichael.zoo.comandi;

import it.euris.academy2023.EserciziMichael.zoo.exception.BadCommandFormatException;
import it.euris.academy2023.EserciziMichael.zoo.exception.ZooNotFoundException;
import it.euris.academy2023.EserciziMichael.zoo.manager.ZooManager;

import java.util.List;

public class IsOpenNowCommand implements Comando {

    private TipologiaComando tipo;
    private ZooManager manager;
    private List<String> parameters;
    public IsOpenNowCommand(TipologiaComando isOpenNow, ZooManager manager, List<String> parameters) {
        this.tipo = isOpenNow;
        this.manager = manager;
        this.parameters = parameters;
    }

    @Override
    public TipologiaComando getComando() {
        return this.tipo;
    }

    @Override
    public String doCommand() throws BadCommandFormatException {
        if(!parameters.isEmpty()){
            try {
                return manager.isZooOpenNow(parameters.get(0)) + "";
            } catch (ZooNotFoundException e) {
                return "lo cercato non esiste";
            }
        }else{
            throw new BadCommandFormatException();
        }

    }
}
