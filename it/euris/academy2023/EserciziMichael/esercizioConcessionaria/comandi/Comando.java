package it.euris.academy2023.EserciziMichael.esercizioConcessionaria.comandi;

import it.euris.academy2023.EserciziMichael.esercizioConcessionaria.comandi.parameters.CommandParameters;

public interface Comando<T extends CommandParameters> {
    String doCommand();
    TipologiaComando getComando();
    T getParameters();
}
