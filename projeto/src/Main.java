import model.*;
import dao.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        EnderecoDAO daoEndereco = new EnderecoDAO();
        ClienteDAO daoCliente = new ClienteDAO();
        ProdutoDAO daoProduto = new ProdutoDAO();
        EntregaDAO daoEntrega = new EntregaDAO();

// --------------------------------------------------------------------------------------------------------------------------------

        // Cadastrando a Primeira Entrega

//        Endereco endereco01 = new Endereco("Pedra Grande", "84-B", "Jardim Maravilha", "Petrolina", "PE");
//        daoEndereco.cadastrarEndereco(endereco01);
//
//        Endereco endereco02 = new Endereco("1ª Travessa Padre Nóbrega", "201-A", "Cavaleiro", "Jaboatão dos Guararapes", "PE");
//        daoEndereco.cadastrarEndereco(endereco02);
//
//        Cliente clienteR01 = new Cliente("Miguel Levi", "73989153000187", "Miguel e Levi Transportes ME", endereco02);
//        daoCliente.cadastrarCliente(clienteR01);
//
//        Cliente clienteD01 = new Cliente("Alícia Raquel Aline Vieira", "22131982178", null, endereco01);
//        daoCliente.cadastrarCliente(clienteD01);
//
//        Produto produto01 = new Produto("Feijão", 2000.00, 2.67, 8000.00);
//        daoProduto.cadastrarProduto(produto01);
//
//        Produto produto02 = new Produto("Arroz", 2000.00, 2.10, 6800.00);
//        daoProduto.cadastrarProduto(produto02);
//
//        ProdutoEntrega produtoFeijao = new ProdutoEntrega(produto01, 4);
//        ProdutoEntrega produtoArroz = new ProdutoEntrega(produto02, 2);
//
//        ArrayList<ProdutoEntrega> mercadoriaEntrega01 = new ArrayList<>();
//
//        mercadoriaEntrega01.add(produtoFeijao);
//        mercadoriaEntrega01.add(produtoArroz);
//
//        Entrega entrega01 = new Entrega(false, clienteD01, clienteR01);
//
//        daoEntrega.cadastrarEntrega(entrega01, mercadoriaEntrega01);

// --------------------------------------------------------------------------------------------------------------------------------

        // Cadastrando a Segunda Entrega

//        Endereco endereco03 = new Endereco("Av. Paulista", "1578", "Bela Vista", "São Paulo", "SP");
//        daoEndereco.cadastrarEndereco(endereco03);
//
//        Endereco endereco04 = new Endereco("Rua Harmonia", "350", "Vila Madalena", "São Paulo", "SP");
//        daoEndereco.cadastrarEndereco(endereco04);
//
//        Cliente clienteR02 = new Cliente("Tech Solutions Ltda", "12345678000199", "TechPoint", endereco03);
//        daoCliente.cadastrarCliente(clienteR02);
//
//        Cliente clienteD02 = new Cliente("Souza Advogados Associados", "98765432000188", "Souza Adv", endereco04);
//        daoCliente.cadastrarCliente(clienteD02);
//
//        Produto produto03 = new Produto("Notebook Dell Inspiron", 3500.00, 1.42, 5000.00);
//        daoProduto.cadastrarProduto(produto03);
//
//        Produto produto04 = new Produto("Mouse Logitec Sem Fio", 80.00, 1.87, 150.00);
//        daoProduto.cadastrarProduto(produto04);
//
//        ProdutoEntrega itemNotebook = new ProdutoEntrega(produto03, 2);
//        ProdutoEntrega itemMouse = new ProdutoEntrega(produto04, 5);
//
//        ArrayList<ProdutoEntrega> mercadoriasEntrega02 = new ArrayList<>();
//        mercadoriasEntrega02.add(itemNotebook);
//        mercadoriasEntrega02.add(itemMouse);
//
//        Entrega entrega02 = new Entrega(true, clienteR02, clienteD02);
//        daoEntrega.cadastrarEntrega(entrega02, mercadoriasEntrega02);

// --------------------------------------------------------------------------------------------------------------------------------
        // Cadastrando a Terceira Entrega (1 Entrega)

//        Endereco endereco05 = new Endereco("Rua Plantão", "87-C", "Deputado José Antônio Liberato", "Caruaru", "PE");
//        daoEndereco.cadastrarEndereco(endereco05);
//
//        Endereco endereco06 = new Endereco("Rua João Ivo da Silva", "841", "Madalena", "Recife", "PE");
//        daoEndereco.cadastrarEndereco(endereco06);
//
//        Cliente clienteR03 = new Cliente("Pietra e Maitê Doces & Salgados Ltda", "90192059000111", "Maipie Doces e Salgados", endereco05);
//        daoCliente.cadastrarCliente(clienteR03);
//
//        Cliente clienteD03 = new Cliente("Rebeca Laura Souza", "30007624425", null, endereco06);
//        daoCliente.cadastrarCliente(clienteD03);
//
//        Produto produto05 = new Produto("Pão Doce de Coco", 3.50 , 1.00, 10.00);
//        daoProduto.cadastrarProduto(produto05);
//
//        ProdutoEntrega itemPaoDoce = new ProdutoEntrega(produto05, 5);
//
//        ArrayList<ProdutoEntrega> mercadoriasEntrega03 = new ArrayList<>();
//        mercadoriasEntrega03.add(itemPaoDoce);
//
//        Entrega entrega03 = new Entrega(true, clienteR03, clienteD03);
//        daoEntrega.cadastrarEntrega(entrega03, mercadoriasEntrega03);

// --------------------------------------------------------------------------------------------------------------------------------
//        Endereco enderecoTeste = new Endereco("La na rua", "84", "Varzea", "Recife", "PE");
//        daoEndereco.cadastrarEndereco(enderecoTeste);
//
//        Cliente clienteTeste = new Cliente("Luan Richard", "84574154151", null, enderecoTeste);
//        daoCliente.cadastrarCliente(clienteTeste);

        // Funções

//        daoEndereco.listarEnderecos();
//        daoCliente.listarClientes();
//        daoCliente.apagarCliente(7);
//
//        System.out.println("========================= DEPOIS DO DELETE DO CLIENTE TESTE ==========================");
//        daoCliente.listarClientes();

//        daoProduto.listarProdutos();
        daoEntrega.listarEntregas();
        daoEntrega.alterarStatusEntrega(true, 1);

        System.out.println("========================= DEPOIS DA MUDANÇA NO ID ENTREGA 1 ==========================");
        daoEntrega.listarEntregas();

    }
}