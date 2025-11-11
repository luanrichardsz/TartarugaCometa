import model.*;

public class Main {
    public static void main(String[] args) {

        Endereco endereco01 = new Endereco("Petrolina", "Rua Pedra Grande", "84-B", "Jardim Maravilha", "PE");

        Endereco endereco02 = new Endereco("Jaboatão dos Guararapes", "1ª Travessa Padre Nóbrega", "201", "Cavaleiro", "PE");

        Cliente clienteR01 = new Cliente("Alícia Raquel Aline Vieira", "221.319.821-78", "",  endereco01);
        Cliente clienteD01 = new Cliente("Miguel Levi", "73.989.153/0001-87", "Miguel e Levi Transportes ME",  endereco02);

        Produto produto01 =  new Produto("Feijão", 2000.00, 2.67, 8000.00); //mudar double
        Produto produto02 =  new Produto("Arroz", 2000.00, 2.67, 8000.00); //mudar double

        Entrega entrega01 = new Entrega(1,false, produto01 , clienteD01, clienteR01);

        System.out.println(entrega01);
    }
}