/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import dao.IngredientesDao;
import entidade.Ingredientes;
import java.io.IOException;
import java.math.BigDecimal;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author USER
 */
@WebServlet(name = "ServletIngredientes", urlPatterns = {"/ServletIngredientes"})
public class ServletIngredientes extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       
        String valorButton = request.getParameter("botao"); 
        
        IngredientesDao ingredientesDao = new IngredientesDao(); 
        
        
        //Pegando dados do Form
        
        String descricao = request.getParameter("descricao");
        BigDecimal preco = new BigDecimal(request.getParameter("preco"));
        String dt_fab = request.getParameter("dt_fabricacao");
        String dt_val = request.getParameter("dt_validade");
        int estoque = Integer.parseInt(request.getParameter("estoque"));
        String tipo = request.getParameter("tipo");
        
       
        Ingredientes ingProcurado = new Ingredientes();
        
        
        if(valorButton.equals("salvar")){
            
            Ingredientes ingredientesSalvar = new Ingredientes();
            //Salvando os dados no ingrediente
            ingredientesSalvar.setDescricao(descricao);         
            ingredientesSalvar.setPreco(preco);        
            ingredientesSalvar.setDtFabricacao(dt_fab);
            ingredientesSalvar.setDtValidade(dt_val);         
            ingredientesSalvar.setEstoque(estoque);
            ingredientesSalvar.setTipo(tipo);
            
            //Salvando no Banco              
            ingredientesDao.salvar(ingredientesSalvar);
            
            request.setAttribute("mensagemCadastroSucesso", "Ingrediente salvo com sucesso!");
                
            RequestDispatcher rd = null;
            rd = request.getRequestDispatcher("/ingredientes.jsp");
            rd.forward(request, response);
            
        }else if (valorButton.equals("alterar")){
            int idIngrediente = Integer.parseInt(request.getParameter("idIngrediente"));
            ingProcurado = ingredientesDao.buscarIngredienteId(idIngrediente);
            
            if(ingProcurado != null){            
                
                Ingredientes ingredientesAlterar = ingProcurado;
                //Salvando os dados no ingrediente                  
                ingredientesAlterar.setPreco(preco);       
                ingredientesAlterar.setEstoque(estoque);            

                //Alterando no Banco  
                ingredientesDao.alterar(ingredientesAlterar);
                
                request.setAttribute("mensagemSucesso", "Ingrediente alterado com sucesso!");
                
                RequestDispatcher rd = null;
                rd = request.getRequestDispatcher("/exibirIngredientes.jsp");
                rd.forward(request, response);

            }else{
                request.setAttribute("mensagemErro", "Ingrediente não encontrado!");
                RequestDispatcher rd = null;
                rd = request.getRequestDispatcher("/exibirIngredientes.jsp");
                rd.forward(request, response);
            }
            
        }else if (valorButton.equals("excluir")){
            int idIngrediente = Integer.parseInt(request.getParameter("idIngrediente"));
            ingProcurado = ingredientesDao.buscarIngredienteId(idIngrediente);
            
            if(ingProcurado != null){             
                Ingredientes ingredientesInativo = ingProcurado;
                //Salvando os dados no ingrediente                  
                ingredientesInativo.setEstoque(0);
                //Alterando no Banco  
                ingredientesDao.alterar(ingredientesInativo);

                request.setAttribute("mensagemSucesso", "Ingrediente excluido com sucesso!");
                
                RequestDispatcher rd = null;
                rd = request.getRequestDispatcher("/exibirIngredientes.jsp");
                rd.forward(request, response);
            }else{
                request.setAttribute("mensagemErro", "Ingrediente não encontrado!");
                
                RequestDispatcher rd = null;
                rd = request.getRequestDispatcher("/exibirIngredientes.jsp");
                rd.forward(request, response);
            }
            
        }else{
            
            RequestDispatcher rd = null;
            rd = request.getRequestDispatcher("/homeAdm.jsp");
            rd.forward(request, response);
            
        }

             
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
