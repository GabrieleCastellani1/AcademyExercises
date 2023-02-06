package it.euris.academy2023.Esercizi.Restaurant;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.HashMap;


public class Main {

        // Main method
        public static void main(String[] args) {
            Table t1 = new Table(1, 4);
            Table t2 = new Table(2, 5);
            Table t3 = new Table(3, 2);

            Menu menu = new Menu();
            menu.addEatable(new Eatable("pizza", 7, false));
            menu.addEatable(new Eatable("pasta al pomodoro", 5.50f, false));
            menu.addEatable(new Eatable("coca-cola", 2.50f, true));
            menu.addEatable(new Eatable("insalata", 4, false));
            menu.addEatable(new Eatable("acqua naturale", 1, true));

            t1.addOrder(menu.get("pizza"), menu.get("coca-cola"));
            t2.addOrder(menu.get("pasta al pomodoro"), menu.get("insalata"), menu.get("acqua naturale"));

            float bill1 = t1.getBill();
            float bill2 = t2.getBill();
        }
}
