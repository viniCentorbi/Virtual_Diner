<%-- 
    Document   : login
    Created on : 26/10/2020, 14:35:34
    Author     : yuri-
--%>



<%@page import="entidade.Cliente"%>
<%@page import="dao.ClienteDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="stylelogin.css">
        
                
        <script src="https://cdnjs.cloudflare.com/ajax/libs/crypto-js/3.1.2/components/core-min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/crypto-js/3.1.2/rollups/md5.js"></script>
        
        <script>
            function encriptarSenha(form) {
                if (form.senha.value != '') {
                    form.senha.value = CryptoJS.MD5(form.senha.value).toString();
                }
            }
                        
        </script>
        
        <style>
            
            .mensagemErro{
                color: red;
                
            }
            
        </style>
        
                
        <title>Login</title>
    </head>
    <body>
        
        <h2>Frita Miolos</h2>
        <div class="container" id="container">
	<div class="form-container sign-up-container">
		<form action="#">
			<h1>Crie sua conta!</h1>
			<span>Registre-se com suas informações pessoais.</span>
			<input type="text" placeholder="Nome" />
			<input type="email" placeholder="Email" />
			<input type="password" placeholder="Senha" />
			<button>Registrar</button>
		</form>
            
	</div>
	<div class="form-container sign-in-container">
            <form class="form" action="ServletLogin" method="post" onsubmit="encriptarSenha(this);validacao(this)">
                    <h1>Entrar</h1>
                    <span>entre com sua conta.</span>
                    <input type="text" name="usuario" placeholder="Usuário" required autocomplete="off" />
                    <input type="password" name="senha" placeholder="Senha" required autocomplete="off"/>
                    
                    <p class="mensagemErro">
                        
                        <%
                            String mensagem = (String) request.getAttribute("mensagem");
                            
                            if(mensagem != null){
                                out.print(mensagem);
                            }
                        %>
                        
                    </p>

                    <table>
                        <td><input type="submit" name="logar" value="Logar" onclick="validaUsuario(request.getP)"></td>                            
                    </table>
            </form>
                       
            
            
            
                
	</div>
	<div class="overlay-container">
		<div class="overlay">
			<div class="overlay-panel overlay-left">
                                <img src="CheeseBurger.png" alt="Trulli" width="60" height="40">
				<h1>Bem-vindo de volta!</h1>
				<p>Para se manter conectado, faça login com seu e-mail e senha cadastrado.</p>
				<button class="ghost" id="signIn">Entrar</button>
			</div>
			<div class="overlay-panel overlay-right">
                                <img src="CheeseBurger.png" alt="Trulli" width="60" height="40">
				<h1>Olá Amigo!</h1>
				<p>Registre-se para fazer parte da nossa lanchonete</p>
				<button onclick="window.location.href='cadastro.jsp'" class="ghost" id="signUp">Registre-se</button>
			</div>
		</div>
	</div>
</div>

<footer>
	<p>
            Venha conhecer a melhor lanchonete zombie da região!
	</p>
</footer>
    </body>
    
</html>
