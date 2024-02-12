package vehiculos;

public class Camion extends Vehiculo implements Manejable
{
	public void manejar() 
	{
		System.out.println("Manejando " + getTipoVehiculo());
	}

	public String getTipoVehiculo() 
	{
		return "Camion";
	}

}
