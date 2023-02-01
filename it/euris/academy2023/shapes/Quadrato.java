package it.euris.academy2023.shapes;

public class Quadrato extends Rettangolo {

    public Quadrato(float lato) {
        super(lato, lato);
    }

    @Override
    public String getNome() {
        return "QUADRATO";
    }

}
