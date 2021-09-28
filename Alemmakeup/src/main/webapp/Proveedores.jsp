<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>    
<%@page import="com.edu.unbosque.Alemmakeup.DAO.ProveedoresDAO" %>
<%@page import="com.edu.unbosque.Alemmakeup.model.Proveedores" %>
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
						<td><label>NIT</label></td>
						<td><input type="text" name="nit"></td>
						<td><label>Telefono</label></td>
						<td><input type="text" name="telefono"></td>
					</tr>
					<tr>
						<td><label>Nombre Proveedor</label></td>
						<td><input type="text" name="nombre_p"></td>
						<td><label>Ciudad</label></td>
						<td><input type="text" name="ciudad"></td>
					</tr>					
					<tr>
						<td><label>Dirección</label></td>
						<td><input type="text" name="direccion"></td>
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
		ProveedoresDAO DAO = new ProveedoresDAO();
		String nit = (request.getParameter("nit"));
		String nombre = (request.getParameter("nombre_p"));
		String direccion = (request.getParameter("direccion")); 
		String telefono = (request.getParameter("telefono"));
		String ciudad = (request.getParameter("ciudad"));
		
		if(request.getParameter("consultar") != null){
			DAO.consultarProveedor(Integer.parseInt(nit));
		}else if(request.getParameter("crear") != null){
			Proveedores prov = new Proveedores();
			prov.setNit_prov(nit);
			prov.setNombre_prov(nombre);
			prov.setDireccion_prov(direccion);
			prov.setTelefono_prov(telefono);
			prov.setCiudad_prov(ciudad);
			DAO.registrarProveedor(prov);
			response.sendRedirect("Proveedores.jsp");
		}else if(request.getParameter("actualizar") != null){
			DAO.modificarProveedor(nit, nombre, direccion, telefono, ciudad);
		}else if(request.getParameter("borrar") != null){
			DAO.eliminarProveedor(nit);
		}		
		}		
		%>
	</footer>
	</form>		
	</body>
</html>