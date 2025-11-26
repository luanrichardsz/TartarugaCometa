package controller;

import dao.EnderecoDAO;
import model.Endereco;

import java.util.ArrayList;

public class EnderecoController {
    EnderecoDAO daoEndereco = new EnderecoDAO();

    public void cadastrarEndereco(){
        Endereco endereco01 = new Endereco("Pedra Grande", "84-B", "Jardim Maravilha", "Petrolina", "PE");
        daoEndereco.cadastrar(endereco01);

        Endereco endereco02 = new Endereco("1ª Travessa Padre Nóbrega", "201-A", "Cavaleiro", "Jaboatão dos Guararapes", "PE");
        daoEndereco.cadastrar(endereco02);
    }

    public ArrayList<Endereco> listarEnderecos(){
        return daoEndereco.listarEnderecos();
    }
}
