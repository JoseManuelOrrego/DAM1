package vehiculos;

public class Helicoptero extends Vehiculo implements Manejable, Volable
{
	public void volar() 
	{
		System.out.println("Volando " + getTipoVehiculo());		
	}

	public void manejar() 
	{
		System.out.println("Manejando " + getTipoVehiculo());
	}

	public String getTipoVehiculo() 
	{
		return "Helicoptero";
	}

}
