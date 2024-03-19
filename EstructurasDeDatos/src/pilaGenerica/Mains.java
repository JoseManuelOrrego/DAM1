package pilaGenerica;

import java.util.Random;

public class Mains 
{
	public static void main(String[] args) 
	{
		PilaGenerica<String> pilaS = new PilaGenerica<String>();
		PilaGenerica<Alumno> pilaA = new PilaGenerica<Alumno>();
		
		String s1="-Hola";
		String s2=" don";
		String s3=" Pepito.";
		String s4="\n";
		String s5="-Hola";
		String s6=" don";
		String s7=" José.";
		
		pilaS.apilar(s7);
		pilaS.apilar(s6);
		pilaS.apilar(s5);
		pilaS.apilar(s4);
		pilaS.apilar(s3);
		pilaS.apilar(s2);
		pilaS.apilar(s1);

		vaciarS(pilaS);
		
		Random random = new Random();
		Alumno a1 = new Alumno ("Yoshi", random.nextInt(11));
		Alumno a2 = new Alumno ("Link", random.nextInt(11));
		Alumno a3 = new Alumno ("Takeshi", random.nextInt(11));
		Alumno a4 = new Alumno ("Lorena", random.nextInt(11));
		Alumno a5 = new Alumno ("Mike", random.nextInt(11));
		Alumno a6 = new Alumno ("Wazosky", random.nextInt(11));
		Alumno a7 = new Alumno ("Sullivan", random.nextInt(11));
		Alumno a8 = new Alumno ("Misae", random.nextInt(11));
		Alumno a9 = new Alumno ("Jake", random.nextInt(11));
		Alumno a10 = new Alumno ("Finn", random.nextInt(11));

		pilaA.apilar(a10);
		pilaA.apilar(a9);
		pilaA.apilar(a8);
		pilaA.apilar(a7);
		pilaA.apilar(a6);
		pilaA.apilar(a5);
		pilaA.apilar(a4);
		pilaA.apilar(a3);
		pilaA.apilar(a2);
		pilaA.apilar(a1);

		vaciarA(pilaA);
	}
	
	public static void vaciarS(PilaGenerica<String> pila)
	{
		while(!pila.pilaVacia())
		{
			System.out.print(pila.desapilar().info);
		}
		System.out.println();
	}
	
	public static void vaciarA(PilaGenerica<Alumno> pila)
	{
		while(!pila.pilaVacia())
		{
			Nodo<Alumno> alumno = pila.desapilar();
			alumno.info.mostrarDatos();
			alumno.info.matricular("Programacion");
		}
	}
}