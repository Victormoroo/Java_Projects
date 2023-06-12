import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDelete {
    public static void main(String[] args) {

        String url = "jdbc:mysql://127.0.0.1:3306/employees_database";

        int rowsAffected;
        // Estabelece um objeto de conexao
        try (Connection conn = DriverManager.getConnection(url, "root", "victorsql")) {

            // Criar um objeto de instrução para enviar ao banco de dados
            Statement statement = conn.createStatement();

            // Executa o objeto de instrução
            rowsAffected = statement.executeUpdate("DELETE FROM employees_tbl");

            // Processar o resultado
            System.out.println("Executed an Delete statement - rowsAffected: " + rowsAffected);

        } catch (SQLException e) {
            System.out.println("Error while Deleting");
        }
    }
}

