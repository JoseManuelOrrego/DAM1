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
		Nodo nodo = new Nodo(t,null);
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
	
	public Nodo desencolar()
	{
		if(colaVacia())
		{
			System.err.println("Cola Vacia");
			return null;
		}
		else if(ultimo == primero)
		{
			Nodo aDevolver = ultimo;
			ultimo = null;
			primero = null;			
			numElementos -= 1;
			return aDevolver;
		}
		else
		{
			Nodo aDevolver = primero;
			primero = primero.enlace;
			numElementos -= 1;
			return aDevolver;
		}
	}
	
	public boolean colaVacia()
	{
		return ultimo == null;
	}
}
