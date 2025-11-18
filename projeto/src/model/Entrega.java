package model;

import java.util.ArrayList;
import java.util.List;

public class Entrega {

    private int idEntrega;
    private boolean entregue;
    public Cliente clienteRemetente;
    public Cliente clienteDestinatario;
    private List<ProdutoEntrega> produtos;

    public Entrega(boolean entregue, Cliente clienteRemetente, Cliente clienteDestinatario) {
        this.entregue = entregue;
        this.clienteRemetente = clienteRemetente;
        this.clienteDestinatario = clienteDestinatario;

        // inicializar a lista de produtos
        this.produtos = new ArrayList<>();
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

    public List<ProdutoEntrega> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<ProdutoEntrega> produtos) {
        this.produtos = produtos;
    }

    /*
    @Override
    public String toString() {
        return "\n==== Entrega ====" +
               "\nEntrega número: " + getIdEntrega() +
               "\nFoi entregue? " + (entregue ? "Sim" : "Não") + "." +
               "\n\nCliente Remetente: " + clienteRemetente +
               "\n\nCliente Destinatario: " + clienteDestinatario +
               "\n" + produto;
    }
     */
}
