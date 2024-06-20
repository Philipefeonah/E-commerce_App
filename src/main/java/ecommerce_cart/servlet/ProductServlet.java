package ecommerce_cart.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ProductServlet", urlPatterns = "/viewProducts")
public class ProductServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Simulate retrieving products from a database
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop XYZ", "Electronics", 999.99, "https://example.com/laptop.jpg"));
        products.add(new Product("Smartphone ABC", "Electronics", 499.99, "https://example.com/smartphone.jpg"));
        products.add(new Product("Headphones DEF", "Accessories", 199.99, "https://example.com/headphones.jpg"));

        // Set the products attribute
        request.setAttribute("products", products);

        // Forward to the JSP
        request.getRequestDispatcher("/viewProducts.jsp").forward(request, response);
    }

    public static class Product {
        private String name;
        private String category;
        private double price;
        private String image;

        public Product(String name, String category, double price, String image) {
            this.name = name;
            this.category = category;
            this.price = price;
            this.image = image;
        }

        // Getters and setters...
        public String getName() {
            return name;
        }

        public String getCategory() {
            return category;
        }

        public double getPrice() {
            return price;
        }

        public String getImage() {
            return image;
        }
    }
}
