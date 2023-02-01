package it.euris.academy2023.calculation;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        calc.setEngine(new CalculatorEngine() {
            @Override
            public float add(float a, float b) {
                return a + b;
            }

            @Override
            public float sub(float a, float b) {
                return a - b;
            }

            @Override
            public float mult(float a, float b) {
                return a * b;
            }

            @Override
            public float div(float a, float b) {
                return a / b;
            }
        });

        calc.add(3, 4);
        calc.sub(5, 3);
        calc.mult(7, 8);
        calc.div(8, 3);
    }
}
