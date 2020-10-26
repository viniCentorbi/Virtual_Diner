<%-- 
    Document   : Login
    Created on : 23/10/2020, 16:21:34
    Author     : yuri-
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link rel="stylesheet" type="text/css" href="stylelogin.css">  
    </head>
    <body>
        <h2>Frita Miolos</h2>
<div class="container" id="container">
	<div class="form-container sign-up-container">
		<form action="#">
			<h1>Criar Conta</h1>
			
			<span>Crie sua conta grátis!</span>
			<input type="text" placeholder="Nome" />
			<input type="email" placeholder="Email" />
			<input type="password" placeholder="Senha" />
                        <button>Registre-se</button>
		</form>
	</div>
	<div class="form-container sign-in-container">
		<form action="#">
			<h1>Login</h1>
		
			<span>Entre com sua conta</span>
			<input type="email" placeholder="Email" />
			<input type="password" placeholder="Senha" />
			<a href="#">Esqueceu sua senha?</a>
                        <button type="button" onclick="location.href='/APS'" >Entrar</button> 
                        
		</form>
	</div>
	<div class="overlay-container">
		<div class="overlay">
			<div class="overlay-panel overlay-left">
                            <img class="Logo" src="./Imagens/CheeseBurger.png" width="75" height="50" >
				<h1>Bem-vindo de volta!</h1>
				<p>Para se manter conectado, faça o login com suas informações pessoais!</p>
				<button class="ghost" id="signIn">Entrar</button>
			</div>
			<div class="overlay-panel overlay-right">
                            <img class="Logo" src="./Imagens/CheeseBurger.png" width="75" height="50" >
				<h1>Olá Amigo!</h1>
				<p>Registre-se para fazer parte da nossa lanchonete!</p>
				<button class="ghost" id="signUp">Registre-se</button>
			</div>
		</div>
	</div>
</div>

<footer>
	<p>
		Venha conhecer a melhor lanchonete Zombie da região!
	</p>
</footer>
    </body>
    <script type="text/javascript" src="./Loginjs.js"></script>
</html>
