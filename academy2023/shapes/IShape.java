package it.euris.academy2023.shapes;

import it.euris.academy2023.dynamic.OggettoOrdinabile;

public interface IShape extends OggettoOrdinabile {

    default String getDescrizione() {
        return "Sono una figura di tipo " + getNome() + ", con perimetro: " + calcolaPerimetro();
    }

    float calcolaPerimetro();


    String getNome();

}
