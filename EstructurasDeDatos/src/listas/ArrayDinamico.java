package listas;

public class ArrayDinamico<T> implements Lista<T> 
{
	private Object [] array;
	private int tamanno;
	
	public ArrayDinamico()
	{
		tamanno = 0;
		array = new Object[10];
	}
	
	public void insertar(int posicion, T elemento) 
	{
		if(array.length == tamanno)
		{
			boolean annadido = false;
			int longi = (int) (array.length*1.5);
			Object [] arrayAux = new Object[longi];
			for(int i = 0; i < arrayAux.length; i++)
			{
				if(i == posicion)
				{
					arrayAux[i] = elemento;
					annadido = true;
				}
				else
				{
					if(!annadido)
						arrayAux[i] = array[i];
					else
					{
						arrayAux[i] = array[i-1];
					}
				}
			}
			array = arrayAux;
			tamanno++;
		}
		else if(array[posicion] != null)
		{
			Object [] arrayAux = new Object[array.length];
			boolean annadido = false;
			for(int i = 0; i < array.length; i++)
			{
				if(i == posicion)
				{
					arrayAux[i] = elemento;
					annadido = true;
				}
				else
				{
					if(!annadido)
						arrayAux[i] = array[i];
					else
					{
						arrayAux[i] = array[i-1];
					}
				}
			}
			array = arrayAux;
			tamanno++;
		}
		else
		{
			array[++tamanno] = elemento;
		}
	}

	public void insertar(T elemento)
	{
		if(array.length == tamanno)
		{
			int longi = (int) (array.length*1.5);
			Object [] arrayAux = new Object[longi];
			for(int i = 0; i <= array.length; i++)
			{
				if(i == (array.length))
				{
					arrayAux[i] = elemento;
				}
				else
				{
					arrayAux[i] = array[i];
				}
			}
			array = arrayAux;
			tamanno++;
		}
		else
		{
			array[tamanno] = elemento;
			tamanno++;
		}
	}

	public void vaciar()
	{
		for(int i = 0; i < array.length; i++)
		{
			array[i] = null;
		}
	}

	@SuppressWarnings("unchecked")
	public T get(int posicion) 
	{
		if(posicion > (array.length-1) || posicion < 0)
		{
			System.out.println("La posicion se sale de la longitud del array");
			return null;
		}
		else
		{
			if(array[posicion] == null)
			{
				System.out.println("El array en esa posicion, no tiene ningun elemento");
				return null;
			}
			else
			{
				return (T) array[posicion];
			}
		}
	}

	public boolean estaVacia() 
	{
		return tamanno == 0;
	}

	public int indice(T elemento) 
	{
		for(int i = 0; i < array.length; i++)
		{
			@SuppressWarnings("unchecked")
			T aux = (T) array[i];
			if(aux.equals(elemento))
			{
				return i;
			}
		}
		return -1;
	}

	@SuppressWarnings("unchecked")
	public T[] aArray() 
	{
		Object[] lista = new Object[tamanno];
		for(int i = 0; i < tamanno; i++)
		{
			lista[i] = array[i];
		}
		return (T[]) lista;
	}

	public T eliminar(int posicion) 
	{
		if(tamanno == 0)
		{
			System.out.println("El array esta vacio");
			return null;
		}
		else
		{
			if(posicion == tamanno-1)
			{
				@SuppressWarnings("unchecked")
				T aux = (T) array[posicion];
				array[posicion] = null;
				tamanno--;
				comprobarLongitud();
				return aux;
			}
			else if(posicion >= tamanno)
			{
				System.out.println("No hay ningun elemento en esta posicion");
				return null;
			}
			else
			{
				@SuppressWarnings("unchecked")
				T aux = (T) array[posicion];
				for(int i = 0; i < array.length-1; i++)
				{
					if(i >= posicion)
					{
						array[i] = array[i+1];
					}
				}
				tamanno--;
				comprobarLongitud();
				return aux;
			}
		}
	}

	public boolean eliminar(T elemento) 
	{
		int posicion = indice(elemento);
		if(posicion != -1)
		{
			for(int i = 0; i < array.length-1; i++)
			{
				if(i >= posicion)
				{
					array[i] = array[i+1];
				}
			}
			tamanno--;
			comprobarLongitud();
			return true;
		}
		else
		{
			System.out.println("El elemento no se encuentra en el array");
			return false;
		}
	}

	public void comprobarLongitud()
	{
		if(array.length > 10)
		{
			int contador = 0;
			for(int i = 0; i < array.length; i++)
			{
				if(array[i] == null)
				{
					contador++;
				}
			}
			if(contador >= (array.length/2))
			{
				Object [] aux = new Object[(array.length-contador)+(contador/2)];
				for(int i = 0; i < aux.length; i++)
				{
					aux[i] = array[i];
				}
				array = aux;
			}
		}
	}
	
	public T set(int posicion, T elemento) 
	{
		if(tamanno > 0)
		{
			if(posicion >= 0 && posicion < tamanno)
			{
				@SuppressWarnings("unchecked")
				T aux = (T) array[posicion];
				array[posicion] = elemento;
				return aux;
			}
		}
		return null;
	}

	public int tamanno()
	{
		return tamanno;
	}

	@SuppressWarnings("unchecked")
	public Lista<T> sublista(int desde, int hasta)
	{
		ArrayDinamico<T> lista = new ArrayDinamico<T>();
		for(int i = desde; i <= hasta; i++)
		{
			lista.insertar((T) array[i]);
		}
		return lista;
	}

	public void concatenar(Lista<T> lista) 
	{
		lista.aArray();
		if(lista instanceof ArrayDinamico)
		{
			ArrayDinamico<T> listaNueva = (ArrayDinamico<T>) lista;
			Object [] arrayNuevo = new Object[array.length+listaNueva.array.length];
			this.tamanno = this.tamanno + listaNueva.tamanno;
			for(int i = 0; i < arrayNuevo.length; i++)
			{
				if(i <= array.length-1)
				{
					arrayNuevo[i] = array[i];
				}
				else
				{
					arrayNuevo[i] = listaNueva.array[i-array.length];
				}
			}
			array = arrayNuevo;
		}
		else if(lista instanceof ListaEnlazada)
		{
			ListaEnlazada<T> listaNueva = (ListaEnlazada<T>) lista;
			Object [] arrayLista = listaNueva.aArray();
			Object [] arrayNuevo = new Object[array.length+arrayLista.length];
			for(int i = 0; i < (tamanno+listaNueva.tamanno()); i++)
			{
				if(i < tamanno)
				{
					arrayNuevo[i] = array[i];
				}
				else
				{
					arrayNuevo[i] = arrayLista[(i-tamanno)];
				}
			}
			array = arrayNuevo;
			this.tamanno = this.tamanno + listaNueva.tamanno();
		}
	}
	
}
