package com.edu.unbosque.Alemmakeup;

import com.opencsv.bean.CsvBindByName;

public class ProducosDetalles {
    @CsvBindByName
	private int idproducto;
    @CsvBindByName
	private String nombre_producto;
    @CsvBindByName
	private int nit_proveedor;
    @CsvBindByName
	private double precio_compra;
    @CsvBindByName
	private double ivacompra;
    @CsvBindByName
	private double precio_venta;
	
	
	
	public ProducosDetalles() {
		super();
	}
	public String getNombre_producto() {
		return nombre_producto;
	}
	public void setNombre_producto(String nombre_producto) {
		this.nombre_producto = nombre_producto;
	}
	public int getNit_proveedor() {
		return nit_proveedor;
	}
	public void setNit_proveedor(int nit_proveedor) {
		this.nit_proveedor = nit_proveedor;
	}
	public double getPrecio_compra() {
		return precio_compra;
	}
	public void setPrecio_compra(double precio_compra) {
		this.precio_compra = precio_compra;
	}
	public double getIvacompra() {
		return ivacompra;
	}
	public void setIvacompra(double ivacompra) {
		this.ivacompra = ivacompra;
	}
	public double getPrecio_venta() {
		return precio_venta;
	}
	public void setPrecio_venta(double precio_venta) {
		this.precio_venta = precio_venta;
	}
	
	
	
}
