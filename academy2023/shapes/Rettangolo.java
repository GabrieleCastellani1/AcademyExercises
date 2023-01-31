package it.euris.academy2023.shapes;

import it.euris.academy2023.dynamic.OggettoOrdinabile;

public class Rettangolo implements IShape {

    protected float base;
    protected float altezza;

    public Rettangolo() {
        this(1, 1);
    }

    public Rettangolo(float base, float altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltezza() {
        return altezza;
    }

    public void setAltezza(float altezza) {
        this.altezza = altezza;
    }

    public float calcolaPerimetro() {
        return (base + altezza) * 2;
    }

    @Override
    public String getNome() {
        return "RETTANGOLO";
    }

    @Override
    public boolean precede(OggettoOrdinabile altro) {
        Rettangolo r = (Rettangolo) altro;
        return this.calcolaPerimetro() < r.calcolaPerimetro();
    }
}
