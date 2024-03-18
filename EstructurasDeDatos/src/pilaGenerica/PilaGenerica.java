package pilaGenerica;

import pilaNodos.Nodo;

public class PilaGenerica <T>
{
	private Nodo<String> primero;
	private Nodo<T> cima;
	private int tamMax;
	
	public PilaGenerica()
	{
		primero = new Nodo(null,null);
		cima = null;
		tamMax = 2000;
	}
	
	public void apilar(T dato)
	{
		Nodo nodo = new Nodo(dato, null);
		if(pilaVacia())
		{
			cima = nodo;
			primero = nodo;
		}
		else
		{
			cima.enlace = nodo;
			cima = nodo;
		}
	}
	public Nodo desapilar()
	{
		if(pilaVacia())
		{
			System.err.println("Pila Vacia");
			return null;
		}
		else if(cima == primero)
		{
			Nodo aDevolver = cima;
			cima = null;
			primero = null;
			return aDevolver;
		}
		else
		{
			Nodo anterior = primero;
			while(anterior.enlace != cima)
			{
				anterior = anterior.enlace;
			}
			Nodo aDevolver = cima;
			cima = anterior;
			return aDevolver;
		}
	}
	
	public boolean pilaVacia()
	{
		return cima == null;
	}
}
