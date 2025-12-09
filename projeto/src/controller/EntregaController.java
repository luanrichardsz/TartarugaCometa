package controller;

import bo.EntregaBO;
import model.Entrega;
import model.ProdutoEntrega;
import dao.EntregaDAO;

import java.util.ArrayList;

public class EntregaController {
    EntregaDAO daoEntrega = new EntregaDAO();
    EntregaBO boEntrega = new EntregaBO();

    public Entrega cadastrarEntrega(Entrega entrega, ArrayList<ProdutoEntrega> mercadoria){
        boEntrega.validarCriacao(entrega, mercadoria);
        return entrega;
    }

    public ArrayList<Entrega> listarEntregas(){
        return daoEntrega.listar();
    }

    public void atualizarStatusEntrega(boolean realizada, int idEntrega) {
        daoEntrega.atualizar(realizada, idEntrega);
    }

    public void apagarEntrega(int idEntrega){
        daoEntrega.apagar(idEntrega);
    }
}
