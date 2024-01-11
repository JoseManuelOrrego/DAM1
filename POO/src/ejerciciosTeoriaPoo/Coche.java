package ejerciciosTeoriaPoo;

public class Coche extends Vehiculo
{
	public Coche(int velocidadActual, int platoActual)
	{
		super(velocidadActual, platoActual);
	}


	public void cambiarPlato(int plato) 
	{
		this.platoActual = plato;
	}

	public void acelerar() 
	{
		this.velocidadActual = velocidadActual*5;
	}


	public void frenar() 
	{
		if(velocidadActual < 6)
			this.velocidadActual = 0;
		else
			this.velocidadActual = velocidadActual/2;
	}
}
