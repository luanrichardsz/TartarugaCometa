package bo;

import dao.ClienteDAO;
import model.Cliente;

import java.util.ArrayList;

public class ClienteBO {
    ClienteDAO clienteDAO = new ClienteDAO();

    ArrayList<String> errosCriacao = new ArrayList<>();

    public void validarCriacao(Cliente cliente){
        errosCriacao.clear();

        // Validações para não receber vazio
        validarEntradaNome(cliente);
        validarEntradaCpfCnpj(cliente);
        validarEntradaRazaoSocial(cliente);
        validarEntradaEndereco(cliente);

        //Validar se o tamanho do CPF/CNPJ esta correto
        validarCpfCnpj(cliente);

        //Se a lista de erros estiver vazia, cria o cliente, se nao, imprime os erros
        if (errosCriacao.isEmpty()){
            clienteDAO.cadastrar(cliente);
        } else {
            System.out.println(errosCriacao);
        }
    }

    private void validarCpfCnpj(Cliente cliente){
        if (cliente.getCpfCnpj().length() != 11 && cliente.getCpfCnpj().length() != 14){
            errosCriacao.add("\nDigite um CPF/CNPJ válido!");
        }
    }

    private void validarEntradaNome(Cliente cliente) {
        if (cliente.getNome() == null || cliente.getNome().isEmpty()) {
            errosCriacao.add("\nPreencha o nome!");
        }
        if (!cliente.getNome().matches("^[a-zA-Zà-ü'\\s]{2,}$")){
            errosCriacao.add("\nCaracteres invalidos no nome!");
        }
    }
    private void validarEntradaCpfCnpj(Cliente cliente) {
        if (cliente.getCpfCnpj() == null || cliente.getCpfCnpj().isEmpty()){
            errosCriacao.add("\nPreencha o documento!");
        }
        if (!cliente.getCpfCnpj().matches("^\\d+$")) {
            errosCriacao.add("\nCaracteres invalidos no CPF/CNPJ!");
        }
    }
    private void validarEntradaRazaoSocial(Cliente cliente){
        if (!cliente.isFisico){
            if (cliente.getRazaoSocial() == null || cliente.getRazaoSocial().isEmpty()){
                errosCriacao.add("\nPreencha a razão social!");
            }
        }
    }
    private void validarEntradaEndereco(Cliente cliente){
        if (cliente.getEnderecoCliente().getId() <= 0){
            errosCriacao.add("\nPreencha com um endereço valido!");
        }
    }
}
