package examen2.JoseManuelOrrego.ejercicio2;

public class Alumno 
{
	private String nombre;
	private int nota;
	
	public Alumno(String nombre, int nota)
	{
		this.nombre = nombre;
		this.nota = nota;
	}
	
	public String getNombre()
	{
		return nombre;
	}
	public int getNota()
	{
		return nota;
	}
	public void setNota(int nota)
	{
		this.nota = nota;
	}
}
