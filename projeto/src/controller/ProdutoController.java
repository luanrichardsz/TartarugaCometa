package controller;

import dao.ProdutoDAO;
import model.Produto;

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

        public void atualizarProduto(String nome, double peso, double volume, double valor, int idProduto){
            daoProduto.atualizar(nome, peso, volume, valor, idProduto);
        }

        public void apagarProduto(int idProduto){
            daoProduto.apagar(idProduto);
        }
}
