package model;

public class Endereco {
    private String cidadeOrigem;
    private String ruaOrigem;
    private int numeroOrigem;
    private String bairroOrigem;
    private String estadoOrigem;


    private String cidadeDestino;
    private String ruaDestino;
    private int numeroDestino;
    private String bairroDestino;
    private String estadoDestino;

    public Endereco(String cidadeOrigem, String ruaOrigem, int numeroOrigem, String bairroOrigem, String estadoOrigem, String cidadeDestino, String ruaDestino, int numeroDestino, String bairroDestino, String estadoDestino) {
        this.cidadeOrigem = cidadeOrigem;
        this.ruaOrigem = ruaOrigem;
        this.numeroOrigem = numeroOrigem;
        this.bairroOrigem = bairroOrigem;
        this.estadoOrigem = estadoOrigem;
        this.cidadeDestino = cidadeDestino;
        this.ruaDestino = ruaDestino;
        this.numeroDestino = numeroDestino;
        this.bairroDestino = bairroDestino;
        this.estadoDestino = estadoDestino;
    }

    public String getCidadeOrigem() {
        return cidadeOrigem;
    }

    public void setCidadeOrigem(String cidadeOrigem) {
        this.cidadeOrigem = cidadeOrigem;
    }

    public String getRuaOrigem() {
        return ruaOrigem;
    }

    public void setRuaOrigem(String ruaOrigem) {
        this.ruaOrigem = ruaOrigem;
    }

    public int getNumeroOrigem() {
        return numeroOrigem;
    }

    public void setNumeroOrigem(int numeroOrigem) {
        this.numeroOrigem = numeroOrigem;
    }

    public String getBairroOrigem() {
        return bairroOrigem;
    }

    public void setBairroOrigem(String bairroOrigem) {
        this.bairroOrigem = bairroOrigem;
    }

    public String getEstadoOrigem() {
        return estadoOrigem;
    }

    public void setEstadoOrigem(String estadoOrigem) {
        this.estadoOrigem = estadoOrigem;
    }

    public String getCidadeDestino() {
        return cidadeDestino;
    }

    public void setCidadeDestino(String cidadeDestino) {
        this.cidadeDestino = cidadeDestino;
    }

    public String getRuaDestino() {
        return ruaDestino;
    }

    public void setRuaDestino(String ruaDestino) {
        this.ruaDestino = ruaDestino;
    }

    public int getNumeroDestino() {
        return numeroDestino;
    }

    public void setNumeroDestino(int numeroDestino) {
        this.numeroDestino = numeroDestino;
    }

    public String getBairroDestino() {
        return bairroDestino;
    }

    public void setBairroDestino(String bairroDestino) {
        this.bairroDestino = bairroDestino;
    }

    public String getEstadoDestino() {
        return estadoDestino;
    }

    public void setEstadoDestino(String estadoDestino) {
        this.estadoDestino = estadoDestino;
    }

    public String toString(){
        return "\n==== Endereço da Viagem ====" +
               "\nProduto saindo da " + getRuaOrigem() + " nº" + getNumeroOrigem() + ", bairro " + getBairroOrigem() + ", cidade " + getCidadeOrigem() + ", estado " + getEstadoOrigem() + "." +
               "\nSe deslocando para " + getRuaDestino() + " nº " + getNumeroDestino() + ", bairro " + getBairroDestino() + ", cidade " + getCidadeDestino() + ", estado " + getEstadoDestino() + "." ;
    }
}
