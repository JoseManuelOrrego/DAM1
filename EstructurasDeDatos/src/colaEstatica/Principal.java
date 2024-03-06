package colaEstatica;

public class Principal 
{
	public static void main(String[] args) 
	{
		ColaEstatica cola = new ColaEstatica('z'-'a'+1);
		rellenar(cola);
		mostrarColaFor(cola);
		vaciar(cola);
		cola.encolar('a');
		cola.encolar('b');
		cola.encolar('c');
		cola.desencolar();
		cola.desencolar();
		mostrarColaWhile(cola);
		cola.encolar('d');
		cola.desencolar();
		cola.encolar('e');
		cola.encolar('f');
		mostrarColaWhile(cola);
		vaciar(cola);
		rellenar(cola);
		cola.desencolar();
		cola.desencolar();
		vaciar(cola);
		rellenar(cola);
		mostraryVoltearCola(cola);
		mostraryVoltearCola(cola);
		mostraryVoltearCola(cola);
	}
	
	public static void rellenar(ColaEstatica cola)
	{
		char caracter = 'a';
		for(int i = 0; i < cola.getArray().length; i++)
		{
			cola.encolar(caracter++);
		}
	}
	
	public static void vaciar(ColaEstatica cola)
	{
		for(int i = 0; i <= cola.getFin(); i++)
		{
			System.out.print(cola.desencolar() + " ");
		}
		System.out.println();
	}
	
	public static void mostrarColaFor(ColaEstatica cola)
	{
		for(int i = 0; i <= cola.getFin(); i++)
		{
			System.out.print(cola.getArray()[i] + " ");
		}
		System.out.println();
	}
	
	public static void mostrarColaWhile(ColaEstatica cola)
	{
		boolean salida = false;
		int num = 0;
		while(!salida)
		{
			System.out.print(cola.getArray()[num++] + " ");
			if(num == cola.getFin())
			{
				salida = true;
			}
		}
		System.out.println();
	}
	
	public static void mostraryVoltearCola(ColaEstatica cola)
	{
		int inicio = 0;
		for(int i = 0; i < cola.getArray().length/2; i++)
		{
			char aux = cola.getArray()[inicio];
			cola.getArray()[inicio] = cola.getArray()[cola.getFin()-i];
			
		}
	}
}