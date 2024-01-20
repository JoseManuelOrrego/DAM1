package clases;

import otros.CreadorDeAleatorios;

public class Clientes 
{
	protected String nombre;
	protected boolean quiereComprar;
	
	public Clientes(String nombre)
	{
		this.nombre = nombre;
		quiereComprar = CreadorDeAleatorios.booleanoAleatorio();
	}
	
	public String getNombre()
	{
		return nombre;
	}
	public boolean getQuiereComprar()
	{
		return quiereComprar;
	}
}