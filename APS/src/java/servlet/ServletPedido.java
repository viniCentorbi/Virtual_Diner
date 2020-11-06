/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import dao.PedidoDao;
import dao.LancheDao;
import entidade.Ingredientes;
import entidade.Pedido;
import entidade.PedidoPK;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Calendar;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author USER
 */
@WebServlet(name = "ServletPedido", urlPatterns = {"/ServletPedido"})
public class ServletPedido extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        
        String valorButton = request.getParameter("botao");        
        
        RequestDispatcher rd = null;
        
        if(valorButton.equals("salvar")){
                
            Pedido p = new Pedido(); 

            PedidoDao pDao = new PedidoDao();

            LancheDao l = new LancheDao();
            
            

            HttpSession session = request.getSession(false);        

            // Salvar o pedido ---------------------------------------------------------------------------------

            String strIdUsuario = String.valueOf(session.getAttribute("idUsuario"));                
            int idUsuario = Integer.parseInt(strIdUsuario);

            int ultLanche = l.listarLanche().size() - 1;

            int idLanche = l.listarLanche().get(ultLanche).getIdLanche();
            
            Ingredientes salada = l.buscarLancheId(idLanche).getIdSalada();
            Ingredientes molho = l.buscarLancheId(idLanche).getIdMolho();
            

            PedidoPK pk = new PedidoPK();
            pk.setIdLanche(idLanche);
            pk.setIdUsuario(idUsuario);                
            
            
            BigDecimal precoPao = l.listarLanche().get(ultLanche).getIdPao().getPreco();
            BigDecimal precoCarne = l.listarLanche().get(ultLanche).getIdCarne().getPreco();
            
            BigDecimal precoPedido = precoPao.add(precoCarne);
            BigDecimal precoTotal = null;
            
            if(molho != null){
                BigDecimal precoMolho = l.listarLanche().get(ultLanche).getIdMolho().getPreco();
                precoTotal = precoPedido.add(precoMolho);
            }
            if(salada != null){
                BigDecimal precoSalada = l.listarLanche().get(ultLanche).getIdSalada().getPreco();
                precoTotal = precoPedido.add(precoSalada);
            }

            Calendar data = Calendar.getInstance();
            int horas = data.get(Calendar.HOUR_OF_DAY);
            int minutos = data.get(Calendar.MINUTE);

            String strHora = String.valueOf(horas);
            String strMinuto = String.valueOf(minutos);

            p.setDtHoraPedido(strHora+":"+strMinuto);
            p.setPedidoPK(pk);
            p.setPrecoPedido(precoTotal);             

            pDao.salvar(p);
            
            rd = request.getRequestDispatcher("/index.jsp");
            rd.forward(request, response);
        
        }else{
            
            rd = request.getRequestDispatcher("/lanche.jsp");
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
