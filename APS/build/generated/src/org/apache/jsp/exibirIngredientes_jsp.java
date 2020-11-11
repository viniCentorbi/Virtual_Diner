package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.util.List;
import entidade.Ingredientes;
import dao.IngredientesDao;

public final class exibirIngredientes_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Exibir Ingredientes</title>\n");
      out.write("        \n");
      out.write("        <style>\n");
      out.write("        #ingredientes {\n");
      out.write("          font-family: arial, sans-serif;\n");
      out.write("          border-collapse: collapse;\n");
      out.write("          width: 70%;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        #exibirIngredientes{\n");
      out.write("          border: 1px solid #dddddd;\n");
      out.write("          text-align: left;\n");
      out.write("          padding: 8px;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        #titulo{\n");
      out.write("            border: 1px solid #dddddd;\n");
      out.write("            text-align: center;\n");
      out.write("            padding: 8px; \n");
      out.write("            background-color: black;\n");
      out.write("            color: white;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        tr:nth-child(even) {\n");
      out.write("          background-color: #dddddd;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        input{\n");
      out.write("            font-family: Arial;\n");
      out.write("        }\n");
      out.write("        form{\n");
      out.write("            font-family: Arial;\n");
      out.write("            font-size: 14px;\n");
      out.write("        }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        ");

            IngredientesDao ingDao = new IngredientesDao();
            
            List<Ingredientes> getListPao = new ArrayList<Ingredientes>();
            List<Ingredientes> getListCarne = new ArrayList<Ingredientes>();
            List<Ingredientes> getListSalada = new ArrayList<Ingredientes>();
            List<Ingredientes> getListMolho = new ArrayList<Ingredientes>();
            
            for (int i = 0; i < ingDao.listarIngredientes().size(); i++) {
                    
                if(ingDao.listarIngredientes().get(i).getTipo().equals("Pao")){
                    getListPao.add(ingDao.listarIngredientes().get(i));
                }
                if(ingDao.listarIngredientes().get(i).getTipo().equals("Carne")){
                    getListCarne.add(ingDao.listarIngredientes().get(i));
                }
                if(ingDao.listarIngredientes().get(i).getTipo().equals("Salada")){
                    getListSalada.add(ingDao.listarIngredientes().get(i));
                }
                if(ingDao.listarIngredientes().get(i).getTipo().equals("Molho")){
                    getListMolho.add(ingDao.listarIngredientes().get(i));
                }
                
            }
            
           
        
      out.write("\n");
      out.write("    <center>\n");
      out.write("        \n");
      out.write("        <form action=\"ServletIngredientes\" method=\"get\">\n");
      out.write("                Número: <input type=\"text\" name=\"idIngrediente\" autocomplete=\"off\"><br>\n");
      out.write("                Descrição: <input type=\"text\" name=\"descricao\" autocomplete=\"off\"><br>\n");
      out.write("                Preço: <input type=\"text\" name=\"preco\"><br>\n");
      out.write("                Data de Fabricação: <input type=\"date\" name=\"dt_fabricacao\" autocomplete=\"off\"><br>\n");
      out.write("                Data de Validade: <input type=\"date\" name=\"dt_validade\" autocomplete=\"off\"><br>\n");
      out.write("                Estoque: <input type=\"number\" name=\"estoque\" autocomplete=\"off\"><br>\n");
      out.write("                <table>\n");
      out.write("                    <td><button class=\"btnCad\" type=\"submit\" name=\"botao\" value=\"alterar\">Alterar</button></td>\n");
      out.write("                    <td><button class=\"btnCad\" type=\"submit\" name=\"botao\" value=\"excluir\">Excluir</button></td>\n");
      out.write("                </table>           \n");
      out.write("            </form>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <table id = \"ingredientes\">\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("                <th id = \"titulo\">Pão</th>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("              <th id=\"exibirIngredientes\">Número</th>\n");
      out.write("              <th id=\"exibirIngredientes\">Descrição</th>\n");
      out.write("              <th id=\"exibirIngredientes\">Preço</th>\n");
      out.write("              <th id=\"exibirIngredientes\">Data de fabricação</th>\n");
      out.write("              <th id=\"exibirIngredientes\">Data de validade</th>\n");
      out.write("              <th id=\"exibirIngredientes\">Estoque</th>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            ");

                for(Ingredientes pao:getListPao){
            
      out.write("\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("                <td id=\"exibirIngredientes\">");
      out.print(pao.getIdIngredientes() );
      out.write("</td>\n");
      out.write("                <td id=\"exibirIngredientes\">");
      out.print(pao.getDescricao());
      out.write("</td>\n");
      out.write("                <td id=\"exibirIngredientes\">");
      out.print(pao.getPreco());
      out.write("</td>\n");
      out.write("                <td id=\"exibirIngredientes\">");
      out.print(pao.getDtFabricacao());
      out.write("</td>\n");
      out.write("                <td id=\"exibirIngredientes\">");
      out.print(pao.getDtValidade());
      out.write("</td>\n");
      out.write("                <td id=\"exibirIngredientes\">");
      out.print(pao.getEstoque());
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            ");

                }
            
      out.write("            \n");
      out.write("        </table>\n");
      out.write("        <br>\n");
      out.write("              \n");
      out.write("        <br>\n");
      out.write("        <table id = \"ingredientes\">\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("                <th id = \"titulo\">Carne</th>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("                <th id=\"exibirIngredientes\">Número</th>\n");
      out.write("              <th id=\"exibirIngredientes\">Descrição</th>\n");
      out.write("              <th id=\"exibirIngredientes\">Preço</th>\n");
      out.write("              <th id=\"exibirIngredientes\">Data de fabricação</th>\n");
      out.write("              <th id=\"exibirIngredientes\">Data de validade</th>\n");
      out.write("              <th id=\"exibirIngredientes\">Estoque</th>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            ");

                for(Ingredientes carne:getListCarne){
            
      out.write("\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("                <td id=\"exibirIngredientes\">");
      out.print(carne.getIdIngredientes());
      out.write("</td>\n");
      out.write("                <td id=\"exibirIngredientes\">");
      out.print(carne.getDescricao());
      out.write("</td>\n");
      out.write("                <td id=\"exibirIngredientes\">");
      out.print(carne.getPreco());
      out.write("</td>\n");
      out.write("                <td id=\"exibirIngredientes\">");
      out.print(carne.getDtFabricacao());
      out.write("</td>\n");
      out.write("                <td id=\"exibirIngredientes\">");
      out.print(carne.getDtValidade());
      out.write("</td>\n");
      out.write("                <td id=\"exibirIngredientes\">");
      out.print(carne.getEstoque());
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            ");

                }
            
      out.write("            \n");
      out.write("        </table>\n");
      out.write("               \n");
      out.write("        <br>\n");
      out.write("        <table id = \"ingredientes\">\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("                <th id = \"titulo\">Salada</th>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("                <th id=\"exibirIngredientes\">Número</th>\n");
      out.write("              <th id=\"exibirIngredientes\">Descrição</th>\n");
      out.write("              <th id=\"exibirIngredientes\">Preço</th>\n");
      out.write("              <th id=\"exibirIngredientes\">Data de fabricação</th>\n");
      out.write("              <th id=\"exibirIngredientes\">Data de validade</th>\n");
      out.write("              <th id=\"exibirIngredientes\">Estoque</th>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            ");

                for(Ingredientes salada:getListSalada){
            
      out.write("\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("                 <td id=\"exibirIngredientes\">");
      out.print(salada.getIdIngredientes());
      out.write("</td>\n");
      out.write("                <td id=\"exibirIngredientes\">");
      out.print(salada.getDescricao());
      out.write("</td>\n");
      out.write("                <td id=\"exibirIngredientes\">");
      out.print(salada.getPreco());
      out.write("</td>\n");
      out.write("                <td id=\"exibirIngredientes\">");
      out.print(salada.getDtFabricacao());
      out.write("</td>\n");
      out.write("                <td id=\"exibirIngredientes\">");
      out.print(salada.getDtValidade());
      out.write("</td>\n");
      out.write("                <td id=\"exibirIngredientes\">");
      out.print(salada.getEstoque());
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            ");

                }
            
      out.write("            \n");
      out.write("        </table>\n");
      out.write("        <br>\n");
      out.write("             \n");
      out.write("        <br>\n");
      out.write("        <table id = \"ingredientes\">\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("                <th id = \"titulo\">Molho</th>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("                <th id=\"exibirIngredientes\">Número</th>\n");
      out.write("              <th id=\"exibirIngredientes\">Descrição</th>\n");
      out.write("              <th id=\"exibirIngredientes\">Preço</th>\n");
      out.write("              <th id=\"exibirIngredientes\">Data de fabricação</th>\n");
      out.write("              <th id=\"exibirIngredientes\">Data de validade</th>\n");
      out.write("              <th id=\"exibirIngredientes\">Estoque</th>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            ");

                for(Ingredientes molho:getListMolho){
            
      out.write("\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("                <td id=\"exibirIngredientes\">");
      out.print(molho.getIdIngredientes());
      out.write("</td>\n");
      out.write("                <td id=\"exibirIngredientes\">");
      out.print(molho.getDescricao());
      out.write("</td>\n");
      out.write("                <td id=\"exibirIngredientes\">");
      out.print(molho.getPreco());
      out.write("</td>\n");
      out.write("                <td id=\"exibirIngredientes\">");
      out.print(molho.getDtFabricacao());
      out.write("</td>\n");
      out.write("                <td id=\"exibirIngredientes\">");
      out.print(molho.getDtValidade());
      out.write("</td>\n");
      out.write("                <td id=\"exibirIngredientes\">");
      out.print(molho.getEstoque());
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            ");

                }
            
      out.write("            \n");
      out.write("        </table>\n");
      out.write("        <br>\n");
      out.write("              \n");
      out.write("       \n");
      out.write("            \n");
      out.write("       \n");
      out.write("        \n");
      out.write("    </center>\n");
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
