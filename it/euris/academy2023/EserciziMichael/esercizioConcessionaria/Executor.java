package it.euris.academy2023.EserciziMichael.esercizioConcessionaria;

import it.euris.academy2023.EserciziMichael.esercizioConcessionaria.comandi.CommandGenerator;
import it.euris.academy2023.EserciziMichael.esercizioConcessionaria.concessionaria.Concessionaria;
import it.euris.academy2023.EserciziMichael.esercizioConcessionaria.comandi.parameters.*;

import java.util.List;

public class Executor {
    List<Concessionaria> concessionarie;

    public Executor(List<Concessionaria> concessionarie) {
        this.concessionarie = concessionarie;
    }

    public String execute(String command) {
        String operation;
        CommandGenerator generator = new CommandGenerator();

        operation = command.substring(0, command.indexOf(":"));

        if (operation.equalsIgnoreCase("insertV")) {

            String[] tokens = command.substring(command.indexOf(":") + 1).split(",");
            String concessionaria = tokens[0];
            String tipo = tokens[1];
            String marca = tokens[2];
            String nome = tokens[3];
            int quantità = Integer.parseInt(tokens[4]);
            float prezzo = Float.parseFloat(tokens[5]);
            InsertParameters parameters = new ParametersCreator().createInsertParameters(concessionaria, tipo, marca, nome, quantità, prezzo);
            return generator.createInsertCommand(concessionarie, parameters).doCommand();


        } else if (operation.equalsIgnoreCase("searchV")) {

            String[] tokens = command.substring(command.indexOf(":") + 1).split(",");
            String tipo = tokens[0];
            String marca = tokens[1];
            String nome = tokens[2];
            SearchParameters parameters = new ParametersCreator().createSearchParameters(tipo, marca, nome);
            return generator.createSearchCommand(parameters, concessionarie).doCommand();


        } else if (operation.equalsIgnoreCase("buyV")) {

            String[] tokens = command.substring(command.indexOf(":") + 1).split(",");
            String concessionaria = tokens[0];
            String tipo = tokens[1];
            String marca = tokens[2];
            String nome = tokens[3];
            int quantità = Integer.parseInt(tokens[4]);
            BuyParameters parameters = new ParametersCreator().createBuyParameters(concessionaria, tipo, marca, nome, quantità);
            return generator.createBuyCommand(concessionarie, parameters).doCommand();

        } else {
            return "non esiste un simile comando";
        }
    }
}
