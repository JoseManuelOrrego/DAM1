package introduccion;

import java.io.IOException;
import java.util.Scanner;

/* ejemplos para aprender como
 * introducir por teclado diferentes 
 * tipos de datos
 */
public class IntroDatos 
{
	public static void main(String[] args) throws IOException
	{
		//tipo char 
		System.out.println("Introduce un caracter:");
		char caracter = (char)System.in.read();
		System.out.println("Caracter es "+ caracter);
		//limpia el buffer eliminando \n\r
		System.in.skip(2);
		
		//salta dos l�neas
		System.out.println("\n");
		
		// creamos un objeto Scanner
		Scanner entrada = new Scanner(System.in);
		
		//tipo cadena
		System.out.println("Introduce una cadena:");
		String cadena = entrada.nextLine();
		System.out.println("Cadena = " + cadena);
						
		System.out.println("\n");
		
		//tipo entero
		System.out.println("Introduce un n�mero entero:");
		int numEntero = entrada.nextInt();
		System.out.println("N�mero entero = " + numEntero);
		
		System.out.println("\n");
		
		System.out.println("Introduce un n�mero real:");
		double numReal = entrada.nextDouble();
		System.out.println("N�mero real = " + numReal);
		
		System.out.println("\n");
		
		entrada.close();
	}
}