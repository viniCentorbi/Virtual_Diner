package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import entidade.Ingredientes;
import java.util.ArrayList;
import java.util.List;
import dao.IngredientesDao;
import dao.LancheDao;
import entidade.Lanche;

public final class lanche_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"menu.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">\r\n");
      out.write("        \r\n");
      out.write("        <link rel=\"stylesheet\" href=\"//netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css\">\r\n");
      out.write("            \r\n");
      out.write("        <title>Lanche</title>\r\n");
      out.write("               \r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        \r\n");
      out.write("        ");

                IngredientesDao i = new IngredientesDao();
                
                List<Ingredientes> getListPao = i.listarPaes();
                List<Ingredientes> getListCarne = i.listarCarnes();
                List<Ingredientes> getListSalada = i.listarSaladas();
                List<Ingredientes> getListMolho = i.listarMolhos();
        
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <main>\r\n");
      out.write("            <aside>\r\n");
      out.write("                <ul class=\"asideList\">\r\n");
      out.write("                  <li><a href=\"homeCliente.jsp\" class=\"asideAnchor\">Inicio</a></li>\r\n");
      out.write("                  <li><a href=\"lanche.jsp\" class=\"asideAnchor\">Montar Lanche</a></li>\r\n");
      out.write("                            <ul style=\"margin-top: 110%;\" class=\"brunodatrabalho2\">\r\n");
      out.write("                  <li><a  href=\"login.jsp\" class=\"asideAnchor\">Logout</a></li>            \r\n");
      out.write("                      </ul>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </aside>\r\n");
      out.write("                 \r\n");
      out.write("        <section>\r\n");
      out.write("            <input type=\"checkbox\" id=\"myInput\">\r\n");
      out.write("            \r\n");
      out.write("            <label for=\"myInput\">\r\n");
      out.write("              <span class=\"bar top\"></span>\r\n");
      out.write("              <span class=\"bar middle\"></span>\r\n");
      out.write("              <span class=\"bar bottom\"></span>\r\n");
      out.write("            </label>\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            <div class=\"content\">                \r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("                <div class=\"box\">       \r\n");
      out.write("                   <h1 class=\"titulo\">Monte seu Lanche</h1>\r\n");
      out.write("                    <form action=\"ServletLanche\" method=\"get\" class=\"formLanche\">\r\n");
      out.write("                        \r\n");
      out.write("                        \r\n");
      out.write("\r\n");
      out.write("                        <select name=\"pao\" id=\"pao\" required>\r\n");
      out.write("\r\n");
      out.write("                            <option value=\"\">Pão</option>\r\n");
      out.write("                            ");

                                for(Ingredientes ingredientes:getListPao){ 

                            
      out.write("\r\n");
      out.write("                                <option value=\"");
      out.print(ingredientes.getDescricao());
      out.write('"');
      out.write('>');
      out.print(ingredientes.getDescricao());
      out.write("</option>\r\n");
      out.write("\r\n");
      out.write("                            ");

                                }
                            
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        </select>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        <select name=\"carne\" id=\"carne\" required>\r\n");
      out.write("                            <option value=\"\">Carne</option>\r\n");
      out.write("                            ");

                                for(Ingredientes ingredientes:getListCarne){ 

                            
      out.write("\r\n");
      out.write("                                <option value=\"");
      out.print(ingredientes.getDescricao());
      out.write('"');
      out.write('>');
      out.print(ingredientes.getDescricao());
      out.write("</option>\r\n");
      out.write("\r\n");
      out.write("                            ");

                                }
                            
      out.write("                  \r\n");
      out.write("                        </select>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        <select name=\"salada\" id=\"salada\">\r\n");
      out.write("                            <option value=\"\">Salada (opcional)</option>\r\n");
      out.write("                            ");

                                for(Ingredientes ingredientes:getListSalada){ 

                            
      out.write("\r\n");
      out.write("                                <option value=\"");
      out.print(ingredientes.getDescricao());
      out.write('"');
      out.write('>');
      out.print(ingredientes.getDescricao());
      out.write("</option>\r\n");
      out.write("\r\n");
      out.write("                            ");

                                }
                            
      out.write("                   \r\n");
      out.write("                        </select>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        <select name=\"molho\" id=\"molho\">\r\n");
      out.write("                            <option value=\"\">Molho (opcional)</option>\r\n");
      out.write("                            ");

                                for(Ingredientes ingredientes:getListMolho){ 

                            
      out.write("\r\n");
      out.write("                                <option value=\"");
      out.print(ingredientes.getDescricao());
      out.write('"');
      out.write('>');
      out.print(ingredientes.getDescricao());
      out.write("</option>\r\n");
      out.write("\r\n");
      out.write("                            ");

                                }
                            
      out.write("                   \r\n");
      out.write("                        </select><br><br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        <center>\r\n");
      out.write("                            <table> \r\n");
      out.write("                            \r\n");
      out.write("                                <td><button class=\"cancel\" type=\"submit\" name=\"botao\" value=\"cancelar\">Cancelar pedido</button></td>\r\n");
      out.write("                                <td><button class=\"confirm\" type=\"submit\" name=\"botao\" value=\"confirmar\">Adicionar pedido</button></td>\r\n");
      out.write("                                                        \r\n");
      out.write("                            </table> \r\n");
      out.write("                        </center>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("          </section>\r\n");
      out.write("        </main>\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("    \r\n");
      out.write("                \r\n");
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
