package ecommerce_cart.controller;

import ecommerce_cart.dataAccessObject.CustomerDao;
import ecommerce_cart.model.Customer;
import ecommerce_cart.util.ConnectionUtils;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "customer", value = "/signup")
public class CustomerController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email  = request.getParameter("email");
        String password= request.getParameter("password");

        //Instantiate Customer and CustomerDao class
        Customer customer = new Customer(firstName,lastName,email,password);
        CustomerDao customerDAO = new CustomerDao(ConnectionUtils.getConnection());

        try {
            customerDAO.addUser(customer);
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }

        response.sendRedirect("signup-success.jsp");

    }

}

