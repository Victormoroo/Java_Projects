import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {
    public static void main(String[] args) {

        String url = "jdbc:mysql://127.0.0.1:3306/employees_database";

        // Estabelece um objeto de conexao
        try (Connection conn = DriverManager.getConnection(url, "root", "victorsql")) {

            // Criar um objeto de instrução para enviar ao banco de dados
            Statement statement = conn.createStatement();

            // Executa o objeto de instrução
            ResultSet resultSet = statement.executeQuery("SELECT * FROM employees_tbl");

            // Processar o resultado
            int salaryTotal = 0;
            while(resultSet.next()) {
                // System.out.println(resultSet.getString("name"));
                salaryTotal = salaryTotal + resultSet.getInt("salary");
            }
            System.out.println(salaryTotal);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
