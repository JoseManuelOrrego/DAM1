package examen2.JoseManuelOrrego.ejercicio1;

public class AlumnoGM extends Alumno implements Matriculable
{
	private String nombreCentro;
	
	public AlumnoGM(String nombre, int nota, String nombreCentro) 
	{
		super(nombre, nota);
		this.nombreCentro = nombreCentro;
	}
	
	public void mostrarDatos()
	{
		super.mostrarDatos();
		System.out.println("Nombre del centro -> " + this.nombreCentro);
	}
}
