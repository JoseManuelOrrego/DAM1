package examen2.JoseManuelOrrego.ejercicio3;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) 
	{
		leerYmedia();
		leerYmaximo();
		rellenarImpares();
	}
	
	public static void leerYmedia()
	{
		Scanner entrada = new Scanner(System.in);
		int [] array = new int [5];
		
		double suma = 0;
		for(int i = 0; i < array.length; i++)
		{
			System.out.print("Introduce un numero: ");
			int numero = entrada.nextInt();
			array[i] = numero;
			suma += numero;
		}
		
		System.out.println("Media de los elementos del array: " + suma/array.length);
	}
	
	public static void leerYmaximo()
	{
		Scanner entrada = new Scanner(System.in);
		int [] array = new int [5];
		
		int maximo = 0;
		for(int i = 0; i < array.length; i++)
		{
			System.out.print("Introduce un numero: ");
			int numero = entrada.nextInt();
			array[i] = numero;
			if(maximo < numero)
				maximo = numero;
		}
		
		System.out.println("Maximo de los elementos del array: " + maximo);
	}
	
	public static void rellenarImpares()
	{
		int [] array = new int [50];
		int contador = 0;
		for(int i = 1; i < 100; i++)
		{
			if(i%2 != 0)
			{
				array[contador++] = i;
			}
		}
		
		for(int i = 0; i < array.length; i++)
		{
			System.out.print(array[i] + " ");
		}
	}
}
