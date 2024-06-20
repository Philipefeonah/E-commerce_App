package ecommerce_cart.servlet;

import ecommerce_cart.model.ProductService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;


@WebServlet("/updateProduct")
public class UpdateProductServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve parameters from the form submission
        String productId = request.getParameter("productId");
        String productName = request.getParameter("productName");
        String price = request.getParameter("price");
        String description = request.getParameter("description");

        // Assuming you have a ProductService to handle database operations
        ProductService productService = new ProductService();

        try {
            // Update the product in the database
            productService.updateProduct(productId, productName, price, description);

            // Redirect to a success page or send a success message
            response.sendRedirect("success.jsp"); // Replace with your success page
        } catch (Exception e) {
            // Handle any errors
            request.setAttribute("error", "Error updating product: " + e.getMessage());
            request.getRequestDispatcher("updateProduct.jsp").forward(request, response);
        }
    }
}
