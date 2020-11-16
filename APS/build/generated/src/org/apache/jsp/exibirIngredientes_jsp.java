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
      out.write("        <link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"logo.ico\">\r\n");
      out.write("\r\n");
      out.write("        <title>Exibir Ingredientes</title>\r\n");
      out.write("        \r\n");
      out.write("        <style>\r\n");
      out.write("        th{\r\n");
      out.write("            background-color: #ed7801;\r\n");
      out.write("            border: 1px solid black;\r\n");
      out.write("            text-align: left;\r\n");
      out.write("            padding: 8px;\r\n");
      out.write("            \r\n");
      out.write("        }\r\n");
      out.write("        #ingredientes {\r\n");
      out.write("            font-family: arial, sans-serif;\r\n");
      out.write("            border-collapse: collapse;\r\n");
      out.write("            width: 70%;\r\n");
      out.write("            border: 1px solid black;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        #exibirIngredientes{\r\n");
      out.write("          border: 1px solid black;\r\n");
      out.write("          text-align: left;\r\n");
      out.write("          padding: 8px;\r\n");
      out.write("          background-color: rgba(255,255,255, 0.5);\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        #titulo{\r\n");
      out.write("            border: 1px solid black;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            padding: 8px; \r\n");
      out.write("            background-color: black;\r\n");
      out.write("            color: white;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        tr:nth-child(even) {\r\n");
      out.write("          background-color: gray;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        input{\r\n");
      out.write("            font-family: Arial;\r\n");
      out.write("        }\r\n");
      out.write("        form{\r\n");
      out.write("            font-family: Arial;\r\n");
      out.write("            font-size: 14px;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        .alter{\r\n");
      out.write("            background-color: #007600;                \r\n");
      out.write("            border-radius: 10px;\r\n");
      out.write("            border-style: none;\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("            color: white;\r\n");
      out.write("            padding: 10px 25px;\r\n");
      out.write("            margin: 20px 20px;\r\n");
      out.write("            margin-left: 0%;\r\n");
      out.write("            cursor: pointer;\r\n");
      out.write("            font-family: 'Open Sans', sans-serif;\r\n");
      out.write("            font-size: 17px;\r\n");
      out.write("            font-weight: bold;\r\n");
      out.write("            width: 22%;\r\n");
      out.write("        }\r\n");
      out.write("        .delete{\r\n");
      out.write("            background-color: #bd0000;                \r\n");
      out.write("            border-radius: 10px;\r\n");
      out.write("            border-style: none;\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("            color: white;\r\n");
      out.write("            padding: 10px 25px;\r\n");
      out.write("            margin: 20px 20px;\r\n");
      out.write("            margin-left: 0%;\r\n");
      out.write("            cursor: pointer;\r\n");
      out.write("            font-family: 'Open Sans', sans-serif;\r\n");
      out.write("            font-size: 17px;\r\n");
      out.write("            font-weight: bold;\r\n");
      out.write("            width: 22%;\r\n");
      out.write("            opacity: none;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        .mensagemErro{\r\n");
      out.write("            color: red;                \r\n");
      out.write("        }\r\n");
      out.write("        .mensagemSucesso{\r\n");
      out.write("            color: #007600;                \r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        \r\n");
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
        
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <main>\r\n");
      out.write("            <aside>\r\n");
      out.write("                <ul class=\"asideList\">\r\n");
      out.write("                    <li><a href=\"home.jsp\" class=\"asideAnchor\">Inicio</a></li>\r\n");
      out.write("                    <li><a href=\"relatorio.jsp\" class=\"asideAnchor\">Relatório</a></li>                  \r\n");
      out.write("                    <li class=\"asideAnchor2\">Ingredientes</li>\r\n");
      out.write("                    <ul class=\"brunodatrabalho\">\r\n");
      out.write("                        <li><a href=\"ingredientes.jsp\" class=\"asideAnchor\">Cadastrar</a></li>\r\n");
      out.write("                        <li><a href=\"exibirIngredientes.jsp\" class=\"asideAnchor\">Exibir</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                    <ul class=\"brunodatrabalho2\">\r\n");
      out.write("                        <li><a href=\"login.jsp\" class=\"asideAnchor\">Logout</a></li>            \r\n");
      out.write("                    </ul>\r\n");
      out.write("                </ul>\r\n");
      out.write("          </aside>\r\n");
      out.write("            \r\n");
      out.write("            <section>\r\n");
      out.write("                <input type=\"checkbox\" id=\"myInput\">\r\n");
      out.write("                <label for=\"myInput\">\r\n");
      out.write("                  <span class=\"bar top\"></span>\r\n");
      out.write("                  <span class=\"bar middle\"></span>\r\n");
      out.write("                  <span class=\"bar bottom\"></span>\r\n");
      out.write("                </label>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"content\">\r\n");
      out.write("                    \r\n");
      out.write("                    <center>\r\n");
      out.write("                        \r\n");
      out.write("                        <div class=\"formExibirIngredientes\">\r\n");
      out.write("                            <h3>Preencha para alterar/excluir ingredientes</h3>\r\n");
      out.write("                            <form action=\"ServletIngredientes\" method=\"get\">\r\n");
      out.write("                                Número: <input type=\"text\" name=\"idIngrediente\" autocomplete=\"off\" required>\r\n");
      out.write("                                <br>\r\n");
      out.write("                                <br>\r\n");
      out.write("                                Preço: <input type=\"text\" name=\"preco\" required>\r\n");
      out.write("                                <br>\r\n");
      out.write("                                <br>\r\n");
      out.write("                                Estoque: <input type=\"number\" name=\"estoque\" autocomplete=\"off\" required>\r\n");
      out.write("                                <br>\r\n");
      out.write("                                <br>\r\n");
      out.write("                                <p class=\"mensagemErro\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensagemErro}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("                                <p class=\"mensagemSucesso\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensagemSucesso}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("                                <div class=\"buttonsExibirIngredientes\">\r\n");
      out.write("                                    \r\n");
      out.write("                                    <button class=\"alter\" type=\"submit\" name=\"botao\" value=\"alterar\">Alterar</button>\r\n");
      out.write("                                    <button class=\"delete\" type=\"submit\" name=\"botao\" value=\"excluir\">Excluir</button>\r\n");
      out.write("                                    \r\n");
      out.write("                                </div>\r\n");
      out.write("                                \r\n");
      out.write("                            </form>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <table id = \"ingredientes\">\r\n");
      out.write("\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <th id = \"titulo\" colspan=\"6\">Pão</th>\r\n");
      out.write("                            </tr>\r\n");
      out.write("\r\n");
      out.write("                            <tr>\r\n");
      out.write("                              <th id=\"\">Número</th>\r\n");
      out.write("                              <th id=\"\">Descrição</th>\r\n");
      out.write("                              <th id=\"\">Preço</th>\r\n");
      out.write("                              <th id=\"\">Data de fabricação</th>\r\n");
      out.write("                              <th id=\"\">Data de validade</th>\r\n");
      out.write("                              <th id=\"\">Estoque</th>\r\n");
      out.write("                            </tr>\r\n");
      out.write("\r\n");
      out.write("                            ");

                                for(Ingredientes pao:getListPao){
                            
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td id=\"exibirIngredientes\">");
      out.print(pao.getIdIngredientes() );
      out.write("</td>\r\n");
      out.write("                                <td id=\"exibirIngredientes\">");
      out.print(pao.getDescricao());
      out.write("</td>\r\n");
      out.write("                                <td id=\"exibirIngredientes\">");
      out.print(pao.getPreco());
      out.write("</td>\r\n");
      out.write("                                <td id=\"exibirIngredientes\">");
      out.print(pao.getDtFabricacao());
      out.write("</td>\r\n");
      out.write("                                <td id=\"exibirIngredientes\">");
      out.print(pao.getDtValidade());
      out.write("</td>\r\n");
      out.write("                                <td id=\"exibirIngredientes\">");
      out.print(pao.getEstoque());
      out.write("</td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("\r\n");
      out.write("                            ");

                                }
                            
      out.write("            \r\n");
      out.write("                        </table>\r\n");
      out.write("                        <br>\r\n");
      out.write("\r\n");
      out.write("                        <br>\r\n");
      out.write("                        <table id = \"ingredientes\">\r\n");
      out.write("\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <th id = \"titulo\" colspan=\"6\">Carne</th>\r\n");
      out.write("                            </tr>\r\n");
      out.write("\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <th id=\"\">Número</th>\r\n");
      out.write("                              <th id=\"\">Descrição</th>\r\n");
      out.write("                              <th id=\"\">Preço</th>\r\n");
      out.write("                              <th id=\"\">Data de fabricação</th>\r\n");
      out.write("                              <th id=\"\">Data de validade</th>\r\n");
      out.write("                              <th id=\"\">Estoque</th>\r\n");
      out.write("                            </tr>\r\n");
      out.write("\r\n");
      out.write("                            ");

                                for(Ingredientes carne:getListCarne){
                            
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td id=\"exibirIngredientes\">");
      out.print(carne.getIdIngredientes());
      out.write("</td>\r\n");
      out.write("                                <td id=\"exibirIngredientes\">");
      out.print(carne.getDescricao());
      out.write("</td>\r\n");
      out.write("                                <td id=\"exibirIngredientes\">");
      out.print(carne.getPreco());
      out.write("</td>\r\n");
      out.write("                                <td id=\"exibirIngredientes\">");
      out.print(carne.getDtFabricacao());
      out.write("</td>\r\n");
      out.write("                                <td id=\"exibirIngredientes\">");
      out.print(carne.getDtValidade());
      out.write("</td>\r\n");
      out.write("                                <td id=\"exibirIngredientes\">");
      out.print(carne.getEstoque());
      out.write("</td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("\r\n");
      out.write("                            ");

                                }
                            
      out.write("            \r\n");
      out.write("                        </table>\r\n");
      out.write("\r\n");
      out.write("                        <br>\r\n");
      out.write("                        <table id = \"ingredientes\">\r\n");
      out.write("\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <th id = \"titulo\" colspan=\"6\">Salada</th>\r\n");
      out.write("                            </tr>\r\n");
      out.write("\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <th id=\"\">Número</th>\r\n");
      out.write("                              <th id=\"\">Descrição</th>\r\n");
      out.write("                              <th id=\"\">Preço</th>\r\n");
      out.write("                              <th id=\"\">Data de fabricação</th>\r\n");
      out.write("                              <th id=\"\">Data de validade</th>\r\n");
      out.write("                              <th id=\"\">Estoque</th>\r\n");
      out.write("                            </tr>\r\n");
      out.write("\r\n");
      out.write("                            ");

                                for(Ingredientes salada:getListSalada){
                            
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                 <td id=\"exibirIngredientes\">");
      out.print(salada.getIdIngredientes());
      out.write("</td>\r\n");
      out.write("                                <td id=\"exibirIngredientes\">");
      out.print(salada.getDescricao());
      out.write("</td>\r\n");
      out.write("                                <td id=\"exibirIngredientes\">");
      out.print(salada.getPreco());
      out.write("</td>\r\n");
      out.write("                                <td id=\"exibirIngredientes\">");
      out.print(salada.getDtFabricacao());
      out.write("</td>\r\n");
      out.write("                                <td id=\"exibirIngredientes\">");
      out.print(salada.getDtValidade());
      out.write("</td>\r\n");
      out.write("                                <td id=\"exibirIngredientes\">");
      out.print(salada.getEstoque());
      out.write("</td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("\r\n");
      out.write("                            ");

                                }
                            
      out.write("            \r\n");
      out.write("                        </table>\r\n");
      out.write("                        <br>\r\n");
      out.write("\r\n");
      out.write("                        <br>\r\n");
      out.write("                        <table id = \"ingredientes\">\r\n");
      out.write("\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <th id = \"titulo\" colspan=\"6\">Molho</th>\r\n");
      out.write("                            </tr>\r\n");
      out.write("\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <th id=\"\">Número</th>\r\n");
      out.write("                              <th id=\"\">Descrição</th>\r\n");
      out.write("                              <th id=\"\">Preço</th>\r\n");
      out.write("                              <th id=\"\">Data de fabricação</th>\r\n");
      out.write("                              <th id=\"\">Data de validade</th>\r\n");
      out.write("                              <th id=\"\">Estoque</th>\r\n");
      out.write("                            </tr>\r\n");
      out.write("\r\n");
      out.write("                            ");

                                for(Ingredientes molho:getListMolho){
                            
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td id=\"exibirIngredientes\">");
      out.print(molho.getIdIngredientes());
      out.write("</td>\r\n");
      out.write("                                <td id=\"exibirIngredientes\">");
      out.print(molho.getDescricao());
      out.write("</td>\r\n");
      out.write("                                <td id=\"exibirIngredientes\">");
      out.print(molho.getPreco());
      out.write("</td>\r\n");
      out.write("                                <td id=\"exibirIngredientes\">");
      out.print(molho.getDtFabricacao());
      out.write("</td>\r\n");
      out.write("                                <td id=\"exibirIngredientes\">");
      out.print(molho.getDtValidade());
      out.write("</td>\r\n");
      out.write("                                <td id=\"exibirIngredientes\">");
      out.print(molho.getEstoque());
      out.write("</td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("\r\n");
      out.write("                            ");

                                }
                            
      out.write("            \r\n");
      out.write("                        </table>\r\n");
      out.write("                        <br>\r\n");
      out.write("\r\n");
      out.write("                    </center>\r\n");
      out.write("                    \r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </section>\r\n");
      out.write("        </main>\r\n");
      out.write("        \r\n");
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
