package controller;

import dao.EnderecoDAO;
import model.Endereco;

import java.util.ArrayList;

public class EnderecoController {
    EnderecoDAO daoEndereco = new EnderecoDAO();

    public Endereco cadastrarEndereco(Endereco endereco){
        daoEndereco.cadastrar(endereco);

        return endereco;
    }

    public ArrayList<Endereco> listarEnderecos(){
        return daoEndereco.listarEnderecos();
    }
}
