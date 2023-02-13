package it.euris.academy2023.EserciziMichael.library;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library<Content> lib = new Library<>();
        Executor ex = new Executor(lib);
        ex.execute("i/l-harry potter");
        ex.execute("i/l-harry potter");
        ex.execute("i/l-narnia");
        ex.execute("i/v-harry potter");

        System.out.println("inserisci comando:");
        String command = scanner.nextLine();

        do {
            System.out.println(ex.execute(command));
            System.out.println("inserisci comando:");
            command = scanner.nextLine();
        } while (!command.equalsIgnoreCase("EXIT"));
    }
}
