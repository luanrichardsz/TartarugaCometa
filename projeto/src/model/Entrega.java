package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Entrega {

    private int idEntrega;
    private boolean entregue;
    private List<Produto> produto;
    public Cliente clienteJuridico;
    public Cliente clienteFisico;

    public Entrega(int idEntrega, boolean entregue, Produto produto, Cliente clienteJuridico, Cliente clienteFisico) {
        this.idEntrega = idEntrega;
        this.entregue = entregue;
        this.produto = Collections.singletonList(produto);
        this.clienteJuridico = clienteJuridico;
        this.clienteFisico = clienteFisico;
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

    public void setEntregue(boolean entregue) {
        this.entregue = entregue;
    }

    public List<Produto> getProduto() {
        return produto;
    }

    public void setProduto(List<Produto> produto) {
        this.produto = produto;
    }

    public Cliente getClienteJuridico() {
        return clienteJuridico;
    }

    public void setClienteJuridico(Cliente clienteJuridico) {
        this.clienteJuridico = clienteJuridico;
    }

    public Cliente getClienteFisico() {
        return clienteFisico;
    }

    public void setClienteFisico(Cliente clienteFisico) {
        this.clienteFisico = clienteFisico;
    }

    @Override
    public String toString() {
        return "\n==== Entrega ====" +
               "\nEntrega número: " + getIdEntrega() +
               "\nFoi entregue? " + (entregue ? "Sim" : "Não") + "." +
               "\n\nCliente Remetente: " + clienteJuridico +
               "\n\nCliente Destinatario: " + clienteFisico +
               "\n" + produto;
    }
}
