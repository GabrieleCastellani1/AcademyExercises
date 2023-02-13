package it.euris.academy2023.EserciziMichael.library;

public class Executor {

    private Library lib;

    public Executor(Library lib) {
        this.lib = lib;
    }

    public String execute(String command) {
        String operation = command.substring(0, command.indexOf("/"));
        String content = command.substring(command.indexOf("/") + 1, command.indexOf("-"));
        String title = command.substring(command.indexOf("-")+1);

        if (operation.equalsIgnoreCase("i")) {

            Content c = Creator.createContent(content, title);
            lib.insert(c, c != null ? c.getType() : null, title);
            return "Operazione di inserimento eseguita";

        } else if (operation.equalsIgnoreCase("r")) {
            int found = lib.search(content, title);
            return "Operazione di ricerca eseguita e sono stati trovati " + found + " cotnenuti con quel nome";

        } else {
            return "formato stringa sbagliato";
        }
    }

}
