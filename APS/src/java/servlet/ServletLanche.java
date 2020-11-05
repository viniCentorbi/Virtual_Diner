/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import dao.IngredientesDao;
import dao.LancheDao;
import entidade.Ingredientes;
import entidade.Lanche;
import entidade.Login;
import entidade.Pedido;
import entidade.PedidoPK;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "ServletLanche", urlPatterns = {"/ServletLanche"})
public class ServletLanche extends HttpServlet {

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
                
        String tipoPao = request.getParameter("pao");
        String tipoCarne = request.getParameter("carne");
        String tipoSalada = request.getParameter("salada");
        String tipoMolho = request.getParameter("molho");
        
        Ingredientes IdPao = null;
        Ingredientes IdCarne = null;
        Ingredientes IdSalada = null;
        Ingredientes IdMolho = null;
        
        LancheDao ld = new LancheDao();        
        Lanche l = new Lanche();
        IngredientesDao ingDao = new IngredientesDao();
        
        Ingredientes pao = new Ingredientes();
        Ingredientes carne = new Ingredientes();
        Ingredientes salada = new Ingredientes();
        Ingredientes molho = new Ingredientes();
        
        int tam = ingDao.listarIngredientes().size();
        
        for (int i = 0; i < tam; i++) {
            
            if(tipoPao.equals(ingDao.listarIngredientes().get(i).getDescricao())){
                
                pao.setIdIngredientes(ingDao.listarIngredientes().get(i).getIdIngredientes());
                IdPao = pao;
                
            }
            if(tipoCarne.equals(ingDao.listarIngredientes().get(i).getDescricao())){
                
                carne.setIdIngredientes(ingDao.listarIngredientes().get(i).getIdIngredientes());
                IdCarne = carne;
                
            }
            if(tipoSalada.equals(ingDao.listarIngredientes().get(i).getDescricao())){
                
                salada.setIdIngredientes(ingDao.listarIngredientes().get(i).getIdIngredientes());
                IdSalada = salada;
                
            }
            if(tipoMolho.equals(ingDao.listarIngredientes().get(i).getDescricao())){
                
                molho.setIdIngredientes(ingDao.listarIngredientes().get(i).getIdIngredientes());
                IdMolho = molho;
                
            }            
        }
        
        l.setIdPao(IdPao);
        l.setIdCarne(IdCarne);
        l.setIdSalada(IdSalada);
        l.setIdMolho(IdMolho);
       
        ld.salvar(l);
        
        RequestDispatcher rd = null;
        rd = request.getRequestDispatcher("/pedidoCliente.jsp");
        rd.forward(request, response);
        
        
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletLanche</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletLanche at " + request.getContextPath() + "</h1>");
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
