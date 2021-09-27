package dao;

import org.junit.jupiter.api.Test;

import com.edu.unbosque.Alemmakeup.DAO.UsuariosDAO;
import com.edu.unbosque.Alemmakeup.model.Usuarios;

class UsuariosDAOTest {
	
	Usuarios u1 = new Usuarios(67,"289","Vilma","vilma@gmail.com","Vilma289","fghjk",0);
	Usuarios u2 = new Usuarios(51,"278","Carlos","Carlitos@gmail.com","Carlos78","nsd",0);
	UsuariosDAO dao = new UsuariosDAO();

	@Test
	void testRegistrarUsuario() {
		dao.registrarUsuario(u1);
		dao.registrarUsuario(u2);
	}

	@Test
	void testConsultarUsuario() {
		dao.consultarUsuario(278);
		
	}

	@Test
	void testListaUsuario() {
		dao.listaUsuario();
		
	}

	@Test
	void testModificarUsuario() {
		dao.modificarUsuario("289", "Vilmaar", "vilm_a@hotmail.com");
		
	}

	@Test
	void testEliminarUsuario() {
		dao.eliminarUsuario("278");
		
	}

}
