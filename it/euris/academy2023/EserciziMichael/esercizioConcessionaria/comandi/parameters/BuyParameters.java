package it.euris.academy2023.EserciziMichael.esercizioConcessionaria.comandi.parameters;

public class BuyParameters implements CommandParameters, Comparable<BuyParameters>{
    private String concessionaria;
    private String tipo;
    private String marca;
    private String nome;
    private int quantità;

    public BuyParameters(String concessionaria, String tipo, String marca, String nome, int quantità) {
        this.concessionaria = concessionaria;
        this.tipo = tipo;
        this.marca = marca;
        this.nome = nome;
        this.quantità = quantità;
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

    @Override
    public String[] getParameters() {
        return new String[]{concessionaria, tipo, marca, nome, quantità + ""};
    }

    @Override
    public int compareTo(BuyParameters o) {
        return this.quantità - o.getQuantità();
    }
}
