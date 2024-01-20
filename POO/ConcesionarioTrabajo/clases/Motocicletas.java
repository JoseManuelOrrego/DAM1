package clases;

import interfaces.Alquilable;
import otros.Globales;

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

	public String getTipoTransmision() 
	{
		return tipoTransmision;
	}
	public void setTipoTransmision(String tipoTransmision) 
	{
		this.tipoTransmision = tipoTransmision;
	}
	public boolean getTieneSidecar() 
	{
		return tieneSidecar;
	}
	public void setTieneSidecar(boolean tieneSidecar) 
	{
		this.tieneSidecar = tieneSidecar;
	}

	public void alquilar() 
	{
		System.out.println("Has alquilado la motocicleta " + getMarca() + " " + getModelo() + 
				" por un precio de " + calcPrecioAlquiler() + " euros. Disfruta del alquiler!");
	}

	public double calcPrecioAlquiler() 
	{
		return (precio+calcularImpuestos())*Globales.ALQUILER_MOTO;
	}

	public double calcularImpuestos() 
	{
		return precio*Globales.IMPUESTO_MOTO;
	}

	public double calcularDepreciacion(int annos) 
	{
		return annos*Globales.DEP_MOTO;
	}
	
}
