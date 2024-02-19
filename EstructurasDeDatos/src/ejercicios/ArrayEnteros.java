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
		ArrayEnteros arrayCopia = new ArrayEnteros[array];
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
	}
	
	public static void insertar()
	{
		
	}
}