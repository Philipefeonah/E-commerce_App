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

@WebServlet(name = "adminServlet", value = "/admin-servlet")
public class AdminSignupServlet extends HttpServlet {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/PersonDB";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "Trumpeter7.";

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String fullName = request.getParameter("fullName");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String adminToken = request.getParameter("adminToken");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            try (Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
                String sql = "INSERT INTO newAdmin (fullName, email, password, adminToken) VALUES (?, ?, ?, ?)";
                try (PreparedStatement statement = conn.prepareStatement(sql)) {
                    statement.setString(1, fullName);
                    statement.setString(2, email);
                    statement.setString(3, password);
                    statement.setString(4, adminToken);

                    int rowsInserted = statement.executeUpdate();
                    if (rowsInserted > 0) {
                        response.sendRedirect("adminSignupSuccess.jsp");
                    } else {
                        response.sendRedirect("adminSignupError.jsp");
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
                response.sendRedirect("adminSignupError.jsp");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            response.sendRedirect("adminSignupError.jsp");
        }
    }
}

