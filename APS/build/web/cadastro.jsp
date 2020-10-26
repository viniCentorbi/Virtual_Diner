<%-- 
    Document   : cadastro
    Created on : 26/10/2020, 14:27:37
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro</title>
    </head>
    <body>
        <form action="ServletClientes" method="get">
                Usuario: <input type="text" name="usuario" autocomplete="off"><br>
                Senha: <input type="password" name="senha" autocomplete="off"><br>
                Nome: <input type="text" name="nome" autocomplete="off"><br>
                Sobrenome: <input type="text" name="sobrenome" autocomplete="off"><br>
                Cpf: <input type="text" name="cpf" autocomplete="off"><br>
                Rua: <input type="text" name="rua" autocomplete="off"><br>
                Numero: <input type="text" name="numero" autocomplete="off"><br>
                CEP: <input type="text" name="cep" autocomplete="off"><br>
                <table>
                    <td><input type="submit" name="salvar" value="Salvar"></td>
                    <td><input type="submit" name="cancelar" value="Cancelar"></td>
                </table>           
            </form> 
    </body>
</html>
