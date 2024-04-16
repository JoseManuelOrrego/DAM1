package pruebas;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CapturaExcepcionesDivision
{
	
	public static void dividir (String cadena)
	{
		try
		{
			if (!Pattern.matches(" *(\\d+) */ *(\\d+) *", cadena))
				throw new NumberFormatException("Formato incorrecto");
			
			//Esta linea divide una cadena a partir del caracter '/'
			String[] divisores = cadena.split("/");	
			int numerador = Integer.parseInt(divisores[0]);
			int denominador= Integer.parseInt(divisores[1]);	
			if ( denominador == 0)
				throw new ArithmeticException("El denominador no puede ser 0");
			System.out.println((double)numerador/denominador);
		}
		catch(NumberFormatException e)
		{
			System.out.println("No has introducido el formato correcto('Numero/Numero')");
		}
		catch(ArithmeticException e)
		{
			System.out.println("No puedes dividir entre 0");
		}
	}
	
	public static void main (String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		boolean salida = false;
		do
		{
			System.out.print("Introduce una division en formato 'Numero/Numero' (Introduce 'fin' para finalizar)--> ");
			String respuesta = entrada.nextLine();
			if(respuesta.contains("fin"))
			{
				salida = true;
			}
			else
			{
				dividir(respuesta);
			}
		} while(!salida);	
		System.out.println("Fin de la aplicacion");
	}
}