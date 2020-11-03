<%-- 
    Document   : pedido
    Created on : 29/10/2020, 09:55:57
    Author     : USER
--%>

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
<%@page import="entidade.Lanche"%>
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
            
            <%
                LancheDao l = new LancheDao();
                
                int ultEle = (l.listarLanche().size() - 1);
                
                Login login = new Login();
                
                int idLanche = l.listarLanche().get(ultEle).getIdLanche();
                
                PedidoPK pk = new PedidoPK();
                pk.setIdLanche(idLanche);
                pk.setIdUsuario(login.getIdUsuario());
                

                Pedido p = new Pedido();
                
                
                BigDecimal precoPao = l.listarLanche().get(ultEle).getIdPao().getPreco();
                BigDecimal precoCarne = l.listarLanche().get(ultEle).getIdCarne().getPreco();
                BigDecimal precoSalada = l.listarLanche().get(ultEle).getIdSalada().getPreco();
                BigDecimal precoMolho = l.listarLanche().get(ultEle).getIdMolho().getPreco();
                
                
                BigDecimal sum1 = precoPao.add(precoCarne);
                BigDecimal sum2 = precoSalada.add(precoMolho);
                
                BigDecimal precoPedido = sum1.add(sum2);
                
                
                Calendar data = Calendar.getInstance();
                int horas = data.get(Calendar.HOUR_OF_DAY);
                int minutos = data.get(Calendar.MINUTE);
                
                String strHora = String.valueOf(horas);
                String strMinuto = String.valueOf(minutos);
                
                p.setDtHoraPedido(strHora+":"+strMinuto);
                p.setPedidoPK(pk);
                p.setPrecoPedido(precoPedido);
             
                PedidoDao pedidoDao = new PedidoDao();
                
                System.out.println(login.getUsuario());
                
                JOptionPane.showMessageDialog(null,login.getUsuario());
                
                pedidoDao.salvar(p);
            %>
        </div>
        </center>
    </body>
</html>
