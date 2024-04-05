package listas;

public class ArrayDinamico<T> implements Lista<T> 
{
	private Object [] array;
	private int tamaño;
	
	public ArrayDinamico()
	{
		tamaño = 0;
		array = new Object[10];
	}
	
	public void añadir(int posicion, T elemento) 
	{
		if(array.length == tamaño)
		{
			boolean añadido = false;
			int longi = (int) (array.length*1.5);
			Object [] arrayAux = new Object[longi];
			for(int i = 0; i < arrayAux.length; i++)
			{
				if(i == posicion)
				{
					arrayAux[i] = elemento;
					añadido = true;
				}
				else
				{
					if(!añadido)
						arrayAux[i] = array[i];
					else
					{
						arrayAux[i] = array[i-1];
					}
				}
			}
			array = arrayAux;
		}
		else if(array[posicion] == null)
		{
			array[posicion] = elemento;
		}
		else
		{
			Object [] arrayAux = new Object[array.length];
			boolean añadido = false;
			for(int i = 0; i < array.length; i++)
			{
				if(i == posicion)
				{
					arrayAux[i] = elemento;
					añadido = true;
				}
				else
				{
					if(!añadido)
						arrayAux[i] = array[i];
					else
					{
						arrayAux[i] = array[i-1];
					}
				}
			}
			array = arrayAux;
		}
	}

	public void añadir(T elemento)
	{
		if(array.length == tamaño)
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
		}
		else
		{
			for(int i = 0; i < array.length; i++)
			{
				if(array[i] == null)
				{
					array[i] = elemento;
				}
			}
		}
	}

	public void vaciar()
	{
		
	}

	public T get(int posicion) 
	{
		return null;
	}

	public boolean estaVacia() 
	{
		return tamaño == 0;
	}

	public int indice(T elemento) 
	{
		return 0;
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
		return null;
	}

	public int tamaño()
	{
		return tamaño;
	}

	public Lista<T> sublista(int desde, int hasta)
	{
		return null;
	}

	public void concatenar(Lista<T> listaNueva) 
	{
		
	}
	
}
