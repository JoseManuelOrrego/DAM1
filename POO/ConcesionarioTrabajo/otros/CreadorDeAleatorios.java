package otros;

import java.util.Random;

public class CreadorDeAleatorios 
{
    private static Random randomGenerator = new Random();

    public static int aleatorio(int n) 
    {
        return randomGenerator.nextInt(n);
    }
    //Sin control de valores de entrada. OJO EXCEPCIONES
    public static int aleatorio(int min, int max) 
    {        
        return randomGenerator.nextInt(max - min + 1) + min;
    }
    
    public static boolean booleanoAleatorio() 
    {
    	return randomGenerator.nextBoolean();
    }
}
