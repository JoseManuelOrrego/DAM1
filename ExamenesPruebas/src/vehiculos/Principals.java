package vehiculos;

public class Principals 
{
	public static void main(String[] args) 
	{
		Vehiculo [] catalogo = {new Avion(), new Barco(), new Camion(), new Coche(), new Helicoptero(), new Submarino()};
		
		for(int i = 0; i < catalogo.length; i++)
		{
			if(catalogo[i] instanceof Manejable)
			{
				if(catalogo[i] instanceof Volable)
				{
					if(catalogo[i] instanceof Avion)
					{
						((Avion) catalogo[i]).volar();
						((Avion) catalogo[i]).manejar();
					}
					else
					{
						((Helicoptero) catalogo[i]).volar();
						((Helicoptero) catalogo[i]).manejar();
					}
				}
				else
				{
					System.out.println("El vehiculo no puede volar");
				}
				if(catalogo[i] instanceof Sumergible)
				{
					((Submarino) catalogo[i]).sumergir();
					((Submarino) catalogo[i]).manejar();
				}
				else
				{
					System.out.println("El vehiculo no puede sumergirse");
				}
				if(catalogo[i] instanceof Barco)
				{
					((Barco)catalogo[i]).manejar();
				}
				else if(catalogo[i] instanceof Camion)
				{
					((Camion)catalogo[i]).manejar();
				}
				else if(catalogo[i] instanceof Coche)
				{
					((Coche)catalogo[i]).manejar();
				}
			}
		}
	}
}