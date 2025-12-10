package bo;

import dao.ProdutoDAO;
import model.Produto;

import java.util.ArrayList;

public class ProdutoBO {
    ProdutoDAO produtoDAO = new ProdutoDAO();

    //Lista onde vai armazenar todos os erros que tiver
    ArrayList<String> erros = new ArrayList<>();

    //chamar somente as funções onde faz sentido para CRIAÇÃO
    public void validarCriacao(Produto produto){
        erros.clear();

        //Chamando a função
        validarEntradaNome(produto);
        validarEntradaPeso(produto);
        validarEntradaVolume(produto);
        validarEntradaValor(produto);

        //Se a lista de erros tiver vazia, vai criar o produto no banco de dados, se nao, imprime os erros
        if (erros.isEmpty()){
            produtoDAO.cadastrar(produto);
        } else {
            System.out.println(erros);
        }
    }

    public void validarAtualizar(String nome, double peso, double volume, double valor, int idProduto){
        erros.clear();

        int idProdutoBanco = produtoDAO.buscarPorId(idProduto);

        if (idProdutoBanco == idProduto){
            produtoDAO.atualizar(nome, peso, volume, valor, idProduto);
        } else {
            erros.add("ID não encontrado no banco de dados!");
            System.out.println(erros);
        }
    }

    public void validarDeletar(int idProduto){
        erros.clear();

        int idProdutoBanco = produtoDAO.buscarPorId(idProduto);

        if (idProdutoBanco == idProduto){
            produtoDAO.apagar(idProduto);
        } else {
            erros.add("ID não encontrado no banco de dados!");
            System.out.println(erros);
        }
    }

    //Função para validar se todas as entradas foram preenchidas
    private void validarEntradaNome(Produto produto) {
        if (produto.getNome() == null || produto.getNome().isEmpty()){
            erros.add("\nPreencha o nome do produto!");
        }
        if (!produto.getNome().matches("^[a-zA-Zà-ü'\\s]{2,}$")){
            erros.add("\nCaracteres invalidos no nome!");
        }
    }
    private void validarEntradaPeso(Produto produto){
        if ( produto.getPeso() <= 0.0 ){
            erros.add("\nPreencha o peso do produto corretamente!");
        }
    }
    private void validarEntradaVolume(Produto produto){
        if ( produto.getVolume() <= 0.0){
            erros.add("\nPreencha o volume do produto corretamente!");
        }
    }
    private void validarEntradaValor(Produto produto){
        if ( produto.getValor() <= 0.0){
            erros.add("\nPreencha o valor do produto corretamente!");
        }
    }
}
