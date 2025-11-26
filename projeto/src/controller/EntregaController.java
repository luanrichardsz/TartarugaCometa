package controller;

import model.Entrega;
import model.ProdutoEntrega;
import dao.EntregaDAO;

import java.util.ArrayList;

public class EntregaController {
    EntregaDAO entrega = new EntregaDAO();

    public void cadastrarEntrega(){
        ArrayList<ProdutoEntrega> mercadoriasEntrega01 = new ArrayList<>();

//        mercadoriasEntrega01.add(produtoFeijao); //arrumar
//        mercadoriasEntrega01.add(produtoArroz); // arrumar

//        Entrega entrega01 = new Entrega(false, clienteD01, clienteR01); //arrumar

//        entrega.cadastrar(entrega01, mercadoriasEntrega01);
    }

    public ArrayList<Entrega> listarEntrega(){
        return entrega.listar();
    }
}
