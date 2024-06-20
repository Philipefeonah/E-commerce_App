package ecommerce_cart.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "CustomerDashboardServlet", urlPatterns = "/customerDashboard")
public class CustomerDashboardServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Assuming you have a way to get the customer's name
        // For example, from the session or a database
        String customerName = (String) request.getSession().getAttribute("customerName");

        if (customerName == null) {
            response.sendRedirect("login-form.jsp"); // Redirect to login if no customer name found in session
            return;
        }

        // Set the customerName attribute
        request.setAttribute("customerName", customerName);

        // Forward to the JSP
        request.getRequestDispatcher("/customerDashboard.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Handle any POST requests specific to the customer dashboard
        // For example, updating profile information or logging out
        String action = request.getParameter("action");

        if ("updateProfile".equals(action)) {
            // Code to handle profile update
            // Example: request.getRequestDispatcher("/updateProfile").forward(request, response);
        } else if ("logout".equals(action)) {
            // Code to handle logout
            request.getSession().invalidate();
            response.sendRedirect("login.jsp");
        } else {
            doGet(request, response);
        }
    }
}

