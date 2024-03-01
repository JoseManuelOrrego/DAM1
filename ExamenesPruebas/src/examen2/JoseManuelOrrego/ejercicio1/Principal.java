package examen2.JoseManuelOrrego.ejercicio1;

import java.util.Random;

public class Principal 
{
	public static void main(String[] args) 
	{
		Alumno [] listaAlumnos = new Alumno[2000];
		for(int i = 0; i < listaAlumnos.length; i++)
		{
			listaAlumnos[i] = alumnoAleatorio("A"+i+"A");
		}
		
		for(int i = 0; i < listaAlumnos.length; i++)
		{
			listaAlumnos[i].matricular("Programacion");
			if(listaAlumnos[i] instanceof AlumnoGS)
			{
				((AlumnoGS) listaAlumnos[i]).contratar("Empresa de Programacion");
			}
		}
		
		for(int i = 0; i < 10; i++)
		{
			listaAlumnos[i].mostrarDatos();
		}
	}
	
	public static Alumno alumnoAleatorio(String nombre)
	{
		Random random = new Random();
		int tipo = random.nextInt(3);
		
		Alumno alumno = null;
		switch(tipo)
		{
		case 0:
			alumno = new Alumno(nombre, random.nextInt(10));
			return alumno;
		case 1:
			alumno = new AlumnoGM(nombre, random.nextInt(10), "Goya");
			return alumno;
		case 2:
			alumno = new AlumnoGS(nombre, random.nextInt(10), random.nextBoolean());
			return alumno;
		}
		return alumno;
	}
}