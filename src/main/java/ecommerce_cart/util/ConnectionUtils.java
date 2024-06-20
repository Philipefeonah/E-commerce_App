package ecommerce_cart.util;

import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtils {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/PersonDB";
    private static final String JDBC_USERNAME = "root";
    private static final String JDBC_PASSWORD = "Trumpeter7.";

    public static java.sql.Connection getConnection() {
        java.sql.Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }
    }

