package pilaGenerica;

public class PilaGenerica <T>
{
	private Nodo<T> primero;
	private Nodo<T> cima;
	private int elementos;
	
	public PilaGenerica()
	{
		primero = null;
		cima = null;
		elementos = 0;
	}
	
	public void apilar(T dato)
	{
		Nodo<T> nodo = new Nodo<T>(dato, null);
		if(pilaVacia())
		{
			cima = nodo;
			primero = nodo;
			elementos++;
		}
		else if(pilaLlena())
		{
			System.out.println("Pila llena. Maximo de 2000");
		}
		else
		{
			cima.enlace = nodo;
			cima = nodo;
			elementos++;
		}
	}
	public Nodo<T> desapilar()
	{
		if(pilaVacia())
		{
			System.err.println("Pila Vacia");
			return null;
		}
		else if(cima == primero)
		{
			Nodo<T> aDevolver = cima;
			cima = null;
			primero = null;
			elementos--;
			return aDevolver;
		}
		else
		{
			Nodo<T> anterior = primero;
			while(anterior.enlace != cima)
			{
				anterior = anterior.enlace;
			}
			Nodo<T> aDevolver = cima;
			cima = anterior;
			elementos--;
			return aDevolver;
		}
	}
	
	public boolean pilaVacia()
	{
		return cima == null;
	}
	public boolean pilaLlena()
	{
		return elementos == 2000;
	}
}
