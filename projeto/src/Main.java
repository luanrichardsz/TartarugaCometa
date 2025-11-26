import model.*;
import controller.*;

public class Main {
    public static void main(String[] args) {

        EnderecoController endereco = new EnderecoController();
        ClienteController  cliente  = new ClienteController();
        EntregaController  entrega   = new EntregaController();
        ProdutoController  produto   = new ProdutoController();

//// --------------------------------------------------------------------------------------------------------------------------------

        //// Cadastrando a Primeira Entrega

        endereco.cadastrarEndereco();
        endereco.listarEnderecos();

        cliente.cadastrarCliente();
        cliente.listarClientes();
        cliente.deletarCliente();

        entrega.cadastrarEntrega();
//        entrega.listarEntregas();

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


//// --------------------------------------------------------------------------------------------------------------------------------

        //// Cadastrando a Segunda Entrega

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

//// --------------------------------------------------------------------------------------------------------------------------------
////         Cadastrando a Terceira Entrega (1 Entrega)

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
        // Funções


//        daoEndereco.listarEnderecos();
//        daoCliente.listarClientes();

//        System.out.println("========================= DEPOIS DO DELETE DO CLIENTE ==========================");
//        daoEndereco.listarEnderecos();
//        daoCliente.listarClientes();

//        daoProduto.listarProdutos();
//        daoEntrega.listarEntregas();

//        daoEntrega.alterarStatusEntrega(true, 1);
//        System.out.println("========================= DEPOIS DA MUDANÇA NO ID ENTREGA 1 ==========================");
//        daoEntrega.listarEntregas();

    }
}