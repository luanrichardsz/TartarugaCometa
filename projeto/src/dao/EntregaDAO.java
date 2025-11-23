package dao;

import bd.ConnectionFactory;
import model.*;

import java.sql.*;
import java.util.ArrayList;

public class EntregaDAO {

    private ConnectionFactory connection;

    public EntregaDAO() {
        this.connection = new ConnectionFactory();
    }

    public void cadastrarEntrega(Entrega entrega, ProdutoEntrega produtoEntrega) {
        String sql = "INSERT INTO Entrega (realizado, clienteRemetente_ID, clienteDestinatario_ID) VALUES (?, ?, ?)";

        try (Connection conn = connection.getConnection()){
            PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setBoolean(1, entrega.isRealizada());
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

    public ArrayList<Entrega> listarEntregas(){
        String sql = "\tSELECT \n" +
                "    e.idEntrega,\n" +
                "    e.realizado,\n" +
                "    e.clienteRemetente_ID,\n" +
                "    e.clienteDestinatario_ID,\n" +
                "\n" +
                "    p.idProduto,\n" +
                "\t  pe.quantidade\n" +
                "FROM Entrega e \n" +
                "LEFT JOIN Produto_Entrega pe ON e.idEntrega = pe.entrega_ID\n" +
                "LEFT JOIN Produto p ON pe.produto_ID = p.idProduto\n" +
                "ORDER BY e.idEntrega;";

        ArrayList<Entrega> entregas = new ArrayList<>();

        try(Connection conn = connection.getConnection()){
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            Entrega entregaAtual = null;
            int ultimoIdEntrega = 0;

            while (rs.next()){
                //Tabela Entrega
                int idEntrega = rs.getInt("identrega");
                boolean realizada = rs.getBoolean("realizado");
                int remetente_id = rs.getInt("clienteRemetente_ID");
                int destinatario_id = rs.getInt("clienteDestinatario_ID");

                //Tabela Produto_Entrega
                int idProduto = rs.getInt("idproduto");
                int quantidade = rs.getInt("quantidade");

                //Validação para os IDs
                if(idEntrega != ultimoIdEntrega){
                    Cliente remetente = new Cliente();
                    Cliente destinatario = new Cliente();

                    //Settando os IDs dos Clientes
                    remetente.setIdCliente(remetente_id);
                    destinatario.setIdCliente(destinatario_id);

                    //Adicionando a nova Entrega na lista Entrega
                    entregaAtual = new Entrega(realizada, remetente, destinatario);

                    //Settando o ID da Entrega
                    entregaAtual.setIdEntrega(idEntrega);

                    //Adicionando na lista
                    entregas.add(entregaAtual);

                    //Mudando o valor da variavel ultimoIdEntrega
                    ultimoIdEntrega = idEntrega;

                }

                //Validação para saber se existe Produto
                if (idProduto != 0){
                    ProdutoEntrega proEnt = new ProdutoEntrega();
                    Produto p = new Produto();

                    //Settando o ID Produto e os atributos da classe Produto_Entrega
                    p.setIdProduto(idProduto);
                    proEnt.setProduto(p);
                    proEnt.setQuantidade(quantidade);

                    //Adicionando Produto na Entrega
                    entregaAtual.getProdutos().add(proEnt);
                }
            }
        } catch (Exception e){
            throw new RuntimeException();
        }
        System.out.println(entregas);
        return entregas;
    }
}