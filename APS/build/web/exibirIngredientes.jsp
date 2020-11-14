<%-- 
    Document   : exibirIngredientes
    Created on : 11/11/2020, 14:19:23
    Author     : Vinicius
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="entidade.Ingredientes"%>
<%@page import="dao.IngredientesDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="menu.css">
        <link rel="stylesheet" type="text/css" href="style.css">
        <title>Exibir Ingredientes</title>
        
        <style>
        #ingredientes {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 70%;
            border: 1px solid black;
        }

        #exibirIngredientes{
          border: 1px solid black;
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
        
        input{
            font-family: Arial;
        }
        form{
            font-family: Arial;
            font-size: 14px;
        }
        </style>
    </head>
    <body>
        
        <%
            IngredientesDao ingDao = new IngredientesDao();
            
            List<Ingredientes> getListPao = new ArrayList<Ingredientes>();
            List<Ingredientes> getListCarne = new ArrayList<Ingredientes>();
            List<Ingredientes> getListSalada = new ArrayList<Ingredientes>();
            List<Ingredientes> getListMolho = new ArrayList<Ingredientes>();
            
            for (int i = 0; i < ingDao.listarIngredientes().size(); i++) {
                    
                if(ingDao.listarIngredientes().get(i).getTipo().equals("Pao")){
                    getListPao.add(ingDao.listarIngredientes().get(i));
                }
                if(ingDao.listarIngredientes().get(i).getTipo().equals("Carne")){
                    getListCarne.add(ingDao.listarIngredientes().get(i));
                }
                if(ingDao.listarIngredientes().get(i).getTipo().equals("Salada")){
                    getListSalada.add(ingDao.listarIngredientes().get(i));
                }
                if(ingDao.listarIngredientes().get(i).getTipo().equals("Molho")){
                    getListMolho.add(ingDao.listarIngredientes().get(i));
                }
                
            }
        %>
        
        
        <main>
            <aside>
                <ul class="asideList">
                  <li><a href="" class="asideAnchor">Inicio</a></li>
                  <li><a href="homeCliente.jsp" class="asideAnchor">Relatório</a></li>
                  <li><a href="homeCliente.jsp" class="asideAnchor">Pedidos</a></li>

                      <li class="asideAnchor2">Ingredientes</li>
                  <ul class="brunodatrabalho">
                   <li><a href="" class="asideAnchor"> Cadastrar</a></li>
                    <li><a href="" class="asideAnchor"> Exibir</a></li>
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
                        
                        <div class="formExibirIngredientes">
                            <h3>Preencha para alterar/excluir ingredientes</h3>
                            <form action="ServletIngredientes" method="get">
                                Número: <input type="text" name="idIngrediente" autocomplete="off" required>
                                <br>
                                <br>
                                Preço: <input type="text" name="preco" required>
                                <br>
                                <br>
                                Estoque: <input type="number" name="estoque" autocomplete="off" required>
                                <br>
                                <br>
                                <table>
                                    <td><button class="btnCad" type="submit" name="botao" value="alterar">Alterar</button></td>
                                    <td><button class="btnCad" type="submit" name="botao" value="excluir">Excluir</button></td>
                                </table>           
                            </form>
                        </div>

                        <table id = "ingredientes">

                            <tr>
                                <th id = "titulo">Pão</th>
                            </tr>

                            <tr>
                              <th id="exibirIngredientes">Número</th>
                              <th id="exibirIngredientes">Descrição</th>
                              <th id="exibirIngredientes">Preço</th>
                              <th id="exibirIngredientes">Data de fabricação</th>
                              <th id="exibirIngredientes">Data de validade</th>
                              <th id="exibirIngredientes">Estoque</th>
                            </tr>

                            <%
                                for(Ingredientes pao:getListPao){
                            %>

                            <tr>
                                <td id="exibirIngredientes"><%=pao.getIdIngredientes() %></td>
                                <td id="exibirIngredientes"><%=pao.getDescricao()%></td>
                                <td id="exibirIngredientes"><%=pao.getPreco()%></td>
                                <td id="exibirIngredientes"><%=pao.getDtFabricacao()%></td>
                                <td id="exibirIngredientes"><%=pao.getDtValidade()%></td>
                                <td id="exibirIngredientes"><%=pao.getEstoque()%></td>
                            </tr>

                            <%
                                }
                            %>            
                        </table>
                        <br>

                        <br>
                        <table id = "ingredientes">

                            <tr>
                                <th id = "titulo">Carne</th>
                            </tr>

                            <tr>
                                <th id="exibirIngredientes">Número</th>
                              <th id="exibirIngredientes">Descrição</th>
                              <th id="exibirIngredientes">Preço</th>
                              <th id="exibirIngredientes">Data de fabricação</th>
                              <th id="exibirIngredientes">Data de validade</th>
                              <th id="exibirIngredientes">Estoque</th>
                            </tr>

                            <%
                                for(Ingredientes carne:getListCarne){
                            %>

                            <tr>
                                <td id="exibirIngredientes"><%=carne.getIdIngredientes()%></td>
                                <td id="exibirIngredientes"><%=carne.getDescricao()%></td>
                                <td id="exibirIngredientes"><%=carne.getPreco()%></td>
                                <td id="exibirIngredientes"><%=carne.getDtFabricacao()%></td>
                                <td id="exibirIngredientes"><%=carne.getDtValidade()%></td>
                                <td id="exibirIngredientes"><%=carne.getEstoque()%></td>
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
                                <th id="exibirIngredientes">Número</th>
                              <th id="exibirIngredientes">Descrição</th>
                              <th id="exibirIngredientes">Preço</th>
                              <th id="exibirIngredientes">Data de fabricação</th>
                              <th id="exibirIngredientes">Data de validade</th>
                              <th id="exibirIngredientes">Estoque</th>
                            </tr>

                            <%
                                for(Ingredientes salada:getListSalada){
                            %>

                            <tr>
                                 <td id="exibirIngredientes"><%=salada.getIdIngredientes()%></td>
                                <td id="exibirIngredientes"><%=salada.getDescricao()%></td>
                                <td id="exibirIngredientes"><%=salada.getPreco()%></td>
                                <td id="exibirIngredientes"><%=salada.getDtFabricacao()%></td>
                                <td id="exibirIngredientes"><%=salada.getDtValidade()%></td>
                                <td id="exibirIngredientes"><%=salada.getEstoque()%></td>
                            </tr>

                            <%
                                }
                            %>            
                        </table>
                        <br>

                        <br>
                        <table id = "ingredientes">

                            <tr>
                                <th id = "titulo">Molho</th>
                            </tr>

                            <tr>
                                <th id="exibirIngredientes">Número</th>
                              <th id="exibirIngredientes">Descrição</th>
                              <th id="exibirIngredientes">Preço</th>
                              <th id="exibirIngredientes">Data de fabricação</th>
                              <th id="exibirIngredientes">Data de validade</th>
                              <th id="exibirIngredientes">Estoque</th>
                            </tr>

                            <%
                                for(Ingredientes molho:getListMolho){
                            %>

                            <tr>
                                <td id="exibirIngredientes"><%=molho.getIdIngredientes()%></td>
                                <td id="exibirIngredientes"><%=molho.getDescricao()%></td>
                                <td id="exibirIngredientes"><%=molho.getPreco()%></td>
                                <td id="exibirIngredientes"><%=molho.getDtFabricacao()%></td>
                                <td id="exibirIngredientes"><%=molho.getDtValidade()%></td>
                                <td id="exibirIngredientes"><%=molho.getEstoque()%></td>
                            </tr>

                            <%
                                }
                            %>            
                        </table>
                        <br>

                    </center>
                    
                </div>

            </section>
        </main>
        
    </body>
</html>
