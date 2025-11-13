package dao;

import bd.ConnectionFactory;
import model.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClienteDAO {
    //Construtor para chamar a conexão com o banco de dados
    private ConnectionFactory connection;

    public ClienteDAO() {
        this.connection = new ConnectionFactory();
    }

    public void cadastrarCliente(Cliente cliente){
        String sql = "INSERT INTO cliente (nome, cpf_cnpj, razaoSocial, isFisico, Endereco_ID) VALUES (?, ?, ?, ?, ?)";

        try(Connection conn = connection.getConnection()){
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getCpfCnpj());
            ps.setString(3, cliente.getRazaoSocial());
            ps.setBoolean(4, cliente.isFisico());
            ps.setInt(5, cliente.getEnderecoCliente().getId());

            System.out.println("Cliente Cadastrado");

            ps.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
