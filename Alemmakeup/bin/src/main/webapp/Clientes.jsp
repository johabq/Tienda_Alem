<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="dao.UsuariosDAO" %>
<%@page import="model.Usuarios" %>
    
<!DOCTYPE html>
<html>
	<head>
		<title> Alem Make Up Store - Usuarios</title>
		<link rel="stylesheet" type="text/css" href="estilo.css">
	</head>
	<body>
		<header>
			<div class="container titulo">
			<h1>Tienda de Maquillaje Alem Make Up</h1>
			</div>
			<div class="container nav-container">
				<nav class="navigation">
					<ul>
						<li><a href="Home.jsp">Usuarios</a></li>
						<li><a href="Clientes.jsp">Clientes</a></li>
						<li><a href="Proveedores.jsp">Proveedores</a></li>
						<li><a href="#">Productos</a></li>
						<li><a href="#">Ventas</a></li>
						<li><a href="#">Reportes</a></li>
					</ul>
				</nav>
			</div>
		</header>
		<form method="post">
		<main class="main">
			<div class="container">
				<table>
					<tr>
						<td><label>Cédula</label></td>
						<td><input type="text" name="cedula"></td>
						<td><label>Usuario</label></td>
						<td><input type="text" name="usuario"></td>
					</tr>
					<tr>
						<td><label>Nombre Completo</label></td>
						<td><input type="text" name="nombre"></td>
						<td><label>Contraseña</label></td>
						<td><input type="password" name="pass"></td>
					</tr>					
					<tr>
						<td><label>Correo electrónico</label></td>
						<td><input type="text" name="email"></td>
					</tr>						
				</table>
				<br><br>
			</div>
		</main>
		
	<footer class="footer">
		<button name="consultar" type="submit">Consultar</button>
		<button name="crear" type="submit">Crear</button>
		<button name="actualizar" type="submit">Actualizar</button>
		<button name="borrar" type="submit">Borrar</button>
		<%
		if (!request.getParameterMap().isEmpty()) {
		UsuariosDAO DAO = new UsuariosDAO();
		String cc = (request.getParameter("cedula"));
		String nombre = (request.getParameter("nombre"));
		String usuario = (request.getParameter("usuario")); 
		String pass = (request.getParameter("pass"));
		String email = (request.getParameter("email"));
		
		if(request.getParameter("consultar") != null){
			DAO.consultarUsuario(Integer.parseInt(cc));
		}else if(request.getParameter("crear") != null){
			Usuarios user = new Usuarios();
			user.setCedula_usuario(cc);
			user.setNombre_usuario(nombre);
			user.setEmail_usuario(email);
			user.setUsuario(usuario);
			user.setPass(pass);
			user.setPermisos(0);
			DAO.registrarUsuario(user);
			response.sendRedirect("Clientes.jsp");
		}else if(request.getParameter("actualizar") != null){
			DAO.modificarUsuario(cc, nombre, email);
		}else if(request.getParameter("borrar") != null){
			DAO.eliminarUsuario(cc);
		}		
		}		
		%>
	</footer>
	</form>		
	</body>
</html>