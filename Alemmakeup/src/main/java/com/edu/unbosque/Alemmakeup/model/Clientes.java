package com.edu.unbosque.Alemmakeup.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="clientes")
public class Clientes {
	
	@Id
	@Column(name="cedula_cliente", nullable = false)
	private long cedula_cliente;
	@Column(name="nombre_cliente", nullable = false, length=50)
	private String nombre_cliente;
	@Column(name="direccion_cliente", nullable = false, length=50)
	private String direccion_cliente;
	@Column(name="telefono_cliente", nullable = false, length=10)
	private long telefono_cliente;
	@Column(name="email_cliente", nullable = false, length=50)
	private String email_cliente;
	
	public long getCedula_cliente() {
		return cedula_cliente;
	}
	public void setCedula_cliente(long cedula_cliente) {
		this.cedula_cliente = cedula_cliente;
	}
	public String getNombre_cliente() {
		return nombre_cliente;
	}
	public void setNombre_cliente(String nombre_cliente) {
		this.nombre_cliente = nombre_cliente;
	}
	public String getDireccion_cliente() {
		return direccion_cliente;
	}
	public void setDireccion_cliente(String direccion_cliente) {
		this.direccion_cliente = direccion_cliente;
	}
	public long getTelefono_cliente() {
		return telefono_cliente;
	}
	public void setTelefono_cliente(long telefono_cliente) {
		this.telefono_cliente = telefono_cliente;
	}
	public String getEmail_cliente() {
		return email_cliente;
	}
	public void setEmail_cliente(String email_cliente) {
		this.email_cliente = email_cliente;
	}	
	
}
