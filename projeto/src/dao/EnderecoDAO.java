package dao;

import bd.ConnectionFactory;
import jdk.nashorn.internal.runtime.regexp.joni.ast.StringNode;
import model.Endereco;

import java.sql.*;
import java.util.ArrayList;

public class EnderecoDAO {

    private ConnectionFactory connection;

    public EnderecoDAO() {
        this.connection = new ConnectionFactory();
    }

    public void cadastrar(Endereco endereco){
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

    public ArrayList<Endereco> listar(){
        String sql = "SELECT rua, numero, bairro, cidade, estado FROM endereco";

        ArrayList<Endereco> enderecos = new ArrayList<>();

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

    public void atualizar(String rua, String numero, String bairro, String cidade, String estado, int idEndereco){
        String sql = "UPDATE Endereco SET rua = ?, numero = ?, bairro = ?, cidade = ?, estado = ? WHERE idEndereco = ?";

        try (Connection cnn = connection.getConnection()){
            PreparedStatement ps = cnn.prepareStatement(sql);

            ps.setString(1, rua);
            ps.setString(2, numero);
            ps.setString(3, bairro);
            ps.setString(4, cidade);
            ps.setString(5, estado);

            ps.setInt(6, idEndereco);

            ps.execute();

            System.out.println("Endereco com o ID: " + idEndereco + " atualizado");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void apagar(int idEndereco){
        String sqlDeleteEndereco = "DELETE FROM Endereco WHERE idEndereco = ?";

        //Deletando Endereço
        try (Connection cnn = connection.getConnection()){
            PreparedStatement ps = cnn.prepareStatement(sqlDeleteEndereco);

            ps.setInt(1, idEndereco);
            ps.execute();

            System.out.println("Endereco apagado");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public int buscarPorId(int idEndereco){
        String sql = "SELECT idendereco FROM Endereco WHERE idendereco = ?";

        try (Connection conn = connection.getConnection()) {
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setInt(1, idEndereco);

            ResultSet rs = ps.executeQuery();

            idEndereco = 0;

            while (rs.next()){
                idEndereco = rs.getInt("idendereco");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return idEndereco;
    }
}
