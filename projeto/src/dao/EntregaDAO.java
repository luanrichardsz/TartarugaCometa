package dao;

import bd.ConnectionFactory;
import model.Entrega;
import model.ProdutoEntrega;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class EntregaDAO {

    private ConnectionFactory connection;

    public EntregaDAO() {
        this.connection = new ConnectionFactory();
    }

    public void cadastrarEntrega(Entrega entrega, ProdutoEntrega produtoEntrega) {
        String sql = "INSERT INTO Entrega (realizado, clienteRemetente_ID, clienteDestinatario_ID) VALUES (?, ?, ?)";

        try (Connection conn = connection.getConnection()){
            PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setBoolean(1, entrega.isEntregue());
            ps.setInt(2, entrega.getClienteDestinatario().getIdCliente());
            ps.setInt(3, entrega.getClienteRemetente().getIdCliente());

            System.out.println("Dados dos Clientes e Dados da Entrega Cadastrado");

            ps.executeUpdate();

            //Pegar o ID da Entrega que foi criada
            int idEntrega = -1;
            try (java.sql.ResultSet rs = ps.getGeneratedKeys()){
                if (rs.next()){
                    idEntrega = rs.getInt(1);
                } else {
                    throw new SQLException("Falha ao criar ID da Entrega, nenhum retornado");
                }
            }

            //Preparar o insert da table produto_entrega
            String sqlProdutoEntrega = "INSERT INTO Produto_Entrega (entrega_ID, produto_ID, quantidade) VALUES (?, ?, ?)";
            PreparedStatement psProdutoEntrega = conn.prepareStatement(sqlProdutoEntrega);

            psProdutoEntrega.setInt(1, idEntrega);
            psProdutoEntrega.setInt(2, produtoEntrega.getProduto().getIdProduto());
            psProdutoEntrega.setInt(3, produtoEntrega.getQuantidade());

            psProdutoEntrega.executeUpdate();

            System.out.println("Produto cadastrado em Entrega!");

        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}