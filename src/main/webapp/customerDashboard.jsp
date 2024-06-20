<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Customer Dashboard</title>
    <style>
        body {
            font-family: Arial, sans-serif;
        }
        .container {
            width: 80%;
            margin: 0 auto;
            text-align: center;
        }
        .header {
            padding: 20px;
            background-color: #f1f1f1;
            margin-bottom: 20px;
        }
        .content {
            margin-bottom: 20px;
        }
        .footer {
            padding: 10px;
            background-color: #f1f1f1;
        }
        a {
            display: inline-block;
            margin: 10px;
            padding: 10px;
            text-decoration: none;
            background-color: #007bff;
            color: white;
            border-radius: 5px;
        }
        a:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
<div class="container">
    <div class="header">
        <h1>Welcome to Your Dashboard</h1>
    </div>
    <div class="content">
        <h2>Hello, ${customerName}!</h2>
        <p>What would you like to do today?</p>
        <a href="viewProducts.jsp">View Products</a>
        <a href="updateProduct.jsp">Update Product</a>
        <a href="addProduct.jsp">AddProductToCart</a>
        <a href="cart.jsp">Cart</a>
        <a href="orders.jsp">Orders</a>
        <form action="customerDashboard" method="post" style="display:inline;">
            <input type="hidden" name="action" value="logout">
            <button type="submit" style="padding: 10px; background-color: #dc3545; color: white; border: none; border-radius: 5px;">Logout</button>
        </form>
    </div>
    <div class="footer">
        <p>&copy; 2024 Your Company. All rights reserved.</p>
    </div>
</div>

<%--&lt;%&ndash; Include the login-form.jsp here &ndash;%&gt;--%>
<%--<jsp:include page="login-form.jsp" />--%>

</body>
</html>



