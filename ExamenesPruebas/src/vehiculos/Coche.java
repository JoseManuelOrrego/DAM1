package vehiculos;

public class Coche extends Vehiculo implements Manejable
{
	public void manejar() 
	{
		System.out.println("Manejando " + getTipoVehiculo());
	}

	public String getTipoVehiculo() 
	{
		return "Coche";
	}

}
