package servlet;


import dao.ClienteDao;
import entidade.Cliente;
import entidade.Endereco;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ServletClientes", urlPatterns = {"/ServletClientes"})
public class ServletCadastroCliente extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        Cliente cliente = new Cliente();
        ClienteDao clienteDao = new ClienteDao();
        
        String usuario = request.getParameter("usuario");
        String senha = request.getParameter("senha");
        String nome = request.getParameter("nome");
        String sobrenome = request.getParameter("sobrenome");
        String cpf = request.getParameter("cpf");
        
        int tam = clienteDao.listarCliente().size();
        
        
        for (int i = 0; i < tam; i++) {
            if(usuario.equals(clienteDao.listarCliente().get(i).getUsuario())){
                //Exibir algum tipo de mensagem
                
                try (PrintWriter out = response.getWriter()) { // Alternativa provisória
            
                    out.println("<!DOCTYPE html>");
                    out.println("<html>");
                    out.println("<head>");
                    out.println("<title>Mensagem de Erro</title>");            
                    out.println("</head>");
                    out.println("<body>");
                    out.println("<h1>Usuário já existe</h1>");
                    out.println("</body>");
                    out.println("</html>");
                }
            }
        }
        
        cliente.setUsuario(usuario);
        cliente.setSenha(senha);
        cliente.setNome(nome);
        cliente.setSobrenome(sobrenome);
        cliente.setCpf(cpf);
        cliente.setFgAtivo(true);
        
        Endereco endereco = new Endereco(request.getParameter("rua"), 
                                        Integer.parseInt(request.getParameter("numero")),
                                        request.getParameter("cep"));
        
        
        cliente.setEndereco(endereco);  

        clienteDao.salvar(cliente);
        
        RequestDispatcher rd = null;
        rd = request.getRequestDispatcher("/login.jsp");
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
