package clases;

import interfaces.Alquilable;
import interfaces.Comprable;
import otros.Globales;

public class Coches extends Vehiculos implements Alquilable, Comprable
{
	protected int numPuertas;
	protected boolean esElectrico;
	protected boolean esTermico;
	
	public Coches(String marca, String modelo, double precio, int numPuertas, boolean esElectrico, boolean esTermico) 
	{
		super(marca, modelo, precio);
		this.numPuertas = numPuertas;
		this.esElectrico = esElectrico;
		this.esTermico = esTermico;
	}

	public int getNumPuertas() 
	{
		return numPuertas;
	}
	public void setNumPuertas(int numPuertas) 
	{
		this.numPuertas = numPuertas;
	}
	public boolean getEsElectrico() 
	{
		return esElectrico;
	}
	public void setEsElectrico(boolean esElectrico) 
	{
		this.esElectrico = esElectrico;
	}
	public boolean getEsTermico() 
	{
		return esTermico;
	}
	public void setEsTermico(boolean esTermico) 
	{
		this.esTermico = esTermico;
	}

	public void comprar() 
	{
		System.out.println("Has comprado el coche " + getMarca() + " " + getModelo() + 
				" por un precio de " + calcPrecioCompra() + " euros. Disfruta de tu compra!");
	}

	public double calcPrecioCompra() 
	{
		return precio + calcularImpuestos();
	}

	public void alquilar() 
	{
		System.out.println("Has alquilado el coche " + getMarca() + " " + getModelo() + 
				" por un precio de " + calcPrecioAlquiler() + " euros. Disfruta del alquiler!");
	}

	public double calcPrecioAlquiler() 
	{
		return calcPrecioCompra() * Globales.ALQUILER_COCHE;
	}

	public double calcularImpuestos() 
	{
		if(esElectrico)
		{
			return (precio*Globales.IMPUESTO_ELECT);
		}
		else
		{
			return (precio*Globales.IMPUESTO_TERMICO);
		}
	}

	public double calcularDepreciacion(int annos) 
	{
		if(esElectrico)
		{
			return (annos*Globales.DEP_ELECTRICO);
		}
		else
		{
			return (annos*Globales.DEP_TERMICO);
		}
	}
}
