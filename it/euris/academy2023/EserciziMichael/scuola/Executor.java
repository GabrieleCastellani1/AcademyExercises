package it.euris.academy2023.EserciziMichael.scuola;

import it.euris.academy2023.EserciziMichael.scuola.Persone.Persona;
import it.euris.academy2023.EserciziMichael.scuola.Persone.Studente;
import it.euris.academy2023.EserciziMichael.scuola.Persone.maxPersoneException;
import it.euris.academy2023.EserciziMichael.scuola.Scuola.Classe;
import it.euris.academy2023.EserciziMichael.scuola.Scuola.SchoolClassNotFoundException;
import it.euris.academy2023.EserciziMichael.scuola.Scuola.Scuola;
import it.euris.academy2023.EserciziMichael.scuola.Scuola.SectionEnum;

import java.util.ArrayList;
import java.util.List;

public class Executor {
    private Scuola scuola;

    public Executor(Scuola scuola) {
        this.scuola = scuola;
    }

    public String execute(String command) throws commandFormatException, SchoolClassNotFoundException, maxPersoneException {
        String operation;


        operation = command.substring(0, command.indexOf(":"));

        if (operation.equalsIgnoreCase("insertS")) {

            String nome = command.substring(command.indexOf(":") + 1, command.indexOf(" "));
            String cognome = command.substring(command.indexOf(" ") + 1, command.indexOf(","));
            String classe = command.substring(command.indexOf(",") + 1, command.lastIndexOf(","));
            int anno = Integer.parseInt(command.substring(command.lastIndexOf(",") + 1));
            Studente s = new Studente(nome, cognome);
            SectionEnum section = scuola.getClasse(SectionEnum.valueOf(classe), anno).getSection();
            scuola.getClasse(section, anno).addStudente(s);
            return "Operazione di inserimento eseguita";

        } else if (operation.equalsIgnoreCase("readP")) {

            String nome = command.substring(command.indexOf(":") + 1, command.indexOf(" "));
            String cognome = command.substring(command.indexOf(" ") + 1);
            List<Persona> persone = new ArrayList<>();
            List<Classe> classi = scuola.getAllClasses();
            for (Classe c : classi) {
                persone.addAll(c.searchPersona(nome, cognome));
            }
            String s = "Operazione di ricerca eseguita, sono stati trovati: ";
            for (Persona p : persone) {
                s += p.toString();
            }
            return s;

        } else if (operation.equalsIgnoreCase("countP")) {

            String classe = command.substring(command.indexOf(":") + 1, command.indexOf(","));
            int anno = Integer.parseInt(command.substring(command.indexOf(",") + 1));
            SectionEnum section = scuola.getClasse(SectionEnum.valueOf(classe), anno).getSection();
            return "sono state contate " + scuola.getClasse(section, anno).getCount() + "persone nella classe";

        } else {

            throw new commandFormatException("non esiste un simile comando");

        }
    }
}
