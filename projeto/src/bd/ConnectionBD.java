package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionBD {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/tartaruga_cometa", "postgres", "1234");

            System.out.println("Conexão com BD com sucesso!");

            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
