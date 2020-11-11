<%-- 
    Document   : index
    Created on : 23/10/2020, 01:31:18
    Author     : yuri-
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>Home Administrador</title>
            <link rel="stylesheet" type="text/css" href="menu.css"> 
            <link rel="stylesheet" type="text/css" href="style.css"> 
            <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css">
        </head>
    <body>
        <main>
  <aside>
    <ul class="asideList">
      <li><a href="" class="asideAnchor">Inicio</a></li>
      <li><a href="homeCliente.jsp" class="asideAnchor">Relatório</a></li>
      <li><a href="homeCliente.jsp" class="asideAnchor">Pedidos</a></li>
      
          <li class="asideAnchor2">Ingredientes</li>
      <ul class="brunodatrabalho">
       <li><a href="" class="asideAnchor"> Cadastrar</a></li>
        <li><a href="" class="asideAnchor"> Exibir</a></li>
      </ul>
          <ul class="brunodatrabalho2">
      <li><a href="login.jsp" class="asideAnchor">Logout</a></li>            
          </ul>
    </ul>
  </aside>
  <section>
    <input type="checkbox" id="myInput">
    <label for="myInput">
      <span class="bar top"></span>
      <span class="bar middle"></span>
      <span class="bar bottom"></span>
    </label>

    <div class="content">
        <div class="Carousel">
            <h1>Home do Admin</h1>
      </div>
        </div>
        
  </section>
</main>

<a href="https://codepen.io/tonkec" class="ua" target="_blank">
  <i class="fa fa-user"></i></a>
    </body>
    <script type="text/javascript">
    function setaImagem() {
      var settings = {
        primeiraImg: function () {
          elemento = document.querySelector("#slider a:first-child");
          elemento.classList.add("ativo");
          this.legenda(elemento);
        },

        slide: function () {
          elemento = document.querySelector(".ativo");

          if (elemento.nextElementSibling) {
            elemento.nextElementSibling.classList.add("ativo");
            settings.legenda(elemento.nextElementSibling);
            elemento.classList.remove("ativo");
          } else {
            elemento.classList.remove("ativo");
            settings.primeiraImg();
          }

        },

        proximo: function () {
          clearInterval(intervalo);
          elemento = document.querySelector(".ativo");

          if (elemento.nextElementSibling) {
            elemento.nextElementSibling.classList.add("ativo");
            settings.legenda(elemento.nextElementSibling);
            elemento.classList.remove("ativo");
          } else {
            elemento.classList.remove("ativo");
            settings.primeiraImg();
          }
          intervalo = setInterval(settings.slide, 4000);
        },anterior: function () {
          clearInterval(intervalo);
          elemento = document.querySelector(".ativo");

          if (elemento.previousElementSibling) {
            elemento.previousElementSibling.classList.add("ativo");
            settings.legenda(elemento.previousElementSibling);
            elemento.classList.remove("ativo");
          } else {
            elemento.classList.remove("ativo");
            elemento = document.querySelector("a:last-child");
            elemento.classList.add("ativo");
            this.legenda(elemento);
          }
          intervalo = setInterval(settings.slide, 4000);
        },

        legenda: function (obj) {
          var legenda = obj.querySelector("img").getAttribute("alt");
          document.querySelector("figcaption").innerHTML = legenda;
        }

      };


      //chama o slide
      settings.primeiraImg();

      //chama a legenda
      settings.legenda(elemento);

      //chama o slide à um determinado tempo
      var intervalo = setInterval(settings.slide, 4000);
      document.querySelector(".next").addEventListener("click", settings.proximo, false);
      document.querySelector(".prev").addEventListener("click", settings.anterior, false);

    }

    window.addEventListener("load", setaImagem, false);

        
    </script>
</html>
<a href="../../../../../../Program Files/Apache Software Foundation/Tomcat 9.0/conf/web.xml"></a>