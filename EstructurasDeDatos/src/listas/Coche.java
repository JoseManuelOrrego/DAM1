package listas;

public class Coche 
{
	private String marcaModelo;
	private int numPuertas;
	private int precio;
	
	public Coche(String marcaModelo, int numPuertas, int precio)
	{
		this.marcaModelo = marcaModelo;
		this.numPuertas = numPuertas;
		this.precio = precio;
	}
	
	public void mostarDatos()
	{
		System.out.println("Marca-Modelo -> "+ marcaModelo +
				"\nNumero de puertas -> " + numPuertas + "\nPrecio -> " + precio + " euros");
	}
}
