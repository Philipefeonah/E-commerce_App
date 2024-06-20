package ecommerce_cart.servlet;//package ecommerce_cart.servlet;
//
//import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import jakarta.servlet.http.HttpSession;
//import java.io.IOException;
//
//@WebServlet(name = "LoginServlet", urlPatterns = "/login")
//public class LoginServlet extends HttpServlet {
//
//    // Dummy user credentials (replace with your actual authentication logic)
//    private static final String VALID_EMAIL = "admin@example.com";
//    private static final String VALID_PASSWORD = "password";
//
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String email = request.getParameter("email");
//        String password = request.getParameter("password");
//
//        if (VALID_EMAIL.equals(email) && VALID_PASSWORD.equals(password)) {
//            HttpSession session = request.getSession();
//            session.setAttribute("email", email);
//            response.sendRedirect("customerDashboard.jsp"); // Redirect to customerDashboard.jsp
//        } else {
//            response.sendRedirect("login-error.jsp"); // Redirect to login-error.jsp on authentication failure
//        }
//    }
//}

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {

    private static final String VALID_EMAIL = "admin@example.com";
    private static final String VALID_PASSWORD = "password";

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        if (VALID_EMAIL.equals(email) && VALID_PASSWORD.equals(password)) {
            HttpSession session = request.getSession();
            session.setAttribute("email", email);
            response.sendRedirect("customerDashboard.jsp");
        } else {
            response.sendRedirect("login-error.jsp");
        }
    }
}

