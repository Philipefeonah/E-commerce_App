package ecommerce_cart.controller;

import ecommerce_cart.dataAccessObject.AdminDao;
import ecommerce_cart.model.Admin;
import ecommerce_cart.util.ConnectionUtils;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "admin", value = "/admin-signup")
public class AdminController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String fullName = req.getParameter("fullName");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String adminToken = req.getParameter("adminToken");

        AdminDao adminDao = new AdminDao(ConnectionUtils.getConnection());

        Admin newAdmin = new Admin(fullName, email, password, adminToken);
        adminDao.addAdmin(newAdmin);
        resp.sendRedirect("adminLogin.jsp");

    }
}
