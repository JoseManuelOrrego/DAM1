package e0504;

import java.io.Serializable;

public class Producto implements Serializable
{
	private static final long serialVersionUID = 1L;
	private String nombre;
	private String descripcion;
	private double precio;
	private int stock;
	
	public Producto(String nombre, String descripcion, double precio, int stock)
	{
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.stock = stock;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public int getStock() {
		return stock;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
}
