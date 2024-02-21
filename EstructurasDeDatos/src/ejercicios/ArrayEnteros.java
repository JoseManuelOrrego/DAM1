package ejercicios;

import java.util.Scanner;

public class ArrayEnteros 
{
	private int [] array;
	private boolean [] arrayPosiciones;
	
	public ArrayEnteros(int longitud)
	{
		this.array = new int[longitud];
		this.arrayPosiciones = new boolean[longitud];
	}
	
	public ArrayEnteros(ArrayEnteros array)
	{
		this.array = new int[array.array.length];
		this.arrayPosiciones = new boolean[array.arrayPosiciones.length];
        for (int i = 0; i < array.array.length; i++) 
        {
            this.array[i] = array.array[i];
            this.arrayPosiciones[i] = array.arrayPosiciones[i];
        }
	}
	
	 public ArrayEnteros() 
	 {
	        Scanner entrada = new Scanner(System.in);
	        System.out.print("Introduce la longitud del array: ");
	        int longitud = entrada.nextInt();
	        this.array = new int[longitud];
	        this.arrayPosiciones = new boolean[longitud];

	        boolean salida = false;
	        int contador = 0;
	        System.out.print("Introduce n�meros para el array o introduce 999 para salir: ");
	        while (!salida) 
	        {
	            int numero = entrada.nextInt();
	            if (numero == 999)
	                salida = true;
	            else
	            {
	            	array[contador] = numero;
	            	arrayPosiciones[contador] = true;
	            }
	            if (contador == longitud-1) 
	            {
	                salida = true;
	            }
	            contador++;
	        }
	    }
	
	public void mostrar()
	{
		for(int i = 0; i < array.length; i++)
		{
			if(arrayPosiciones[i])
				System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	public void insertar(int numero)
	{
		boolean insertado = false;
		int i = 0;
		while(!insertado)
		{
			if(!arrayPosiciones[i])
			{
				array[i] = numero;
				arrayPosiciones[i] = true;
				insertado = true;
			}
			i++;
		}
	}
	
	public void insertarWPosicion(int numero, int posicion)
	{
		if(!arrayPosiciones[posicion])
		{
			array[posicion] = numero;
			arrayPosiciones[posicion] = true;
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
	
	public int buscar(int buscado)
	{
		for(int i = 0; i < array.length; i++)
		{
			if(array[i] == buscado)
				return i;
		}
		return -1;
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
	
	public void eliminar()
	{
		Scanner entrada = new Scanner(System.in);
		int posicion = -1;
		boolean encontrado = false;
		while(!encontrado)
		{
			System.out.print("Introduce una posicion valida que quieres eliminar: ");
			posicion = entrada.nextInt();
			if (posicion >= 0 && posicion < arrayPosiciones.length) 
			{
                encontrado = true;
			}
			if(!encontrado)
				System.out.println("Posicion no valida");
		}
		
		arrayPosiciones[posicion] = false;
		System.err.println("Elemento eliminado (No esta eliminado, solo ocultado)");
	}
	
	public int[] fusion(int[] array2)
	{
		int [] arrayFusionado = new int[array.length+array2.length];
		for(int i = 0; i < arrayFusionado.length; i++)
		{
			if(i < array.length)
			{
				arrayFusionado[i] = array[i];
			}
			else
			{
				arrayFusionado[i] = array2[i];
			}
		}
		return arrayFusionado;
	}
	
	public void paresImpares()
	{
		int pares = 0, impares = 0;
		for(int i = 0; i < array.length; i++)
		{
			if(arrayPosiciones[i] && array[i] % 2 == 0)
				pares++;
			else if(arrayPosiciones[i] && array[i] % 2 != 0)
				impares++;
		}
		System.out.println("Numero de pares del array: " + pares + "\nNumero de impares del array: " + impares);
	}
	
	public void media()
	{
		int suma = 0, elementos = 0;
		for(int i = 0; i < array.length; i++)
		{
			if(arrayPosiciones[i])
			{
				elementos++;
				suma += array[i];
			}
		}
		System.out.println("Media de los elementos del array: " + suma/elementos);
	}
}