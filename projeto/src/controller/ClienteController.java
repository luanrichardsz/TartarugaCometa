package controller;

import model.Cliente;
import dao.ClienteDAO;

import java.util.ArrayList;

public class ClienteController {
    ClienteDAO cliente = new ClienteDAO();

    public void cadastrarCliente(){

//        Cliente clienteR01 = new Cliente("Miguel Levi", "73989153000187", "Miguel e Levi Transportes ME", endereco02); //puxar o endereco
//        cliente.cadastrar(clienteR01);

//        Cliente clienteD01 = new Cliente("Alícia Raquel Aline Vieira", "22131982178", null, endereco01); //puxar o endereco
//        cliente.cadastrar(clienteD01);
    }

    public ArrayList<Cliente> listarClientes(){
        return cliente.listar();
    }

    public void deletarCliente(){
        cliente.apagar(2);
    }
}
