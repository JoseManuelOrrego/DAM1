package pilaColaAlumnos;

import java.util.Random;

public class Principal 
{
	public static void main(String[] args) 
	{
		Alumno alumno;
		ColaAlumnos cola = new ColaAlumnos();
		PilaAlumnos pila = new PilaAlumnos();
		
		for(int i = 0; i < 2000; i++)
		{
			alumno = crearAlumno();
			cola.encolar(alumno);
			pila.apilar(alumno);
		}
		
		matricular(cola, 1000);
		System.out.println("Media de las notas de los alumnos --> " + media(pila));
		
		cola.mostrarCola();
		pila.mostrarPila();
	}
	
	public static Alumno crearAlumno()
	{
		Random random = new Random();
		String [] listaNombres = {"Yoshi", "Kirby", "Mario", "TonyHawks", "Kratos", "Master Chief", "Estela", "Lara Croft", "Samus", "Ash",
				"Stich", "Tom", "Jerry", "Ben", "Phil", "Marcus Fenix", "Pikachu", "Bowser", "Link", "Goron"};
		
		return new Alumno(listaNombres[random.nextInt(20)], random.nextInt(10));
	}
	
	public static void matricular(ColaAlumnos cola, int numMatriculados)
	{
		Random random = new Random();
		String [] asignaturas = {"Matematicas", "Lengua", "Biologia", "Historia", "Ingles", "Educacion Fisica", "Informatica", "Frances"};
		for(int i = 0; i < cola.numElementos(); i++)
		{
			Alumno alumno = cola.desencolar();
			if(i < numMatriculados)
			{
				alumno.matricular(asignaturas[random.nextInt(8)]);
			}
			cola.encolar(alumno);
		}
	}
	
	public static double media(PilaAlumnos pila)
	{
		return media(pila,0,0);
	}
	private static double media(PilaAlumnos pila, double numElementos, double sumatorio)
	{
		double nota = 0;
		Alumno alumno = null;
		if(!pila.pilaVacia())
		{
			alumno = pila.desapilar();
			sumatorio += alumno.getNota();
			nota = media(pila,numElementos+1, sumatorio);
			if(numElementos == pila.numElementos())
				return nota/numElementos;
			pila.apilar(alumno);
		}
		
		return sumatorio;
	}
}