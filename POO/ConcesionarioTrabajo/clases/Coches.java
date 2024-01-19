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

	public void comprar() 
	{
		
	}

	public double calcPrecioCompra() 
	{
		return precio + calcularImpuestos();
	}

	public void alquilar() 
	{
		
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
