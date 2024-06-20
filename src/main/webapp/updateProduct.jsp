<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Update Product</title>
    <style>
        body {
            font-family: Arial, sans-serif;
        }
        .container {
            width: 50%;
            margin: 0 auto;
            padding: 20px;
            border: 1px solid #ccc;
            border-radius: 5px;
            background-color: #f9f9f9;
        }
        h2 {
            text-align: center;
        }
        form {
            display: flex;
            flex-direction: column;
        }
        label {
            margin-top: 10px;
        }
        input[type="text"], input[type="password"] {
            padding: 8px;
            margin-top: 5px;
            margin-bottom: 10px;
            border: 1px solid #ccc;
            border-radius: 3px;
            width: 100%;
            box-sizing: border-box;
        }
        input[type="submit"] {
            background-color: #4CAF50;
            color: white;
            padding: 10px 20px;
            border: none;
            border-radius: 3px;
            cursor: pointer;
            margin-top: 10px;
            width: 100%;
            box-sizing: border-box;
        }
        input[type="submit"]:hover {
            background-color: #45a049;
        }
        .error {
            color: red;
            margin-top: 5px;
        }
    </style>
</head>
<body>
<div class="container">
    <h2>Update Product</h2>
    <form action="updateProduct" method="post">
        <label for="productId">Product ID:</label>
        <input type="text" id="productId" name="productId" value="<%= request.getAttribute("productId") %>">

        <label for="productName">Product Name:</label>
        <input type="text" id="productName" name="productName" value="<%= request.getAttribute("productName") %>">

        <label for="price">Price:</label>
        <input type="text" id="price" name="price" value="<%= request.getAttribute("price") %>">

        <label for="description">Description:</label>
        <input type="text" id="description" name="description" value="<%= request.getAttribute("description") %>">

        <input type="submit" value="Update Product">
    </form>

    <%-- Display errors if any --%>
    <div class="error">
        <%= request.getAttribute("error") %>
    </div>
</div>
</body>
</html>
