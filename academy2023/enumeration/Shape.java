package it.euris.academy2023.enumeration;

public enum Shape {
    TRIANGOLO(3),
    QUADRATO(4),
    PENTAGONO(5);

    private int numLati;

    Shape(int numLati) {
        this.numLati = numLati;
    }

    public static void main(String[] args) {
        Shape shape1 = Shape.TRIANGOLO;
        Shape shape2 = Shape.QUADRATO;
    }
}
