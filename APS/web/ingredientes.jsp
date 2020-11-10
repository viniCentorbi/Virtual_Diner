<%-- 
    Document   : ingredientes
    Created on : 22/10/2020, 23:26:45
    Author     : USER
--%>

<%@page import="entidade.Ingredientes"%>
<%@page import="java.util.List"%>
<%@page import="dao.IngredientesDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ingredientes</title>
        
        <style>
        #ingredientes {
          font-family: arial, sans-serif;
          border-collapse: collapse;
          width: 70%;
        }

        td, th {
          border: 1px solid #dddddd;
          text-align: left;
          padding: 8px;
        }
        
        #titulo{
            border: 1px solid #dddddd;
            text-align: center;
            padding: 8px; 
            background-color: black;
            color: white;
        }

        tr:nth-child(even) {
          background-color: #dddddd;
        }
        </style>
    </head>
    <body>
        
        <%
            IngredientesDao ingDao = new IngredientesDao();

            List<Ingredientes> getListIngredientes = ingDao.listarIngredientes();

            
            List<Ingredientes> getListPao = ingDao.listarPaes();
            List<Ingredientes> getListCarne = ingDao.listarCarnes();
            List<Ingredientes> getListSalada = ingDao.listarSaladas();
            List<Ingredientes> getListMolho = ingDao.listarMolhos();
           
        %>
    
    <center>
        <div>
            <form action="ServletIngredientes" method="get">
                <table>
                    <td><input id="1" type="radio" name="tipo" value="Carne">Carne</td>
                    <td><input id="2" type="radio" name="tipo" value="Pao">Pão</td>
                    <td><input id="3" type="radio" name="tipo" value="Molho">Molho</td>
                    <td><input id="4" type="radio" name="tipo" value="Salada">Salada</td>
                </table>
                Descrição: <input type="text" name="descricao" autocomplete="off"><br>
                Preço: <input type="text" name="preco"><br>
                Data de Fabricação: <input type="date" name="dt_fabricacao" autocomplete="off"><br>
                Data de Validade: <input type="date" name="dt_validade" autocomplete="off"><br>
                Estoque: <input type="number" name="estoque" autocomplete="off"><br>
                <table>
                    <td><input type="submit" name="salvar" value="Salvar"></td>
                    <td><input type="submit" name="cancelar" value="Cancelar"></td>
                </table>           
            </form> 
        </div>
        
        
            
        <table id = "ingredientes">
            
            <tr>
                <th id = "titulo">Pão</th>
            </tr>
            
            <tr>
              <th>Descrição</th>
              <th>Preço</th>
              <th>Data de fabricação</th>
              <th>Data de validade</th>
              <th>Estoque</th>
            </tr>
            
            <%
                for(Ingredientes pao:getListPao){
            %>
            
            <tr>
                <td><%=pao.getDescricao()%></td>
                <td><%=pao.getPreco()%></td>
                <td><%=pao.getDtFabricacao()%></td>
                <td><%=pao.getDtValidade()%></td>
                <td><%=pao.getEstoque()%></td>
            </tr>
            
            <%
                }
            %>            
        </table>
        <br>
        <table id = "ingredientes">
            
            <tr>
                <th id = "titulo">Carne</th>
            </tr>
            
            <tr>
              <th>Descrição</th>
              <th>Preço</th>
              <th>Data de fabricação</th>
              <th>Data de validade</th>
              <th>Estoque</th>
            </tr>
            
            <%
                for(Ingredientes carne:getListCarne){
            %>
            
            <tr>
                <td><%=carne.getDescricao()%></td>
                <td><%=carne.getPreco()%></td>
                <td><%=carne.getDtFabricacao()%></td>
                <td><%=carne.getDtValidade()%></td>
                <td><%=carne.getEstoque()%></td>
            </tr>
            
            <%
                }
            %>            
        </table>
        <br>
        <table id = "ingredientes">
            
            <tr>
                <th id = "titulo">Salada</th>
            </tr>
            
            <tr>
              <th>Descrição</th>
              <th>Preço</th>
              <th>Data de fabricação</th>
              <th>Data de validade</th>
              <th>Estoque</th>
            </tr>
            
            <%
                for(Ingredientes salada:getListSalada){
            %>
            
            <tr>
                <td><%=salada.getDescricao()%></td>
                <td><%=salada.getPreco()%></td>
                <td><%=salada.getDtFabricacao()%></td>
                <td><%=salada.getDtValidade()%></td>
                <td><%=salada.getEstoque()%></td>
            </tr>
            
            <%
                }
            %>            
        </table>
        <br>
        <table id = "ingredientes">
            
            <tr>
                <th id = "titulo">Molho</th>
            </tr>
            
            <tr>
              <th>Descrição</th>
              <th>Preço</th>
              <th>Data de fabricação</th>
              <th>Data de validade</th>
              <th>Estoque</th>
            </tr>
            
            <%
                for(Ingredientes molho:getListMolho){
            %>
            
            <tr>
                <td><%=molho.getDescricao()%></td>
                <td><%=molho.getPreco()%></td>
                <td><%=molho.getDtFabricacao()%></td>
                <td><%=molho.getDtValidade()%></td>
                <td><%=molho.getEstoque()%></td>
            </tr>
            
            <%
                }
            %>            
        </table>
        
            
       
        
    </center>
    </body>
</html>
<a href="../../../../../../Program Files/Apache Software Foundation/Tomcat 9.0/conf/web.xml"></a>