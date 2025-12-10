package controller;

import bo.ProdutoBO;
import dao.ProdutoDAO;
import model.Produto;

import java.util.ArrayList;

public class ProdutoController {
    ProdutoDAO daoProduto = new ProdutoDAO();
    ProdutoBO boProduto = new ProdutoBO();

        public Produto cadastrarProduto(Produto produto){
            //Chamando a validação para validar e mandar para o banco de dados
            boProduto.validarCriacao(produto);

            return produto;
        }

        public ArrayList<Produto> listarProdutos(){
            return daoProduto.listar();
        }

        public void atualizarProduto(String nome, double peso, double volume, double valor, int idProduto){
            boProduto.validarAtualizar(nome, peso, volume, valor, idProduto);
        }

        public void apagarProduto(int idProduto){
            boProduto.validarDeletar(idProduto);
        }
}
