package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("        <head>\n");
      out.write("            <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("            <title>Página Indefinida</title>\n");
      out.write("            <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">      \n");
      out.write("        </head>\n");
      out.write("    <body>\n");
      out.write("        <main>\n");
      out.write("  <aside>\n");
      out.write("    <ul class=\"asideList\">\n");
      out.write("      <li><a href=\"\" class=\"asideAnchor\">Inicio</a></li>\n");
      out.write("      <li><a href=\"pedidoAdm.jsp\" class=\"asideAnchor\">Pedidos</a></li>\n");
      out.write("      <li><a href=\"\" class=\"asideAnchor\">Ajuda</a></li>\n");
      out.write("      <li><a href=\"login.jsp\" class=\"asideAnchor\">Logout</a></li>\n");
      out.write("    </ul>\n");
      out.write("  </aside>\n");
      out.write("  <section>\n");
      out.write("    <input type=\"checkbox\" id=\"myInput\">\n");
      out.write("    <label for=\"myInput\">\n");
      out.write("      <span class=\"bar top\"></span>\n");
      out.write("      <span class=\"bar middle\"></span>\n");
      out.write("      <span class=\"bar bottom\"></span>\n");
      out.write("    </label>\n");
      out.write("\n");
      out.write("    <div class=\"content\">\n");
      out.write("        <center>\n");
      out.write("            <img src=\"https://picsum.photos/200/300?t=1\" alt=\"\" class=\"pic\">\n");
      out.write("        </center>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("  </section>\n");
      out.write("</main>\n");
      out.write("\n");
      out.write("<a href=\"https://codepen.io/tonkec\" class=\"ua\" target=\"_blank\">\n");
      out.write("  <i class=\"fa fa-user\"></i></a>\n");
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
