<%-- 
    Document   : lanche
    Created on : 29/10/2020, 10:05:59
    Author     : USER
--%>

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
        <title>Lanche</title>
    </head>
    <body>
        <center>
        <div>
            
            <%
                IngredientesDao i = new IngredientesDao();
                
                List<Ingredientes> getListPao = i.listarPaes();
                List<Ingredientes> getListCarne = i.listarCarnes();
                List<Ingredientes> getListSalada = i.listarSaladas();
                List<Ingredientes> getListMolho = i.listarMolhos();
            %>
                
            <form action="ServletLanche" method="get">
                                
                Pão:
                <select name="pao" id="pao" required>
                    <option value="">Selecione</option>
                    <%
                        for(Ingredientes ingredientes:getListPao){ 
                            
                    %>
                        <option value="<%=ingredientes.getDescricao()%>"><%=ingredientes.getDescricao()%></option>
                        
                    <%
                        }
                    %>
                                    
                </select>
                   
                Carne:
                <select name="carne" id="carne" required>
                    <option value="">Selecione</option>
                    <%
                        for(Ingredientes ingredientes:getListCarne){ 
                            
                    %>
                        <option value="<%=ingredientes.getDescricao()%>"><%=ingredientes.getDescricao()%></option>
                        
                    <%
                        }
                    %>                  
                </select>
                
                Salada:
                <select name="salada" id="salada">
                    <option value="">Selecione</option>
                    <%
                        for(Ingredientes ingredientes:getListSalada){ 
                            
                    %>
                        <option value="<%=ingredientes.getDescricao()%>"><%=ingredientes.getDescricao()%></option>
                        
                    <%
                        }
                    %>                   
                </select>
                
                Molho:
                <select name="molho" id="molho">
                    <option value="">Selecione</option>
                    <%
                        for(Ingredientes ingredientes:getListMolho){ 
                            
                    %>
                        <option value="<%=ingredientes.getDescricao()%>"><%=ingredientes.getDescricao()%></option>
                        
                    <%
                        }
                    %>                   
                </select><br><br>
                
                
                
                <table>
                    <td><input type="submit" name="salvar" value="Adicionar ao pedido"></td>
                    <td><input type="submit" name="cancelar" value="Cancelar"></td>
                </table>           
            </form> 
        </div>
        </center>
    </body>
</html>
