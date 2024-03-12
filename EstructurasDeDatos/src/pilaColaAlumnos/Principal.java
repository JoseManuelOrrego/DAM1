package pilaColaAlumnos;

import java.util.Random;

public class Principal 
{
	public static void main(String[] args) 
	{
		Alumno [] alumnosTotales = new Alumno[2000];
		
		for(int i = 0; i < alumnosTotales.length; i++)
		{
			alumnosTotales[i] = crearAlumno();
		}
	}
	
	public static Alumno crearAlumno()
	{
		Random random = new Random();
		String [] listaNombres = {"Yoshi", "Kirby", "Mario", "TonyHawks", "Kratos", "Master Chief", "Estela", "Lara Croft", "Samus", "Ash",
				"Stich", "Tom", "Jerry", "Ben", "Phil", "Marcus Fenix", "Pikachu", "Bowser", "Link", "Goron"};
		
		return new Alumno(listaNombres[random.nextInt(20)], random.nextInt(10));
	}
}