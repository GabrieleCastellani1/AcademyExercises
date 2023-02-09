package it.euris.academy2023.EserciziMichael.Scuola;

import it.euris.academy2023.EserciziMichael.Scuola.Scuola.Classe;
import it.euris.academy2023.EserciziMichael.Scuola.Scuola.Scuola;
import it.euris.academy2023.EserciziMichael.Scuola.Scuola.SectionEnum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scuola --> List<Classi>
        // Persone --> Studenti,Professori
        // Classi--> List<Studenti> e List<Professori> e nome (NUM MAX PERSONE ==5)

        // Utente può eseguire operazioni:
        // -inserire uno studente in una class (insertS)
        // -può leggere una persona dato un nome (readP)
        // -può contare quante persone ha una certa classe (countP)

        // gestire tutte le eccezioni
        // es: commando inesistente
        // es: num max persone nella classe
        // es: persona non presente

        // EXIT per uscire dal programma

        Scanner scanner = new Scanner(System.in);
        Scuola scuola = new Scuola("Scuola statale");
        Executor ex = new Executor(scuola);

        try {
            scuola.addClasse(new Classe(SectionEnum.A, 1, 10));
            scuola.addClasse(new Classe(SectionEnum.B, 1, 10));
            ex.execute("insertS:Carlo Carli,A,1");
            ex.execute("insertS:Giorgio Giorgi,A,1");
            ex.execute("insertS:Giacomo Giacomi,B,1");
            ex.execute("readP:Giacomo Giacomi");
            ex.execute("countP:A,1");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("inserisci comando:");
        String command = scanner.nextLine();

        do {
            try{
                System.out.println(ex.execute(command));
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
            System.out.println("inserisci comando:");
            command = scanner.nextLine();
        } while (!command.equalsIgnoreCase("EXIT"));
    }
}
