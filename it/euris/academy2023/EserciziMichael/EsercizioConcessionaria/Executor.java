package it.euris.academy2023.EserciziMichael.EsercizioConcessionaria;

import it.euris.academy2023.EserciziMichael.EsercizioConcessionaria.comandi.InsertCommand;
import it.euris.academy2023.EserciziMichael.EsercizioConcessionaria.comandi.buyCommand;
import it.euris.academy2023.EserciziMichael.EsercizioConcessionaria.comandi.searchCommand;
import it.euris.academy2023.EserciziMichael.EsercizioConcessionaria.concessionaria.Concessionaria;

import java.util.ArrayList;
import java.util.List;

public class Executor {
    List<Concessionaria> concessionarie;

    public Executor(List<Concessionaria> concessionarie) {
        this.concessionarie = concessionarie;
    }

    public String execute(String command) {
        String operation;

        operation = command.substring(0, command.indexOf(":"));

        if (operation.equalsIgnoreCase("insertV")) {

            String[] tokens = command.substring(command.indexOf(":") + 1).split(",");
            String concessionaria = tokens[0];
            String tipo = tokens[1];
            String marca = tokens[2];
            String nome = tokens[3];
            int quantità = Integer.parseInt(tokens[4]);
            float prezzo = Float.parseFloat(tokens[5]);
            return new InsertCommand(concessionarie, concessionaria, tipo, marca, nome, quantità, prezzo).execute();


        } else if (operation.equalsIgnoreCase("searchV")) {

            String[] tokens = command.substring(command.indexOf(":") + 1).split(",");
            String tipo = tokens[0];
            String marca = tokens[1];
            String nome = tokens[2];
            List<String> veicoli = new ArrayList<>();
            return new searchCommand(tipo, marca, nome, concessionarie).execute();


        } else if (operation.equalsIgnoreCase("buyV")) {

            String[] tokens = command.substring(command.indexOf(":") + 1).split(",");
            String concessionaria = tokens[0];
            String tipo = tokens[1];
            String marca = tokens[2];
            String nome = tokens[3];
            int quantità = Integer.parseInt(tokens[4]);
            return new buyCommand(concessionarie, concessionaria, tipo, marca, nome, quantità).execute();

        } else {
            return "non esiste un simile comando";
        }
    }
}
