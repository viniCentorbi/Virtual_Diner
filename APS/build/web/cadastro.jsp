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
                text-align: right;
            }
        </style>
        
        <title>Cadastro</title>
    </head>
    <body>
        <h2>Registre-se</h2>
<div class="container" id="container">
	
	<div class="form-container sign-in-container">
            
            <form class="form" action="ServletCadastroCliente" method="post" onsubmit="encriptarSenha(this)">
                <div class="section">
                    <div class="control-group">
                        Usuário <input class="form-usuario" type="text" name="usuario" autocomplete="off" placeholder="Usuário" required><br>
                        Senha <input class="form-senha" type="password" name="senha" autocomplete="off" placeholder="Senha" required><br>
                    </div>

                <div class="control-group">
                    Nome <input class="form-nome" type="text" name="nome" autocomplete="off" placeholder="Nome" required> <br>
                    Sobrenome <input class="form-sobrenome" type="text" name="sobrenome" autocomplete="off" placeholder="Sobrenome" required><br>
                    <button class="btnCancelar" type="button" onclick="location.href='login.jsp';">Cancelar</button>
                    
                        <p class="mensagemErro">
                        
                        <%
                            String mensagem = (String) request.getAttribute("mensagem");
                            
                            if(mensagem != null){
                                out.print(mensagem);
                            }
                        %>
                        
                        </p>
                    
                </div>
                    
                </div>

                <div class="section">
                 <div class="control-group">
                    CPF <input type="text" id="cpf" name="cpf" class="form-cpf" autocomplete="0ff" required><br>
                    Rua <input class="form-rua" type="text" name="rua" autocomplete="off" placeholder="Rua" required><br>
                    Número <input class="form-numero" type="text" name="numero" autocomplete="off" placeholder="Número" required><br>
                    CEP <input class="form-cep" type="text" name="cep" autocomplete="off"  placeholder="CEP" required><br>
                    
                    
                   
                    <button class="btnCad" type="submit">Cadastrar</button>

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

