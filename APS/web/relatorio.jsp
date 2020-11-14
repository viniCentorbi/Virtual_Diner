<%@page import="java.sql.Time"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="dao.PedidoDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Relatório</title>
        
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

        tr:nth-child(even) {
          background-color: #dddddd;
        }
        </style>
    </head>
    <body>
        
        
        <%
        
            PedidoDao pDao = new PedidoDao();
            
            SimpleDateFormat formatador = new SimpleDateFormat("HH:mm");
            Date data = null;
            Time time = null;
            
            Date dateTeste = formatador.parse("13:00");
            Time timeTeste = new Time(data.getTime());
            
            int tam = pDao.listarPedidos().size();
            int qtdPedido1 = 0;
            int qtdPedido2 = 0;
            int qtdPedido3 = 0;
            int qtdPedido4 = 0;
            int qtdPedido5 = 0;
            
            for (int i = 0; i < tam; i++) {
                    
                data = formatador.parse(pDao.listarPedidos().get(i).getDtHoraPedido());
                time = new Time(data.getTime());
                
                if(time.after(timeTeste)){
                    qtdPedido1++; 
                }
                
            }
        
        %>
        
        <table>
          <tr>
            <th>Horário</th>
            <th>Número de pedidos</th>
          </tr>
          
            <tr>
                <td>13:00 - 16:00</td>
                <td><%=qtdPedido1%></td>               
            </tr>
            <tr>
                <td>16:01 - 19:00</td>
                <td>Teste2</td>               
            </tr>
            <tr>
                <td>19:01 - 21:00</td>
                <td>Teste3</td>               
            </tr>
            <tr>
                <td>21:01 - 00:00</td>
                <td>Teste4</td>               
            </tr>
            <tr>
                <td>00:01 - 03:00</td>
                <td>Teste5</td>               
            </tr>
          
          
        </table>
        
        
    </body>
</html>
