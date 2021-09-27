package dao;

import org.junit.jupiter.api.Test;

import com.edu.unbosque.Alemmakeup.DAO.ProveedoresDAO;
import com.edu.unbosque.Alemmakeup.model.Proveedores;

class ProveedoresDAOTest {
	
	Proveedores p1 = new Proveedores(98,"123","San andresito","Cra10","6355343","Cali");
	Proveedores p2 = new Proveedores(54,"456","Bimbo","Cra7","5435","Buga");
	ProveedoresDAO dao = new ProveedoresDAO();

	@Test
	void testRegistrarProveedor() {
		dao.registrarProveedor(p1);
		dao.registrarProveedor(p2);
		
	}

	@Test
	void testConsultarProveedor() {
		dao.consultarProveedor(123);
	}

	@Test
	void testListaProveedores() {
		dao.listaProveedores();
	}

	@Test
	void testModificarProveedor() {
		dao.modificarProveedor("123", "Zenu", "Calle26", "78965", "Bogota");
	}

	@Test
	void testEliminarProveedor() {
		dao.eliminarProveedor("456");
	}

}
