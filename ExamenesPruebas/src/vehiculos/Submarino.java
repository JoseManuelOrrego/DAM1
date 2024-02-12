package vehiculos;

public class Submarino extends Vehiculo implements Manejable, Sumergible
{
	public void sumergir() 
	{
		System.out.println("Sumergiendo el " + getTipoVehiculo());
	}

	public void manejar() 
	{
		System.out.println("Manejando " + getTipoVehiculo());
	}

	public String getTipoVehiculo() 
	{
		return "Submarino";
	}
	
}
