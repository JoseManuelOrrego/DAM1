package pruebas;

import java.util.regex.Pattern;

public class ElevacionExcepciones {
	
	public static void dividir (String cadena) {
		//No os asusteis con la expresi�n regular,
		//es simplemente para verificar que el numero es tipo a / b
		if (!Pattern.matches(" *(\\d+) */ *(\\d+) *", cadena))
			throw new NumberFormatException("Formato incorrecto");
		
		//Esta linea divide una cadena a partir del caracter /
		String[] divisores = cadena.split("/");	
		int numerador = Integer.parseInt(divisores[0]);
		int denominador= Integer.parseInt(divisores[1]);	
		if ( denominador == 0)
			throw new ArithmeticException("El denominador no puede ser 0");
		System.out.println((double)numerador/denominador);
	}	
	
	
	
	public static void producirExcepcion(boolean producir) throws Exception {
		System.out.println("Inicio funci�n");
		if(producir)
			throw new Exception();
		System.out.println("Fin funci�n");
	}
	
	
	public static void main (String[] args)  {
		
		System.out.println("Hola1");
		
		try {
			producirExcepcion(false);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		System.out.println("Adi�s1");
		
		System.out.println("Hola1");
		
		try {
			producirExcepcion(false);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		System.out.println("Adi�s1");
		
		
		dividir("6/3");
		dividir("3/0");
		dividir("3/2a");
				
	}
}