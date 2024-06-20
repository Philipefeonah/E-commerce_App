<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Delete Product</title>
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
            background-color: #f44336; /* Red color for delete button */
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
            background-color: #d32f2f; /* Darker red on hover */
        }
        .error {
            color: red;
            margin-top: 5px;
        }
    </style>
</head>
<body>
<div class="container">
    <h2>Delete Product</h2>
    <form action="deleteProduct" method="post">
        <label for="productId">Product ID:</label>
        <input type="text" id="productId" name="productId" value="<%= request.getAttribute("productId") %>">

        <input type="submit" value="Delete Product">
    </form>

    <%-- Display errors if any --%>
    <div class="error">
        <%= request.getAttribute("error") %>
    </div>
</div>
</body>
</html>
