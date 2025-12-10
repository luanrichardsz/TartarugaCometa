package controller;

import bo.EnderecoBO;
import dao.EnderecoDAO;
import model.Endereco;

import java.util.ArrayList;

public class EnderecoController {
    EnderecoDAO daoEndereco = new EnderecoDAO();
    EnderecoBO boEndereco = new EnderecoBO();

    public Endereco cadastrarEndereco(Endereco endereco){
        boEndereco.validarCriacao(endereco);
        return endereco;
    }

    public ArrayList<Endereco> listarEnderecos(){
        return daoEndereco.listar();
    }

    public void atualizarEndereco(String rua, String numero, String bairro, String cidade, String estado, int idEndereco){
        boEndereco.validarAtualizar(rua, numero, bairro, cidade, estado, idEndereco);
    }

    public void apagarEndereco(int idEndereco){
        boEndereco.validarDelete(idEndereco);
    }
}
