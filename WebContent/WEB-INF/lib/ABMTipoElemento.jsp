
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.ArrayList"%>
<%@ page import= "entities.*" %> 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
  <h2>ABM TIPO ELEMENTOS</h2>
              
  <table class="table">
    <thead>
      <tr>
        <th>ID</th>
        <th>DESCRIPCION</th>
        <th>CANT DIAS MAX</th>
        <th>EDITAR</th>
        <th>ELIMINAR</th>
      </tr>
    </thead>
    <% 
    ArrayList<TipoElemento> lista = new ArrayList<TipoElemento>();
		TipoElemento tipito = new TipoElemento("bar",10);
		tipito.setIdTipo(1);
		lista.add(tipito);
		tipito = new TipoElemento("teatro",10);
		tipito.setIdTipo(2);
		lista.add(tipito);
		for (TipoElemento tipo : lista){ %>
    <tbody>
      <tr>
        <td><%= tipo.getIdTipo() %></td>
        <td><%= tipo.getDescTipo() %></td>
        <td><%= tipo.getCantdiasMax() %></td>
        <td><button class="btn btn-lg btn-primary btn-block" type="submit">Editar</button></td>
        <td><button class="btn btn-lg btn-primary btn-block" type="submit">Eliminar</button></td>
      </tr>
    <%} %>  
    
    </tbody>
  </table>
  <div>
  <form class="form-signin" name="signin" action="altaTipo" method="post">
  <button class="btn btn-lg btn-primary btn-block" type="submit" style="width: 235px; ">Agregar</button>
  </form>
  </div>
</div>

</body>
</html>