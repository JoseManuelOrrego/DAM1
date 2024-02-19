package ejercicios;

import java.util.Scanner;

public class ArrayEnteros 
{
	private int [] array;
	
	public ArrayEnteros(int longitud)
	{
		this.array = new int[longitud];
	}
	
	public ArrayEnteros(ArrayEnteros array)
	{
		ArrayEnteros arrayCopia = new ArrayEnteros(array.array.length);
	}
	
	public ArrayEnteros()
	{
		Scanner entrada = new Scanner(System.in);
		boolean salida = false;
		int contador = 0;
		while (!salida)
		{
			System.out.print("Introduce numeros para el array o introduce 999 para salir: ");
			int numero = entrada.nextInt();
			if(numero == 999)
				salida = true;
			else
				array[contador] = numero;
			contador += 1;
		}
		entrada.close();
	}
	
	public void mostrar()
	{
		for(int i = 0; i < array.length; i++)
		{
			System.out.println(array[i]);
		}
	}
	
	public void insertar(boolean [] arrayPosiciones, int numero)
	{
		boolean insertado = false;
		int i = 0;
		while(!insertado)
		{
			if(!arrayPosiciones[i])
			{
				array[i] = numero;
				insertado = true;
			}
			i++;
		}
	}
	
	public void insertarWPosicion(boolean [] arrayPosiciones, int numero, int posicion)
	{
		if(!arrayPosiciones[posicion])
		{
			array[posicion] = numero;
		}
		else
			System.out.println("La posicion elegida ya esta ocupada.");
	}
	
	public void ordenar()
	{
		Scanner entrada = new Scanner(System.in);
		System.out.print("Ordenar de mayor a menor / Ordenar de menor a mayor (1/2) --> ");
		int opcion = entrada.nextInt();
		if(opcion == 1)
		{
			int aux;
			for(int i = 0; i < array.length-1; i++)
			{
				for(int j = 0; j < array.length-1-i; j++)
				{
					if(array[j] < array[j+1])
					{
						aux = array[j];
						array[j] = array[j+1];
						array[j+1] = aux;
					}
				}
			}
		}
		else
		{
			int aux;
			for(int i = 0; i < array.length-1; i++)
			{
				for(int j = 0; j < array.length-1-i; j++)
				{
					if(array[j] > array[j+1])
					{
						aux = array[j];
						array[j] = array[j+1];
						array[j+1] = aux;
					}
				}
			}
		}
	}
	
	public boolean buscar(int buscado)
	{
		for(int i = 0; i < array.length; i++)
		{
			if(array[i] == buscado)
				return true;
		}
		return false;
	}
	
	public void numVeces(int buscado)
	{
		int numVeces = 0;
		for(int i = 0; i < array.length; i++)
		{
			if(array[i] == buscado)
			{
				numVeces += 1;
			}
		}
		System.out.println("El elemento se ha encontrado " + numVeces + " veces.");
	}
}