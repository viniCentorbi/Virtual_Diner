package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import entidade.Ingredientes;
import javax.swing.JOptionPane;
import dao.IngredientesDao;
import java.math.BigDecimal;
import java.util.Calendar;
import dao.LancheDao;
import dao.PedidoDao;
import entidade.Pedido;
import entidade.PedidoPK;
import entidade.Login;
import entidade.Lanche;

public final class pedidoCliente_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"menu.css\">\r\n");
      out.write("        <title>Pedido</title>\r\n");
      out.write("        \r\n");
      out.write("        <style>\r\n");
      out.write("        table {\r\n");
      out.write("          font-family: arial, sans-serif;\r\n");
      out.write("          border-collapse: collapse;\r\n");
      out.write("          width: 70%;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        td, th {\r\n");
      out.write("          border: 1px solid #dddddd;\r\n");
      out.write("          text-align: left;\r\n");
      out.write("          padding: 8px;\r\n");
      out.write("          width: 100%;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        tr:nth-child(even) {\r\n");
      out.write("          background-color: #dddddd;\r\n");
      out.write("        }\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <center>\r\n");
      out.write("        <div class=\"pedidoCliente\">\r\n");
      out.write("            \r\n");
      out.write("            ");

                
                LancheDao l = new LancheDao();
                
                int ultLanche = l.listarLanche().size() - 1;
                
                int idLanche = l.listarLanche().get(ultLanche).getIdLanche();                
                                
                Ingredientes salada = l.buscarLancheId(idLanche).getIdSalada();
                Ingredientes molho = l.buscarLancheId(idLanche).getIdMolho();
                
                // Exibir o pedido do Cliente ---------------------------------------------------------------------                
                String pao = l.buscarLancheId(idLanche).getIdPao().getDescricao();
                String carne = l.buscarLancheId(idLanche).getIdCarne().getDescricao();
                String  molhoDesc = "Nenhum molho selecionado";
                String saladaDesc = "Nenhuma salada selecionada";
                
                
                BigDecimal precoPao = l.listarLanche().get(ultLanche).getIdPao().getPreco();
                BigDecimal precoCarne = l.listarLanche().get(ultLanche).getIdCarne().getPreco();
                
                BigDecimal precoPedido = precoPao.add(precoCarne);
                
                BigDecimal precoTotal = null;
                
                if(molho == null && salada == null){
                    precoTotal = precoPedido;
                }                
                if(molho != null){
                    BigDecimal precoMolho = l.listarLanche().get(ultLanche).getIdMolho().getPreco();
                    precoTotal = precoPedido.add(precoMolho);
                    molhoDesc = l.buscarLancheId(idLanche).getIdMolho().getDescricao();
                }
                if(salada != null){
                    BigDecimal precoSalada = l.listarLanche().get(ultLanche).getIdSalada().getPreco();
                    precoTotal = precoPedido.add(precoSalada);
                    saladaDesc = l.buscarLancheId(idLanche).getIdSalada().getDescricao();
                } 
                //------------------------------------------------------------------------------------------------- 

            
      out.write("\r\n");
      out.write("                \r\n");
      out.write("            <h1>Seu Pedido</h1>\r\n");
      out.write("            \r\n");
      out.write("                            \r\n");
      out.write("            <table>\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <th>Pão</th>\r\n");
      out.write("                  <th>Carne</th>\r\n");
      out.write("                  <th>Salada</th>\r\n");
      out.write("                  <th>Molho</th>\r\n");
      out.write("                  <th>Preço Total</th>\r\n");
      out.write("                </tr>\r\n");
      out.write("          \r\n");
      out.write("          \r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>");
      out.print(pao);
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print(carne);
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print(saladaDesc);
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print(molhoDesc);
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print(precoTotal);
      out.write("</td>\r\n");
      out.write("                </tr>                         \r\n");
      out.write("          \r\n");
      out.write("            </table> \r\n");
      out.write("            \r\n");
      out.write("                <br>\r\n");
      out.write("                \r\n");
      out.write("                <form action=\"ServletPedido\" method=\"get\">\r\n");
      out.write("                    <button class=\"btnCad\" type=\"submit\" name=\"botao\" value=\"salvar\">Finalizar Pedido</button>\r\n");
      out.write("                    <button class=\"btnCad\" type=\"submit\" name=\"botao\" value=\"excluir\">Cancelar Pedido</button>\r\n");
      out.write("                    \r\n");
      out.write("                </form>\r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("        </div>\r\n");
      out.write("        </center>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
