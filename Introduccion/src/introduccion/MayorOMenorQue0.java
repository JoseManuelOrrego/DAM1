package introduccion;

import java.util.Scanner;

public class MayorOMenorQue0 
{
	public static void main(String[] args) 
	{
		//Variables que necesito
		int numero;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce un n�mero para comprobar si es mayor, igual o menor que 0: ");
		
		numero = entrada.nextInt();
		
		if(numero == 0)
		{
			System.out.println("El n�mero introducido es 0");
		}
		else if(numero > 0)
		{
			System.out.println("El n�mero es mayor que 0");
		}
		else
			System.out.println("El n�mero es menor que 0");
		
		entrada.close();
	}
}
