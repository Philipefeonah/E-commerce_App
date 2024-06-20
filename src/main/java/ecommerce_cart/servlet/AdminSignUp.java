//package ecommerce_cart.servlet;
//
//
//
//import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import jakarta.servlet.http.HttpSession;
//
//import java.io.IOException;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//
//@WebServlet(name = "admin-signup", value = "/admin-signup")
//public class AdminSignUp extends HttpServlet {
//
//    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/EcommerceDB";
//    private static final String JDBC_USER = "root";
//    private static final String JDBC_PASSWORD = "password";
//
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String fullName = request.getParameter("fullName");
//        String email = request.getParameter("email");
//        String password = request.getParameter("password");
//        String adminToken = request.getParameter("adminToken");
//
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//
//            try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
//                String sql = "INSERT INTO admin (fullName, email, password, adminToken) VALUES (?, ?, ?, ?)";
//                try (PreparedStatement statement = connection.prepareStatement(sql)) {
//                    statement.setString(1, fullName);
//                    statement.setString(2, email);
//                    statement.setString(3, password);
//                    statement.setString(4, adminToken);
//
//                    int rowsInserted = statement.executeUpdate();
//                    if (rowsInserted > 0) {
//                        HttpSession session = request.getSession();
//                        session.setAttribute("Email", email);
//                        response.sendRedirect("adminDashboard");
//                    } else {
//                        response.sendRedirect("signup-error.jsp");
//                    }
//                } catch (SQLException e) {
//                    throw new RuntimeException(e);
//                }
//            } catch (SQLException e) {
//                e.printStackTrace();
//                response.sendRedirect("signup-error.jsp");
//            }
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//            response.sendRedirect("signup-error.jsp");
//        }
//    }
//}
//
