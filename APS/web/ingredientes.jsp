<%-- 
    Document   : ingredientes
    Created on : 22/10/2020, 23:26:45
    Author     : USER
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="entidade.Ingredientes"%>
<%@page import="java.util.List"%>
<%@page import="dao.IngredientesDao"%>
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
                    <td><input id="1" type="radio" name="tipo" value="Carne" focus="true" checked>Carne</td>
                    <td><input id="2" type="radio" name="tipo" value="Pao">Pão</td>
                    <td><input id="3" type="radio" name="tipo" value="Molho">Molho</td>
                    <td><input id="4" type="radio" name="tipo" value="Salada">Salada</td>
                </table>
                Descrição: <input type="text" name="descricao" autocomplete="off" required><br>
                Preço: <input type="text" name="preco" required><br>
                Data de Fabricação: <input type="date" name="dt_fabricacao" autocomplete="off" required><br>
                Data de Validade: <input type="date" name="dt_validade" autocomplete="off" required><br>
                Estoque: <input type="number" name="estoque" autocomplete="off" required><br>
                <table>
                    <td><button class="btnCad" type="submit" name="botao" value="salvar">Salvar</button></td>
                    <td><button class="btnCad" type="submit" name="botao" value="cancelar">Cancelar</button></td>
                </table>           
            </form> 
        </div>
        
        
            
               
       
            
       
        
    </center>
    </body>
</html>
<a href="../../../../../../Program Files/Apache Software Foundation/Tomcat 9.0/conf/web.xml"></a>