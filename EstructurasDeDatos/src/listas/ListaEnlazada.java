package listas;

public class ListaEnlazada<T> implements Lista<T> 
{
	private Nodo<T> inicio;
	private Nodo<T> ultimo;
	private int numElementos;
	
	public ListaEnlazada()
	{
		inicio = null;
		ultimo = null;
		numElementos = 0;
	}
	
	private Nodo<T> getNodo(int posicion) 
	{
		if (posicion < 0 || posicion >= numElementos) 
		{
			return null;
		}
		Nodo<T> nodo = inicio;
		int i = 0;
		while (tieneEnlace(nodo) && i < posicion) 
		{
			nodo = nodo.enlace;
			i++;
		}
		return nodo;
	}

	private boolean tieneEnlace(Nodo<T> nodo) 
	{
		return nodo.enlace != null;
	}
	
	public void insertar(int posicion, T elemento) 
	{
		Nodo<T> nodo = new Nodo<T>(elemento,null); 
		if(estaVacia())
		{
			inicio = nodo;
			ultimo = nodo;
			numElementos++;
		}
		else if(posicion >= 0 && posicion < numElementos)
		{
			Nodo<T> actual = inicio;
			Nodo<T> anterior = null;
			int i = 0;
			while(tieneEnlace(actual) && i < posicion)
			{
				anterior = actual;
				actual = actual.enlace;
				i++;
			}
			anterior.enlace = nodo;
			nodo.enlace = actual;
			numElementos++;
		}
		else
		{
			insertar(elemento);
		}
	}

	public void insertar(T elemento)
	{
		Nodo<T> nodo = new Nodo<T>(elemento, null);
		if(estaVacia())
		{
			inicio = nodo;
			ultimo = nodo;
			numElementos++;
		}
		else
		{
			ultimo.enlace = nodo;
			ultimo = nodo;
			numElementos++;
		}
	}

	public void vaciar()
	{
		inicio = null;
		ultimo = null;
		numElementos = 0;
	}

	public T get(int posicion) 
	{
		Nodo<T> nodo = inicio;
		int i = 0;
		while (i < posicion) 
		{
			nodo = nodo.enlace;
			i++;
		}
		return nodo.info;
	}

	public boolean estaVacia()
	{
		return inicio == null;
	}

	public int indice(T elemento) 
	{
		Nodo<T> actual = inicio;
		int posicion = 0;
		while(actual.enlace != null && actual.info == elemento)
		{
			actual = actual.enlace;
			posicion++;
		}
		return posicion;
	}

	public T[] aArray() 
	{
		return null;
	}

	public T eliminar(int posicion) 
	{
		return null;
	}

	public boolean eliminar(T elemento) 
	{
		return false;
	}

	public T set(int posicion, T elemento)
	{
		Nodo<T> aux = getNodo(posicion);
		T retornar = aux.info;
		aux.info = elemento;
		return retornar;
	}

	public int tamanno() 
	{
		return numElementos;
	}

	public Lista<T> sublista(int desde, int hasta) 
	{
		return null;
	}

	public void concatenar(Lista<T> listaNueva) 
	{
		if(listaNueva instanceof ListaEnlazada)
		{
			ListaEnlazada<T> lista = (ListaEnlazada<T>) listaNueva;
			ultimo.enlace = lista.inicio;
			ultimo = lista.ultimo;
			numElementos += lista.numElementos;
		}
		else if(listaNueva instanceof ArrayDinamico)
		{
			ArrayDinamico<T> lista = (ArrayDinamico<T>) listaNueva;
			T [] array = lista.aArray();
			for(int i = 0; i < array.length; i++)
			{
				insertar(array[i]);
			}
		}
	}
	
}
