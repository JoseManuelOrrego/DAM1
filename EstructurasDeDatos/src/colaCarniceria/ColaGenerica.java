package colaCarniceria;

public class ColaGenerica <T>
{
	private Nodo<T> primero;
	private Nodo<T> ultimo;
	private int numElementos;
	
	public ColaGenerica()
	{
		primero = null;
		ultimo = null;
		numElementos = 0;
	}
	
	public void encolar(T t)
	{
		Nodo<T> nodo = new Nodo<T>(t,null);
		if(colaVacia())
		{
			ultimo = nodo;
			primero = nodo;
			numElementos += 1;
		}
		else
		{
			ultimo.enlace = nodo;
			ultimo = nodo;	
			numElementos += 1;
		}
	}
	
	public T desencolar()
	{
		if(colaVacia())
		{
			System.err.println("Cola Vacia");
			return null;
		}
		else if(ultimo == primero)
		{
			Nodo<T> aDevolver = ultimo;
			ultimo = null;
			primero = null;			
			numElementos -= 1;
			return aDevolver.info;
		}
		else
		{
			Nodo<T> aDevolver = primero;
			primero = primero.enlace;
			numElementos -= 1;
			return aDevolver.info;
		}
	}
	
	public boolean colaVacia()
	{
		return ultimo == null;
	}
}
