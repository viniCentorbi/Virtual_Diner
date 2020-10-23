<%-- 
    Document   : cadastro
    Created on : 23/10/2020, 14:41:30
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="ServletCliente" method="get">
            Usuario: <input type="text" name="usuario" autocomplete="off"><br>
            Senha: <input type="password" name="senha" autocomplete="off"><br>
            Nome: <input type="text" name="nome" autocomplete="off"><br>
            Sobrenome: <input type="text" name="sobrenome" autocomplete="off"><br>
            Cpf: <input type="text" name="cpf" autocomplete="off"><br>
            Endereço: <input type="Endereco" name="endereco" autocomplete="off"><br>
            <input type="submit" name="salvar" value="Entrar">
        </form> 
    </body>
</html>
