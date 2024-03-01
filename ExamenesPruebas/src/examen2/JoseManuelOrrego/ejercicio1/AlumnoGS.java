package examen2.JoseManuelOrrego.ejercicio1;

public class AlumnoGS extends Alumno implements Matriculable, Contratable
{
	private boolean practicasTerminadas;
	
	public AlumnoGS(String nombre, int nota, boolean practicasTerminadas) 
	{
		super(nombre, nota);
		this.practicasTerminadas = practicasTerminadas;
	}

	public void mostrarDatos()
	{
		super.mostrarDatos();
		System.out.println("Ha terminado las practicas -> " + this.practicasTerminadas);
	}

	public void contratar(String nombreEmpresa) 
	{
		System.out.println("Alumno ha sido contratado en -> " + nombreEmpresa);
	}
}
