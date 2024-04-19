package e0404.libreria;

import java.nio.charset.Charset;
import java.util.Random;

public class Utilidades {
	
	public static int numeroAleatorio(int maximo) {		
		Random rand = new Random();
	      return rand.nextInt(maximo+1);
	}	
	
	public static String cadenaAleatoria(int maxLongitud) {
	    byte[] array = new byte[numeroAleatorio(maxLongitud)]; 
	    new Random().nextBytes(array);
	    String generatedString = new String(array, Charset.forName("UTF-8"));
	    return generatedString;
	}
	
	public static Boolean booleanoAleatorio() {		
		if(numeroAleatorio(1)== 1) 
			return true;		
		return false;
	}

}
