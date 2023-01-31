package it.euris.academy2023.validator;

import java.util.ArrayList;

public class AnagraficaOutput {
    private String codiceFiscale;
    private ArrayList<String> errore;

    public AnagraficaOutput(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
        this.errore = new ArrayList<>();
    }

    public AnagraficaOutput(String codiceFiscale, ArrayList<String> errore) {
        this.codiceFiscale = codiceFiscale;
        this.errore = errore;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    public ArrayList<String> getErrore() {
        return errore;
    }

    public void setErrore(ArrayList<String> errore) {
        this.errore = errore;
    }
}
