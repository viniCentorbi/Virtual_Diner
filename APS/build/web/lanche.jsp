<%-- 
    Document   : lanche
    Created on : 29/10/2020, 10:05:59
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lanche</title>
    </head>
    <body>
        <center>
        <div>
            <form action="ServletLanche" method="get">
                Pão:
                <select name="pao" id="pao" required>
                    <option value="">Selecione</option>
                    <option value="Pão Australiano">Pão Australiano</option>
                    <option value="Pão Frances">Pão Frances</option>                   
                </select>
                   
                Carne:
                <select name="carne" id="carne" required>
                    <option value="">Selecione</option>
                    <option value="Linguiça">Linguiça</option>
                    <option value="Hamburguer">Hamburguer</option>                   
                </select>
                
                Salada:
                <select name="salada" id="salada">
                    <option value="">Selecione</option>
                    <option value="Alface">Alface</option>
                    <option value="Tomate">Tomate</option>                   
                </select>
                
                Molho:
                <select name="molho" id="molho">
                    <option value="">Selecione</option>
                    <option value="Maionese">Maionese</option>
                    <option value="Molho da Casa">Molho da Casa</option>                   
                </select><br><br>
                
                <table>
                    <td><input type="submit" name="salvar" value="Salvar"></td>
                    <td><input type="submit" name="cancelar" value="Cancelar"></td>
                </table>           
            </form> 
        </div>
        </center>
    </body>
</html>
