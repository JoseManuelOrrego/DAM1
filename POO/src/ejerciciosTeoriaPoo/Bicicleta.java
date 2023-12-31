package ejerciciosTeoriaPoo;

public class Bicicleta 
{
	protected int velocidadActual;
	protected int platoActual;
	protected int pinnonActual;
	
	public Bicicleta(int velocidadActual, int platoActual, int pinnonActual)
	{
		this.velocidadActual = velocidadActual;
		this.platoActual = platoActual;
		this.pinnonActual = pinnonActual;
	}
	
	public Bicicleta()
	{
		velocidadActual = 0;
		platoActual = 1;
		pinnonActual = 1;
	}

	public int getVelocidad()
	{
		return velocidadActual;
	}
	public void setVelocidad(int velocidadActual)
	{
		this.velocidadActual = velocidadActual;
	}

	public int getPlato()
	{
		return platoActual;
	}
	public void set(int platoActual)
	{
		this.platoActual = platoActual;
	}
	
	public int getpinnon()
	{
		return pinnonActual;
	}
	public void setpinnon(int pinnonActual)
	{
		this.pinnonActual = pinnonActual;
	}
	
	public void acelerar()
	{
		this.velocidadActual*=2;
	}
	
	public void frenar()
	{
		this.velocidadActual/=2;
	}
	
	public void cambiarPlato(int plato)
	{
		this.platoActual = plato;
	}
	
	public void cambiarpinnon(int pinnon)
	{
		this.pinnonActual = pinnon;
	}
	
	public void cambiarPlato()
	{
		this.platoActual = 1;
	}
	
	public void cambiarpinnon()
	{
		this.pinnonActual = 1;
	}
}