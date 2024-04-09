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
		while (tieneEnlace(nodo) && i < posicion) 
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
		while(actual != null && !actual.info.equals(elemento))
		{
			actual = actual.enlace;
			posicion++;
		}
		return posicion;
	}

	@SuppressWarnings("unchecked")
	public T[] aArray() 
	{
		Object[] array = new Object[numElementos];
		Nodo<T> actual = inicio;
		int i = 0;
		while(actual != null)
		{
			array[i++] = actual.info;
			actual = actual.enlace;
		}
		return (T[]) array;
	}

	public T eliminar(int posicion) 
	{
		if(estaVacia())
		{
			System.out.println("La lista esta vacia");
			return null;
		}
		if(posicion <= 1)
		{
			if(posicion == 0)
			{
				Nodo<T> aDevolver = inicio;
				inicio = inicio.enlace;
				numElementos--;
				return aDevolver.info;
			}
		}
		Nodo<T> actual = inicio;
		Nodo<T> anterior = actual;
		int i = 0;
		while (tieneEnlace(actual) && i < posicion) 
		{
			if(i > 0)
			{
				anterior = anterior.enlace;
			}
			actual = actual.enlace;
			i++;
		}
		anterior.enlace = actual.enlace;
		numElementos--;
		return actual.info;
	}

	public boolean eliminar(T elemento) 
	{
		int indice = indice(elemento);
		if(indice != -1)
		{
			eliminar(indice);
			return true;
		}
		else
		{
			System.out.println("El elemento no se encuentra en la lista");
			return false;
		}
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
		ListaEnlazada<T> sublista = new ListaEnlazada<T>();
		Nodo<T> actual = inicio;
		int i = 0;
		while(actual != null && i <= hasta)
		{
			if(i >= desde && i <= hasta)
			{
				sublista.insertar(actual.info);
			}
			actual = actual.enlace;
			i++;
		}
		return sublista;
	}

	public void concatenar(Lista<T> listaNueva) 
	{
		if(listaNueva instanceof ListaEnlazada)
		{
			ListaEnlazada<T> lista = (ListaEnlazada<T>) listaNueva;
			T[] array = lista.aArray();
			for(int i = 0; i < array.length; i++)
			{
				insertar(array[i]);
			}
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
	
	public void insertarInicio(T elemento)
	{
		if(!estaVacia())
		{
			Nodo<T> nodo = new Nodo<T>(elemento, null);
			nodo.enlace = inicio;
			inicio = nodo;
			numElementos++;
		}
		else
		{
			Nodo<T> nodo = new Nodo<T>(elemento, null);
			inicio = nodo;
			ultimo = nodo;
			numElementos++;
		}
	}
	public void insertarFinal(T elemento)
	{
		if(!estaVacia())
		{
			Nodo<T> nodo = new Nodo<T>(elemento, null);
			ultimo.enlace = nodo;
			ultimo = nodo;
			numElementos++;
		}
		else
		{
			Nodo<T> nodo = new Nodo<T>(elemento, null);
			inicio = nodo;
			ultimo = nodo;
			numElementos++;
		}
	}
	public boolean contiene(T elemento)
	{
		boolean contiene = false;
		Nodo<T> actual = inicio;
		while(actual != null && !actual.info.equals(elemento))
		{
			actual = actual.enlace;
			if(actual.info.equals(elemento))
				contiene = true;
		}
		return contiene;
	}
	public T mirarInicio()
	{
		return inicio.info;
	}
	public T mirarFinal()
	{
		return ultimo.info;
	}
	public boolean eliminarInicio()
	{
		inicio = inicio.enlace;
		numElementos--;
		return true;
	}
	public boolean eliminarFinal()
	{
		Nodo<T> actual = inicio;
		Nodo<T> anterior = actual;
		int i = 0;
		while (tieneEnlace(actual)) 
		{
			if(i > 0)
			{
				anterior = anterior.enlace;
			}
			actual = actual.enlace;
			i++;
		}
		anterior.enlace = null;
		numElementos--;
		return true;
	}
}
