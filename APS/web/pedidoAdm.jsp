<%-- 
    Document   : pedidoAdm
    Created on : 05/11/2020, 10:03:43
    Author     : Vinicius
--%>

<%@page import="java.util.List"%>
<%@page import="dao.PedidoDao"%>
<%@page import="entidade.Pedido"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <style>
        table {
          font-family: arial, sans-serif;
          border-collapse: collapse;
          width: 100%;
        }

        td, th {
          border: 1px solid #dddddd;
          text-align: left;
          padding: 8px;
        }

        tr:nth-child(even) {
          background-color: #dddddd;
        }
        </style>
    </head>
    <body>

    <h2>Pedidos</h2>
    
        <%
            PedidoDao p = new PedidoDao();

            List<Pedido> getListPedido = p.listarPedidos();
           
        %>

        <table>
          <tr>
            <th>ID Usuário</th>
            <th>ID Lanche</th>
            <th>Preço Total</th>
            <th>Hora do Pedido</th>
          </tr>
          
            <%
                for(Pedido pedidos:getListPedido){ 

            %>
            <tr>
                <td><%=pedidos.getPedidoPK().getIdUsuario()%></td>
                <td><%=pedidos.getPedidoPK().getIdLanche()%></td>
                <td><%=pedidos.getPrecoPedido()%></td>
                <td><%=pedidos.getDtHoraPedido()%></td>
            </tr>
            <%
                }
            %>              
          
          
        </table>

    </body>
</html>
