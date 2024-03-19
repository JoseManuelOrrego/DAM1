package pilaGenerica;

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
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	public int getNota()
	{
		return nota;
	}
	public void setNota(int nota)
	{
		this.nota = nota;
	}
	
	public void matricular(String nombreAsignatura) 
	{
		System.out.println("Alumno matriculado en -> " + nombreAsignatura);
	}
	
	public void mostrarDatos()
	{
		System.out.println("--------------------------------");
		System.out.println("Nombre del alumno --> " + nombre + "\nNota --> " + nota);
	}
}
