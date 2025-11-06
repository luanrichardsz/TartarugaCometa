package model;

import java.util.ArrayList;
import java.util.List;

public class Entrega {

    private int idEntrega;
    private boolean entregue;
    private List<Produto> produto = new ArrayList<>();
    public Cliente cliente = new Cliente();

    public Entrega(int idEntrega, boolean entregue, Cliente produto, Produto cliente) {
        this.idEntrega = idEntrega;
        this.entregue = entregue;
    }

    public List<Produto> getProduto() {
        return produto;
    }

    public void setProduto(List<Produto> produto) {
        this.produto = produto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getIdEntrega() {
        return idEntrega;
    }

    public void setIdEntrega(int idEntrega) {
        this.idEntrega = idEntrega;
    }

    public boolean isEntregue() {
        return entregue;
    }

    public void setEntregue (boolean entregue) {
        this.entregue = entregue;
    }

    /*
    @Override
    public String toString() {
        return "\n==== Entrega ====" +
               "\nEntrega número: " + getIdEntrega() +
               "\nFoi entregue? " + (entregue ? "Sim" : "Não") + ".";
    }
     */
}
