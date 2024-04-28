package e0502;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		Alumno [] listaAlumnos = new Alumno[4];
		int cont = 0;
		do
		{
			System.out.println("----------Alumno " + cont + "------------");
			System.out.print("Introduce el nombre del alumno: ");
			String nombre = scan.next();
			System.out.print("Introduce los apellidos del alumno: ");
			String apellidos = scan.next();
			listaAlumnos[cont++] = new Alumno(nombre,apellidos);
		}while(cont < 4);
		
		escrituraAlumnos(listaAlumnos);
		mostrarArray(listaAlumnos);
		leerAlumnos();
	}
	
	public static void mostrarArray(Alumno [] listaAlumnos) 
	{
		System.out.println("MOSTRANDO ARRAY");
		for(int i = 0; i < listaAlumnos.length; i++)
		{
			System.out.print("Alumno " + i + ": ");
			System.out.println(listaAlumnos[i].getNombre() + " " + listaAlumnos[i].getApellidos() + ".");
		}
	}

	public static void escrituraAlumnos(Alumno [] listaAlumnos)
	{
		PrintWriter out = null;
		try 
		{
			out = new PrintWriter("Alumnos.txt");
			for(int i = 0; i < listaAlumnos.length; i++)
			{
				out.println("Alumno " + i + ": " + listaAlumnos[i].getNombre() +" "+ listaAlumnos[i].getApellidos() + ".");
			}
		}
		catch(IOException e)
		{
			System.out.println("IOException al escribir:" + e.getMessage());
		}
		finally
		{
			if(out != null)
			{
				out.close();
			}
		}
	}
	
	public static void leerAlumnos()
	{
		BufferedReader in = null;
		String linea = "";
		int cont = 0;
		Alumno [] listaAlumnosLeida = new Alumno[4];
		try
		{
			in = new BufferedReader(new FileReader("Alumnos_leer.txt"));
			while((linea = in.readLine()) != null)
			{
				String [] lineaSeparada = linea.split(":");
				String nombreCompleto = lineaSeparada[1];
				String [] alumnoSeparado = nombreCompleto.split(" ");
				
				listaAlumnosLeida[cont++] = new Alumno(alumnoSeparado[1],alumnoSeparado[2]);
			}
			System.out.println("MOSTRANDO ARRAY LEIDO POR TEXTO");
			mostrarArray(listaAlumnosLeida);
		}
		catch(IOException e)
		{
			System.out.println("IOException al escribir:" + e.getMessage());
		}
		finally
		{
			if(in != null)
			{
				try 
				{
					in.close();
				} 
				catch (IOException e) 
				{
					System.out.println("IOExceptional cerrar:		" + e.getMessage());
				}
			}
		}
	}
}
