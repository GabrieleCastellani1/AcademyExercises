package it.euris.academy2023.EserciziNiccolò.validator;

import java.util.ArrayList;

public class Main {

    public static final ArrayList<String> ANAGRAFICA;

    static {
        ANAGRAFICA = new ArrayList<>();
        ANAGRAFICA.add("Mario Rossi;RRRMMM90D50E635M;1990-01-05;M;Via Roma 22;3335555555");
        ANAGRAFICA.add("Carlo Verdi;VVVCCC78D50E635M;1978-05-09;M;Via Milano 55;3662222222");
        ANAGRAFICA.add("Elena Bianchi;BBBEEE95D50E635M;1995-01-01;Z;Via Como 77;3334445566");
        ANAGRAFICA.add("Luca Gialli;GGGLLL85D50E635M;1985/05/05;M;Via Venezia 33;333125");
    }

    private static void stampa(ArrayList<String> args) {
        for (String s : args) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        AnagraficaValidator validator = new AnagraficaValidator(ANAGRAFICA);
        validator.process();
        ArrayList<String> okOut = validator.getSuccessOutput();
        ArrayList<String> koOut = validator.getErrorOutput();
        System.out.println("Validazioni ok: ");
        stampa(okOut);
        System.out.println("Validazioni ko: ");
        stampa(koOut);

    }
}
