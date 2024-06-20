package ecommerce_cart.dataAccessObject;

import ecommerce_cart.model.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonDao {
    private Connection connection;

    public PersonDao(Connection connection) {
        this.connection = connection;
    }

    public void addUser(Customer customer) {
        try {
            // Check if the email already exists before adding a new user
            if (emailExists(customer.getEmail())) {
                throw new IllegalArgumentException("Email already exists");
            }

            PreparedStatement preparedStatement = connection.prepareStatement(
                    "INSERT INTO customerT (firstName, lastName, email, password) VALUES (?, ?, ?, ?)");
            preparedStatement.setString(1, customer.getFirstName());
            preparedStatement.setString(2, customer.getLastName());
            preparedStatement.setString(3, customer.getEmail());
            preparedStatement.setString(4, customer.getPassword());
            preparedStatement.executeUpdate();

            // Close the PreparedStatement
            preparedStatement.close();

        } catch (SQLException e) {
            e.printStackTrace();
            // Handle SQL exception
        }
    }

    public boolean emailExists(String email) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT COUNT(*) FROM customerT WHERE email = ?");
            preparedStatement.setString(1, email);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                // Close the ResultSet and PreparedStatement
                resultSet.close();
                preparedStatement.close();
                return resultSet.getInt(1) > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle SQL exception
        }
        return false;
    }
}
