package it.euris.academy2023.EserciziMichael.esercizioConcessionaria.comandi.parameters;

public class SearchParameters implements CommandParameters{
    private String tipo;
    private String marca;
    private String nome;

    public SearchParameters(String tipo, String marca, String nome) {
        this.tipo = tipo;
        this.marca = marca;
        this.nome = nome;
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

    @Override
    public String[] getParameters() {
        return new String[]{tipo, marca, nome};
    }
}
