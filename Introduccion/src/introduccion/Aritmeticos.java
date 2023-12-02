package introduccion;

import java.util.Scanner;

/**
 * Muestra el funcionamiento de los operadores aritméticos.
 * @author josemanuelorrego
 * Fecha: 14/09/2023
 */

public class Aritmeticos 
{
	public static void main(String[] args) 
	{
		//Variables que necesito (numero1,numero2)
		double total;
		
		//Objeto Scanner
		Scanner entrada = new Scanner(System.in);
		
		//Sentencia de salida y entrada
		System.out.println("Introduce un n�mero: ");
		double numero1 = entrada.nextDouble();
		System.out.println("Introduce otro n�mero: ");
		double numero2 = entrada.nextDouble();
		
		System.out.println();
		
		total = numero1 + numero2;
		
		System.out.println("La suma de los n�meros introducidos es: " + total);
		
		total = numero1 - numero2;
		
		System.out.println("La resta de los n�meros es: " + total);
		
		total = numero1 * numero2;
		
		System.out.println("El producto de los n�meros es: " + total);
		
		total = numero1 / numero2;
		
		System.out.println("Y la division de los n�meros es: " + total);
		
		entrada.close();
	}
}