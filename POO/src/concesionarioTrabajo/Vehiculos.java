package concesionarioTrabajo;

public abstract class Vehiculos 
{
	protected String marca;
	protected String modelo;
	protected double precio;
	
	public Vehiculos(String marca, String modelo, double precio)
	{
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}
	
	public String getMarca()
	{
		return marca;
	}
	public String getModelo()
	{
		return modelo;
	}
	public double getPrecio()
	{
		return precio;
	}
	
	public void setMarca(String marca)
	{
		this.marca = marca;
	}
	public void setModelo(String modelo)
	{
		this.modelo = modelo;
	}
	public void setPrecio(double precio)
	{
		this.precio = precio;
	}
	
	public String getDetalles()
	{
		return "Detalles del vehiculo: \nMarca -> " + getMarca() + "\nModelo -> " + getModelo() + "\nPrecio -> " + getPrecio();
	}
	
	public abstract void calcularImpuestos();
	
	public abstract void calcularDepreciacion(int annos);
}
