package pilaNodos;

public class PilaNodos 
{
	private Nodo primero;
	private Nodo cima;
	
	public PilaNodos()
	{
		primero = null;
		cima = null;
	}
	
	public void apilar(String s)
	{
		Nodo nodo = new Nodo(s,null);
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
	
	public void mostrarPila()
	{
		Nodo actual = primero;
		while(actual != null)
		{
			String cadena = (String) actual.info;
			System.out.print(cadena);
			actual = actual.enlace;
		}
	}
}
