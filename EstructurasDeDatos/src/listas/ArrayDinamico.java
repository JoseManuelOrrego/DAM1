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
			for(int i = 0; i < arrayAux.length; i++)
			{
				if(i == (array.length+1))
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
			array[++tamanno] = elemento;
		}
	}

	public void vaciar()
	{
		for(int i = 0; i < array.length; i++)
		{
			array[i] = null;
		}
	}

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
			T aux = (T) array[i];
			if(aux.equals(elemento))
			{
				return i;
			}
		}
		return -1;
	}

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
				T aux = (T) array[posicion];
				array[posicion] = null;
				tamanno--;
				return aux;
			}
			else if(posicion >= tamanno)
			{
				System.out.println("No hay ningun elemento en esta posicion");
				return null;
			}
			else
			{
				T aux = (T) array[posicion];
				for(int i = 0; i < array.length; i++)
				{
					if(i >= posicion)
					{
						array[i] = array[i+1];
					}
				}
				tamanno--;
				return aux;
			}
		}
	}

	public boolean eliminar(T elemento) 
	{
		int posicion = indice(elemento);
		if(posicion != -1)
		{
			for(int i = 0; i < array.length; i++)
			{
				if(i >= posicion)
				{
					array[i] = array[i+1];
				}
			}
			tamanno--;
			return true;
		}
		else
		{
			System.out.println("El elemento no se encuentra en el array");
			return false;
		}
	}

	public T set(int posicion, T elemento) 
	{
		if(tamanno > 0)
		{
			if(posicion >= 0 && posicion < tamanno)
			{
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

	public Lista<T> sublista(int desde, int hasta)
	{
		return null;
	}

	public void concatenar(Lista<T> listaNueva) 
	{
		
	}
	
}
