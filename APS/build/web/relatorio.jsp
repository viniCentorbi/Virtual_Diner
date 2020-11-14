<%@page import="java.sql.Time"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="dao.PedidoDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="menu.css">
        <link rel="stylesheet" type="text/css" href="style.css">        
        <link rel="shortcut icon" type="image/x-icon" href="logo.ico">
        <title>Relatório</title>
        
        <style>
        table {
          font-family: arial, sans-serif;
          border-collapse: collapse;
          width: 70%;
          border: 2px solid black;
        }

        td, th {
          border: 1px solid black;
          text-align: left;
          padding: 8px;
        }

        tr:nth-child(even) {
          background-color: #dddddd;
        }
        .input1{
            margin-bottom: 0;
            margin-top: 0;
            margin-left: 6%;
            margin-right: 0;
        }
        .input2{
            margin-bottom: 0;
            margin-top: 0;
            margin-left: 3%;
            margin-right: 0;
        }
        .calcular{
            background-color: #007600;                
            border-radius: 10px;
            border-style: none;
            text-decoration: none;
            color: white;
            padding: 10px 25px;
            margin: 15px 15px;
            margin-left: 0%;
            cursor: pointer;
            font-family: 'Open Sans', sans-serif;
            font-size: 17px;
            font-weight: bold;
            width: 22%;
        }
        
        </style>
    </head>
    <body>
        
        
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
                    
                    <div class="divRelatorio">
                        <center>
                        <form method="get" action="ServletRelatorio">
                            
                            <h3>Preencha os campos para ver o número de Pedidos</h3>
                            <br>
                            Hora início:<input class="input1" type="time" name="horaInicio" autocomplete="off" required>
                            <br>
                            <br>
                            Hora término:<input class="input2" type="time" name="horaTermino" autocomplete="off" required>
                            <br>
                            <br>
                            <div class="buttonsExibirIngredientes">
                                <center>
                                    <button class="calcular" type="submit">Calcular</button>
                                </center>
                            </div>
                            <br>
                        </form>
                        
                        <table>
                            
                            <tr>
                                <th>Intervalo de Tempo</th>
                                <th>Quantidade de Pedidos</th>                                    
                            </tr>
                            <tr>
                                <td><%
                                        String IntervaloTempo = (String) request.getAttribute("IntervaloTempo");

                                        if(IntervaloTempo != null){
                                            out.print(IntervaloTempo);
                                        }
                                    %>
                                </td>
                                <td>
                                    <%
                                        String qtdPedidos = (String) request.getAttribute("qtdPedidos");

                                        if(qtdPedidos != null){
                                            out.print(qtdPedidos);
                                        }
                                    %>
                                </td>
                            </tr>
                            
                        </table>
                        </center>
                    </div>
                    
                </div>
                
            </section>
        </main>
        
    </body>
</html>
