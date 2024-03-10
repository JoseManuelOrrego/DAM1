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
		mostrarColaRecur(cola);
		vaciar(cola);
		rellenar(cola);
		cola.desencolar();
		cola.desencolar();
		vaciar(cola);
		rellenar(cola);
		mostraryVoltearCola(cola);
		mostraryVoltearCola(cola);
		mostrarColaFor(cola);
		mostrarColaWhile(cola);
		mostrarColaRecur(cola);
	}
	
	public static void rellenar(ColaEstatica cola)
	{
		char caracter = 'a';
		for(int i = 0; i < cola.tamMaxCola(); i++)
		{
			cola.encolar(caracter++);
		}
	}
	
	public static void vaciar(ColaEstatica cola)
	{
		int fin = cola.numElementos();
		for(int i = 0; i < fin; i++)
		{
			cola.desencolar();
		}
	}
	
	public static void mostrarColaFor(ColaEstatica cola)
	{
		for(int i = 0; i < cola.numElementos(); i++)
		{
			System.out.print(cola.encolar(cola.desencolar()) + " ");
		}
		System.out.println();
	}
	
	public static void mostrarColaWhile(ColaEstatica cola)
	{
		boolean salida = false;
		int num = 0;
		while(!salida)
		{
			System.out.print(cola.encolar(cola.desencolar()) + " ");
			num++;
			if(num == cola.numElementos())
			{
				salida = true;
			}
		}
		System.out.println();
	}
	
	public static void mostrarColaRecur(ColaEstatica cola)
	{
		llamadaFuncion(cola, 0);
		System.out.println();
	}
	public static void llamadaFuncion(ColaEstatica cola, int numero)
	{
		if(numero == cola.numElementos())
		{
			return;
		}
		System.out.print(cola.encolar(cola.desencolar()) + " ");
		llamadaFuncion(cola, numero+1);
	}
	
	public static void mostraryVoltearCola(ColaEstatica cola)
	{
		int fin = cola.numElementos();
		char [] auxiliar = new char['z'-'a'+1];
		for(int i = 0; i < fin; i++)
		{
			auxiliar[i] = cola.desencolar();
		}
		for(int i = fin-1; i >= 0; i--)
		{
			cola.encolar(auxiliar[i]);
		}
		mostrarColaFor(cola);
	}
}