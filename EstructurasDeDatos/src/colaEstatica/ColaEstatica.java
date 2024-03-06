package colaEstatica;

public class ColaEstatica 
{
	private char [] array;
	private int fin;
	
	public ColaEstatica(int longitud)
	{
		array = new char[longitud];
		setFin(-1);
	}
	
	public char [] getArray() {
		return array;
	}

	public int getFin() {
		return fin;
	}

	public int setFin(int fin) {
		this.fin = fin;
		return fin;
	}

	public void encolar(char caracter)
	{
		if(!colaLlena())
		{
			getArray()[setFin(getFin() + 1)] = caracter;
		}
		else
		{
			System.out.println("Imposible introducir, la cola esta llena");
		}
	}
	public boolean colaLlena()
	{
		return getFin() == getArray().length-1;
	}
	
	public char desencolar()
	{
		if(!colaVacia())
		{
			char retornable = getArray()[0];
			for(int i = 0; i < getFin(); i++)
			{
				getArray()[i] = getArray()[i+1];	
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
		return getFin() == -1;
	}
}
