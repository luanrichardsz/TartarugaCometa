package dao;

import bd.ConnectionFactory;
import model.Endereco;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class EnderecoDAO {

    private ConnectionFactory connection;

    public EnderecoDAO() {
        this.connection = new ConnectionFactory();
    }

    public void cadastrarEndereco(Endereco endereco){
        String sql = "INSERT INTO endereco (cidade, rua, numero, bairro, estado) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = connection.getConnection()) {
            PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, endereco.getCidade());
            ps.setString(2, endereco.getRua());
            ps.setString(3, endereco.getNumero());
            ps.setString(4, endereco.getBairro());
            ps.setString(5, endereco.getEstado());

            System.out.println("Endereco Cadastrado");

            ps.executeUpdate(); //retorna um INTEIRO com as linhas modificadas

            //Buscar o ID gerado
            try(ResultSet rs = ps.getGeneratedKeys()){
                if(rs.next()){ //tentando mover o cursos para a proxima linha
                    int idGerado  = rs.getInt(1); // pegando a primeira coluna (ID)
                    endereco.setId(idGerado); //salvando o id no objeto
                }
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Set<Endereco> listarEnderecos(){
        String sql = "SELECT rua, numero, bairro, cidade, estado FROM endereco";

        Set<Endereco> enderecos = new HashSet<>();

        try(Connection conn = connection.getConnection()){
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()){
                String rua = rs.getString("rua");
                String numero = rs.getString("numero");
                String bairro = rs.getString("bairro");
                String cidade = rs.getString("cidade");
                String estado = rs.getString("estado");

                enderecos.add(new Endereco(rua ,numero, bairro, cidade, estado));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println(enderecos);
        return enderecos;
    }
}
