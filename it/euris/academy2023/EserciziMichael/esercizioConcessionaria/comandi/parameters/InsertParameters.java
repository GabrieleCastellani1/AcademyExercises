package it.euris.academy2023.EserciziMichael.esercizioConcessionaria.comandi.parameters;

public class InsertParameters implements CommandParameters{
    private final String concessionaria;
    private final String tipo;
    private final String marca;
    private final String nome;
    private final int quantità;
    private final float prezzo;

    public InsertParameters(String concessionaria, String tipo, String marca, String nome, int quantità, float prezzo) {
        this.concessionaria = concessionaria;
        this.tipo = tipo;
        this.marca = marca;
        this.nome = nome;
        this.quantità = quantità;
        this.prezzo = prezzo;
    }

    @Override
    public String[] getParameters() {
        return new String[]{concessionaria, tipo, marca, nome, quantità + "", prezzo + ""};
    }

    public String getConcessionaria() {
        return concessionaria;
    }

    public String getTipo() {
        return tipo;
    }

    public String getMarca() {
        return marca;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantità() {
        return quantità;
    }

    public float getPrezzo() {
        return prezzo;
    }
}
