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
        errosCriacao.clear();

        //Chamando a função
        validarEntradaNome(produto);
        validarEntradaPeso(produto);
        validarEntradaVolume(produto);
        validarEntradaValor(produto);

        //Se a lista de erros tiver vazia, vai criar o produto no banco de dados, se nao, imprime os erros
        if (errosCriacao.isEmpty()){
            produtoDAO.cadastrar(produto);
        } else {
            System.out.println(errosCriacao);
        }
    }

    //Função para validar se todas as entradas foram preenchidas
    private void validarEntradaNome(Produto produto) {
        if (produto.getNome() == null || produto.getNome().isEmpty()){
            errosCriacao.add("\nPreencha o nome do produto!");
        }
        if (!produto.getNome().matches("^[a-zA-Zà-ü'\\s]{2,}$")){
            errosCriacao.add("\nCaracteres invalidos no nome!");
        }
    }
    private void validarEntradaPeso(Produto produto){
        if ( produto.getPeso() <= 0.0 ){
            errosCriacao.add("\nPreencha o peso do produto corretamente!");
        }
    }
    private void validarEntradaVolume(Produto produto){
        if ( produto.getVolume() <= 0.0){
            errosCriacao.add("\nPreencha o volume do produto corretamente!");
        }
    }
    private void validarEntradaValor(Produto produto){
        if ( produto.getValor() <= 0.0){
            errosCriacao.add("\nPreencha o valor do produto corretamente!");
        }
    }
}
