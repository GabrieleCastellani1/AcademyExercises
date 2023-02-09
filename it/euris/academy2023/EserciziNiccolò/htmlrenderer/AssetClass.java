package it.euris.academy2023.EserciziNiccolò.htmlrenderer;

public class AssetClass {

    private String nome;
    private float valore;

    public AssetClass(String nome, float valore) {
        this.nome = nome;
        this.valore = valore;
    }

    public AssetClass() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValore() {
        return valore;
    }

    public void setValore(float valore) {
        this.valore = valore;
    }
}
