import model.*;
import controller.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        EnderecoController endereco = new EnderecoController();
        ClienteController  cliente  = new ClienteController();
        EntregaController  entrega   = new EntregaController();
        ProdutoController  produto   = new ProdutoController();

//// --------------------------------------------------------------------------------------------------------------------------------

        //// Cadastrando a Primeira Entrega

//        Endereco endereco01 = endereco.cadastrarEndereco(new Endereco("1ª Travessa Padre Nóbrega", "201-A", "Cavaleiro", "Jaboatão dos Guararapes", "PE"));
//        Endereco endereco02 = endereco.cadastrarEndereco(new Endereco("Pedra Grande", "84-B", "Jardim Maravilha", "Petrolina", "PE"));
//
//        Cliente clienteR01 = cliente.cadastrarCliente(new Cliente("Miguel Levi", "73989153000187", "Miguel e Levi Transportes ME", endereco02));
//        Cliente clienteD01 = cliente.cadastrarCliente(new Cliente("Alícia Raquel Aline Vieira", "22131982178", null, endereco01));
//
//        Produto produto01 = produto.cadastrarProduto(new Produto("Feijão", 2000.00, 2.67, 8000.00));
//        Produto produto02 = produto.cadastrarProduto(new Produto("Arroz", 2000.00, 2.10, 6800.00));
//
//        ArrayList<ProdutoEntrega> mercadoriasEntrega01 = new ArrayList<>();
//
//        ProdutoEntrega produtoFeijao = new ProdutoEntrega(produto01, 4);
//        ProdutoEntrega produtoArroz = new ProdutoEntrega(produto02, 2);
//
//        mercadoriasEntrega01.add(produtoFeijao);
//        mercadoriasEntrega01.add(produtoArroz);
//
//        Entrega entrega01 = entrega.cadastrarEntrega(new Entrega(false, clienteD01, clienteR01), mercadoriasEntrega01);

//// --------------------------------------------------------------------------------------------------------------------------------

        //// Cadastrando a Segunda Entrega

//        Endereco endereco03 =  endereco.cadastrarEndereco(new Endereco("Av. Paulista", "1578", "Bela Vista", "São Paulo", "SP"));
//        Endereco endereco04 =  endereco.cadastrarEndereco(new Endereco("Rua Harmonia", "350", "Vila Madalena", "São Paulo", "SP"));
//
//        Cliente clienteR02 = cliente.cadastrarCliente(new Cliente("Tech Solutions Ltda", "12345678000199", "TechPoint", endereco03));
//        Cliente clienteD02 = cliente.cadastrarCliente(new Cliente("Souza Advogados Associados", "98765432000188", "Souza Adv", endereco04));
//
//        Produto produto03 = produto.cadastrarProduto(new Produto("Notebook Dell Inspiron", 3500.00, 1.42, 5000.00));
//        Produto produto04 =  produto.cadastrarProduto(new Produto("Mouse Logitec Sem Fio", 80.00, 1.87, 150.00));
//
//        ProdutoEntrega itemNotebook = new ProdutoEntrega(produto03, 2);
//        ProdutoEntrega itemMouse = new ProdutoEntrega(produto04, 5);
//
//        ArrayList<ProdutoEntrega> mercadoriasEntrega02 = new ArrayList<>();
//        mercadoriasEntrega02.add(itemNotebook);
//        mercadoriasEntrega02.add(itemMouse);
//
//        Entrega entrega02 = entrega.cadastrarEntrega(new Entrega(true, clienteR02, clienteD02), mercadoriasEntrega02);

//// --------------------------------------------------------------------------------------------------------------------------------
////         Cadastrando a Terceira Entrega (1 Produto)
//
//        Endereco endereco05 = endereco.cadastrarEndereco(new Endereco("Rua Plantão", "87-C", "Deputado José Antônio Liberato", "Caruaru", "PE"));
//        Endereco endereco06 = endereco.cadastrarEndereco(new Endereco("Rua João Ivo da Silva", "841", "Madalena", "Recife", "PE"));
//
//        Cliente clienteR03 = cliente.cadastrarCliente(new Cliente("Pietra e Maitê Doces & Salgados Ltda", "90192059000111", "Maipie Doces e Salgados", endereco05));
//        Cliente clienteD03 = cliente.cadastrarCliente(new Cliente("Rebeca Laura Souza", "30007624425", null, endereco06));
//
//        Produto produto05 = produto.cadastrarProduto(new Produto("Pão Doce de Coco", 3.50 , 1.00, 10.00));
//
//        ProdutoEntrega itemPaoDoce = new ProdutoEntrega(produto05, 5);
//
//        ArrayList<ProdutoEntrega> mercadoriasEntrega03 = new ArrayList<>();
//        mercadoriasEntrega03.add(itemPaoDoce);
//
//        Entrega entrega03 = entrega.cadastrarEntrega(new Entrega(true, clienteR03, clienteD03), mercadoriasEntrega03);

// --------------------------------------------------------------------------------------------------------------------------------
        // Funções

        endereco.listarEnderecos();
        cliente.listarClientes();
//        cliente.deletarCliente(2);
        produto.listarProdutos();
        entrega.listarEntregas();
//        entrega.atualizarStatusEntrega(false, 1);

    }
}