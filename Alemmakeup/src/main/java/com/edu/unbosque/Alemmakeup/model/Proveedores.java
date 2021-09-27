package com.edu.unbosque.Alemmakeup.model;

import javax.persistence.Entity;

@Entity
public class Proveedores {
	private int id;
	private String nit_prov;
	private String nombre_prov;
	private String direccion_prov;
	private String telefono_prov;
	private String ciudad_prov;
	
	
	public Proveedores() {

	}
		
	public Proveedores(int id, String nit_prov, String nombre_prov, String direccion_prov, String telefono_prov,
			String ciudad_prov) {
		super();
		this.id = id;
		this.nit_prov = nit_prov;
		this.nombre_prov = nombre_prov;
		this.direccion_prov = direccion_prov;
		this.telefono_prov = telefono_prov;
		this.ciudad_prov = ciudad_prov;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNit_prov() {
		return nit_prov;
	}
	public void setNit_prov(String nit_prov) {
		this.nit_prov = nit_prov;
	}
	public String getNombre_prov() {
		return nombre_prov;
	}
	public void setNombre_prov(String nombre_prov) {
		this.nombre_prov = nombre_prov;
	}
	public String getDireccion_prov() {
		return direccion_prov;
	}
	public void setDireccion_prov(String direccion_prov) {
		this.direccion_prov = direccion_prov;
	}
	public String getTelefono_prov() {
		return telefono_prov;
	}
	public void setTelefono_prov(String telefono_prov) {
		this.telefono_prov = telefono_prov;
	}
	public String getCiudad_prov() {
		return ciudad_prov;
	}
	public void setCiudad_prov(String ciudad_prov) {
		this.ciudad_prov = ciudad_prov;
	}
	
	
	

}
