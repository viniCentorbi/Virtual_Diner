<%-- 
    Document   : pedido
    Created on : 29/10/2020, 09:55:57
    Author     : USER
--%>

<%@page import="entidade.Ingredientes"%>
<%@page import="javax.swing.JOptionPane"%>
<%@page import="dao.IngredientesDao"%>
<%@page import="java.math.BigDecimal"%>
<%@page import="java.util.Calendar"%>
<%@page import="dao.LancheDao"%>
<%@page import="dao.PedidoDao"%>
<%@page import="entidade.Pedido"%>
<%@page import="entidade.PedidoPK"%>
<%@page import="entidade.Login"%>
<%@page import="entidade.Lanche"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pedido</title>
        
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
        <center>
        <div>
            
            <%
                
                LancheDao l = new LancheDao();
                
                int ultLanche = l.listarLanche().size() - 1;
                
                int idLanche = l.listarLanche().get(ultLanche).getIdLanche();                
                                
                Ingredientes salada = l.buscarLancheId(idLanche).getIdSalada();
                Ingredientes molho = l.buscarLancheId(idLanche).getIdMolho();
                
                // Exibir o pedido do Cliente ---------------------------------------------------------------------                
                String pao = l.buscarLancheId(idLanche).getIdPao().getDescricao();
                String carne = l.buscarLancheId(idLanche).getIdCarne().getDescricao();
                String  molhoDesc = "Nenhum molho selecionado";
                String saladaDesc = "Nenhuma salada selecionada";
                
                
                BigDecimal precoPao = l.listarLanche().get(ultLanche).getIdPao().getPreco();
                BigDecimal precoCarne = l.listarLanche().get(ultLanche).getIdCarne().getPreco();
                
                BigDecimal precoPedido = precoPao.add(precoCarne);
                
                BigDecimal precoTotal = null;
                
                if(molho != null){
                    BigDecimal precoMolho = l.listarLanche().get(ultLanche).getIdMolho().getPreco();
                    precoTotal = precoPedido.add(precoMolho);
                    molhoDesc = l.buscarLancheId(idLanche).getIdMolho().getDescricao();
                }
                if(salada != null){
                    BigDecimal precoSalada = l.listarLanche().get(ultLanche).getIdSalada().getPreco();
                    precoTotal = precoPedido.add(precoSalada);
                    saladaDesc = l.buscarLancheId(idLanche).getIdSalada().getDescricao();
                } 
                //------------------------------------------------------------------------------------------------- 

            %>
                
            <h1>Seu Pedido</h1>
            
                            
            <table>
                <tr>
                  <th>Pão</th>
                  <th>Carne</th>
                  <th>Salada</th>
                  <th>Molho</th>
                  <th>Preço Total</th>
                </tr>
          
          
                <tr>
                    <td><%=pao%></td>
                    <td><%=carne%></td>
                    <td><%=saladaDesc%></td>
                    <td><%=molhoDesc%></td>
                    <td><%=precoTotal%></td>
                </tr>                         
          
            </table> 
            
                <br>
                
                <form action="ServletPedido" method="get">
                    <button class="btnCad" type="submit" name="botao" value="salvar">Finalizar Pedido</button>
                    <button class="btnCad" type="submit" name="botao" value="excluir">Cancelar Pedido</button>
                    
                </form>
                
                
            
            
        </div>
        </center>
    </body>
</html>
