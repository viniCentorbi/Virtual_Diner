package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Time;
import java.util.Date;
import java.text.SimpleDateFormat;
import dao.PedidoDao;

public final class relatorio_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Relatório</title>\n");
      out.write("        \n");
      out.write("        <style>\n");
      out.write("        table {\n");
      out.write("          font-family: arial, sans-serif;\n");
      out.write("          border-collapse: collapse;\n");
      out.write("          width: 70%;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        td, th {\n");
      out.write("          border: 1px solid #dddddd;\n");
      out.write("          text-align: left;\n");
      out.write("          padding: 8px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        tr:nth-child(even) {\n");
      out.write("          background-color: #dddddd;\n");
      out.write("        }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");

        
            PedidoDao pDao = new PedidoDao();
            
            SimpleDateFormat formatador = new SimpleDateFormat("HH:mm");
            Date data = null;
            Time time = null;
            
            Date dateTeste = formatador.parse("13:00");
            Time timeTeste = new Time(data.getTime());
            
            int tam = pDao.listarPedidos().size();
            int qtdPedido1 = 0;
            int qtdPedido2 = 0;
            int qtdPedido3 = 0;
            int qtdPedido4 = 0;
            int qtdPedido5 = 0;
            
            for (int i = 0; i < tam; i++) {
                    
                data = formatador.parse(pDao.listarPedidos().get(i).getDtHoraPedido());
                time = new Time(data.getTime());
                
                if(time.after(timeTeste)){
                    qtdPedido1++; 
                }
                
            }
        
        
      out.write("\n");
      out.write("        \n");
      out.write("        <table>\n");
      out.write("          <tr>\n");
      out.write("            <th>Horário</th>\n");
      out.write("            <th>Número de pedidos</th>\n");
      out.write("          </tr>\n");
      out.write("          \n");
      out.write("            <tr>\n");
      out.write("                <td>13:00 - 16:00</td>\n");
      out.write("                <td>");
      out.print(qtdPedido1);
      out.write("</td>               \n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>16:01 - 19:00</td>\n");
      out.write("                <td>Teste2</td>               \n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>19:01 - 21:00</td>\n");
      out.write("                <td>Teste3</td>               \n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>21:01 - 00:00</td>\n");
      out.write("                <td>Teste4</td>               \n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>00:01 - 03:00</td>\n");
      out.write("                <td>Teste5</td>               \n");
      out.write("            </tr>\n");
      out.write("          \n");
      out.write("          \n");
      out.write("        </table>\n");
      out.write("        \n");
      out.write("        \n");
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
