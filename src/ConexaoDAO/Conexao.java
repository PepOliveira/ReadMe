package ConexaoDAO;

/**
 *
 * @author João Pedro Timo Angelotti Pinto
 */
import java.sql.*;

public class Conexao {

    public Connection conector() {
        Connection conexaoDAO = null;

        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/Recreio_Da_Esperanca?serverTimezone=UTC";
        String user = "root";
        String password = "joao2005";

        try {
            Class.forName(driver);
            conexaoDAO = DriverManager.getConnection(url, user, password);
            return conexaoDAO;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}
