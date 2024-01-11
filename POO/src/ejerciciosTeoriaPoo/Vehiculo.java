package ejerciciosTeoriaPoo;

public abstract class Vehiculo 
{
	protected int velocidadActual;
	protected int platoActual;
	
	public Vehiculo(int velocidadActual, int platoActual)
	{
		this.velocidadActual = velocidadActual;
		this.platoActual = platoActual;
	}
	
	public abstract void acelerar();
	
	public abstract void frenar();
	
	public void cambiarPlato(int plato)
	{
		this.platoActual = plato;
	}
}
