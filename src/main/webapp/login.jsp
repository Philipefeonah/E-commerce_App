<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Login</title>
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
    .content {
      margin-bottom: 20px;
    }
    .footer {
      padding: 10px;
      background-color: #f1f1f1;
    }
    input {
      display: block;
      width: 100%;
      padding: 10px;
      margin-bottom: 10px;
    }
    button {
      padding: 10px;
      background-color: #007bff;
      color: white;
      border: none;
      border-radius: 5px;
      cursor: pointer;
    }
    button:hover {
      background-color: #0056b3;
    }
  </style>
</head>
<body>
<div class="container">
  <div class="header">
    <h1>Login</h1>
  </div>
  <div class="content">
    <form action="login" method="post">
      <input type="email" name="email" placeholder="Email" required>
      <input type="password" name="password" placeholder="Password" required>
      <button type="submit">Login</button>
    </form>
  </div>
  <div class="footer">
    <p>&copy; 2024 Your Company. All rights reserved.</p>
  </div>
</div>
</body>
</html>

<%--<!DOCTYPE html>--%>
<%--<html lang="en">--%>
<%--<head>--%>
<%--  <meta charset="UTF-8">--%>
<%--  <title>Login</title>--%>
<%--  <!-- Styles and scripts -->--%>
<%--</head>--%>
<%--<body>--%>
<%--<div class="container">--%>
<%--  <h1>Login</h1>--%>
<%--  <form action="login" method="post">--%>
<%--    <input type="email" name="email" placeholder="Email" required>--%>
<%--    <input type="password" name="password" placeholder="Password" required>--%>
<%--    <button type="submit">Login</button>--%>
<%--  </form>--%>
<%--</div>--%>
<%--</body>--%>
<%--</html>--%>

