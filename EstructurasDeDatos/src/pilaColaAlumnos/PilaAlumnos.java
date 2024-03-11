package pilaColaAlumnos;

public class PilaAlumnos 
{
	private Alumno[] pila;
	private int cima;
	
	public PilaAlumnos()
	{
		pila = new Alumno[0];
		cima = -1;
	}
	
	public void apilar(Alumno alumno)
	{
		Alumno [] pilaAux = new Alumno[pila.length+1];
		for(int i = 0; i < pila.length; i++)
		{
			pilaAux[i] = pila[i];
		}
		pilaAux[cima+1] = alumno;
		pila = pilaAux;
		cima++;
	}
	
	public Alumno desapilar()
	{
		Alumno [] pilaAux = new Alumno[pila.length-1];
		for(int i = 0; i < pilaAux.length; i++)
		{
			pilaAux[i] = pila[i];
		}
		Alumno retornable = pila[cima--];
		pila = pilaAux;
		return retornable;
	}
}
