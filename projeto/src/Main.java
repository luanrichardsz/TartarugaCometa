import model.ClienteFisico;
import model.ClienteJudiciario;
import model.Endereco;

public class Main {
    public static void main(String[] args) {
        ClienteFisico clienteF01 = new ClienteFisico("Alícia Raquel Aline Vieira", "Rua Doutor José Lino, Mucuripe, Fortaleza, CE", "(85) 99714-4682", "221.319.821-78");

        ClienteJudiciario clienteJ01 = new ClienteJudiciario("Hugo Sebastião Anthony Ribeiro", "Rua Natal, Parque Bela Vista, Salvador, BA", "(11) 98239-7139", "01.525.629/0001-18", "Antonella e Milena Informática ME");

        System.out.println(clienteF01);
        System.out.println(clienteJ01);

        Endereco endereco = new Endereco(
                "Petrolina", "Rua Pedra Grande", 84, "Jardim Maravilha", "PE",
                "Recife", "Rua Urubá", 71, "Torrões", "PE"
        );

        System.out.println(endereco);

    }
}