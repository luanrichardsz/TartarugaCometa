package model;

public class Endereco {
    private int id;
    private String cidade;
    private String rua;
    private String numero;
    private String bairro;
    private String estado;

    public Endereco(String cidade, String rua, String numero, String bairro, String estado) {
        this.cidade = cidade;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String toString(){
        return getRua() + ", nº " + getNumero() + ", bairro " + getBairro() + ", cidade " + getCidade() + ", estado " + getEstado() + ".";
    }
}
