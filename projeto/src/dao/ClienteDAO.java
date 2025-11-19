package dao;

import bd.ConnectionFactory;
import model.Cliente;
import model.Endereco;

import java.sql.*;
import java.util.HashSet;
import java.util.Set;

public class ClienteDAO {
    //Construtor para chamar a conexão com o banco de dados
    private ConnectionFactory connection;
    Endereco endereco = new Endereco();

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


    public Set<Cliente> listarClientes(){
        String sql = "SELECT nome, cpf_Cnpj, razaoSocial, endereco_id from Cliente";

        Set<Cliente> clientes = new HashSet<>();

        try(Connection cnn = connection.getConnection()){
            PreparedStatement ps = cnn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()){
                String nome = rs.getString("nome");
                String cpfCnpj = rs.getString("cpf_Cnpj");
                String razaoSocial = rs.getString("razaoSocial");

                clientes.add(new Cliente(nome, cpfCnpj, razaoSocial, endereco));
            }
        } catch (Exception e){
            throw new RuntimeException(e);
        }

        System.out.println(clientes);
        return clientes;
    }
}
