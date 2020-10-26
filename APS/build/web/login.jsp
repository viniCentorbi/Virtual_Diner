<%-- 
    Document   : login
    Created on : 26/10/2020, 14:35:34
    Author     : yuri-
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="stylelogin.css">
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
		<form action="#">
			<h1>Entrar</h1>
			<span>entre com sua conta.</span>
			<input type="email" placeholder="Email" />
			<input type="password" placeholder="Senha" />
			<a href="#">Perdeu sua senha? problema seu</a>
			<button type="button" onclick="location.href='index.jsp';">Entrar</button>
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
