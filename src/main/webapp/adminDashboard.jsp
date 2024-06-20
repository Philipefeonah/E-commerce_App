<%--&lt;%&ndash;<%@ page import="com.example.model.Product" %>&ndash;%&gt;--%>
<%--<%@ page import="java.util.List" %>&lt;%&ndash;--%>
<%--  Created by IntelliJ IDEA.--%>
<%--  User: customer--%>
<%--  Date: 3/12/24--%>
<%--  Time: 5:15 PM--%>
<%--  To change this template use File | Settings | File Templates.--%>
<%--&ndash;%&gt;--%>
<%--<%@ page contentType="text/html; charset=UTF-8" language="java" %>--%>
<%--<!DOCTYPE html>--%>
<%--<html lang="en">--%>
<%--<head>--%>
<%--  <meta charset="UTF-8">--%>
<%--  <title>Admin Dashboard - Electro</title>--%>
<%--  <!-- Reuse existing CSS links from your initial snippet -->--%>
<%--  <link href="https://fonts.googleapis.com/css?family=Montserrat:400,500,700" rel="stylesheet">--%>
<%--  <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.15.4/css/all.css">--%>
<%--  <link type="text/css" rel="stylesheet" href="css/bootstrap.min.css"/>--%>
<%--  <link type="text/css" rel="stylesheet" href="css/slick.css"/>--%>
<%--  <link type="text/css" rel="stylesheet" href="css/slick-theme.css"/>--%>
<%--  <link type="text/css" rel="stylesheet" href="css/nouislider.min.css"/>--%>
<%--  <link rel="stylesheet" href="css/font-awesome.min.css">--%>
<%--  <link type="text/css" rel="stylesheet" href="css/style.css"/>--%>
<%--</head>--%>
<%--<body>--%>
<%--<div class="container mt-5">--%>
<%--  <h2 style="padding-top: 50px">ADMIN DASHBOARD</h2>--%>

<%--  <!-- Add Product Form -->--%>
<%--  <div class="section mt-5">--%>
<%--    <h3>Add New Product(s)</h3>--%>
<%--    <form action="addProduct" method="post" class="form-horizontal">--%>
<%--      <div class="form-group">--%>
<%--        <label for="name" class="control-label col-sm-2">Name:</label>--%>
<%--        <div class="col-sm-10">--%>
<%--          <input type="text" class="form-control" id="name" name="name" placeholder="Enter updateProduct name" required>--%>
<%--        </div>--%>
<%--      </div>--%>
<%--      <div class="form-group">--%>
<%--        <label for="category" class="control-label col-sm-2">Category:</label>--%>
<%--        <div class="col-sm-10">--%>
<%--          <input type="text" class="form-control" id="category" name="category" placeholder="Enter updateProduct category" required>--%>
<%--        </div>--%>
<%--      </div>--%>
<%--      <div class="form-group">--%>
<%--        <label for="price" class="control-label col-sm-2">Price:</label>--%>
<%--        <div class="col-sm-10">--%>
<%--          <input type="number" class="form-control" id="price" name="price" placeholder="Enter updateProduct price" step="0.01" required>--%>
<%--        </div>--%>
<%--      </div>--%>
<%--      <div class="form-group">--%>
<%--        <label for="image" class="control-label col-sm-2">Image URL:</label>--%>
<%--        <div class="col-sm-10">--%>
<%--          <input type="text" class="form-control" id="image" name="image" placeholder="Enter updateProduct image URL" required>--%>
<%--        </div>--%>
<%--      </div>--%>
<%--      <div class="form-group">--%>
<%--        <div class="col-sm-offset-2 col-sm-10">--%>
<%--          <button type="submit" class="btn btn-default">Add Product</button>--%>
<%--        </div>--%>
<%--      </div>--%>
<%--    </form>--%>
<%--  </div>--%>

