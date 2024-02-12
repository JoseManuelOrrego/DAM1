package vehiculos;

public class Barco extends Vehiculo implements Manejable
{

	public String getTipoVehiculo() 
	{
		return "Barco";
	}

	public void manejar() 
	{
		System.out.println("Manejando " + getTipoVehiculo());
	}

}
