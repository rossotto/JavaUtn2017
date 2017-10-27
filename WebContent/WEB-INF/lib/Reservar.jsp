<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js" integrity="sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js" integrity="sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ" crossorigin="anonymous"></script>
<title>Insert title here</title>
</head>
<body>



<form role="form">
  <div class="form-group">
    <label for="id-reserva">ID</label>
    <input type="id-reserva" class="form-control" id="id-reserva" readonly="true" style="width:50px;height:30px">
  </div>
  <div class="form-group">
    <label for="fecha-inic">Fecha de Inicio</label>
    <input type="fecha-inic" class="form-control" id="Fecha de Inicio" style="width:100px;
    height:30px" >
  </div>
  <div class="form-group">
    <label for="fecha-fin">Fecha de Fin de Rerserva</label>
    <input type="fecha-fin" class="form-control" id="Fecha de Fin de Reserva" style="width:100px;height:35px" >
  </div>
   <div class="dropdown" >
  <button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown" style="bottom:30px">Tipo de Recinto<span class="caret"></span></button>
	</div> 
	 <div class="dropdown" style="margin-bottom: 30px; margin-top: 30px;">
  <button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown">Recinto
  <span class="caret"></span></button>
	</div> 
  <button type="submit" class="btn btn-default">Reservar</button>
</form>

</body>
</html>