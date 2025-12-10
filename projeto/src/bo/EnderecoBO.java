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
        errosCriacao.clear();

        //Validar as entradas
        validarEntradaRua(endereco);
        validarEntradaNumero(endereco);
        validarEntradaBairro(endereco);
        validarEntradaCidade(endereco);
        validarEntradaEstado(endereco);

        //Se a lista de erros estiver vazia, cria o cliente, se nao, imprime os erros
        if (errosCriacao.isEmpty()){
            enderecoDAO.cadastrar(endereco);
        } else {
            System.out.println(errosCriacao);
        }
    }

    //Função para validar se todas as entradas foram preenchidas
    public void validarEntradaRua(Endereco endereco){
        if (endereco.getRua() == null || endereco.getRua().isEmpty()){
            errosCriacao.add("\nPreencha o nome da rua!");
        }
    }
    private void validarEntradaNumero(Endereco endereco){
        if (endereco.getNumero() == null || endereco.getNumero().isEmpty()){
            errosCriacao.add("\nPreencha o numero da residência!");
        }
        if (!endereco.getNumero().matches("^\\d{1,5}[A-Z]{0,1}$")){
            errosCriacao.add("\nPreencha com um número válido!");
        }
    }
    private void validarEntradaBairro(Endereco endereco){
        if (endereco.getBairro() == null || endereco.getBairro().isEmpty()){
            errosCriacao.add("\nPreencha o nome do bairro!");
        }

    }
    private void validarEntradaCidade(Endereco endereco){
        if (endereco.getCidade() == null || endereco.getCidade().isEmpty()){
            errosCriacao.add("\nPreencha o nome da cidade!");
        }
        if (!endereco.getCidade().matches("^[a-zA-Zà-ü'\\s]{2,}$")){
            errosCriacao.add("\nCaracteres invalidos no nome da cidade!");
        }
    }
    public void validarEntradaEstado(Endereco endereco){
        if (endereco.getEstado() == null || endereco.getEstado().isEmpty()){
            errosCriacao.add("\nPreencha o nome do estado!");
        }
        if (!endereco.getEstado().matches("^[a-zA-Zà-ü'\\s]{2,}$")){
            errosCriacao.add("\nCaracteres invalidos no nome do estado!");
        }
    }
}
