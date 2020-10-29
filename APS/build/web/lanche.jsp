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
                Pão: <input type="number" name="id_pao"><br>
                Carne: <input type="number" name="id_carne"><br>
                Salada: <input type="number" name="id_salada"><br>
                Molho: <input type="number" name="id_molho"><br>
                <table>
                    <td><input type="submit" name="salvar" value="Salvar"></td>
                    <td><input type="submit" name="cancelar" value="Cancelar"></td>
                </table>           
            </form> 
        </div>
        </center>
    </body>
</html>
