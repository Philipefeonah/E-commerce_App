package ecommerce_cart.dataAccessObject;

import ecommerce_cart.model.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CustomerDao {

    private Connection connection;

    public CustomerDao(Connection connection) {
        this.connection = connection;
    }

    public void addUser(Customer customer) throws SQLException {
        // Ensure connection is not null before using it
        if (connection == null) {
            throw new IllegalStateException("Connection is not initialized");
        }
        String sql = "INSERT INTO customers (firstName, lastName, email, password) VALUES (?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, customer.getFirstName());
            statement.setString(2, customer.getLastName());
            statement.setString(3, customer.getEmail());
            statement.setString(4, customer.getPassword());
            statement.executeUpdate();
        }
    }
}

