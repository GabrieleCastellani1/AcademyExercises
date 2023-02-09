package it.euris.academy2023.EserciziNiccolò.shapes;

public abstract class Shape {

    public Shape() {}

    public abstract float calcolaPerimetro();

    public final String toString() {
        return "Sono una figura di tipo " + getNome() + ", con perimetro: " + calcolaPerimetro();
    }

    protected abstract String getNome();

}
