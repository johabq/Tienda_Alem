package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Proveedores;

public class ProveedoresDAO {

	public void registrarProveedor(Proveedores prov) {
		Conexion con= new Conexion();
		try {
			Statement estatuto = con.getConex().createStatement();
			estatuto.executeUpdate("INSERT INTO proveedores values('"+prov.getNit_prov()+"','"
					+prov.getNombre_prov()+"','"+prov.getDireccion_prov()+"','"+prov.getTelefono_prov()+"','"
							+prov.getCiudad_prov()+")");
			estatuto.close();
			con.desconectar();
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public ArrayList<Proveedores> consultarProveedor(int nit){
		ArrayList<Proveedores> misProveedores = new ArrayList<Proveedores>();
		Conexion con = new Conexion();
		try {
			PreparedStatement consulta = con.getConex().prepareStatement("SELECT * FROM proveedores WHERE nit=?");
			consulta.setInt(1, nit);
			ResultSet res = consulta.executeQuery();
			if (res.next()) {
				Proveedores prov = new Proveedores();
				prov.setNit_prov(res.getString("nit"));
				prov.setNombre_prov(res.getString("nombre_proveedor"));
				prov.setDireccion_prov(res.getString("direccion"));
				prov.setTelefono_prov(Long.parseLong(res.getString("telefono")));
				prov.setCiudad_prov(res.getString("ciudad"));
				
				misProveedores.add(prov);
			}
			res.close();
			consulta.close();
			con.desconectar();
		}catch(Exception e) {
			System.out.println(e);
		}
		return misProveedores;
	}
	
	public ArrayList<Proveedores> listaProveedores(){
		ArrayList<Proveedores> misProveedores = new ArrayList<Proveedores>();
		Conexion con = new Conexion();
		try {
			PreparedStatement consulta = con.getConex().prepareStatement("SELECT * FROM proveedores");
			ResultSet res = consulta.executeQuery();//Entender seleccion
			while(res.next()) {
				Proveedores prov = new Proveedores();
				prov.setNit_prov(res.getString("nit"));
				prov.setNombre_prov(res.getString("nombre_proveedor"));
				prov.setDireccion_prov(res.getString("direccion"));
				prov.setTelefono_prov(Long.parseLong(res.getString("telefono")));
				prov.setCiudad_prov(res.getString("ciudad"));
				
			}res.close();
			consulta.close();
			con.desconectar();
				
			}catch(Exception e) {
				System.out.println(e);
		}
		
		return misProveedores;
	}
	
	public void modificarProveedor(String nit, String nombre, String direccion,String tel, String ciudad){       
       String safe = "SET SQL_SAFE_UPDATES = 0";      
       String consulta = "UPDATE proveedores SET nombre_proveedor='"+nombre+"',direccion='"+direccion+"'"
       		+"',telefono='"+tel+"'"+"',ciudad='"+ciudad+"'"+ " WHERE nit='"+nit+"'";
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
    
    public void eliminarProveedor(String nit){
    	Conexion con = new Conexion();
        String consulta = "DELETE FROM proveedores WHERE nit='"+nit+"'";
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