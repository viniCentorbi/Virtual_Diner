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
        <link rel="stylesheet" type="text/css" href="menu.css">
        <link rel="stylesheet" type="text/css" href="style.css">
        <link rel="shortcut icon" type="image/x-icon" href="logo.ico">
        
        <title>Home Administrador</title>
        <style>
        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 80%;
            border: 1px solid black;
        }
        th{
            background-color: #ed7801;
            border: 1px solid black;
            text-align: left;
            padding: 8px;
        }
        td{
           border: 1px solid black;
           text-align: left;
           padding: 8px;
           background-color: rgba(255,255,255, 0.5);
        }

        tr:nth-child(even) {
          background-color: gray;
        }
        h2{
            font-weight: bolder;
        }
        </style>
    </head>
    <body>
        <%
            PedidoDao p = new PedidoDao();

            List<Pedido> getListPedido = p.listarPedidos();

        %>
        
        <main>
            <aside>
                <ul class="asideList">
                    <li><a href="homeAdm.jsp" class="asideAnchor">Inicio</a></li>
                    <li><a href="relatorio.jsp" class="asideAnchor">Relatório</a></li>                  
                    <li class="asideAnchor2">Ingredientes</li>
                    <ul class="brunodatrabalho">
                        <li><a href="ingredientes.jsp" class="asideAnchor">Cadastrar</a></li>
                        <li><a href="exibirIngredientes.jsp" class="asideAnchor">Exibir</a></li>
                    </ul>
                    <ul class="brunodatrabalho2">
                        <li><a href="login.jsp" class="asideAnchor">Logout</a></li>            
                    </ul>
                </ul>
            </aside>
            <section>
                <input type="checkbox" id="myInput">
                <label for="myInput">
                  <span class="bar top"></span>
                  <span class="bar middle"></span>
                  <span class="bar bottom"></span>
                </label>
        
                <div class="content">                    
                    
                    <center>
                        <div class="pedidoAdm">
                            <h2>Pedidos</h2>

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
                        </div>
                    </center>       
                </div>
            </section>
        </main>
        
        
        
        

    

    </body>
</html>
