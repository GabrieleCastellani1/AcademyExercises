package it.euris.academy2023.EserciziNiccolò.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;

public class Product {
    private final String name;
    private final float price;
    private final int amount;
    private final boolean saleable;

    public Product(String name, float price, int amount, boolean saleable) {
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.saleable = saleable;
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product("TV", 1000, 10, true));
        products.add(new Product("Tablet", 200, 7, true));
        products.add(new Product("Smartphone", 500, 17, true));
        products.add(new Product("Estintore", 100, 2, false));

        //scrivere un'espressione lambda che va a calcolare
        // l'importo totale di tutti i prodotti vendibili presenti nello store

        double sum = products.stream()
                .filter(p -> p.saleable)
                .mapToDouble(p -> p.amount * p.price)
                .sum();

        sum = products.stream()
                .filter(p -> p.saleable)
                .map(x -> x.amount * x.price)
                .reduce((x, y) -> x + y).get();

        System.out.println("la somma è " + sum);
    }
}
