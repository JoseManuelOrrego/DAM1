package pilaEstatica;

public class Pila 
{
	private char [] caracteres;
	private int cima;
	
	public Pila(int longitud)
	{
		this.caracteres = new char[longitud];
		this.cima = -1;
	}
	
	public boolean apilar(char caracter)
	{
		if(!pilaLlena())
		{
			if(pilaVacia())
			{
				cima++;
				caracteres[cima] = caracter;
				return true;
			}
			else
			{
				cima++;
				caracteres[cima] = caracter;
				return true;
			}
		}
		return false;
	}
	public boolean pilaLlena()
	{
		return cima == caracteres.length-1;
	}
	
	public char desapilar()
	{
		if(!pilaVacia())
		{
			return caracteres[cima--];
		}
		return 0;
	}
	public boolean pilaVacia()
	{
		return cima == -1;
	}
	
	public void mirar()
	{
		if(pilaVacia())
			System.out.println("La pila está vacía, no se puede mostrar nada");
		else
			System.out.println("Valor de la cima de la pila -> " + caracteres[cima]);
	}
	
	public int numElementos()
	{
		return cima+1;
	}
}
