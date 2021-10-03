<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<title> Alem Make Up Store - Usuarios</title>
		<link rel="stylesheet" type="text/css" href="estilo.css">
	</head>
	<body>
			<form action="/home" method="post">	
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
	            </footer>
	            <%
	            if (!request.getParameterMap().isEmpty()) {
	            String user = (request.getParameter("usuario"));
	            String pass = (request.getParameter("pass"));
	            String admin = "admininicial";
	            String admin_pass = "admin123456";

	            if (user.equals(admin) && pass.equals(admin_pass)){
	               	response.sendRedirect("http://localhost:8080/home");	
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