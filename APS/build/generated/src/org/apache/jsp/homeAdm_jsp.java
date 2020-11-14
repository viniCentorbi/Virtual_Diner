package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import dao.PedidoDao;
import entidade.Pedido;

public final class homeAdm_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"menu.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">\n");
      out.write("        <link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"logo.ico\">\n");
      out.write("        \n");
      out.write("        <title>Home Administrador</title>\n");
      out.write("        <style>\n");
      out.write("        table {\n");
      out.write("            font-family: arial, sans-serif;\n");
      out.write("            border-collapse: collapse;\n");
      out.write("            width: 80%;\n");
      out.write("            border: 1px solid black;\n");
      out.write("        }\n");
      out.write("        th{\n");
      out.write("            background-color: #ed7801;\n");
      out.write("            border: 1px solid black;\n");
      out.write("            text-align: left;\n");
      out.write("            padding: 8px;\n");
      out.write("        }\n");
      out.write("        td{\n");
      out.write("           border: 1px solid black;\n");
      out.write("           text-align: left;\n");
      out.write("           padding: 8px;\n");
      out.write("           background-color: rgba(255,255,255, 0.5);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        tr:nth-child(even) {\n");
      out.write("          background-color: gray;\n");
      out.write("        }\n");
      out.write("        h2{\n");
      out.write("            font-weight: bolder;\n");
      out.write("        }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            PedidoDao p = new PedidoDao();

            List<Pedido> getListPedido = p.listarPedidos();

        
      out.write("\n");
      out.write("        \n");
      out.write("        <main>\n");
      out.write("            <aside>\n");
      out.write("                <ul class=\"asideList\">\n");
      out.write("                    <li><a href=\"pedidoAdm.jsp\" class=\"asideAnchor\">Inicio</a></li>\n");
      out.write("                    <li><a href=\"relatorio.jsp\" class=\"asideAnchor\">Relatório</a></li>                  \n");
      out.write("                    <li class=\"asideAnchor2\">Ingredientes</li>\n");
      out.write("                    <ul class=\"brunodatrabalho\">\n");
      out.write("                        <li><a href=\"ingredientes.jsp\" class=\"asideAnchor\">Cadastrar</a></li>\n");
      out.write("                        <li><a href=\"exibirIngredientes.jsp\" class=\"asideAnchor\">Exibir</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                    <ul class=\"brunodatrabalho2\">\n");
      out.write("                        <li><a href=\"login.jsp\" class=\"asideAnchor\">Logout</a></li>            \n");
      out.write("                    </ul>\n");
      out.write("                </ul>\n");
      out.write("            </aside>\n");
      out.write("            <section>\n");
      out.write("                <input type=\"checkbox\" id=\"myInput\">\n");
      out.write("                <label for=\"myInput\">\n");
      out.write("                  <span class=\"bar top\"></span>\n");
      out.write("                  <span class=\"bar middle\"></span>\n");
      out.write("                  <span class=\"bar bottom\"></span>\n");
      out.write("                </label>\n");
      out.write("        \n");
      out.write("                <div class=\"content\">                    \n");
      out.write("                    \n");
      out.write("                    <center>\n");
      out.write("                        <div class=\"pedidoAdm\">\n");
      out.write("                            <h2>Pedidos</h2>\n");
      out.write("\n");
      out.write("                            <table>\n");
      out.write("                              <tr>\n");
      out.write("                                <th>ID Usuário</th>\n");
      out.write("                                <th>ID Lanche</th>\n");
      out.write("                                <th>Preço Total</th>\n");
      out.write("                                <th>Hora do Pedido</th>\n");
      out.write("                              </tr>\n");
      out.write("\n");
      out.write("                                ");

                                    for(Pedido pedidos:getListPedido){ 

                                
      out.write("\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>");
      out.print(pedidos.getPedidoPK().getIdUsuario());
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print(pedidos.getPedidoPK().getIdLanche());
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print(pedidos.getPrecoPedido());
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print(pedidos.getDtHoraPedido());
      out.write("</td>\n");
      out.write("                                </tr>\n");
      out.write("                                ");

                                    }
                                
      out.write("              \n");
      out.write("\n");
      out.write("\n");
      out.write("                            </table>\n");
      out.write("                        </div>\n");
      out.write("                    </center>       \n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("        </main>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("\n");
      out.write("    \n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
