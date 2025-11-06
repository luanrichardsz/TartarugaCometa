import model.*;

public class Main {
    public static void main(String[] args) {

        Endereco endereco01 = new Endereco(
                "Petrolina", "Rua Pedra Grande", 84, "Jardim Maravilha", "PE"
        );

        Cliente clienteF01 = new Cliente("Alícia Raquel Aline Vieira", "221.319.821-78", "", "", endereco01);


        Produto produto01 =  new Produto(
                "Feijão", 2000.00, 2.67, 8.000 //mudar double
        );

        Entrega entrega01 = new Entrega(
                8,false, clienteF01, produto01
        );

        System.out.println(produto01);

    }
}