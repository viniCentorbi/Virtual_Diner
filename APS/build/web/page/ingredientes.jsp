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
        <link rel="stylesheet" type="text/css" href="menu.css">
        <link rel="stylesheet" type="text/css" href="style.css">
        <link rel="shortcut icon" type="image/x-icon" href="logo.ico">
        
        <title>Ingredientes</title>
        <style>
            .mensagemSucesso{
                color: #007600;
                margin-bottom: 0;
                margin-right: 0;
                margin-top: 0;
                margin-left: 10%;
                    
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
                    
                   <center>
                       <div class="cadastroIngrediente">
                            <form action="ServletIngredientes" method="get">
                                
                                <h2 style="border-bottom: 1px solid black; padding-bottom: 2%">Cadastro de Ingrediente</h2>
                                
                                
                                <table>
                                    <td><input id="1" type="radio" name="tipo" value="Carne" focus="true" checked>Carne</td>
                                    <td><input id="2" type="radio" name="tipo" value="Pao">Pão</td>
                                    <td><input id="3" type="radio" name="tipo" value="Molho">Molho</td>
                                    <td><input id="4" type="radio" name="tipo" value="Salada">Salada</td>
                                </table>
                                <br>
                                
                                Descrição: <input type="text" name="descricao" autocomplete="off" required>
                                <br>
                                <br>
                                Preço: <input type="text" name="preco" required>
                                <br>
                                <br>
                                Data de Fabricação: <input type="date" name="dt_fabricacao" autocomplete="off" required>
                                <br>
                                <br>
                                Data de Validade: <input type="date" name="dt_validade" autocomplete="off" required>
                                <br>
                                <br>
                                Estoque: <input type="number" name="estoque" autocomplete="off" required>
                                <br>
                                <br>
                                <br>
                                <p class="mensagemSucesso">${mensagemCadastroSucesso}</p>
                                <table>
                                    <td><button class="btnCancelarIngredientes" type="submit" name="botao" value="cancelar">Cancelar</button></td>
                                    <td><button class="btnSalvarIngredientes" type="submit" name="botao" value="salvar">Salvar</button></td>
                                </table>           
                            </form> 
                        </div>
                    </center> 
                    
                    
                </div>
            </section>
        </main>
        
        
        
        
        
    </body>
</html>
<a href="../../../../../../Program Files/Apache Software Foundation/Tomcat 9.0/conf/web.xml"></a>