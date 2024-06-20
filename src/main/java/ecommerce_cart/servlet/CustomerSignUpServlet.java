package ecommerce_cart.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet(name = "customerServlet", value = "/customer-servlet")
public class CustomerSignUpServlet extends HttpServlet {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/PersonDB";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "Trumpeter7."; // Replace with your database password

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
                String sql = "INSERT INTO customers (firstName, lastName, email, password) VALUES (?, ?, ?, ?)";
                try (PreparedStatement statement = connection.prepareStatement(sql)) {
                    statement.setString(1, firstName);
                    statement.setString(2, lastName);
                    statement.setString(3, email);
                    statement.setString(4, password);

                    int rowsInserted = statement.executeUpdate();
                    if (rowsInserted > 0) {
                        response.sendRedirect("customerSignupSuccess.jsp");
                    } else {
                        response.sendRedirect("customerSignupError.jsp");
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
                response.sendRedirect("customerSignupError.jsp");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            response.sendRedirect("customerSignupError.jsp");
        }
    }
}
