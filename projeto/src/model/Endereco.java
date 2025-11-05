package model;

public class Endereco {
    public String origem;
    public String destino;
    //complementar a origem e o destino com mais detalhes

    public Endereco(String origem, String destino) {
        this.origem = origem;
        this.destino = destino;
    }

    public String retornarOrigem() {
        return origem;
    }

    public void informarOrigem(String origem) {
        this.origem = origem;
    }

    public String retornarDestino() {
        return destino;
    }

    public void informarDestino(String destino) {
        this.destino = destino;
    }

}
