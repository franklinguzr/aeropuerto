<%-- 
    Document   : login
    Created on : 2/04/2020, 02:35:40 PM
    Author     : FRANKLIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Login</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <div>
            <label>
                Login
            </label>
        </div>
        <div>
           
   <form action="/../aeropuerto/UsuarioServlet?action=login" method="post">
  <div class="container">
    <label for="us"><b>Username</b></label>
    <input type="text" placeholder="Enter Username" name="us" required>

    <label for="pass"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="pass" required>
    <button type="submit"  name="action" value="login">Login</button>
  </div>
</form>
     </div>
    </body>
</html>
