package e0504;

import java.io.Serializable;

public class Venta implements Serializable
{
	private static final long serialVersionUID = 1L;
	private String nombreProducto;
	private int cantidadVendida;
	private double precioVenta;
	
	public Venta(String nombreProducto, int cantidadVendida, double precioVenta)
	{
		this.nombreProducto = nombreProducto;
		this.cantidadVendida = cantidadVendida;
		this.precioVenta = precioVenta;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public int getCantidadVendida() {
		return cantidadVendida;
	}

	public double getPrecioVenta() {
		return precioVenta;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public void setCantidadVendida(int cantidadVendida) {
		this.cantidadVendida = cantidadVendida;
	}

	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}
	
	
}
