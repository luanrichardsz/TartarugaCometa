package dao;

import bd.ConnectionFactory;
import model.Produto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProdutoDAO {

    private ConnectionFactory connection;

    public ProdutoDAO() {
        this.connection = new ConnectionFactory();
    }

    public void cadastrarProduto(Produto produto){
        String sql = "INSERT INTO Produto (nome, peso, volume, valor) VALUES (?, ?, ?,?)";

        try (Connection conn = connection.getConnection()){
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, produto.getNome());
            ps.setDouble(2, produto.getPeso());
            ps.setDouble(3, produto.getVolume());
            ps.setDouble(4, produto.getValor());

            System.out.println("Produto Cadastrado");

            ps.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
