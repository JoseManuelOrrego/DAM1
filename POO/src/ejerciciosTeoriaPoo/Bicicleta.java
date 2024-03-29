package ejerciciosTeoriaPoo;

public class Bicicleta extends Vehiculo implements Imprimible
{
	protected int pinnonActual;
	
	public Bicicleta(int velocidadActual, int platoActual, int pinnonActual)
	{
		super(velocidadActual,platoActual);
		this.pinnonActual = pinnonActual;
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
	
	public void cambiarpinnon(int pinnon)
	{
		this.pinnonActual = pinnon;
	}
	
	public void cambiarpinnon()
	{
		this.pinnonActual = 1;
	}

	public void imprime() 
	{
		System.out.println("Velocidad actual: " + velocidadActual + "\nPlato actual: " + platoActual + "\nP�nnon actual: " + pinnonActual);
	}

	public int[] getAtributos() 
	{
		return new int[] {velocidadActual,platoActual,pinnonActual};
	}
}