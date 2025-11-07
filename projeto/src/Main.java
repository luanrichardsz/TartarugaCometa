import model.*;

public class Main {
    public static void main(String[] args) {

        Endereco endereco01 = new Endereco("Petrolina", "Rua Pedra Grande", 84, "Jardim Maravilha", "PE");

        Endereco endereco02 = new Endereco("Jaboatão dos Guararapes", "1ª Travessa Padre Nóbrega", 201, "Cavaleiro", "PE");

        Cliente clienteF01 = new Cliente("Alícia Raquel Aline Vieira", "221.319.821-78", "", "", endereco01);
        Cliente clienteJ01 = new Cliente("", "", "73.989.153/0001-87", "Miguel e Levi Transportes ME", endereco02);


        Produto produto01 =  new Produto("Feijão", 2000.00, 2.67, 8000.00); //mudar double
        Produto produto02 =  new Produto("Arroz", 2000.00, 2.67, 8000.00); //mudar double

        Entrega entrega01 = new Entrega(1,false, produto01 , clienteF01, clienteJ01);

        System.out.println(entrega01);

    }
}