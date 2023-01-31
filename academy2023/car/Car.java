package it.euris.academy2023.car;

/**
 * Definizione di una automobile.
 * Le proprietà sono
 * - targa
 * - colore
 * - modello
 * - cilindrata
 * - potenza
 * - prezzo
 */
public class Car {
    private String plateNumber;
    private String color;
    private String model;
    private int engineSize;
    private int power;
    private float price;

    public Car() {
    }

    public Car(String plateNumber, String color, String model, int engineSize, int power, float price) {
        this.plateNumber = plateNumber;
        this.color = color;
        this.model = model;
        this.engineSize = engineSize;
        this.power = power;
        this.price = price;
    }

    public Car(String plateNumber, String color, String model) {
        this(plateNumber, color, model, 1000, 80, 8000);
    }

    @Override
    public String toString() {
        return "Car{" +
                "plateNumber='" + this.plateNumber + '\'' +
                ", color='" + this.color + '\'' +
                ", model='" + this.model + '\'' +
                ", engineSize=" + this.engineSize +
                ", power=" + this.power +
                ", price=" + this.price +
                '}';
    }

    public String getPlateNumber() {
        return this.plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(int engineSize) {
        this.engineSize = engineSize;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object car) {
        if (car instanceof Car) {
            return this.plateNumber.equals(((Car) car).plateNumber);
        } else {
            return false;
        }
    }


    /**
     *
     * @param cars
     * @return
     */
    public static Car[] sort(Car[] cars) {
        Car[] sorted = new Car[cars.length];
        for (int i = 0; i < sorted.length; i++) {
            sorted[i] = cars[i].copy();
        }
        Car.addTax(sorted);
        Car.bubbleSort(sorted);
        return sorted;
    }

    public Car copy() {
        Car copy = new Car(this.getPlateNumber(), this.getColor(), this.getModel(), this.getEngineSize(), this.getPower(), this.getPrice());
        return copy;
    }

    private static void addTax(Car[] sorted) {
        for (Car car : sorted) {
            car.price = (float) (car.price * 1.2);
        }
    }

    public static void bubbleSort(Car[] cars) {
        int n = cars.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (cars[j].price > cars[j + 1].price) {
                    swap(cars, j, j + 1);
                }
            }
        }
    }

    private static void swap(Car[] cars, int first, int second) {
        Car temp = cars[first];
        cars[first] = cars[second];
        cars[second] = temp;
    }



}
