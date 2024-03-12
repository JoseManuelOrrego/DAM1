package pilaColaAlumnos;

public class ColaAlumnos 
{
	private Alumno [] cola;
	private int fin;
	
	public ColaAlumnos()
	{
		cola = new Alumno[0];
		fin = -1;
	}
	
	public void encolar(Alumno alumno)
	{
		Alumno [] colaAux = new Alumno[cola.length+1];
		for(int i = 0; i < cola.length; i++)
		{
			colaAux[i] = cola[i];
		}
		colaAux[++fin] = alumno;
		cola = colaAux;
	}
	
	public Alumno desencolar()
	{
		if(colaVacia())
		{
			System.out.println("La cola de Alumnos está vacía");
			return null;
		}
		else if(fin == 0)
		{
			Alumno [] colaAux = new Alumno[0];
			Alumno retornable = cola[fin--];
			cola = colaAux;
			return retornable;
		}
		else
		{
			Alumno [] colaAux = new Alumno[cola.length-1];
			Alumno retornable = cola[0];
			for(int i = 0; i < colaAux.length; i++)
			{
				colaAux[i] = cola[i+1];
			}
			fin--;
			cola = colaAux;
			return retornable;
		}
	}
	public boolean colaVacia()
	{
		return fin == -1;
	}
	
	public void mostrarCola()
	{
		for(int i = 0; i < cola.length; i++)
		{
			cola[i].mostrarDatos();
		}
	}
}
