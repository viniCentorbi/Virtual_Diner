<%@page import="entidade.Ingredientes"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="dao.IngredientesDao"%>
<%@page import="dao.LancheDao"%>
<%@page import="entidade.Lanche"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="menu.css">
        <link rel="stylesheet" type="text/css" href="style.css">
        
        <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css">
            
        <title>Lanche</title>
               
    </head>
    <body>
        
        <%
                IngredientesDao i = new IngredientesDao();
                
                List<Ingredientes> getListPao = i.listarPaes();
                List<Ingredientes> getListCarne = i.listarCarnes();
                List<Ingredientes> getListSalada = i.listarSaladas();
                List<Ingredientes> getListMolho = i.listarMolhos();
        %>        
        
        
        
        <main>
            <aside>
                <ul class="asideList">
                  <li><a href="homeCliente.jsp" class="asideAnchor">Inicio</a></li>
                  <li><a href="lanche.jsp" class="asideAnchor">Montar Lanche</a></li>
                            <ul style="margin-top: 110%;" class="brunodatrabalho2">
                  <li><a  href="login.jsp" class="asideAnchor">Logout</a></li>            
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
                
                
                
                <div class="box">       
                   <h1 class="titulo">Monte seu Lanche</h1>
                    <form action="ServletLanche" method="get" class="formLanche">
                        
                        

                        <select name="pao" id="pao" required>

                            <option value="">Pão</option>
                            <%
                                for(Ingredientes ingredientes:getListPao){ 

                            %>
                                <option value="<%=ingredientes.getDescricao()%>"><%=ingredientes.getDescricao()%></option>

                            <%
                                }
                            %>

                        </select>


                        <select name="carne" id="carne" required>
                            <option value="">Carne</option>
                            <%
                                for(Ingredientes ingredientes:getListCarne){ 

                            %>
                                <option value="<%=ingredientes.getDescricao()%>"><%=ingredientes.getDescricao()%></option>

                            <%
                                }
                            %>                  
                        </select>


                        <select name="salada" id="salada">
                            <option value="">Salada (opcional)</option>
                            <%
                                for(Ingredientes ingredientes:getListSalada){ 

                            %>
                                <option value="<%=ingredientes.getDescricao()%>"><%=ingredientes.getDescricao()%></option>

                            <%
                                }
                            %>                   
                        </select>


                        <select name="molho" id="molho">
                            <option value="">Molho (opcional)</option>
                            <%
                                for(Ingredientes ingredientes:getListMolho){ 

                            %>
                                <option value="<%=ingredientes.getDescricao()%>"><%=ingredientes.getDescricao()%></option>

                            <%
                                }
                            %>                   
                        </select><br><br>


                        <center>
                            <table> 
                            
                                <td><button class="cancel" type="submit" name="botao" value="cancelar">Cancelar pedido</button></td>
                                <td><button class="confirm" type="submit" name="botao" value="confirmar">Adicionar pedido</button></td>
                                                        
                            </table> 
                        </center>
                    </form>
                </div>
                
                
                
            </div>

          </section>
        </main>
            
            
    
                
    </body>
</html>
