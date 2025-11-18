package dao;

import bd.ConnectionFactory;
import model.Cliente;

import java.sql.*;

public class ClienteDAO {
    //Construtor para chamar a conexão com o banco de dados
    private ConnectionFactory connection;

    public ClienteDAO() {
        this.connection = new ConnectionFactory();
    }

    public void cadastrarCliente(Cliente cliente){
        String sql = "INSERT INTO cliente (nome, cpf_cnpj, razaoSocial, isFisico, Endereco_ID) VALUES (?, ?, ?, ?, ?)";

        try(Connection conn = connection.getConnection()){
            PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getCpfCnpj());
            ps.setString(3, cliente.getRazaoSocial());
            ps.setBoolean(4, cliente.isFisico());
            ps.setInt(5, cliente.getEnderecoCliente().getId());

            System.out.println("Cliente Cadastrado");

            ps.execute();

            //Pegar o ID da Entrega que foi criada
            int idCliente = -1;
            try (java.sql.ResultSet rs = ps.getGeneratedKeys()){
                if (rs.next()){
                    idCliente = rs.getInt(1);
                    cliente.setIdCliente(idCliente);
                } else {
                    throw new SQLException("Falha ao criar ID do cliente, nenhum retornado");
                }
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void listarClientes(){
        String sqlListarTodos = "SELECT * FROM cliente";

        try(Connection conn = connection.getConnection()){
            PreparedStatement ps = conn.prepareStatement(sqlListarTodos);

            ps.executeUpdate();
    } catch (SQLException e) {
        throw new RuntimeException(e);
        }
    }
}
