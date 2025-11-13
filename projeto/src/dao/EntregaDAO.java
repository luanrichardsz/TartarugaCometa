package dao;

import bd.ConnectionFactory;
import model.Entrega;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class EntregaDAO {

    private ConnectionFactory connection;

    public EntregaDAO() {
        this.connection = new ConnectionFactory();
    }

    public void cadastrarEntrega(Entrega entrega) {
        String sql = "INSERT INTO Entrega (realizado, PRODUTO_id, clienteRemetente_ID, clienteDestinatario_ID) VALUES (?, ?, ?, ?)";

        try (Connection conn = connection.getConnection()){
            PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setBoolean(1, entrega.isEntregue());
            ps.setInt(2, entrega.getIdEntrega());
            ps.setInt(3, entrega.getProduto().getIdProduto());


        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}
