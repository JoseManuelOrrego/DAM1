package pruebasArrays;

import java.util.Scanner;

public class Array 
{
	public static void main(String[] args) 
	{
		int [] array = {1, 3, 7, 4, 6};
		
	
		System.out.println("El mayor de los elementos del array es: " + mayorElemento(array));
		
		System.out.println("Media de los elementos del array: " + mediaElementos(array));
		
		int [] arrayInvertido = invertido(array);
		mostrarArray(array);
		System.out.println();
		
		int [] array1 = {1, 3, 7, 4, 6};
		int [] arrayConcatenado = concatenacion(array1, arrayInvertido);
		mostrarArray(arrayConcatenado);
		System.out.println();
		
		busquedaElemento(arrayConcatenado);
	}
	
	public static int mayorElemento(int[]array)
	{
		int mayor = array[0];
		for (int i = 0; i < array.length; i++)
		{
			if (array[i] > mayor)
			{
				mayor = array[i];
			}
		}
		return mayor;
	}
	
	public static double mediaElementos(int[]array)
	{
		double suma = 0;
		for(int i = 0; i < array.length; i++)
		{
			suma += array[i];
		}
		return suma/array.length;
	}
	
	public static int[] invertido(int [] array)
	{
		int finale = array.length-1;
		for(int i = 0; i < array.length/2; i++)
		{
			int aux = array[finale];
			array[finale] = array[i];
			array[i] = aux;
			finale--;
		}
		return array;
	}
	
	public static int[] concatenacion(int [] array1, int [] array2)
	{
		int [] arrayConcatenado = new int [array1.length + array2.length];
		for(int i = 0; i < arrayConcatenado.length; i++)
		{
			if(i < array1.length)
			{
				arrayConcatenado[i] = array1[i];
			}
			else
			{
				arrayConcatenado[i] = array2[i-array1.length];
			}
		}
		return arrayConcatenado;
	}
	
	public static boolean busquedaElemento(int [] array)
	{
		Scanner entrada = new Scanner(System.in);
		System.out.print("Introduce un numero positivo para buscar en el array: ");
		int buscado = entrada.nextInt();
		
		boolean encontrado = false;
		for(int i = 0; i < array.length && !encontrado; i++)
		{
			if(buscado == array[i])
				encontrado = true;
		}
		if(encontrado)
		{
			System.out.println("El elemento ha sido encontrado en el array");
			System.out.println("Numero de veces que aparece: " + contarElemento(buscado, array));
		}

		else
			System.out.println("El elemento no se encuentra en el array");
		
		return encontrado;
		
	}
	
	public static int contarElemento(int buscado, int [] array)
	{
		int cuenta = 0;
		for(int i = 0; i < array.length; i++)
		{
			if(buscado == array[i])
				cuenta++;
		}
		return cuenta;
	}
	
	public static void mostrarArray(int [] array)
	{
		for(int i = 0; i < array.length; i++)
		{
			System.out.print(array[i]);
		}
	}
}