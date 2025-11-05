package model;

public class Produto {
    public String nome;
    public double peso;
    public double volume;
    public double valor;

    public Produto(String nome, double peso, double volume, double valor) {
        this.nome = nome;
        this.peso = peso;
        this.volume = volume;
        this.valor = valor;
    }

    public String retornarNome() {
        return nome;
    }

    public void cadastrarNome(String nome) {
        this.nome = nome;
    }

    public double retornarPeso() {
        return peso;
    }

    public void cadastrarPeso(double peso) {
        this.peso = peso;
    }

    public double retornarVolume() {
        return volume;
    }

    public void cadastrarVolume(double volume) {
        this.volume = volume;
    }

    public double retornarValor() {
        return valor;
    }

    public void cadastrarValor(double valor) {
        this.valor = valor;
    }
}
