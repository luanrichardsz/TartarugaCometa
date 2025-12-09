package controller;

import bo.ClienteBO;
import model.Cliente;
import dao.ClienteDAO;

import java.util.ArrayList;

public class ClienteController {
    ClienteDAO daoCliente = new ClienteDAO();
    ClienteBO boCliente = new ClienteBO();

    public Cliente cadastrarCliente(Cliente cliente){
        boCliente.validarCriacao(cliente);

        return cliente;
    }

    public ArrayList<Cliente> listarClientes(){
        return daoCliente.listar();
    }

    public void deletarCliente(int idCliente){
        daoCliente.apagar(idCliente);
    }
}
