package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class homeCliente_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("            <title>Home Cliente</title>\r\n");
      out.write("            <link rel=\"stylesheet\" type=\"text/css\" href=\"menu.css\"> \r\n");
      out.write("            <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\"> \r\n");
      out.write("            <link rel=\"stylesheet\" href=\"//netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css\">\r\n");
      out.write("        </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <main>\r\n");
      out.write("  <aside>\r\n");
      out.write("    <ul class=\"asideList\">\r\n");
      out.write("      <li><a href=\"\" class=\"asideAnchor\">Inicio</a></li>\r\n");
      out.write("      <li><a href=\"homeCliente.jsp\" class=\"asideAnchor\">Montar Lanche</a></li>\r\n");
      out.write("      <li><a href=\"homeCliente.jsp\" class=\"asideAnchor\">Ajuda</a></li>\r\n");
      out.write("          <ul style=\"margin-top: 110%;\" class=\"brunodatrabalho2\">\r\n");
      out.write("      <li><a  href=\"login.jsp\" class=\"asideAnchor\">Logout</a></li>            \r\n");
      out.write("          </ul>\r\n");
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
      out.write("        <div class=\"Carousel\">\r\n");
      out.write("            <figure>\r\n");
      out.write("\r\n");
      out.write("      <div id=\"slider\">\r\n");
      out.write("          <a  href=\"#\" class=\"trs a-carousel\"><img src=\"testiculodeboi.jpg\" alt=\" Novidade da Semana : Hamburger com molho de testiculo de boi\" /></a>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <figcaption></figcaption>\r\n");
      out.write("    </figure>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("  </section>\r\n");
      out.write("</main>\r\n");
      out.write("\r\n");
      out.write("<a href=\"https://codepen.io/tonkec\" class=\"ua\" target=\"_blank\">\r\n");
      out.write("  <i class=\"fa fa-user\"></i></a>\r\n");
      out.write("    </body>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("    function setaImagem() {\r\n");
      out.write("      var settings = {\r\n");
      out.write("        primeiraImg: function () {\r\n");
      out.write("          elemento = document.querySelector(\"#slider a:first-child\");\r\n");
      out.write("          elemento.classList.add(\"ativo\");\r\n");
      out.write("          this.legenda(elemento);\r\n");
      out.write("        },\r\n");
      out.write("\r\n");
      out.write("        slide: function () {\r\n");
      out.write("          elemento = document.querySelector(\".ativo\");\r\n");
      out.write("\r\n");
      out.write("          if (elemento.nextElementSibling) {\r\n");
      out.write("            elemento.nextElementSibling.classList.add(\"ativo\");\r\n");
      out.write("            settings.legenda(elemento.nextElementSibling);\r\n");
      out.write("            elemento.classList.remove(\"ativo\");\r\n");
      out.write("          } else {\r\n");
      out.write("            elemento.classList.remove(\"ativo\");\r\n");
      out.write("            settings.primeiraImg();\r\n");
      out.write("          }\r\n");
      out.write("\r\n");
      out.write("        },\r\n");
      out.write("\r\n");
      out.write("        proximo: function () {\r\n");
      out.write("          clearInterval(intervalo);\r\n");
      out.write("          elemento = document.querySelector(\".ativo\");\r\n");
      out.write("\r\n");
      out.write("          if (elemento.nextElementSibling) {\r\n");
      out.write("            elemento.nextElementSibling.classList.add(\"ativo\");\r\n");
      out.write("            settings.legenda(elemento.nextElementSibling);\r\n");
      out.write("            elemento.classList.remove(\"ativo\");\r\n");
      out.write("          } else {\r\n");
      out.write("            elemento.classList.remove(\"ativo\");\r\n");
      out.write("            settings.primeiraImg();\r\n");
      out.write("          }\r\n");
      out.write("          intervalo = setInterval(settings.slide, 4000);\r\n");
      out.write("        },anterior: function () {\r\n");
      out.write("          clearInterval(intervalo);\r\n");
      out.write("          elemento = document.querySelector(\".ativo\");\r\n");
      out.write("\r\n");
      out.write("          if (elemento.previousElementSibling) {\r\n");
      out.write("            elemento.previousElementSibling.classList.add(\"ativo\");\r\n");
      out.write("            settings.legenda(elemento.previousElementSibling);\r\n");
      out.write("            elemento.classList.remove(\"ativo\");\r\n");
      out.write("          } else {\r\n");
      out.write("            elemento.classList.remove(\"ativo\");\r\n");
      out.write("            elemento = document.querySelector(\"a:last-child\");\r\n");
      out.write("            elemento.classList.add(\"ativo\");\r\n");
      out.write("            this.legenda(elemento);\r\n");
      out.write("          }\r\n");
      out.write("          intervalo = setInterval(settings.slide, 4000);\r\n");
      out.write("        },\r\n");
      out.write("\r\n");
      out.write("        legenda: function (obj) {\r\n");
      out.write("          var legenda = obj.querySelector(\"img\").getAttribute(\"alt\");\r\n");
      out.write("          document.querySelector(\"figcaption\").innerHTML = legenda;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("      };\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("      //chama o slide\r\n");
      out.write("      settings.primeiraImg();\r\n");
      out.write("\r\n");
      out.write("      //chama a legenda\r\n");
      out.write("      settings.legenda(elemento);\r\n");
      out.write("\r\n");
      out.write("      //chama o slide à um determinado tempo\r\n");
      out.write("      var intervalo = setInterval(settings.slide, 4000);\r\n");
      out.write("      document.querySelector(\".next\").addEventListener(\"click\", settings.proximo, false);\r\n");
      out.write("      document.querySelector(\".prev\").addEventListener(\"click\", settings.anterior, false);\r\n");
      out.write("\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    window.addEventListener(\"load\", setaImagem, false);\r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("    </script>\r\n");
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
