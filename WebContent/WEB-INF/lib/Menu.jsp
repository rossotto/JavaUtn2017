<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js" integrity="sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js" integrity="sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ" crossorigin="anonymous"></script>
<title>Insert title here</title>
</head>
<body>
<div>
	<div>
	<h1>Menu de opciones</h1>
	</div>
	<p><% %></p>
	<div>
	<form class="form-signin" name="signin" action="aABMTipoElemento" method="post">
   	<button class="btn btn-lg btn-primary btn-block" type="submit" style="width: 890px; margin-bottom: 30px;  ">ABM Tipo  Elemento</button> 
  	</form>
  		<form class="form-signin" name="signin" action="aABMPersona" method="post">
   	<button class="btn btn-lg btn-primary btn-block" type="submit" style="width: 890px; margin-bottom: 30px;">ABM Persona</button> 
  	</form>
  	<form class="form-signin" name="signin" action="aABMReservar" method="post">
   	<button class="btn btn-lg btn-primary btn-block" type="submit" style="width: 890px; margin-bottom: 30px;">Reservar</button> 
  	</form>
  	<form class="form-signin" name="signin" action="aABMElemento" method="post">
   	<button class="btn btn-lg btn-primary btn-block" type="submit" style="width: 890px; margin-bottom: 30px;">ABM Elemento</button> 
  	</form>
  	<form class="form-signin" name="signin" action="mostrarReservas" method="post">
   	<button class="btn btn-lg btn-primary btn-block" type="submit" style="width: 890px; margin-bottom: 30px;">Mostrar Reservas</button> 
  	</form>
	</div>
</div>
</body>
</html>