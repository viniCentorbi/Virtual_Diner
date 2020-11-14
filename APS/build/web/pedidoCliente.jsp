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
        <link rel="stylesheet" type="text/css" href="menu.css">
        <link rel="stylesheet" type="text/css" href="style.css">
        <link rel="shortcut icon" type="image/x-icon" href="logo.ico">
        <title>Pedido Cliente</title>
        
        <style>
        table {
          font-family: arial, sans-serif;
          border-collapse: collapse;
          width: 70%;
        }

        td, th {
          border: 1px solid #dddddd;
          text-align: left;
          padding: 8px;
         
        }
        th {
          border: 1px solid #dddddd;
          text-align: left;
          padding: 8px;
          background-color: #ed7801;
         
        }

        tr:nth-child(even) {
          background-color: #dddddd;
        }
        </style>
        
        <script>
            function pedidoSalvo() {
              alert("Pedido realizado com sucesso!");
            }
        </script>
        
    </head>
    <body>
        <center>
        <div class="box">
            
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
                
                                
                if(molho != null){
                    BigDecimal precoMolho = l.listarLanche().get(ultLanche).getIdMolho().getPreco();
                    precoPedido = precoPedido.add(precoMolho);
                    molhoDesc = l.buscarLancheId(idLanche).getIdMolho().getDescricao();
                }
                if(salada != null){
                    BigDecimal precoSalada = l.listarLanche().get(ultLanche).getIdSalada().getPreco();
                    precoPedido = precoPedido.add(precoSalada);
                    saladaDesc = l.buscarLancheId(idLanche).getIdSalada().getDescricao();
                } 
                //------------------------------------------------------------------------------------------------- 

            %>
                
            <h1 class="titulo">Seu Pedido</h1>
            
            <center>              
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
                        <td><%=precoPedido%></td>
                    </tr>                         

                </table> 
            </center>
            
                <br>
                <center>
                    <form action="ServletPedido" method="get">
                        <table>
                            <td><button class="btnCancelar" type="submit" name="botao" value="excluir">Cancelar Pedido</button></td>
                            <td><button onclick="pedidoSalvo()"class="btnSalvar" type="submit" name="botao" value="salvar">Finalizar Pedido</button></td>
                        </table>
                    </form>
                </center>
                
            
            
        </div>
        </center>
    </body>
</html>