<%--  <!-- List Products (This section should be dynamically populated) -->--%>
<%--&lt;%&ndash;  <div class="section">&ndash;%&gt;--%>
<%--&lt;%&ndash;    <h3>Manage Products</h3>&ndash;%&gt;--%>
<%--&lt;%&ndash;    <!-- Example table structure. Populate dynamically with updateProduct data -->&ndash;%&gt;--%>
<%--&lt;%&ndash;    <table class="table">&ndash;%&gt;--%>
<%--&lt;%&ndash;      <thead>&ndash;%&gt;--%>
<%--&lt;%&ndash;      <tr>&ndash;%&gt;--%>
<%--&lt;%&ndash;        <th>ID</th>&ndash;%&gt;--%>
<%--&lt;%&ndash;        <th>Name</th>&ndash;%&gt;--%>
<%--&lt;%&ndash;        <th>Category</th>&ndash;%&gt;--%>
<%--&lt;%&ndash;        <th>Price</th>&ndash;%&gt;--%>
<%--&lt;%&ndash;        <th>Image</th>&ndash;%&gt;--%>
<%--&lt;%&ndash;        <th>Action</th>&ndash;%&gt;--%>
<%--&lt;%&ndash;      </tr>&ndash;%&gt;--%>
<%--&lt;%&ndash;      </thead>&ndash;%&gt;--%>
<%--&lt;%&ndash;      <tbody>&ndash;%&gt;--%>
<%--&lt;%&ndash;      &lt;%&ndash;%>--%>
<%--&lt;%&ndash;        List<Product> productList = (List<Product>) request.getAttribute("products");&ndash;%&gt;--%>
<%--&lt;%&ndash;        if(productList != null) {&ndash;%&gt;--%>
<%--&lt;%&ndash;          for(Product updateProduct : productList) {&ndash;%&gt;--%>
<%--&lt;%&ndash;      %>&ndash;%&gt;--%>
<%--&lt;%&ndash;      <tr>&ndash;%&gt;--%>
<%--&lt;%&ndash;        <td><%= updateProduct.getId() %></td>&ndash;%&gt;--%>
<%--&lt;%&ndash;        <td><%= updateProduct.getName() %></td>&ndash;%&gt;--%>
<%--&lt;%&ndash;        <td><%= updateProduct.getCategory() %></td>&ndash;%&gt;--%>
<%--&lt;%&ndash;        <td>$<%= updateProduct.getPrice() %></td>&ndash;%&gt;--%>
<%--&lt;%&ndash;        <td><img src="<%= request.getContextPath() %>/img/<%= updateProduct.getImage() %>" style="width: 50px; height: auto;"></td>&ndash;%&gt;--%>
<%--&lt;%&ndash;        <td>&ndash;%&gt;--%>
<%--&lt;%&ndash;          <a href="deleteProduct?id=<%= updateProduct.getId() %>" class="btn btn-danger">Delete</a>&ndash;%&gt;--%>
<%--&lt;%&ndash;        </td>&ndash;%&gt;--%>
<%--&lt;%&ndash;      </tr>&ndash;%&gt;--%>
<%--&lt;%&ndash;      &lt;%&ndash;%>--%>
<%--&lt;%&ndash;          }&ndash;%&gt;--%>
<%--&lt;%&ndash;        }&ndash;%&gt;--%>
<%--&lt;%&ndash;      %>&ndash;%&gt;--%>
<%--&lt;%&ndash;      </tbody>&ndash;%&gt;--%>

<%--&lt;%&ndash;    </table>&ndash;%&gt;--%>
<%--  </div>--%>
<%--</div>--%>
<%--<script src="js/jquery.min.js"></script>--%>
<%--<script src="js/bootstrap.min.js"></script>--%>
<%--<script src="js/slick.min.js"></script>--%>
<%--<script src="js/nouislider.min.js"></script>--%>
<%--<script src="js/jquery.zoom.min.js"></script>--%>
<%--<script src="js/main.js"></script>--%>
<%--</body>--%>
<%--</html>--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Admin Dashboard</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      background-color: #e3f2fd;
    }
    .container {
      width: 80%;
      margin: 0 auto;
      text-align: center;
      background-color: #ffffff;
      box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
      border-radius: 8px;
      padding: 20px;
    }
    .header {
      padding: 20px;
      background-color: #0d47a1;
      color: white;
      margin-bottom: 20px;
      border-radius: 8px 8px 0 0;
    }
    .content {
      margin-bottom: 20px;
    }
    .footer {
      padding: 10px;
      background-color: #0d47a1;
      color: white;
      border-radius: 0 0 8px 8px;
    }
    a {
      display: inline-block;
      margin: 10px;
      padding: 10px;
      text-decoration: none;
      background-color: #1e88e5;
      color: white;
      border-radius: 5px;
      transition: background-color 0.3s;
    }
    a:hover {
      background-color: #1565c0;
    }
    button {
      padding: 10px;
      background-color: #d32f2f;
      color: white;
      border: none;
      border-radius: 5px;
      cursor: pointer;
      transition: background-color 0.3s;
    }
    button:hover {
      background-color: #b71c1c;
    }
  </style>
</head>
<body>
<div class="container">
  <div class="header">
    <h1>Admin Dashboard</h1>
  </div>
  <div class="content">
    <h2>Hello, ${adminName}!</h2>
    <p>What would you like to do today?</p>
    <a href="viewProducts.jsp">ViewProduct</a>
    <a href="addProduct.jsp">addProduct</a>
    <a href="updateProduct.jsp">updateProduct</a>
    <a href="delete.jsp">deleteProduct</a>
    <form action="adminDashboard" method="post" style="display:inline;">
      <input type="hidden" name="action" value="logout">
      <button type="submit">Logout</button>
    </form>
  </div>
  <div class="footer">
    <p>&copy; 2024 Your Company. All rights reserved.</p>
  </div>
</div>
</body>
</html>
