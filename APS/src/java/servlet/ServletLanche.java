/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import dao.LancheDao;
import entidade.Ingredientes;
import entidade.Lanche;
import static entidade.Lanche_.idCarne;
import static entidade.Lanche_.idMolho;
import static entidade.Lanche_.idPao;
import static entidade.Lanche_.idSalada;
import java.io.IOException;
import java.io.PrintWriter;
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
        
        int IdPao = Integer.parseInt(request.getParameter("pao"));
        int IdCarne = Integer.parseInt(request.getParameter("carne"));
        int IdSalada = Integer.parseInt(request.getParameter("salada"));
        int IdMolho = Integer.parseInt(request.getParameter("molho"));
  
        
        Lanche lanche = new Lanche();
        
       lanche.setIdPao((Ingredientes) idPao);
       lanche.setIdCarne((Ingredientes)idCarne);
       lanche.setIdSalada((Ingredientes) idSalada);
       lanche.setIdMolho((Ingredientes) idMolho);
       
       
        LancheDao lancheDao = new LancheDao();
        lancheDao.salvar(lanche);    
       
       
        
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
