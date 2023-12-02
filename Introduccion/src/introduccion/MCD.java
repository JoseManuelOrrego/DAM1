package introduccion;

import java.util.Scanner;

public class MCD 
{
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un primer n�mero: ");
		int numero1 = entrada.nextInt();
		System.out.println("Introduce un segundo n�mero: ");
		int numero2 = entrada.nextInt();
		
		while(numero1 != numero2)
		{
			if(numero1 > numero2)
				numero1 = numero1 - numero2;
			else
				numero2 = numero2 - numero1;
		}
		
		System.out.println("El m�ximo com�n divisor de los n�meros es: " + numero1);
		entrada.close();
	}
}