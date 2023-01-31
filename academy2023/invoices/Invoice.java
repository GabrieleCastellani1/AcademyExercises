package it.euris.academy2023.invoices;

import it.euris.academy2023.dynamic.OggettoOrdinabile;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Invoice implements OggettoOrdinabile {

    private int progressivo;
    private String ordine;
    private float valore;
    private Date dataEmissione;

    // Il date format conviene usarlo come costante, in quanto non varia tra le singole istanze
    // (in realtà questa classe in particolare non essendo thread safe, diventa pericolosa se condivisa
    // in contesto multithread, ma non è questo il caso)
    private static final SimpleDateFormat SIMPLE_DATE_FORMAT;
    static {
        SIMPLE_DATE_FORMAT = new SimpleDateFormat("yyyy/MM/dd");
    }

    public Invoice(int progressivo, String ordine, float valore, String dataEmissione) {
        this.progressivo = progressivo;
        this.ordine = ordine;
        this.valore = valore;
        this.dataEmissione = convert(dataEmissione);
    }

    private Date convert(String dataEmissione) {
        try {
            return SIMPLE_DATE_FORMAT.parse(dataEmissione);
        } catch (ParseException e) {
            throw new RuntimeException("Formato date errato");
        }
    }

    public int getProgressivo() {
        return progressivo;
    }

    public void setProgressivo(int progressivo) {
        this.progressivo = progressivo;
    }

    public String getOrdine() {
        return ordine;
    }

    public void setOrdine(String ordine) {
        this.ordine = ordine;
    }

    public float getValore() {
        return valore;
    }

    public void setValore(float valore) {
        this.valore = valore;
    }

    public Date getDataEmissione() {
        return dataEmissione;
    }

    public void setDataEmissione(Date dataEmissione) {
        this.dataEmissione = dataEmissione;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "progressivo=" + progressivo +
                ", ordine='" + ordine + '\'' +
                ", valore=" + valore +
                ", dataEmissione=" + dataEmissione +
                '}';
    }

    @Override
    public boolean precede(OggettoOrdinabile altro) {
        Invoice i = (Invoice) altro;
        return this.progressivo < i.progressivo;
    }
}
