<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>View Products</title>
  <style>
    body {
      font-family: Arial, sans-serif;
    }
    .container {
      width: 80%;
      margin: 0 auto;
    }
    .header {
      padding: 20px;
      background-color: #f1f1f1;
      margin-bottom: 20px;
      text-align: center;
    }
    .products {
      display: flex;
      flex-wrap: wrap;
      gap: 20px;
      justify-content: center;
    }
    .updateProduct {
      border: 1px solid #ccc;
      padding: 10px;
      width: 200px;
      text-align: center;
      background-color: #fff;
    }
    .updateProduct img {
      width: 100%;
      height: auto;
    }
    .updateProduct h2 {
      font-size: 18px;
      margin: 10px 0;
    }
    .updateProduct p {
      margin: 5px 0;
    }
    .footer {
      padding: 10px;
      background-color: #f1f1f1;
      text-align: center;
      margin-top: 20px;
    }
  </style>
</head>
<body>
<div class="container">
  <div class="header">
    <h1>Products Available</h1>
  </div>
  <div class="products">
    <%
      // Sample data to simulate database products
      class Product {
        String name;
        String category;
        double price;
        String image;

        Product(String name, String category, double price, String image) {
          this.name = name;
          this.category = category;
          this.price = price;
          this.image = image;
        }
      }

      java.util.List<Product> products = new java.util.ArrayList<>();
      products.add(new Product("Laptop hP", "Electronics", 999.99, "https://example.com/laptop.jpg"));
      products.add(new Product("SmartWristwatch ABC", "Accessories", 499.99, "https://example.com/smartphone.jpg"));
      products.add(new Product("Headphones DEF", "Accessories", 199.99, "https://example.com/headphones.jpg"));
      products.add(new Product("Samsung Galaxy 10+", "Accessories", 999.99, "https://example.com/laptop.jpg"));
      products.add(new Product("iPhone ABC", "Electronics", 499.99, "https://example.com/smartphone.jpg"));
      products.add(new Product("Android DEF", "Accessories", 199.99, "https://example.com/headphones.jpg"));

      for (Product updateProduct : products) {
    %>
    <div class="updateProduct">
      <img src="images/<%= updateProduct.image %>" alt="<%= updateProduct.name %>">
      <h2><%= updateProduct.name %></h2>
      <p>Category: <%= updateProduct.category %></p>
      <p>Price: $<%= updateProduct.price %></p>
    </div>
    <%
      }
    %>
  </div>
  <div class="footer">
    <p>&copy; 2024 Your Company. All rights reserved.</p>
  </div>
</div>
</body>
</html>

<%--<%@ page language="java" contentType="text/html; charset=UTF-8"--%>
<%--         pageEncoding="UTF-8"%>--%>
<%--<!DOCTYPE html>--%>
<%--<html lang="en">--%>
<%--<head>--%>
<%--  <meta charset="UTF-8">--%>
<%--  <title>View Products</title>--%>
<%--  <style>--%>
<%--    body {--%>
<%--      font-family: Arial, sans-serif;--%>
<%--    }--%>
<%--    .container {--%>
<%--      width: 80%;--%>
<%--      margin: 0 auto;--%>
<%--      text-align: center;--%>
<%--    }--%>
<%--    .updateProduct {--%>
<%--      border: 1px solid #ccc;--%>
<%--      border-radius: 5px;--%>
<%--      padding: 10px;--%>
<%--      margin-bottom: 20px;--%>
<%--      text-align: left;--%>
<%--      background-color: #f9f9f9;--%>
<%--    }--%>
<%--    .updateProduct img {--%>
<%--      max-width: 100px;--%>
<%--      max-height: 100px;--%>
<%--      border-radius: 5px;--%>
<%--      margin-right: 10px;--%>
<%--    }--%>
<%--  </style>--%>
<%--</head>--%>
<%--<body>--%>
<%--<div class="container">--%>
<%--  <h1>View Products</h1>--%>

<%--  <div class="updateProduct">--%>
<%--    <img src="https://via.placeholder.com/150" alt="updateProduct-Images">--%>
<%--    <h3>Product Name</h3>--%>
<%--    <p>Description: Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>--%>
<%--    <p>Price: $99.99</p>--%>
<%--  </div>--%>

<%--  <!-- Repeat for other products -->--%>

<%--  <div class="updateProduct">--%>
<%--    <img src="updateProduct-images/<%=p.getImage() %>" alt="updateProduct-Image">--%>
<%--    <h3>Another Product Name</h3>--%>
<%--    <p>Description: Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>--%>
<%--    <p>Price: $79.99</p>--%>
<%--  </div>--%>

<%--  <!-- Add more products as needed -->--%>

<%--</div>--%>
<%--</body>--%>
<%--</html>--%>

