package examen2.JoseManuelOrrego.ejercicio2;

public class ArrayAlumnos 
{
	private Alumno [] listaAlumnos;
	
	public ArrayAlumnos()
	{
		listaAlumnos = new Alumno[0];
	}
	
	public void insertar(Alumno alumno)
	{
		Alumno [] aux = new Alumno[listaAlumnos.length+1];
		for(int i = 0; i < listaAlumnos.length; i++)
		{
			aux[i] = listaAlumnos[i];
		}
		aux[aux.length-1] = alumno;
		listaAlumnos = aux;
	}
	
	public void eliminar(String nombre)
	{
		int i = 0;
		boolean encontrado = false;
		while(!encontrado && i < 5)
		{
			if(listaAlumnos[i].getNombre() == nombre)
			{
				encontrado = true;
				
				Alumno [] aux = new Alumno[listaAlumnos.length-1];
				for(int j = 0; j < aux.length; j++)
				{
					if(j < i)
						aux[j] = listaAlumnos[j];
					else if(j >= i)
						aux[j] = listaAlumnos[j+1];
				}
				listaAlumnos = aux;
			}
			else
			{
				i++;
			}
		}
	}
	
	public Alumno buscar(String nombre)
	{
		for(int i = 0; i < listaAlumnos.length; i++)
		{
			if(listaAlumnos[i].getNombre() == nombre)
				return listaAlumnos[i];
		}
		return null;
	}
	
	public ArrayAlumnos alumnosInferiores(int nota)
	{
		ArrayAlumnos arrayAlumnos = new ArrayAlumnos();
		
		for(int i = 0; i < listaAlumnos.length; i++)
		{
			if(listaAlumnos[i].getNota() < nota)
			{
				arrayAlumnos.insertar(listaAlumnos[i]); 
			}
		}
		return arrayAlumnos;
	}
	
	public double media()
	{
		double suma = 0;
		for(int i = 0; i < listaAlumnos.length; i++)
		{
			suma += listaAlumnos[i].getNota();
		}
		return suma/listaAlumnos.length;
	}
	
	public Alumno maxNota()
	{
		Alumno maximo = listaAlumnos[0];

		for(int i = 0; i < listaAlumnos.length; i++)
		{
			if(maximo.getNota() < listaAlumnos[i].getNota())
			{
				maximo = listaAlumnos[i];
				
			}
		}
		return maximo;
	}
	
	public Alumno minNota()
	{
		Alumno minimo = listaAlumnos[0];
		for(int i = 0; i < listaAlumnos.length; i++)
		{
			if(minimo.getNota() > listaAlumnos[i].getNota())
			{
				minimo = listaAlumnos[i];
			}
		}
		return minimo;
	}
	
	public void mostrar()
	{
		for(int i = 0; i < listaAlumnos.length; i++)
		{
			System.out.println("Nombre del alumno -> " + listaAlumnos[i].getNombre());
			System.out.println("Nota del alumno -> " + listaAlumnos[i].getNota());
		}
	}
}
