package colaEstatica;

public class ColaEstatica 
{
	private char [] array;
	private int fin;
	
	public ColaEstatica(int longitud)
	{
		array = new char[longitud];
		fin = -1;
	}

	public char encolar(char caracter)
	{
		if(!colaLlena())
		{
			array[++fin] = caracter;
			
			return array[fin];
		}
		else
		{
			System.out.println("Imposible introducir, la cola esta llena");
			return 0;
		}
	}
	public boolean colaLlena()
	{
		return fin == array.length-1;
	}
	
	public char desencolar()
	{
		if(!colaVacia())
		{
			char retornable = array[0];
			for(int i = 0; i < fin; i++)
			{
				array[i] = array[i+1];	
			}
			fin--;
			return retornable;
		}
		else
		{
			return 0;
		}
	}
	public boolean colaVacia()
	{
		return fin == -1;
	}
	
	public int tamMaxCola()
	{
		return array.length;
	}
	
	public int numElementos()
	{
		return fin+1;
	}
}
