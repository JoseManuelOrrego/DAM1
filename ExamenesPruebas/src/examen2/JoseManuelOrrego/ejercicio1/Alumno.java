package examen2.JoseManuelOrrego.ejercicio1;

public class Alumno implements Matriculable
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
	
	public void mostrarDatos()
	{
		System.out.println("Nombre del alumno -> " + this.nombre + "\nNota del alumno -> " + this.nota);
	}

	public void matricular(String nombreAsignatura) 
	{
		System.out.println("Alumno matriculado en -> " + nombreAsignatura);
	}
}
