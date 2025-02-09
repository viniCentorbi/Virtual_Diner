package servlet;

import dao.ClienteDao;
import entidade.Cliente;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "ServletLogin", urlPatterns = {"/ServletLogin"})
public class ServletLogin extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        
        String formUsuario = request.getParameter("usuario");
        String formSenha = request.getParameter("senha");                
        
        ClienteDao cd = new ClienteDao();
                
        int tam = cd.listarCliente().size();
        int idUsuario = 0;
        boolean userExist = true;
        
        for (int i = 0; i < tam; i++) {
            
            if(formUsuario.equals(cd.listarCliente().get(i).getUsuario())){
                idUsuario = cd.listarCliente().get(i).getIdUsuario();
                userExist = true;
                break;
            }else{
                userExist = false;
            }
        }
        
        RequestDispatcher rd = null;
        
        if(userExist){
            
           Cliente c = cd.buscarClienteId(idUsuario);

            if(formUsuario.equals(c.getUsuario()) && formSenha.equals(c.getSenha())){

                if(c.getFgAtivo() == true){              
                    rd = request.getRequestDispatcher("/homeCliente.jsp");
                    rd.forward(request, response);
                }else{
                    rd = request.getRequestDispatcher("/homeAdm.jsp");
                    rd.forward(request, response);
                }  

                HttpSession session = request.getSession();            

                session.setAttribute("idUsuario", c.getIdUsuario());
                session.setAttribute("usuario", formUsuario);
                session.setAttribute("senha", formSenha);


            }else{  
                
                request.setAttribute("mensagem", "Usuário e/ou senha inválido!");
                
                rd = request.getRequestDispatcher("/login.jsp");
                rd.forward(request, response);
            } 
            
        }else{
            request.setAttribute("mensagem", "Usuário não encontrado!");
            rd = request.getRequestDispatcher("/login.jsp");
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
