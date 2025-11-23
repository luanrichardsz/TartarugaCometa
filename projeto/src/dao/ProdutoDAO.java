package dao;

import bd.ConnectionFactory;
import model.Produto;

import java.sql.*;
import java.util.ArrayList;

public class ProdutoDAO {

    private ConnectionFactory connection;

    public ProdutoDAO() {
        this.connection = new ConnectionFactory();
    }

    public void cadastrarProduto(Produto produto){
        String sql = "INSERT INTO Produto (nome, peso, volume, valor) VALUES (?, ?, ?,?)";

        try (Connection conn = connection.getConnection()){
            PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, produto.getNome());
            ps.setDouble(2, produto.getPeso());
            ps.setDouble(3, produto.getVolume());
            ps.setDouble(4, produto.getValor());

            System.out.println("Produto Cadastrado");

            ps.execute();

            //Pegar o ID da Entrega que foi criada
            int idProduto = -1;
            try (java.sql.ResultSet rs = ps.getGeneratedKeys()){
                if (rs.next()){
                    idProduto = rs.getInt(1);
                    produto.setIdProduto(idProduto);
                } else {
                    throw new SQLException("Falha ao criar ID do Produto, nenhum retornado");
                }
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<Produto> listarProdutos(){
        String sql = "SELECT * FROM Produto";

        ArrayList<Produto> produtos = new ArrayList<>();

        try(Connection conn = connection.getConnection()){
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()){
                String nome = rs.getString("nome");
                double peso = rs.getDouble("peso");
                double volume = rs.getDouble("volume");
                double valor = rs.getDouble("valor");

                produtos.add(new Produto(nome, peso, volume, valor));
            }
        } catch (Exception e){
            throw new RuntimeException(e);
        }

        System.out.println(produtos);
        return produtos;
    }
}
