<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.edu.unbosque.Alemmakeup.DAO.UsuariosDAO" %>
<%@page import="com.edu.unbosque.Alemmakeup.model.Usuarios" %>
<%@page import="java.util.ArrayList" %>     
<!DOCTYPE html>
<html>
	<head>
		<title> Alem Make Up Store - Usuarios</title>
		<link rel="stylesheet" type="text/css" href="estilo.css">
	</head>
	<body>
			<form method="post">	
				<header>
					<div class="container titulo">
					<h1>Bienvenido a Alem Make Up Store</h1>
					</div>
					<div class="container nav-container">
						<nav class="navigation">
							<tr>
								<td><label>Usuario</label></td>
								<td><input type="text" name="usuario"></td>
							</tr>
							<tr>
							<br><br>
								<td><label>Contraseña</label></td>
								<td><input type="password" name="pass"></td>				 	
							</tr>					
						</nav>							
					</div>	
				</header>		     
				<footer class="footer">
				    <button name="aceptar" type="submit">Aceptar</button>
				    <button name="cancelar" type="submit">Cancelar</button>		
	            </footer>
	            <%
	            if (!request.getParameterMap().isEmpty()) {
	            String user = (request.getParameter("usuario"));
	            String pass = (request.getParameter("pass"));
	            String admin = "";
	            String admin_pass = "";
	            UsuariosDAO DAO = new UsuariosDAO();
	            boolean check = DAO.login(user, pass);
	            if (check == true){
	            	response.sendRedirect("Home.jsp");
	            }else{
	            	out.println(user);
	            	%><h2>El usuario y/o contraseña ingresados no son correctos</h2>
	            	<%
	            	}         
	            }
	            %>
	        </form>
	</body>		

</html>