package clases;

import interfaces.Alquilable;

public class Motocicletas extends Vehiculos implements Alquilable
{
	protected String tipoTransmision;
	protected boolean tieneSidecar;
	
	public Motocicletas(String marca, String modelo, double precio, String tipoTransmision, boolean tieneSidecar) 
	{
		super(marca, modelo, precio);
		this.tipoTransmision = tipoTransmision;
		this.tieneSidecar = tieneSidecar;
	}

	public void alquilar() 
	{
		
	}

	public double calcPrecioAlquiler() 
	{
		return 0;
	}

	public double calcularImpuestos() 
	{
		return 0;
	}

	public double calcularDepreciacion(int annos) 
	{
		return 0;
	}
	
}
