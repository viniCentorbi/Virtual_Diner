/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import dao.IngredientesDao;
import entidade.Ingredientes;
import entidade.Conversor;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.Date;
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
        
        
        
        /*
        Primeiro pega os dados do form, instancia um objeto ingrediente, depois instancia um novo objeto
        com os dados do ingrediente para converter o necessário. Porém não está funcionando.
        */
        
        Conversor conversor = new Conversor();
        
        //Pegando dados do Form
        String descricao = request.getParameter("descricao");
        BigDecimal preco = new BigDecimal(request.getParameter("preco"));
        Date dt_fab = conversor.StringToDate(request.getParameter("dt_fabricacao"));
        Date dt_val = conversor.StringToDate(request.getParameter("dt_validade"));
        int estoque = Integer.parseInt(request.getParameter("estoque"));

        //Salvando os dados no ingrediente
        Ingredientes ingredientes = new Ingredientes();

        ingredientes.setDescricao(descricao);         
        ingredientes.setPreco(preco);        
        ingredientes.setDtFabricacao(dt_fab);
        ingredientes.setDtValidade(dt_val);        
        ingredientes.setEstoque(estoque);

        //Convertendo o que precisa converte
        Ingredientes ingredientesFormat = new Ingredientes();

        ingredientesFormat.setDescricao(ingredientes.getDescricao());
        ingredientesFormat.setPreco(ingredientes.getPreco());      
        
        //java.sql.Date sqlDt_fab = new java.sql.Date(dt_fab.getTime());
        //java.sql.Date sqlDt_val = new java.sql.Date(dt_val.getTime());
        
        Date teste1 = conversor.StringToDate("Mon Nov 23 00:00:00 BRST 2015");
        Date teste2 = conversor.StringToDate("Mon Nov 23 00:00:00 BRST 2015");
        
        //ingredientesFormat.setDtFabricacao(teste1.getTime());
        //ingredientesFormat.setDtValidade(teste2.getTime()); 
        
        ingredientesFormat.setEstoque(ingredientes.getEstoque());

        //Salvando no Banco
        IngredientesDao ingredientesDao = new IngredientesDao();   
        ingredientesDao.salvar(ingredientesFormat);       
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletIngredientes</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletIngredientes at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
