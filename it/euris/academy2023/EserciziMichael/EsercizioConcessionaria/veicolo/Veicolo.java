package it.euris.academy2023.EserciziMichael.EsercizioConcessionaria.veicolo;

import java.util.Objects;

public class Veicolo {
    private String nome;
    private String marca;
    private tipoEnum tipo;
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
