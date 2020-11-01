package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Lanche</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <center>\r\n");
      out.write("        <div>\r\n");
      out.write("            <form action=\"ServletLanche\" method=\"get\">\r\n");
      out.write("                Pão:\r\n");
      out.write("                <select name=\"pao\" id=\"pao\" required>\r\n");
      out.write("                    <option value=\"\">Selecione</option>\r\n");
      out.write("                    <option value=\"Pão Australiano\">Pão Australiano</option>\r\n");
      out.write("                    <option value=\"Pão Frances\">Pão Frances</option>                   \r\n");
      out.write("                </select>\r\n");
      out.write("                   \r\n");
      out.write("                Carne:\r\n");
      out.write("                <select name=\"carne\" id=\"carne\" required>\r\n");
      out.write("                    <option value=\"\">Selecione</option>\r\n");
      out.write("                    <option value=\"Linguiça\">Linguiça</option>\r\n");
      out.write("                    <option value=\"Hamburguer\">Hamburguer</option>                   \r\n");
      out.write("                </select>\r\n");
      out.write("                \r\n");
      out.write("                Salada:\r\n");
      out.write("                <select name=\"salada\" id=\"salada\">\r\n");
      out.write("                    <option value=\"\">Selecione</option>\r\n");
      out.write("                    <option value=\"Alface\">Alface</option>\r\n");
      out.write("                    <option value=\"Tomate\">Tomate</option>                   \r\n");
      out.write("                </select>\r\n");
      out.write("                \r\n");
      out.write("                Molho:\r\n");
      out.write("                <select name=\"molho\" id=\"molho\">\r\n");
      out.write("                    <option value=\"\">Selecione</option>\r\n");
      out.write("                    <option value=\"Maionese\">Maionese</option>\r\n");
      out.write("                    <option value=\"Molho da Casa\">Molho da Casa</option>                   \r\n");
      out.write("                </select><br><br>\r\n");
      out.write("                \r\n");
      out.write("                <table>\r\n");
      out.write("                    <td><input type=\"submit\" name=\"salvar\" value=\"Salvar\"></td>\r\n");
      out.write("                    <td><input type=\"submit\" name=\"cancelar\" value=\"Cancelar\"></td>\r\n");
      out.write("                </table>           \r\n");
      out.write("            </form> \r\n");
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
