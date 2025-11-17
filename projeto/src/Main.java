import model.*;
import dao.*;

public class Main {
    public static void main(String[] args) {

        EnderecoDAO daoEndereco = new EnderecoDAO();
        ClienteDAO daoCliente = new ClienteDAO();
        ProdutoDAO daoProduto = new ProdutoDAO();

        Endereco endereco01 = new Endereco("Petrolina", "Rua Pedra Grande", "84-B", "Jardim Maravilha", "PE");
        daoEndereco.cadastrarEndereco(endereco01);

        Endereco endereco02 = new Endereco("Jaboatão dos Guararapes", "1ª Travessa Padre Nóbrega", "201", "Cavaleiro", "PE");
        daoEndereco.cadastrarEndereco(endereco02);

        Cliente clienteD01 = new Cliente("Miguel Levi", "73989153000187", "Miguel e Levi Transportes ME",  endereco02);
        daoCliente.cadastrarCliente(clienteD01);

        Cliente clienteR01 = new Cliente("Alícia Raquel Aline Vieira", "22131982178", null, endereco01);
        daoCliente.cadastrarCliente(clienteR01);

        Produto produto01 = new Produto("Feijão", 2000.00, 2.67, 8000.00);
        daoProduto.cadastrarProduto(produto01);

        Produto produto02 = new Produto("Arroz", 2000.00, 2.67, 8000.00);
        daoProduto.cadastrarProduto(produto02);

        /*
        Entrega entrega01 = new Entrega(false , clienteD01, clienteR01);
        daoEntrega.cadastrarEntrega(entrega01);

        System.out.println(entrega01);
         */
    }
}