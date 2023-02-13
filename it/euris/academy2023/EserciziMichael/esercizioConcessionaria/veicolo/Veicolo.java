package it.euris.academy2023.EserciziMichael.esercizioConcessionaria.veicolo;

import java.util.Objects;

public abstract class Veicolo {
    private final String nome;
    private final String marca;
    private final tipoEnum tipo;
    public Veicolo(String nome, String marca, tipoEnum tipo) {
        this.nome = nome;
        this.marca = marca;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return marca;
    }

    public tipoEnum getTipo() {
        return tipo;
    }

    public abstract int getNUmeroRuote();

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (!(o instanceof Veicolo)){
            return false;
        }else {
            Veicolo veicolo = (Veicolo)o;
            return Objects.equals(nome, veicolo.nome) && Objects.equals(marca, veicolo.marca) && tipo == veicolo.tipo;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, marca, tipo);
    }

    @Override
    public String toString() {
        return "Veicolo{" +
                "nome='" + nome + '\'' +
                ", marca='" + marca + '\'' +
                ", tipo=" + tipo +
                '}';
    }
}
