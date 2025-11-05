package model;

public class Entrega {
    private int idEntrega;
    public boolean realizado;

    public Entrega(boolean realizado) {
        this.realizado = realizado;
    }

    public boolean verificarEntrega() {
        return realizado;
    }

    public void informarEntrega (boolean realizado) {
        this.realizado = realizado;
    }
}
