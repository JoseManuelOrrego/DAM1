package granjaReinventadaAnimales;

import java.util.Random;

public class Vacas extends Animales
{
	private boolean estaPrenada;
	
	public Vacas(String nombre)
	{
		super(150, nombre, "Vacas", 15);
		setPrenada(false);
	}
	
	public boolean isPrenada()
	{
		return this.estaPrenada;
	}
	
	public void setPrenada(boolean estaPrenada)
	{
		this.estaPrenada = estaPrenada;
	}
	
	public void sonido()
	{
		System.out.println("MUU");
	}
	
	public void producir()
	{
		int litrosLeche = 0;
		if(isPrenada())
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
		System.out.println();
		
		Random ra = new Random();
		if(ra.nextBoolean())
		{
			setPrenada(true);
		}
		else
		{
			setPrenada(false);
		}
	}
}
