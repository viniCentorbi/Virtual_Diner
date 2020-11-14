
package servlet;

import dao.PedidoDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ServletRelatorio", urlPatterns = {"/ServletRelatorio"})
public class ServletRelatorio extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ParseException {
        response.setContentType("text/html;charset=UTF-8");
        
        
        String horaInicio = request.getParameter("horaInicio");
        String horaTermino = request.getParameter("horaTermino");
        
        //Formatador
        SimpleDateFormat formatador = new SimpleDateFormat("HH:mm");
        
        //Hora inicio do pedido do Cliente         
        Date dataInico = formatador.parse(horaInicio);
        Time timeInicio = new Time(dataInico.getTime());
        
        //Hora término do pedido do Cliente         
        Date dataTermino = formatador.parse(horaTermino);
        Time timeTermino = new Time(dataTermino.getTime());
        
        //Hora dos pedidos do banco         
        Date dataPedido = null;
        Time timePedido = null;
        
        PedidoDao pDao = new PedidoDao();
        
        int tam = pDao.listarPedidos().size();
        int qtdPedido = 0;
        
        for (int i = 0; i < tam; i++) {
                    
            dataPedido = formatador.parse(pDao.listarPedidos().get(i).getDtHoraPedido());
            timePedido = new Time(dataPedido.getTime());

            if(timePedido.after(timeInicio) && timePedido.before(timeTermino)){
                qtdPedido++; 
            }
        }
        
        String strQtdPedido = String.valueOf(qtdPedido);
        
        request.setAttribute("IntervaloTempo", horaInicio+" - "+horaTermino);
        request.setAttribute("qtdPedidos", strQtdPedido);
        
        RequestDispatcher rd = null;
        rd = request.getRequestDispatcher("/relatorio.jsp");
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
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(ServletRelatorio.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(ServletRelatorio.class.getName()).log(Level.SEVERE, null, ex);
        }
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
