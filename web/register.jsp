<%-- 
    Document   : register
    Created on : 3/04/2020, 11:24:35 AM
    Author     : FRANKLIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <div class="well well-sm">
                <form class="form-horizontal"  action="/aeropuerto/UsuarioServlet?action=registrar" method="post">
                <fieldset>
                        <legend class="text-center header">Nuevo Usuario</legend>
                        <div class="form-group">
                            <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-user bigicon"></i></span>
                            <div class="col-md-8">
                                <input id="usuario" name="usuario" type="text" placeholder="usuario" class="form-control" required>
                            </div>
                        </div>
                        <div class="form-group">
                            <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-user bigicon"></i></span>
                            <div class="col-md-8">
                                <input id="nombre" name="nombre" type="text" placeholder="nombre" class="form-control" required>
                            </div>
                        </div>

                        <div class="form-group">
                            <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-envelope-o bigicon"></i></span>
                            <div class="col-md-8">
                               <input id="contrasena" name="contrasena" type="password" placeholder="contraseña" class="form-control" required>
                            </div>
                        </div>
                        <div class="form-group">
                            <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-envelope-o bigicon"></i></span>
                            <div class="col-md-8">
                       <button type="submit" class="btn btn-primary btn-lg"  name="action" value="registrar">Registrar</button>
                        </div>
                            </div>
                    </fieldset>
                </form>
                </div>
              </div>
           </div>
            </div>
    </body>
</html>
