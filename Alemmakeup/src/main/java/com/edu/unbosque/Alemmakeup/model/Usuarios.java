package com.edu.unbosque.Alemmakeup.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Usuarios {
	@Id
	private int id;
	private String cedula_usuario;
	private String nombre_usuario;
	private String email_usuario;
	private String usuario;
	private String pass;
	private int permisos;
	
	
	public Usuarios() {
		
	}
	

	public Usuarios(int id, String cedula_usuario, String nombre_usuario, String email_usuario, String usuario,
			String pass, int permisos) {
		this.id = id;
		this.cedula_usuario = cedula_usuario;
		this.nombre_usuario = nombre_usuario;
		this.email_usuario = email_usuario;
		this.usuario = usuario;
		this.pass = pass;
		this.permisos = permisos;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCedula_usuario() {
		return cedula_usuario;
	}
	public void setCedula_usuario(String string) {
		this.cedula_usuario = string;
	}
	public String getNombre_usuario() {
		return nombre_usuario;
	}
	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}
	public String getEmail_usuario() {
		return email_usuario;
	}
	public void setEmail_usuario(String email_usuario) {
		this.email_usuario = email_usuario;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	
	}

	public int getPermisos() {
		return permisos;
	}

	public void setPermisos(int permisos) {
		this.permisos = permisos;
	}
	

}
