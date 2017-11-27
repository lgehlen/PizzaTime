package connectionFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Gehlen
 */
public class ConnectionFactory {

    public static final int MYSQL = 0;
    private static final String MySQLDriver = "com.mysql.jdbc.Driver";

    public static Connection getConnection(
            String url, String nome, String senha, int banco)
            throws ClassNotFoundException, SQLException {

        Class.forName(MySQLDriver);

        return DriverManager.getConnection(url, nome, senha);
    }
}
