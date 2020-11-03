<%-- 
    Document   : cadastro
    Created on : 26/10/2020, 14:27:37
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="stylecadastro.css">
        <title>Cadastro</title>
    </head>
    <body>
        <h2>Registre-se</h2>
<div class="container" id="container">
	
	<div class="form-container sign-in-container">
            
            <form class="form" action="ServletClientes">
                <div class="section">
                    <div class="control-group">
                    Usuário <input class="form-usuario" type="text" name="usuario" autocomplete="off" placeholder="Usuário"><br>
                    Senha <input class="form-senha" type="password" name="senha" autocomplete="off" placeholder="Senha"><br>
                    </div>

                <div class="control-group">
                    Nome <input class="form-nome" type="text" name="nome" autocomplete="off" placeholder="Nome"><br>
                    Sobrenome <input class="form-sobrenome" type="text" name="sobrenome" autocomplete="off" placeholder="Sobrenome"><br>
                    <button class="btnCancelar" type="button" onclick="location.href='login.jsp';">Cancelar</button>
                </div>
                    
                </div>

                <div class="section">
                 <div class="control-group">
                    CPF <input type="text" id="cpf" name="cpf" class="form-cpf" autocomplete="0ff"><br>
                    Rua <input class="form-rua" type="text" name="rua" autocomplete="off" placeholder="Rua"><br>
                    Número <input class="form-numero" type="text" name="numero" autocomplete="off" placeholder="Número"><br>
                    CEP <input class="form-cep" type="text" name="cep" autocomplete="off"  placeholder="CEP"><br>
                    
                    
                   
                    <button class="btnCad" type="submit" onclick="location.href='index.jsp';">Cadastrar</button>

                </div>
                </div>
</form>
                    
                    
	</div>
	
</div>

<footer>
	<p>
            Venha conhecer a melhor lanchonete zombie da região!
	</p>
</footer>
        
                <script src="mask.js" type="text/javascript"></script>
    </body>
    
</html>

