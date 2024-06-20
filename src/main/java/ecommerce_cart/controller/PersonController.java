package ecommerce_cart.controller;


import ecommerce_cart.dataAccessObject.PersonDao;
import ecommerce_cart.model.Customer;
import ecommerce_cart.util.ConnectionUtils;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "customer", value = "/signup")
public class PersonController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        Customer newCustomer = new Customer(firstName,lastName,email,password);
        PersonDao userDao = new PersonDao(ConnectionUtils.getConnection());
        userDao.addUser(newCustomer);

        response.sendRedirect("login-form.jsp");
    }
}
