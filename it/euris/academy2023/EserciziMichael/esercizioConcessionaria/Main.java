package it.euris.academy2023.EserciziMichael.esercizioConcessionaria;

import it.euris.academy2023.EserciziMichael.esercizioConcessionaria.comandi.CommandGenerator;
import it.euris.academy2023.EserciziMichael.esercizioConcessionaria.comandi.parameters.ParametersCreator;
import it.euris.academy2023.EserciziMichael.esercizioConcessionaria.concessionaria.CatalogoConcessionaria;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        CatalogoConcessionaria c1 = new CatalogoConcessionaria("c1");
        CatalogoConcessionaria c2 = new CatalogoConcessionaria("c2");
        List<CatalogoConcessionaria> catalogoConcessionariaList = new ArrayList<>();
        catalogoConcessionariaList.add(c1);
        catalogoConcessionariaList.add(c2);
        GestoreConcessionarie gestore = GestoreConcessionarie.getGestoreInstance();
        gestore.setConcessionarie(catalogoConcessionariaList);
        ParametersCreator parametersCreator = new ParametersCreator();
        CommandGenerator commandGenerator = new CommandGenerator();

        CommandParser parser = new CommandParser(gestore, parametersCreator, commandGenerator);

        CommandExecutor ex = new CommandExecutor(parser);

        System.out.println(
            ex.execute("insertV:c1,MACCHINA,Fiat,500,3,300f") +
            ex.execute("searchV:MACCHINA,Fiat,5001") +
            ex.execute("buyV:c1,MACCHINA,Fiat,500,3")
        );


        Scanner scanner = new Scanner(System.in);
        System.out.println("Loggati:");
        scanner.nextLine();
        System.out.println("inserisci comando:");
        String command = scanner.nextLine();


        do {
            if(command.equalsIgnoreCase("logout")){
                System.out.println("Loggati:");
                command = scanner.nextLine();
                System.out.println("inserisci comando:");
                command = scanner.nextLine();
            }else{
                System.out.println(ex.execute(command));
                System.out.println("inserisci comando:");
                command = scanner.nextLine();
            }
        } while (!command.equalsIgnoreCase("EXIT"));
    }
}
