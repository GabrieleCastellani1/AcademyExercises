package it.euris.academy2023.enumeration;

public class ShapeClass {


    private int numLati;

    public static final ShapeClass TRIANGOLO = new ShapeClass(3);
    public static final ShapeClass QUADRATO = new ShapeClass(4);
    public static final ShapeClass PENTAGONO = new ShapeClass(5);

    private ShapeClass(int numLati) {
        this.numLati = numLati;
    }

    public static void main(String[] args) {

    }
}
