package vehiculos;

public class Avion extends Vehiculo implements Volable, Manejable
{
	public String getTipoVehiculo() 
	{
		return "Avion";
	}

	public void volar() 
	{
		System.out.println("Volando " + getTipoVehiculo());
	}

	public void manejar() 
	{
		System.out.println("Manejando " + getTipoVehiculo());
	}

}
