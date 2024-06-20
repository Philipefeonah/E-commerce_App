package ecommerce_cart.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet("/addProduct")
@MultipartConfig
public class AddProductServlet extends HttpServlet {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/persondb";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "Trumpeter7.";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve form fields
        String name = request.getParameter("name");
        String category = request.getParameter("category");
        String priceStr = request.getParameter("price");
        Part filePart = request.getPart("file");

        // Validate parameters
        if (name == null || name.isEmpty()) {
            response.sendRedirect("addProduct.jsp?error=nameNull");
            return;
        }
        if (category == null || category.isEmpty()) {
            response.sendRedirect("addProduct.jsp?error=categoryNull");
            return;
        }
        if (priceStr == null || priceStr.isEmpty()) {
            response.sendRedirect("addProduct.jsp?error=priceNull");
            return;
        }

        double price = 0;
        try {
            price = Double.parseDouble(priceStr);
        } catch (NumberFormatException e) {
            response.sendRedirect("addProduct.jsp?error=invalidPrice");
            return;
        }

        String fileName = getFileName(filePart);

        // Debugging: Print parameters to console
        System.out.println("Name: " + name);
        System.out.println("Category: " + category);
        System.out.println("Price: " + price);
        System.out.println("File: " + fileName);

        // Insert into database
        String sql = "INSERT INTO product (name, category, price, image_url) VALUES (?, ?, ?, ?)";
        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, name);
            statement.setString(2, category);
            statement.setDouble(3, price);
            statement.setString(4, fileName);

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                response.sendRedirect("viewProducts.jsp");
            } else {
                response.sendRedirect("addProduct.jsp?error=dbError");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            response.sendRedirect("addProduct.jsp?error=dbError");
        }
    }

    private String getFileName(Part part) {
        for (String content : part.getHeader("content-disposition").split(";")) {
            if (content.trim().startsWith("filename")) {
                return content.substring(content.indexOf('=') + 1).trim().replace("\"", "");
            }
        }
        return null;
    }
}
