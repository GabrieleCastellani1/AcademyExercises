package it.euris.academy2023.EserciziMichael.esercizioConcessionaria;

import it.euris.academy2023.EserciziMichael.esercizioConcessionaria.comandi.Comando;
import it.euris.academy2023.EserciziMichael.esercizioConcessionaria.comandi.CommandGenerator;
import it.euris.academy2023.EserciziMichael.esercizioConcessionaria.comandi.parameters.*;
import it.euris.academy2023.EserciziMichael.esercizioConcessionaria.concessionaria.CatalogoConcessionaria;
import it.euris.academy2023.EserciziMichael.esercizioConcessionaria.concessionaria.NotPresentException;
import it.euris.academy2023.EserciziMichael.esercizioConcessionaria.veicolo.VeicoloFactory;

public class CommandParser {

    private final GestoreConcessionarie gestore;
    private final ParametersCreator parametersCreator;
    private final CommandGenerator commandGenerator;

    public CommandParser(GestoreConcessionarie gestore, ParametersCreator parametersCreator, CommandGenerator commandGenerator) {
        this.gestore = gestore;
        this.parametersCreator = parametersCreator;
        this.commandGenerator = commandGenerator;
    }

    public Comando<? extends CommandParameters> parse(String command) throws NotPresentException, commandFormatException {
        String operation= command.substring(0, command.indexOf(":"));

        if (operation.equalsIgnoreCase("insertV")) {

            String[] tokens = command.substring(command.indexOf(":") + 1).split(",");
            String concessionaria = tokens[0];
            String tipo = tokens[1];
            String marca = tokens[2];
            String nome = tokens[3];
            int quantità = Integer.parseInt(tokens[4]);
            float prezzo = Float.parseFloat(tokens[5]);
            InsertParameters parameters = null;
            try {
                parameters = parametersCreator.createInsertParameters(concessionaria, new VeicoloFactory().createVeicolo(tipo, marca, nome), quantità, prezzo);
            } catch (commandFormatException e) {
                throw new RuntimeException();
            }

            CatalogoConcessionaria conc = gestore.searchConcessionaria(concessionaria);
            return commandGenerator.createInsertCommand(conc, parameters);


        } else if (operation.equalsIgnoreCase("searchV")) {

            String[] tokens = command.substring(command.indexOf(":") + 1).split(",");
            String tipo = tokens[0];
            String marca = tokens[1];
            String nome = tokens[2];
            SearchParameters parameters = parametersCreator.createSearchParameters(tipo, marca, nome);
            return commandGenerator.createSearchAllCommand(commandGenerator, gestore.iterator(), parameters);


        } else if (operation.equalsIgnoreCase("buyV")) {

            String[] tokens = command.substring(command.indexOf(":") + 1).split(",");
            String concessionaria = tokens[0];
            String tipo = tokens[1];
            String marca = tokens[2];
            String nome = tokens[3];
            int quantità = Integer.parseInt(tokens[4]);
            BuyParameters parameters = parametersCreator.createBuyParameters(concessionaria, tipo, marca, nome, quantità);

            CatalogoConcessionaria conc = gestore.searchConcessionaria(concessionaria);
            return commandGenerator.createBuyCommand(conc, parameters);

        } else {
            throw new commandFormatException("non esiste un simile comando");
        }
    }
}
