package e0503;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.Scanner;

public class Main{
	private static final String ficheroEscrituraLectura = "Alumnos.bin";
	private static Scanner scan;
	
	private static class Alumno implements Serializable{
		private String nombre;
		private String apellido;		
		
		public Alumno (String nombre, String apellido) {
			this.nombre=nombre;
			this.apellido=apellido;
		}
		public String getNombre() {
			return nombre;
		}
		public String getApellido() {
			return apellido;
		}
	}

	private static boolean eleccionUsuario() {
		System.out.print("Desea leer[L] / escribir[E] / salir[X]: ");
		String teclado = scan.next();
		char opcion = teclado.toLowerCase().charAt(0);
		Alumno[] alumnos;
		switch (opcion) {
		case 'l':
			alumnos = leerAlumnos();
			if (alumnos != null) {
				mostrarAlumnos(alumnos);
			}
			return true;
		case 'e':
			alumnos = crearAlumnos();
			if (alumnos != null) {
				mostrarAlumnos(alumnos);
				guardarAlumnos(alumnos);
			}
			return true;
		case 'x':
			return false;
		default:
			System.out.println("Opción no válida.");
			return true;
		}

	}

	public static Alumno[] crearAlumnos() {
		System.out.print("¿Cuántos alumnos desea crear?: ");
		int numAlumnos;
		Alumno[] alumnos = null;
		try {
			numAlumnos = scan.nextInt();
			System.out.println("Creando array de " + numAlumnos + " alumnos.");
			alumnos = new Alumno[numAlumnos];
			for (int i = 0; i < numAlumnos; i++) {
				System.out.println("Introduce el nombre del alumno " + i + ":");
				String nombre = scan.next();
				System.out.println("Introduce el apellido del alumno " + i + " (" + nombre + "):");				
				String apellido = scan.next();
				alumnos[i] = new Alumno(nombre, apellido);
			}

		} catch (Exception ex) {
			alumnos = null;
		}
		return alumnos;
	}

	public static void guardarAlumnos(Alumno[] alumnos) {
		System.out.println("Guardando alumnos en fichero: " + ficheroEscrituraLectura);
		ObjectOutputStream out = null;
		try {
			out = new ObjectOutputStream(new FileOutputStream(ficheroEscrituraLectura));
			for (int i = 0; i < alumnos.length; i++) {
				out.writeObject(alumnos[i]);
			}
		} catch (IOException ex) {
			System.out.println("IOExceptional escribir:" + ex.getMessage());
		} finally {
			if (out != null)
			{
				try 
				{
					out.close();
				}
				catch (IOException e)
				{
					System.out.println("IOExceptional al cerrar:" + e.getMessage());
				}
			}
		}
	}

	public static Alumno[] leerAlumnos() {
		System.out.println("Leyendo alumnos de fichero.");
		ObjectInputStream in = null;
		LinkedList<Alumno> listaAlumnos = new LinkedList<Alumno>();
		Alumno[] alumnos = null;
		boolean excepcion = false;
		try {
			in = new ObjectInputStream(new FileInputStream(ficheroEscrituraLectura));
			String linea;
			while ((linea = in.readLine()) != null) {
				String[] datos = linea.split(" ");
				String nombre = datos[2];
				String apellido = datos[3].substring(0, datos[3].length() - 1);
				listaAlumnos.add(new Alumno(nombre, apellido));
			}
		} catch (IOException ex) {
			System.out.println("IOExceptional leer: " + ex.getMessage());
			excepcion = true;
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException ex) {
					System.out.println("IOExceptional cerrar: " + ex.getMessage());
				}
			}
		}
		if (!excepcion) {
			int numAlumnos = listaAlumnos.size();
			alumnos = new Alumno[numAlumnos];
			for (int i = 0; i < numAlumnos; i++) {
				alumnos[i] = listaAlumnos.get(i);
			}
		}
		return alumnos;
	}

	public static void mostrarAlumnos(Alumno[] alumnos) {
		System.out.println("Mostrando array de alumnos en memoria.");
		for (int i = 0; i < alumnos.length; i++) {
			String nombre = alumnos[i].getNombre();
			String apellido = alumnos[i].getApellido();
			String linea = "Alumno " + i + ": " + nombre + " " + apellido + ".";
			System.out.println(linea);
		}
	}

	public static void main(String[] args) {
		System.out.println("Iniciando programa.");
		scan = new Scanner(System.in);
		while (eleccionUsuario());
		scan.close();
		System.out.print("Terminando programa.");
	}
}