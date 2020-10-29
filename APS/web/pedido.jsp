<%-- 
    Document   : pedido
    Created on : 29/10/2020, 09:55:57
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pedido</title>
    </head>
    <body>
        <center>
        <div>
            <form action="ServletPedido" method="get">
                Número do Pedido: <input type="number" name="num_pedido"><br>
                Preço Total: <input type="text" name="preco_pedido"><br>
                Hora do Pedido: <input type="time" name="dt_hora_pedido"><br>
                <table>
                    <td><input type="submit" name="salvar" value="Salvar"></td>
                    <td><input type="submit" name="cancelar" value="Cancelar"></td>
                </table>           
            </form> 
        </div>
        </center>
    </body>
</html>
