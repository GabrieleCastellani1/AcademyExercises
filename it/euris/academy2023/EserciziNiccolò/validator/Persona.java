package it.euris.academy2023.EserciziNiccolò.validator;

public class Persona {
    private String nome;
    private String codiceFiscale;
    private String data;
    private String domicilio;
    private String genere;
    private String numero;

    public Persona(String nome, String codiceFiscale, String data, String genere, String domicilio, String numero) {
        this.nome = nome;
        this.codiceFiscale = codiceFiscale;
        this.data = data;
        this.domicilio = domicilio;
        this.genere = genere;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
