package controller;

import model.Cliente;
import dao.ClienteDAO;

import java.util.ArrayList;

public class ClienteController {
    ClienteDAO daoCliente = new ClienteDAO();

    public Cliente cadastrarCliente(Cliente cliente){

        daoCliente.cadastrar(cliente);

        return  cliente;
    }

    public ArrayList<Cliente> listarClientes(){
        return daoCliente.listar();
    }

    public void deletarCliente(int idCliente){
        daoCliente.apagar(idCliente);
    }
}
