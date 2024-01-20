package clases;

import interfaces.Comprable;
import otros.Globales;

public class Camiones extends Vehiculos implements Comprable
{
	protected double capacidadCarga;
	
	public Camiones(String marca, String modelo, double precio, double capacidadCarga)
	{
		super(marca,modelo,precio);
		this.capacidadCarga = capacidadCarga;
	}

	public double getCapacidadCarga() 
	{
		return capacidadCarga;
	}
	public void setCapacidadCarga(double capacidadCarga) 
	{
		this.capacidadCarga = capacidadCarga;
	}

	public void comprar() 
	{
		System.out.println("Has comprado el camion " + getMarca() + " " + getModelo() + 
				" por un precio de " + calcPrecioCompra() + " euros. Disfruta de tu compra!");
	}

	public double calcPrecioCompra()
	{
		return precio+calcularImpuestos();
	}

	public double calcularImpuestos()
	{
		return precio*Globales.IMPUESTO_CAMION;
	}

	public double calcularDepreciacion(int annos) 
	{
		return precio*Globales.DEP_CAMION;
	}
}
