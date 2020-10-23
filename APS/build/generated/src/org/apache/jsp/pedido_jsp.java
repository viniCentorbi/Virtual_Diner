package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class pedido_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <head>\r\n");
      out.write("            <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("            <title>Lanchonete</title>\r\n");
      out.write("            <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">      \r\n");
      out.write("        </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <main>\r\n");
      out.write("  <aside>\r\n");
      out.write("    <ul class=\"asideList\">\r\n");
      out.write("      <li><a href=\"\" class=\"asideAnchor\">Inicio</a></li>\r\n");
      out.write("      <li><a href=\"\" class=\"asideAnchor\">Lanches</a></li>\r\n");
      out.write("      <li><a href=\"\" class=\"asideAnchor\">Ajuda</a></li>\r\n");
      out.write("      <li><a href=\"\" class=\"asideAnchor\">Logout</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("  </aside>\r\n");
      out.write("  <section>\r\n");
      out.write("    <input type=\"checkbox\" id=\"myInput\">\r\n");
      out.write("    <label for=\"myInput\">\r\n");
      out.write("      <span class=\"bar top\"></span>\r\n");
      out.write("      <span class=\"bar middle\"></span>\r\n");
      out.write("      <span class=\"bar bottom\"></span>\r\n");
      out.write("    </label>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"content\">\r\n");
      out.write("        <h1>eu não sei mexer nisso</h1>\r\n");
      out.write("    </div>\r\n");
      out.write("  </section>\r\n");
      out.write("</main>\r\n");
      out.write("\r\n");
      out.write("<a href=\"https://codepen.io/tonkec\" class=\"ua\" target=\"_blank\">\r\n");
      out.write("  <i class=\"fa fa-user\"></i></a>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
