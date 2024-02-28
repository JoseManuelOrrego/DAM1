package pilaEstatica;

public class Programa 
{
	public static void main(String[] args) 
	{
		Pila pilita = new Pila(26);
		
		System.err.println("Rellenando pila...");
		char caracter = 'z';
		rellenoPila(pilita, caracter);
		
		System.err.println("Pila completa");
		pilita.mirar();
		System.out.println("Numero de elementos en la pila --> " + pilita.numElementos());
		
		System.err.println("Procedemos a vaciar la pila...");
		vaciadoPila(pilita);
		
		System.err.println("\nPila vaciada");
		pilita.mirar();
		System.out.println("Numero de elementos en la pila --> " +pilita.numElementos());
	}
	
	public static boolean rellenoPila(Pila pilita, char caracter)
	{
		if(caracter == 'a')
		{
			pilita.apilar(caracter);
			return true;
		}
		pilita.apilar(caracter--);
		return rellenoPila(pilita, caracter);
	}
	
	public static void vaciadoPila(Pila pilita)
	{
		char cara = '0';
		while(cara != 0)
		{
			cara = pilita.desapilar();
			if(cara != 0)
				System.out.print(cara + " ");
		}
	}
}