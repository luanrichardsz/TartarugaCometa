package controller;

import model.Entrega;
import model.ProdutoEntrega;
import dao.EntregaDAO;

import java.util.ArrayList;

public class EntregaController {
    EntregaDAO daoEntrega = new EntregaDAO();

    public Entrega cadastrarEntrega(Entrega entrega, ArrayList<ProdutoEntrega> mercadoria){

        daoEntrega.cadastrar(entrega, mercadoria);

        return entrega;
    }

    public ArrayList<Entrega> listarEntregas(){
        return daoEntrega.listar();
    }

    public void atualizarStatusEntrega(boolean realizada, int idEntrega) {
        daoEntrega.atualizar(realizada, idEntrega);
    }
}
