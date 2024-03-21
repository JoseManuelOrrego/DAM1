package colaCarniceria;

public class Cliente 
{
	private String nombre;
	
	public Cliente(String nombre)
	{
		this.nombre = nombre;
	}
	
	public void llega()
	{
		System.out.println("¿Quien es el ultimo?");
	}
	public void contestaUltimo()
	{
		System.out.println("Yo soy el ultimo");
	}
	public void seVa()
	{
		System.out.println("Gracias, me voy");
	}
}
