package bo;

import model.Endereco;
import dao.EnderecoDAO;

import java.util.ArrayList;

public class EnderecoBO {
    EnderecoDAO enderecoDAO = new EnderecoDAO();

    //Lista onde vai armazenar todos os erros que tiver
    ArrayList<String> errosCriacao = new ArrayList<>();

    //chamar somente as funções onde faz sentido para CRIAÇÃO
    public void validarCriacao(Endereco endereco){
        validarEntrada(endereco);

        if (errosCriacao.isEmpty()){
            enderecoDAO.cadastrar(endereco);
        }
    }

    //Função para validar se todas as entradas foram preenchidas
    public ArrayList<String> validarEntrada(Endereco endereco){
        if (endereco.getRua() == null || endereco.getRua().isEmpty()){
            errosCriacao.add("\nPreencha o nome da rua!");
        }
        if (endereco.getNumero() == null || endereco.getNumero().isEmpty()){
            errosCriacao.add("\nPreencha o numero da residência!");
        }
        if (endereco.getBairro() == null || endereco.getBairro().isEmpty()){
            errosCriacao.add("\nPreencha o nome do bairro!");
        }
        if (endereco.getCidade() == null || endereco.getCidade().isEmpty()){
            errosCriacao.add("\nPreencha o nome da cidade!");
        }
        if (endereco.getEstado() == null || endereco.getEstado().isEmpty()){
            errosCriacao.add("\nPreencha o nome da cidade!");
        }

        //Se a lista tiver com algum erro, vai imprimir os erros, se nao, nao imprime nada
        if (!errosCriacao.isEmpty()){
            System.out.println(errosCriacao);

//            errosCriacao.clear();
        }

        return errosCriacao;
    }
}
