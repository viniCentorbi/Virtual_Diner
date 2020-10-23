<%-- 
    Document   : ligon
    Created on : 23/10/2020, 14:25:34
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <form action="ServletCliente" method="get">
            Usuario: <input type="text" name="usuario"><br>
            Senha: <input type="password" name="senha"><br>
            <input type="submit" name="salvar" value="Entrar">
        </form>  
    </body>
</html>
