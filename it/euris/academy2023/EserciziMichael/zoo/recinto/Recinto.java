package it.euris.academy2023.EserciziMichael.zoo.recinto;

import it.euris.academy2023.EserciziMichael.zoo.animali.Animale;

import java.time.LocalTime;
import java.util.List;

public abstract class Recinto {
    private LocalTime orarioDiApertura;
    private LocalTime orarioDiChiusura;
    private List<Animale> animaleList;

    public Recinto(LocalTime orarioDiApertura, LocalTime orarioDiChiusura, List<Animale> animaleList) {
        this.orarioDiApertura = orarioDiApertura;
        this.orarioDiChiusura = orarioDiChiusura;
        this.animaleList = animaleList;
    }

    public abstract TipologiaRecinto getTipologiaRecinto();

    public LocalTime getOrarioDiApertura() {
        return orarioDiApertura;
    }

    public void setOrarioDiApertura(LocalTime orarioDiApertura) {
        this.orarioDiApertura = orarioDiApertura;
    }

    public LocalTime getOrarioDiChiusura() {
        return orarioDiChiusura;
    }

    public void setOrarioDiChiusura(LocalTime orarioDiChiusura) {
        this.orarioDiChiusura = orarioDiChiusura;
    }

    public List<Animale> getAnimaliList() {
        return animaleList;
    }

    public void setAnimaliList(List<Animale> animaleList) {
        this.animaleList = animaleList;
    }
}
