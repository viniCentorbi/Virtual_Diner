package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ingredientes_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Ingredientes</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <center><div>\n");
      out.write("            <form action=\"ServletIngredientes\" method=\"get\">\n");
      out.write("                <table>\n");
      out.write("                    <td><input type=\"radio\" name=\"carne\">Carne</td>\n");
      out.write("                    <td><input type=\"radio\" name=\"pao\">Pão</td>\n");
      out.write("                    <td><input type=\"radio\" name=\"molho\">Molho</td>\n");
      out.write("                    <td><input type=\"radio\" name=\"salada\">Salada</td>\n");
      out.write("                </table>\n");
      out.write("                Descrição: <input type=\"text\" name=\"descricao\" autocomplete=\"off\"><br>\n");
      out.write("                Preço: <input type=\"text\" name=\"preco\" autocomplete=\"off\"><br>\n");
      out.write("                Data de Fabricação: <input type=\"date\" name=\"dt_fabricacao\" autocomplete=\"off\"><br>\n");
      out.write("                Data de Validade: <input type=\"date\" name=\"dt_validade\" autocomplete=\"off\"><br>\n");
      out.write("                Estoque: <input type=\"number\" name=\"estoque\" autocomplete=\"off\"><br>\n");
      out.write("                <table>\n");
      out.write("                    <td><input type=\"submit\" name=\"salvar\" value=\"Salvar\"></td>\n");
      out.write("                    <td><input type=\"submit\" name=\"cancelar\" value=\"Cancelar\"></td>\n");
      out.write("                </table>           \n");
      out.write("            </form> \n");
      out.write("        </div></center>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("<a href=\"../../../../../../Program Files/Apache Software Foundation/Tomcat 9.0/conf/web.xml\"></a>");
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
