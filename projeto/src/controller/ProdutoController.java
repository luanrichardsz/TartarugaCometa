package controller;

import dao.ProdutoDAO;
import model.Produto;
import model.ProdutoEntrega;

import java.util.ArrayList;

public class ProdutoController {
    ProdutoDAO daoProduto = new ProdutoDAO();

        public Produto cadastrarProduto(Produto produto){
            daoProduto.cadastrar(produto);

            return produto;
        }

        public ArrayList<Produto> listarProdutos(){
            return daoProduto.listar();
        }
}
