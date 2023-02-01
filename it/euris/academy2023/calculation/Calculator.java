package it.euris.academy2023.calculation;

public class Calculator {
    private CalculatorEngine engine;

    public Calculator(){
        this.engine = null;
    }

    public Calculator(CalculatorEngine engine){
        this.engine = engine;
    }

    public void add(float a, float b) {
        float result = engine.add(a, b);
        System.out.println(result);
    }

    public void sub(float a, float b) {
        float result = engine.sub(a, b);
        System.out.println(result);
    }

    public void mult(float a, float b) {
        float result = engine.mult(a, b);
        System.out.println(result);
    }

    public void div(float a, float b) {
        float result = engine.div(a, b);
        System.out.println(result);
    }

    public void setEngine(CalculatorEngine engine) {
        this.engine = engine;
    }
}
