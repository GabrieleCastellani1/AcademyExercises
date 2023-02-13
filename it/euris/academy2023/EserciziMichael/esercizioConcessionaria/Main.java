package it.euris.academy2023.EserciziMichael.esercizioConcessionaria;

import it.euris.academy2023.EserciziMichael.esercizioConcessionaria.concessionaria.Concessionaria;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Concessionaria c1 = new Concessionaria("c1");
        Concessionaria c2 = new Concessionaria("c2");
        List<Concessionaria> concessionariaList = new ArrayList<>();
        concessionariaList.add(c1);
        concessionariaList.add(c2);

        Executor ex = new Executor(concessionariaList);
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
