package controller;

import dao.ProdutoDAO;
import model.Produto;

public class ProdutoController {
    ProdutoDAO daoProduto = new ProdutoDAO();

        public void cadastrarProduto(Produto produto){
            Produto produto01 = new Produto("Feijão", 2000.00, 2.67, 8000.00);
            daoProduto.cadastrar(produto01);

            Produto produto02 = new Produto("Arroz", 2000.00, 2.10, 6800.00);
            daoProduto.cadastrar(produto02);
        }
}
