package com.edu.unbosque.Alemmakeup.rest;


	import java.util.List;
	import java.util.Optional;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.http.ResponseEntity;
	import org.springframework.web.bind.annotation.DeleteMapping;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.PutMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;

	import com.edu.unbosque.Alemmakeup.DAO.*;
	import com.edu.unbosque.Alemmakeup.model.Clientes;

	@RestController
	@RequestMapping("clientes")
	public class ClienteRest {
		
		@Autowired
		private ClientesDAO clienteDAO;
		
		@GetMapping
		public ResponseEntity<List<Clientes>> getProduct(){
			List<Clientes> clientes = clienteDAO.findAll();
			return ResponseEntity.ok(clientes);
			
		}
		
		@RequestMapping(value="{productId}")
		public ResponseEntity<Clientes> getProductById(@PathVariable("clienteId") Long clienteId){
			Optional<Clientes> optionalCliente = clienteDAO.findById(clienteId);
			if(optionalCliente.isPresent()) {
				return ResponseEntity.ok(optionalCliente.get());
			} else {
				return ResponseEntity.noContent().build();
			}
		}
		
		@PostMapping
		public ResponseEntity<Clientes> createProduct(@RequestBody Clientes cliente){
			Clientes newCliente = clienteDAO.save(cliente);
			return ResponseEntity.ok(newCliente);
		}
		
		@DeleteMapping(value="{clienteId}")
		public ResponseEntity<Void> deleteProduct(@PathVariable("clienteId") Long clienteId){
			clienteDAO.deleteById(clienteId);
			return ResponseEntity.ok(null);
		}
		
		@PutMapping
		public ResponseEntity<Clientes> updateProduct(@RequestBody Clientes cliente){
			Optional<Clientes> optionalCliente = clienteDAO.findById(cliente.getCedula_cliente());
			if(optionalCliente.isPresent()) {
				Clientes updateCliente = optionalCliente.get();
				updateCliente.setNombre_cliente(cliente.getNombre_cliente());
				clienteDAO.save(updateCliente);
				return ResponseEntity.ok(updateCliente);
			}else {
				return ResponseEntity.notFound().build();
			}
			
		}
		
}

