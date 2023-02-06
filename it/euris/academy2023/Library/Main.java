package it.euris.academy2023.Library;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library<Content> lib = new Library<>();
        lib.insert(new Book( "harry potter"));
        lib.insert(new Book( "harry potter"));
        lib.insert(new Book( "narnia"));
        lib.insert(new Video("harry potter"));
        Executor ex = new Executor(lib);
        System.out.println("inserisci comando:");
        String command = scanner.nextLine();

        do {
            System.out.println(ex.execute(command));
            System.out.println("inserisci comando:");
            command = scanner.nextLine();
        } while (!command.equalsIgnoreCase("EXIT"));
    }
}
