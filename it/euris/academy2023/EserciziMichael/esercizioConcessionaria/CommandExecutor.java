package it.euris.academy2023.EserciziMichael.esercizioConcessionaria;

import it.euris.academy2023.EserciziMichael.esercizioConcessionaria.comandi.Comando;
import it.euris.academy2023.EserciziMichael.esercizioConcessionaria.comandi.CommandGenerator;
import it.euris.academy2023.EserciziMichael.esercizioConcessionaria.concessionaria.CatalogoConcessionaria;
import it.euris.academy2023.EserciziMichael.esercizioConcessionaria.comandi.parameters.*;
import it.euris.academy2023.EserciziMichael.esercizioConcessionaria.concessionaria.NotPresentException;
import it.euris.academy2023.EserciziMichael.esercizioConcessionaria.veicolo.VeicoloFactory;

import java.util.Iterator;

public class CommandExecutor {
    private CommandParser parser;

    public CommandExecutor(CommandParser parser) {
        this.parser = parser;
    }

    public String execute(String command) {
        try {
            Comando<? extends CommandParameters> comando = parser.parse(command);
            return comando.doCommand();
        } catch (NotPresentException | commandFormatException e) {
            return e.getMessage();
        }
    }
}
