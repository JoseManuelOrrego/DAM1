package granjaReinventadaAnimales;

import java.util.Random;

public class Vacas extends Animales
{
	private boolean estaPreņada;
	
	public Vacas(String nombre, boolean buenaSalud, String nombreEspecie)
	{
		super(150, nombre, buenaSalud, nombreEspecie, 15);
		setPreņada(false);
	}
	
	public boolean isPreņada()
	{
		return this.estaPreņada;
	}
	
	public void setPreņada(boolean estaPreņada)
	{
		this.estaPreņada = estaPreņada;
	}
	
	public void sonido()
	{
		System.out.println("MUU");
	}
	
	public void producir()
	{
		int litrosLeche = 0;
		if(isPreņada())
		{
			if(isBuenaSalud())
			{
				litrosLeche = 10;
			}
			else
			{
				litrosLeche = 2;
			}
			sonido();
		}
		System.out.println("La vaca " + getNombre() + " ha producido " + litrosLeche + " litros de leche.");
		
		Random ra = new Random();
		if(ra.nextBoolean())
		{
			setPreņada(true);
		}
		else
		{
			setPreņada(false);
		}
	}
}
