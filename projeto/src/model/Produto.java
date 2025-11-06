package model;

public class Produto {

    private String nome;
    private double peso;
    private double volume;
    private double valor;

    public Produto(String nome, double peso, double volume, double valor) {
        this.nome = nome;
        this.peso = peso;
        this.volume = volume;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String toString(){
        return "\n=== Produto ===" +
                "\nDados do Produto:" +
                "\nNome: " + getNome() +
                "\nPeso: " + getPeso() +
                "\nVolume: " + getVolume() +
                "\nValor: " + getValor();
    }

}
