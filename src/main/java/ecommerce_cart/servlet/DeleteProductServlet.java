package ecommerce_cart.servlet;

import ecommerce_cart.model.ProductService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;


@WebServlet("/deleteProduct")
public class DeleteProductServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve parameter from the form submission
        String productId = request.getParameter("productId");

        // Assuming you have a ProductService to handle database operations
        ProductService productService = new ProductService();

        try {
            // Delete the product from the database
            productService.deleteProduct(productId);

            // Redirect to a success page or send a success message
            response.sendRedirect("success.jsp"); // Replace with your success page
        } catch (Exception e) {
            // Handle any errors
            request.setAttribute("error", "Error deleting product: " + e.getMessage());
            request.getRequestDispatcher("delete.jsp").forward(request, response);
        }
    }
}
