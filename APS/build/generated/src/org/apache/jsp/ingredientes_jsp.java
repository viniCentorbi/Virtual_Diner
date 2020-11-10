package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import entidade.Ingredientes;
import java.util.List;
import dao.IngredientesDao;

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
      out.write("        <title>Ingredientes</title>\r\n");
      out.write("        \r\n");
      out.write("        <style>\r\n");
      out.write("        #ingredientes {\r\n");
      out.write("          font-family: arial, sans-serif;\r\n");
      out.write("          border-collapse: collapse;\r\n");
      out.write("          width: 70%;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        td, th {\r\n");
      out.write("          border: 1px solid #dddddd;\r\n");
      out.write("          text-align: left;\r\n");
      out.write("          padding: 8px;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        #titulo{\r\n");
      out.write("            border: 1px solid #dddddd;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            padding: 8px; \r\n");
      out.write("            background-color: black;\r\n");
      out.write("            color: white;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        tr:nth-child(even) {\r\n");
      out.write("          background-color: #dddddd;\r\n");
      out.write("        }\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("         <aside>\r\n");
      out.write("    <ul class=\"asideList\">\r\n");
      out.write("      <li><a href=\"homeAdm.jsp\" class=\"asideAnchor\">Inicio</a></li>\r\n");
      out.write("      <li><a href=\"pedidoAdm.jsp\" class=\"asideAnchor\">Pedidos</a></li>\r\n");
      out.write("      <li><a href=\"ingredientes.jsp\" class=\"asideAnchor\">Ingredientes</a></li>\r\n");
      out.write("      <li><a href=\"\" class=\"asideAnchor\">Relatório</a></li>\r\n");
      out.write("      <li><a href=\"login.jsp\" class=\"asideAnchor\">Logout</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("  </aside>\r\n");
      out.write("        ");

            IngredientesDao ingDao = new IngredientesDao();

            List<Ingredientes> getListIngredientes = ingDao.listarIngredientes();

            
            List<Ingredientes> getListPao = ingDao.listarPaes();
            List<Ingredientes> getListCarne = ingDao.listarCarnes();
            List<Ingredientes> getListSalada = ingDao.listarSaladas();
            List<Ingredientes> getListMolho = ingDao.listarMolhos();
           
        
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    <center>\r\n");
      out.write("        <div>\r\n");
      out.write("            <form action=\"ServletIngredientes\" method=\"get\">\r\n");
      out.write("                <table>\r\n");
      out.write("                    <td><input id=\"1\" type=\"radio\" name=\"tipo\" value=\"Carne\">Carne</td>\r\n");
      out.write("                    <td><input id=\"2\" type=\"radio\" name=\"tipo\" value=\"Pao\">Pão</td>\r\n");
      out.write("                    <td><input id=\"3\" type=\"radio\" name=\"tipo\" value=\"Molho\">Molho</td>\r\n");
      out.write("                    <td><input id=\"4\" type=\"radio\" name=\"tipo\" value=\"Salada\">Salada</td>\r\n");
      out.write("                </table>\r\n");
      out.write("                Descrição: <input type=\"text\" name=\"descricao\" autocomplete=\"off\"><br>\r\n");
      out.write("                Preço: <input type=\"text\" name=\"preco\"><br>\r\n");
      out.write("                Data de Fabricação: <input type=\"date\" name=\"dt_fabricacao\" autocomplete=\"off\"><br>\r\n");
      out.write("                Data de Validade: <input type=\"date\" name=\"dt_validade\" autocomplete=\"off\"><br>\r\n");
      out.write("                Estoque: <input type=\"number\" name=\"estoque\" autocomplete=\"off\"><br>\r\n");
      out.write("                <table>\r\n");
      out.write("                    <td><input type=\"submit\" name=\"salvar\" value=\"Salvar\"></td>\r\n");
      out.write("                    <td><input type=\"submit\" name=\"cancelar\" value=\"Cancelar\"></td>\r\n");
      out.write("                </table>           \r\n");
      out.write("            </form> \r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("            \r\n");
      out.write("        <table id = \"ingredientes\">\r\n");
      out.write("            \r\n");
      out.write("            <tr>\r\n");
      out.write("                <th id = \"titulo\">Pão</th>\r\n");
      out.write("            </tr>\r\n");
      out.write("            \r\n");
      out.write("            <tr>\r\n");
      out.write("              <th>Descrição</th>\r\n");
      out.write("              <th>Preço</th>\r\n");
      out.write("              <th>Data de fabricação</th>\r\n");
      out.write("              <th>Data de validade</th>\r\n");
      out.write("              <th>Estoque</th>\r\n");
      out.write("            </tr>\r\n");
      out.write("            \r\n");
      out.write("            ");

                for(Ingredientes pao:getListPao){
            
      out.write("\r\n");
      out.write("            \r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>");
      out.print(pao.getDescricao());
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(pao.getPreco());
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(pao.getDtFabricacao());
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(pao.getDtValidade());
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(pao.getEstoque());
      out.write("</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            \r\n");
      out.write("            ");

                }
            
      out.write("            \r\n");
      out.write("        </table>\r\n");
      out.write("        <br>\r\n");
      out.write("        <table id = \"ingredientes\">\r\n");
      out.write("            \r\n");
      out.write("            <tr>\r\n");
      out.write("                <th id = \"titulo\">Carne</th>\r\n");
      out.write("            </tr>\r\n");
      out.write("            \r\n");
      out.write("            <tr>\r\n");
      out.write("              <th>Descrição</th>\r\n");
      out.write("              <th>Preço</th>\r\n");
      out.write("              <th>Data de fabricação</th>\r\n");
      out.write("              <th>Data de validade</th>\r\n");
      out.write("              <th>Estoque</th>\r\n");
      out.write("            </tr>\r\n");
      out.write("            \r\n");
      out.write("            ");

                for(Ingredientes carne:getListCarne){
            
      out.write("\r\n");
      out.write("            \r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>");
      out.print(carne.getDescricao());
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(carne.getPreco());
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(carne.getDtFabricacao());
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(carne.getDtValidade());
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(carne.getEstoque());
      out.write("</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            \r\n");
      out.write("            ");

                }
            
      out.write("            \r\n");
      out.write("        </table>\r\n");
      out.write("        <br>\r\n");
      out.write("        <table id = \"ingredientes\">\r\n");
      out.write("            \r\n");
      out.write("            <tr>\r\n");
      out.write("                <th id = \"titulo\">Salada</th>\r\n");
      out.write("            </tr>\r\n");
      out.write("            \r\n");
      out.write("            <tr>\r\n");
      out.write("              <th>Descrição</th>\r\n");
      out.write("              <th>Preço</th>\r\n");
      out.write("              <th>Data de fabricação</th>\r\n");
      out.write("              <th>Data de validade</th>\r\n");
      out.write("              <th>Estoque</th>\r\n");
      out.write("            </tr>\r\n");
      out.write("            \r\n");
      out.write("            ");

                for(Ingredientes salada:getListSalada){
            
      out.write("\r\n");
      out.write("            \r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>");
      out.print(salada.getDescricao());
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(salada.getPreco());
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(salada.getDtFabricacao());
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(salada.getDtValidade());
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(salada.getEstoque());
      out.write("</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            \r\n");
      out.write("            ");

                }
            
      out.write("            \r\n");
      out.write("        </table>\r\n");
      out.write("        <br>\r\n");
      out.write("        <table id = \"ingredientes\">\r\n");
      out.write("            \r\n");
      out.write("            <tr>\r\n");
      out.write("                <th id = \"titulo\">Molho</th>\r\n");
      out.write("            </tr>\r\n");
      out.write("            \r\n");
      out.write("            <tr>\r\n");
      out.write("              <th>Descrição</th>\r\n");
      out.write("              <th>Preço</th>\r\n");
      out.write("              <th>Data de fabricação</th>\r\n");
      out.write("              <th>Data de validade</th>\r\n");
      out.write("              <th>Estoque</th>\r\n");
      out.write("            </tr>\r\n");
      out.write("            \r\n");
      out.write("            ");

                for(Ingredientes molho:getListMolho){
            
      out.write("\r\n");
      out.write("            \r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>");
      out.print(molho.getDescricao());
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(molho.getPreco());
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(molho.getDtFabricacao());
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(molho.getDtValidade());
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(molho.getEstoque());
      out.write("</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            \r\n");
      out.write("            ");

                }
            
      out.write("            \r\n");
      out.write("        </table>\r\n");
      out.write("        \r\n");
      out.write("            \r\n");
      out.write("       \r\n");
      out.write("        \r\n");
      out.write("    </center>\r\n");
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
