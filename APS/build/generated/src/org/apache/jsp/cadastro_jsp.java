package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cadastro_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"stylecadastro.css\">\r\n");
      out.write("        <title>Cadastro</title>\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("\t\t\tfunction fMasc(objeto,mascara) {\r\n");
      out.write("\t\t\t\tobj=objeto\r\n");
      out.write("\t\t\t\tmasc=mascara\r\n");
      out.write("\t\t\t\tsetTimeout(\"fMascEx()\",1)\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tfunction fMascEx() {\r\n");
      out.write("\t\t\t\tobj.value=masc(obj.value)\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tfunction mCNPJ(cnpj){\r\n");
      out.write("\t\t\t\tcnpj=cnpj.replace(/\\D/g,\"\")\r\n");
      out.write("\t\t\t\tcnpj=cnpj.replace(/^(\\d{2})(\\d)/,\"$1.$2\")\r\n");
      out.write("\t\t\t\tcnpj=cnpj.replace(/^(\\d{2})\\.(\\d{3})(\\d)/,\"$1.$2.$3\")\r\n");
      out.write("\t\t\t\tcnpj=cnpj.replace(/\\.(\\d{3})(\\d)/,\".$1/$2\")\r\n");
      out.write("\t\t\t\tcnpj=cnpj.replace(/(\\d{4})(\\d)/,\"$1-$2\")\r\n");
      out.write("\t\t\t\treturn cnpj\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tfunction mCPF(cpf){\r\n");
      out.write("\t\t\t\tcpf=cpf.replace(/\\D/g,\"\")\r\n");
      out.write("\t\t\t\tcpf=cpf.replace(/(\\d{3})(\\d)/,\"$1.$2\")\r\n");
      out.write("\t\t\t\tcpf=cpf.replace(/(\\d{3})(\\d)/,\"$1.$2\")\r\n");
      out.write("\t\t\t\tcpf=cpf.replace(/(\\d{3})(\\d{1,2})$/,\"$1-$2\")\r\n");
      out.write("\t\t\t\treturn cpf\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tfunction mCEP(cep){\r\n");
      out.write("\t\t\t\tcep=cep.replace(/\\D/g,\"\")\r\n");
      out.write("\t\t\t\tcep=cep.replace(/^(\\d{2})(\\d)/,\"$1.$2\")\r\n");
      out.write("\t\t\t\tcep=cep.replace(/\\.(\\d{3})(\\d)/,\".$1-$2\")\r\n");
      out.write("\t\t\t\treturn cep\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tfunction mNum(num){\r\n");
      out.write("\t\t\t\tnum=num.replace(/\\D/g,\"\")\r\n");
      out.write("\t\t\t\treturn num\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t</script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <h2>Registre-se</h2>\r\n");
      out.write("<div class=\"container\" id=\"container\">\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"form-container sign-in-container\">\r\n");
      out.write("            \r\n");
      out.write("            <form class=\"form\" action=\"ServletClientes\">\r\n");
      out.write("                <div class=\"section\">\r\n");
      out.write("                    <div class=\"control-group\">\r\n");
      out.write("                    Usuário <input class=\"form-usuario\" type=\"text\" name=\"usuario\" autocomplete=\"off\" placeholder=\"Usuário\"><br>\r\n");
      out.write("                    Senha <input class=\"form-senha\" type=\"password\" name=\"senha\" autocomplete=\"off\" placeholder=\"Senha\"><br>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"control-group\">\r\n");
      out.write("                    Nome <input class=\"form-nome\" type=\"text\" name=\"nome\" autocomplete=\"off\" placeholder=\"Nome\"><br>\r\n");
      out.write("                    Sobrenome <input class=\"form-sobrenome\" type=\"text\" name=\"sobrenome\" autocomplete=\"off\" placeholder=\"Sobrenome\"><br>\r\n");
      out.write("                    <button class=\"btnCancelar\" type=\"button\" onclick=\"location.href='login.jsp';\">Cancelar</button>\r\n");
      out.write("                </div>\r\n");
      out.write("                    \r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"section\">\r\n");
      out.write("                 <div class=\"control-group\">\r\n");
      out.write("                    CPF <input type=\"text\" id=\"cpf\" name=\"cpf\" class=\"form-cpf\" autocomplete=\"0ff\" maxlength=\"14\" placeholder=\"CPF\" onkeydown=\"javascript: fMasc( this, mCPF );\"><br>\r\n");
      out.write("                    Rua <input class=\"form-rua\" type=\"text\" name=\"rua\" autocomplete=\"off\" placeholder=\"Rua\"><br>\r\n");
      out.write("                    Numero <input class=\"form-numero\" type=\"text\" name=\"numero\" autocomplete=\"off\" placeholder=\"Número\"><br>\r\n");
      out.write("                    CEP <input class=\"form-cep\" type=\"text\" name=\"cep\" autocomplete=\"off\"  placeholder=\"CEP\" maxlength=\"10\" onkeydown=\"javascript: fMasc(this, mCEP); \"><br>\r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                   \r\n");
      out.write("                    <button class=\"btnCad\" type=\"submit\" onclick=\"location.href='index.jsp';\">Cadastrar</button>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                </div>\r\n");
      out.write("</form>\r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<footer>\r\n");
      out.write("\t<p>\r\n");
      out.write("            Venha conhecer a melhor lanchonete zombie da região!\r\n");
      out.write("\t</p>\r\n");
      out.write("</footer>\r\n");
      out.write("        \r\n");
      out.write("                <script src=\"mask.js\" type=\"text/javascript\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("    \r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
