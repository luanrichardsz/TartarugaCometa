package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Entrega {

    private int idEntrega;
    private boolean entregue;
    private List<Produto> produto;
    public Cliente clienteRemetente;
    public Cliente clienteDestinatario;

    public Entrega(int idEntrega, boolean entregue, Produto produto, Cliente clienteRemetente, Cliente clienteDestinatario) {
        this.idEntrega = idEntrega;
        this.entregue = entregue;
        this.produto = Collections.singletonList(produto);
        this.clienteRemetente = clienteRemetente;
        this.clienteDestinatario = clienteDestinatario;
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

    public Cliente getClienteRemetente() {
        return clienteRemetente;
    }

    public void setClienteRemetente(Cliente clienteRemetente) {
        this.clienteRemetente = clienteRemetente;
    }

    public Cliente getClienteDestinatario() {
        return clienteDestinatario;
    }

    public void setClienteDestinatario(Cliente clienteDestinatario) {
        this.clienteDestinatario = clienteDestinatario;
    }

    @Override
    public String toString() {
        return "\n==== Entrega ====" +
               "\nEntrega número: " + getIdEntrega() +
               "\nFoi entregue? " + (entregue ? "Sim" : "Não") + "." +
               "\n\nCliente Remetente: " + clienteRemetente +
               "\n\nCliente Destinatario: " + clienteDestinatario +
               "\n" + produto;
    }
}
