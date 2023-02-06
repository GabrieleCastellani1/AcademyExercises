package it.euris.academy2023.Library;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library<Content> lib = new Library<>();
        lib.insert(new Book("l", "harry potter"));
        lib.insert(new Book("l", "narnia"));
        lib.insert(new Video("v", "harry potter"));
        Executor ex = new Executor(lib);

        do {
            System.out.println("inserisci comando:");
            String command = scanner.nextLine();
            System.out.println(ex.execute(command));
            System.out.println("inserisci comando:");
        } while (!scanner.nextLine().equalsIgnoreCase("EXIT"));
    }
}
