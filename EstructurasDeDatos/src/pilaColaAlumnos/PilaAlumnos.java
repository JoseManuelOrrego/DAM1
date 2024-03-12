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
		if(pilaVacia())
		{
			System.out.println("La pila de Alumnos está vacía");
			return null;
		}
		else if(cima == 0)
		{
			Alumno [] pilaAux = new Alumno[0];
			Alumno retornable = pila[cima--];
			pila = pilaAux;
			return retornable;
		}
		else
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
	public boolean pilaVacia()
	{
		return cima == -1;
	}
}
