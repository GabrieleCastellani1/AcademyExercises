package it.euris.academy2023.EserciziMichael.zoo.recinto;

import it.euris.academy2023.EserciziMichael.zoo.animali.Animale;

import java.time.LocalTime;
import java.util.List;

public class RecintoStandard extends Recinto{
    private static final TipologiaRecinto TIPOLOGIA_RECINTO=TipologiaRecinto.RECINTOSTANDARD;

    public RecintoStandard(LocalTime orarioDiApertura, LocalTime orarioDiChiusura, List<Animale> animaleList) {
        super(orarioDiApertura,orarioDiChiusura, animaleList);
    }

    @Override
    public TipologiaRecinto getTipologiaRecinto() {
        return TIPOLOGIA_RECINTO;
    }
}
