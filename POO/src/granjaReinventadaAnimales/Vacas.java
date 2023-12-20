package granjaReinventadaAnimales;

import java.util.Random;

public class Vacas extends Animales
{
	private boolean estaPre�ada;
	
	public Vacas(String nombre, boolean buenaSalud, String nombreEspecie)
	{
		super(150, nombre, buenaSalud, nombreEspecie, 15);
		setPre�ada(false);
	}
	
	public boolean isPre�ada()
	{
		return this.estaPre�ada;
	}
	
	public void setPre�ada(boolean estaPre�ada)
	{
		this.estaPre�ada = estaPre�ada;
	}
	
	public void sonido()
	{
		System.out.println("MUU");
	}
	
	public void producir()
	{
		int litrosLeche = 0;
		if(isPre�ada())
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
			setPre�ada(true);
		}
		else
		{
			setPre�ada(false);
		}
	}
}
