<%-- 
    Document   : ingredientes
    Created on : 22/10/2020, 23:26:45
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ingredientes</title>
    </head>
    <body>
    <center>
        <div>
            <form action="ServletIngredientes" method="get">
                <table>
                    <td><input type="radio" id="carne" name="gender" value="carne">
                        <label for="carne">Carne</label><br></td>                    
                    <td><input type="radio" id="pao" name="gender" value="pao">
                        <label for="pao">Pão</label><br></td>
                    <td><input type="radio" id="molho" name="gender" value="molho">
                        <label for="molho">Molho</label><br></td>
                    <td><input type="radio" id="salada" name="gender" value="salada">
                        <label for="salada">Salada</label><br></td>
                </table>
                Descrição: <input type="text" name="descricao" autocomplete="off"><br>
                Preço: <input type="text" name="preco" autocomplete="off"><br>
                Data de Fabricação: <input type="date" name="dt_fabricacao" autocomplete="off"><br>
                Data de Validade: <input type="date" name="dt_validade" autocomplete="off"><br>
                Estoque: <input type="number" name="estoque" autocomplete="off"><br>
                <table>
                    <td><input type="submit" name="salvar" value="Salvar"></td>
                    <td><input type="submit" name="cancelar" value="Cancelar"></td>
                </table>           
            </form> 
        </div>
    </center>
    </body>
</html>
<a href="../../../../../../Program Files/Apache Software Foundation/Tomcat 9.0/conf/web.xml"></a>