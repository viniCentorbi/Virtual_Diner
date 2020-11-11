package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.ClienteDao;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"stylelogin.css\">\r\n");
      out.write("        \r\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/crypto-js/3.1.2/components/core-min.js\"></script>\r\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/crypto-js/3.1.2/rollups/md5.js\"></script>\r\n");
      out.write("        <script>\r\n");
      out.write("            function encriptarSenha(form) {\r\n");
      out.write("                if (form.senha.value != '') {\r\n");
      out.write("                    form.senha.value = CryptoJS.MD5(form.senha.value).toString();\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        </script>\r\n");
      out.write("        <script>\r\n");
      out.write("            function myFunction() {\r\n");
      out.write("              alert(location.hostname);\r\n");
      out.write("            }\r\n");
      out.write("        </script>\r\n");
      out.write("                \r\n");
      out.write("        <title>Login</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <h2>Frita Miolos</h2>\r\n");
      out.write("<div class=\"container\" id=\"container\">\r\n");
      out.write("\t<div class=\"form-container sign-up-container\">\r\n");
      out.write("\t\t<form action=\"#\">\r\n");
      out.write("\t\t\t<h1>Crie sua conta!</h1>\r\n");
      out.write("\t\t\t<span>Registre-se com suas informações pessoais.</span>\r\n");
      out.write("\t\t\t<input type=\"text\" placeholder=\"Nome\" />\r\n");
      out.write("\t\t\t<input type=\"email\" placeholder=\"Email\" />\r\n");
      out.write("\t\t\t<input type=\"password\" placeholder=\"Senha\" />\r\n");
      out.write("\t\t\t<button>Registrar</button>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("            \r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"form-container sign-in-container\">\r\n");
      out.write("            <form action=\"ServletLogin\" action=\"ServletLanche\" method=\"post\" onsubmit=\"encriptarSenha(this)\">\r\n");
      out.write("                    <h1>Entrar</h1>\r\n");
      out.write("                    <span>entre com sua conta.</span>\r\n");
      out.write("                    <input type=\"text\" name=\"usuario\" placeholder=\"Usuário\" required />\r\n");
      out.write("                    <input type=\"password\" name=\"senha\" placeholder=\"Senha\" required/>\r\n");
      out.write("                    <a href=\"#\">Perdeu sua senha? problema seu</a>\r\n");
      out.write("\r\n");
      out.write("                    <table>\r\n");
      out.write("                        <td><input type=\"submit\" name=\"logar\" value=\"Logar\"></td>                            \r\n");
      out.write("                    </table>\r\n");
      out.write("\r\n");
      out.write("            </form>\r\n");
      out.write("                       \r\n");
      out.write("            ");

                String usuario = request.getParameter("usuario");
                
                ClienteDao cd = new ClienteDao();
                
                int tam = cd.listarCliente().size();
                
                boolean userExist = true;

                
                for (int i = 0; i < tam; i++) {

                    if(usuario.equals(cd.listarCliente().get(i).getUsuario())){
                        userExist = true;
                        break;                        
                    }else{
                        userExist = false;
                    }
                }
            
      out.write("\r\n");
      out.write("            ");

                 if(userExist = false){               
                
            
      out.write("\r\n");
      out.write("            \r\n");
      out.write("            myFunction();\r\n");
      out.write("            ");

                }              
                
            
      out.write("\r\n");
      out.write("            \r\n");
      out.write("                \r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"overlay-container\">\r\n");
      out.write("\t\t<div class=\"overlay\">\r\n");
      out.write("\t\t\t<div class=\"overlay-panel overlay-left\">\r\n");
      out.write("                                <img src=\"CheeseBurger.png\" alt=\"Trulli\" width=\"60\" height=\"40\">\r\n");
      out.write("\t\t\t\t<h1>Bem-vindo de volta!</h1>\r\n");
      out.write("\t\t\t\t<p>Para se manter conectado, faça login com seu e-mail e senha cadastrado.</p>\r\n");
      out.write("\t\t\t\t<button class=\"ghost\" id=\"signIn\">Entrar</button>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"overlay-panel overlay-right\">\r\n");
      out.write("                                <img src=\"CheeseBurger.png\" alt=\"Trulli\" width=\"60\" height=\"40\">\r\n");
      out.write("\t\t\t\t<h1>Olá Amigo!</h1>\r\n");
      out.write("\t\t\t\t<p>Registre-se para fazer parte da nossa lanchonete</p>\r\n");
      out.write("\t\t\t\t<button onclick=\"window.location.href='cadastro.jsp'\" class=\"ghost\" id=\"signUp\">Registre-se</button>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<footer>\r\n");
      out.write("\t<p>\r\n");
      out.write("            Venha conhecer a melhor lanchonete zombie da região!\r\n");
      out.write("\t</p>\r\n");
      out.write("</footer>\r\n");
      out.write("    </body>\r\n");
      out.write("    \r\n");
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
