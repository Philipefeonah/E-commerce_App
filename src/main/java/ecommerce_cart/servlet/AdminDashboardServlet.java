package ecommerce_cart.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import ecommerce_cart.model.Product;
import ecommerce_cart.util.ConnectionUtils;

@WebServlet(name = "AdminDashboardServlet", urlPatterns = "/adminDashboard")
public class AdminDashboardServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        if (session.getAttribute("admin") == null) {
            response.sendRedirect(request.getContextPath() + "/adminLogin.jsp");
            return;
        }

        List<Product> productList = new ArrayList<>();

        try (Connection conn = ConnectionUtils.getConnection()) {
            String sql = "SELECT * FROM product";
            PreparedStatement statement = conn.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String category = rs.getString("category");
                double price = rs.getDouble("price");
                String image = rs.getString("image");
                // You can retrieve other columns if needed

                Product product = new Product(id, name, category, price,image);
                productList.add(product);
            }

            request.setAttribute("productList", productList);
            request.getRequestDispatcher("/adminDashboard.jsp").forward(request, response);
        } catch (SQLException e) {
            throw new ServletException(e);
        }
    }
}

