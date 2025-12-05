package bo;

import dao.ProdutoDAO;
import model.Produto;

import java.util.ArrayList;

public class ProdutoBO {
    ProdutoDAO produtoDAO = new ProdutoDAO();

    //Lista onde vai armazenar todos os erros que tiver
    ArrayList<String> errosCriacao = new ArrayList<>();

    //chamar somente as funções onde faz sentido para CRIAÇÃO
    public void validarCriacao(Produto produto){
        //Chamando a função
        validarProduto(produto);

        //Se a lista de erros tiver vazia, vai criar o produto no banco de dados
        if (errosCriacao.isEmpty()){
            produtoDAO.cadastrar(produto);
        }
    }

    //Função para validar se todas as entradas foram preenchidas
    private ArrayList<String> validarProduto(Produto produto) {

        if (produto.getNome() == null || produto.getNome().isEmpty()){
            errosCriacao.add("\nPreencha o nome do produto!");
        }
        if ( produto.getPeso() <= 0.0 ){
            errosCriacao.add("\nPreencha o peso do produto corretamente!");
        }
        if ( produto.getVolume() <= 0.0){
            errosCriacao.add("\nPreencha o volume do produto corretamente!");
        }
        if ( produto.getValor() <= 0.0){
            errosCriacao.add("\nPreencha o valor do produto corretamente!");
        }

        //Se a lista tiver com algum erro, vai imprimir os erros, se nao, nao imprime nada
        if (!errosCriacao.isEmpty()){
            System.out.println(errosCriacao);

//            errosCriacao.clear();
        }
        return errosCriacao;

    }
}
