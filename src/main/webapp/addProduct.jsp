<%--<!DOCTYPE html>--%>
<%--<html>--%>
<%--<head>--%>
<%--    <title>Add Product</title>--%>
<%--</head>--%>
<%--<body>--%>
<%--<h2>Add Product</h2>--%>
<%--<form action="addProduct" method="post" enctype="multipart/form-data">--%>
<%--    <div>--%>
<%--        <label for="name">Product Name:</label>--%>
<%--        <input type="text" id="name" name="name" required>--%>
<%--    </div>--%>
<%--    <div>--%>
<%--        <label for="category">Category:</label>--%>
<%--        <input type="text" id="category" name="category" required>--%>
<%--    </div>--%>
<%--    <div>--%>
<%--        <label for="price">Price:</label>--%>
<%--        <input type="number" id="price" name="price" step="0.01" required>--%>
<%--    </div>--%>
<%--    <div>--%>
<%--        <label for="image">Image:</label>--%>
<%--        <input type="file" id="image" name="image" accept="image/*" required>--%>
<%--    </div>--%>
<%--    <div>--%>
<%--        <button type="submit">Add Product</button>--%>
<%--    </div>--%>
<%--</form>--%>
<%--</body>--%>
<%--</html>--%>

<<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Add Product</title>
    <style>
        body {
            font-family: Arial, sans-serif;
        }
        .container {
            width: 50%;
            margin: 0 auto;
            text-align: center;
        }
        .header {
            padding: 20px;
            background-color: #f1f1f1;
            margin-bottom: 20px;
        }
        form {
            width: 100%;
            margin-top: 20px;
        }
        input {
            display: block;
            width: 100%;
            padding: 10px;
            margin-bottom: 10px;
            font-size: 16px;
        }
        button {
            padding: 10px;
            background-color: #007bff;
            color: white;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            font-size: 16px;
        }
        button:hover {
            background-color: #0056b3;
        }
        .error {
            color: red;
            margin-top: 10px;
        }
    </style>
</head>
<body>
<div class="container">
    <div class="header">
        <h1>Add New Product</h1>
    </div>
    <form action="addProduct" method="post" enctype="multipart/form-data">
        <%-- Display error messages if there are any --%>
        <% String error = request.getParameter("error");
            if (error != null) { %>
        <div class="error">
            <% if (error.equals("nameNull")) { %>
            Please enter a valid updateProduct name.
            <% } else if (error.equals("dbError")) { %>
            Failed to add updateProduct. Please try again later.
            <% } %>
        </div>
        <% } %>
        <input type="text" name="name" placeholder="Product Name" required>
        <input type="text" name="category" placeholder="Category" required>
        <input type="number" name="price" placeholder="Price" step="0.01" required>
        <input type="file" name="file" accept="image/*">
        <button type="submit">Add Product</button>
    </form>
</div>
</body>
</html>
