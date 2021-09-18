package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;


import dao.Conexion;
import model.Usuarios;

public class UsuariosDAO {
	
	public void registrarUsuario(Usuarios user) {
		Conexion con= new Conexion();
		try {
			Statement estatuto = con.getConex().createStatement();
			estatuto.executeUpdate("INSERT INTO usuario values('"+user.getId()+"','"
					+user.getCedula_usuario()+"','"+user.getNombre_usuario()+"','"+user.getEmail_usuario()+"','"
							+user.getUsuario()+"','"+user.getPass()+"',"+user.getPermisos()+")");
			estatuto.close();
			con.desconectar();
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public ArrayList<Usuarios> consultarUsuario(int documento){
		ArrayList<Usuarios> miUser = new ArrayList<Usuarios>();
		Conexion con = new Conexion();
		try {
			PreparedStatement consulta = con.getConex().prepareStatement("SELECT * FROM usuario WHERE Id=?");
			consulta.setInt(1, documento);
			ResultSet res = consulta.executeQuery();
			if (res.next()) {
				Usuarios user = new Usuarios();
				user.setId(Integer.parseInt(res.getString("Id")));
				user.setCedula_usuario(res.getString("Cedula_usuario"));
				user.setNombre_usuario(res.getString("Nombre_usuario"));
				user.setEmail_usuario(res.getString("Email_usuario"));
				user.setUsuario(res.getString("Usuario"));
				user.setPass(res.getString("Password"));
				
				miUser.add(user);
			}
			res.close();
			consulta.close();
			con.desconectar();
		}catch(Exception e) {
			System.out.println(e);
		}
		return miUser;
	}
	
	public ArrayList<Usuarios> listaUsuario(){
		ArrayList<Usuarios> miUser = new ArrayList<Usuarios>();
		Conexion con = new Conexion();
		try {
			PreparedStatement consulta = con.getConex().prepareStatement("SELECT * FROM usuario");
			ResultSet res = consulta.executeQuery();//Entender seleccion
			while(res.next()) {
				Usuarios user = new Usuarios();
				user.setId(Integer.parseInt(res.getString("Id")));
				user.setCedula_usuario(res.getString("Cedula_usuario"));
				user.setNombre_usuario(res.getString("Nombre_usuario"));
				user.setEmail_usuario(res.getString("Email_usuario"));
				user.setUsuario(res.getString("Usuario"));
				user.setPass(res.getString("Password"));
				miUser.add(user);
			}res.close();
			consulta.close();
			con.desconectar();
				
			}catch(Exception e) {
				System.out.println(e);
		}
		
		return miUser;
	}
	
	public void modificarUsuario(String doc, String nombre, String email){       
       String safe = "SET SQL_SAFE_UPDATES = 0";      
       String consulta = "UPDATE usuario SET Nombre_usuario='"+nombre+"',Email_usuario='"+email+"'"
       		+ " WHERE Cedula_usuario='"+doc+"'";
       Conexion con = new Conexion();
       try {                       
            Statement aux = con.getConex().createStatement();
            aux.executeQuery(safe);
            Statement declaracion = con.getConex().createStatement();            
            declaracion.executeUpdate(consulta);
                            
        }catch (Exception e) {
        	System.out.println(e);
        }finally {
        	con.desconectar();
        }
    }
    
    public void eliminarUsuario(String doc){
    	Conexion con = new Conexion();
        String consulta = "DELETE FROM usuario WHERE Cedula_usuario='"+doc+"'";
        try {
            Statement declaracion = con.getConex().createStatement();
            declaracion.executeUpdate(consulta);            
        } catch (Exception e) {
        	System.out.println(e);
        }finally{            
            con.desconectar();
        }       
    }  
    

	
	
}
