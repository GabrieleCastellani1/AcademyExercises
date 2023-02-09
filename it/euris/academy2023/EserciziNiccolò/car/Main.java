package it.euris.academy2023.EserciziNiccolò.car;

public class Main {

    public static void main(String[] args) {

        Car[] cars = new Car[3];
        cars[0] = new Car("JKR805X", "Nera", "Jaguar", 3000, 350, 75000);
        cars[1] = new Car("LDP00SX", "Bianca", "Honda", 2000, 180, 25000);
        cars[2] = new Car("AAL092L", "Rossa", "Mitsubishi", 2500, 220, 33000);
        //cars[3] = new Car("XK5550D", "Blu", "Toyota", 1300, 95, 15000);
        //cars[4] = new Car("ZP00009", "Grigia", "Subaru", 1500, 115, 19000);

        // Scrivere un metodo nella classe Car, che
        // dato un array di Car
        // Resituisce un secondo NUOVO array, con le Car ordinate per prezzo

        printArray(cars);
        Car[] sorted = Car.sort(cars);
        printArray(cars);
        printArray(sorted);
    }

    private static void printArray(Car[] sorted) {
        System.out.println("------------------------");
        for (Car car : sorted) {
            System.out.println(car);
        }
    }


}
