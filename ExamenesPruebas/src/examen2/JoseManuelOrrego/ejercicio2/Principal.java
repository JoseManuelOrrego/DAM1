package examen2.JoseManuelOrrego.ejercicio2;

public class Principal 
{

	public static void main(String[] args) 
	{
		ArrayAlumnos arrayalumnos = new ArrayAlumnos();
		Alumno a1 = new Alumno("Yoshi", 9);
		Alumno a2 = new Alumno("Kirby", 3);
		Alumno a3 = new Alumno("Mario", 10);
		Alumno a4 = new Alumno("Peach", 9);
		Alumno a5 = new Alumno("Luigi", 1);

		arrayalumnos.insertar(a1);
		arrayalumnos.insertar(a2);
		arrayalumnos.insertar(a3);
		arrayalumnos.insertar(a4);
		arrayalumnos.insertar(a5);

		arrayalumnos.mostrar();
		
		arrayalumnos.eliminar("Peach");
		arrayalumnos.buscar("Mario").setNota(5);
		
		arrayalumnos.mostrar();
		
		System.out.println("Alumno con mejor nota -> " + arrayalumnos.maxNota().getNombre() + "/" + arrayalumnos.maxNota().getNota());
		System.out.println("Alumno con peor nota -> " + arrayalumnos.minNota().getNombre() + "/" + arrayalumnos.minNota().getNota());

		System.out.println("Media de todos los alumnos -> " + arrayalumnos.media());
		System.out.println("Media de los alumnos suspensos -> " + arrayalumnos.alumnosInferiores(5).media());
	}

}
