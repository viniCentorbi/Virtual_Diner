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
import java.io.IOException;
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
        
        //Pegando os dados do Form
        String tipoPao = request.getParameter("pao");
        String tipoCarne = request.getParameter("carne");
        String tipoSalada = request.getParameter("salada");
        String tipoMolho = request.getParameter("molho");
        
        //Instaciando o ingredientes que serão salvos no Lanche
        Ingredientes IdPao = null;
        Ingredientes IdCarne = null;
        Ingredientes IdSalada = null;
        Ingredientes IdMolho = null;
        
        //--------------------------------------------------------
        LancheDao ld = new LancheDao();        
        Lanche l = new Lanche();
        IngredientesDao ingDao = new IngredientesDao();
        
        //Instaciando os ingredientes
        Ingredientes pao = new Ingredientes();
        Ingredientes carne = new Ingredientes();
        Ingredientes salada = new Ingredientes();
        Ingredientes molho = new Ingredientes();
        
        int tam = ingDao.listarIngredientes().size();
        
        //Buscando os ingredientes escolhidos pelo cliente no banco
        for (int i = 0; i < tam; i++) {
            
            if(tipoPao.equals(ingDao.listarIngredientes().get(i).getDescricao())){
                
                pao.setIdIngredientes(ingDao.listarIngredientes().get(i).getIdIngredientes());
                IdPao = pao;
                pao = ingDao.buscarIngredienteId(pao.getIdIngredientes());
                
            }
            if(tipoCarne.equals(ingDao.listarIngredientes().get(i).getDescricao())){
                
                carne.setIdIngredientes(ingDao.listarIngredientes().get(i).getIdIngredientes());
                IdCarne = carne;
                //Salvando o ingrediente escolhido no objeto
                carne = ingDao.buscarIngredienteId(carne.getIdIngredientes());
                
            }
            if(tipoSalada.equals(ingDao.listarIngredientes().get(i).getDescricao())){
                
                salada.setIdIngredientes(ingDao.listarIngredientes().get(i).getIdIngredientes());
                IdSalada = salada;
                
                //Salvando o ingrediente escolhido no objeto
                salada = ingDao.buscarIngredienteId(salada.getIdIngredientes());
                
                //Diminuindo o estoque do ingrediente
                salada.setEstoque(salada.getEstoque()-1);
                
                //Alterando o estoque do ingrediente no banco
                ingDao.alterar(salada);
                
            }else if(tipoSalada.equals("Selecione")){
                IdSalada = null;
            }
            
            if(tipoMolho.equals(ingDao.listarIngredientes().get(i).getDescricao())){
                
                molho.setIdIngredientes(ingDao.listarIngredientes().get(i).getIdIngredientes());
                IdMolho = molho;  
                
                //Salvando o ingrediente escolhido no objeto
                molho = ingDao.buscarIngredienteId(molho.getIdIngredientes());
                
                //Diminuindo o estoque do ingrediente
                molho.setEstoque(molho.getEstoque()-1);
                
                //Alterando o estoque do ingrediente no banco
                ingDao.alterar(molho);
                
            }else if(tipoMolho.equals("Selecione")){
                IdMolho = null;
            }         
        }
        //Salvando os ingredientes no lanche
        l.setIdPao(IdPao);
        l.setIdCarne(IdCarne);
        l.setIdSalada(IdSalada);
        l.setIdMolho(IdMolho);
        
        //Salvando o lanche no banco
        ld.salvar(l);
        
        //Diminuindo o estoque dos ingredientes
        pao.setEstoque(pao.getEstoque()-1);
        carne.setEstoque(carne.getEstoque()-1);
                
        
        //Alterando o estoque dos ingredientes no banco
        ingDao.alterar(pao);
        ingDao.alterar(carne);
        
        RequestDispatcher rd = null;
        rd = request.getRequestDispatcher("/pedidoCliente.jsp");
        rd.forward(request, response);
        
        
        
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
