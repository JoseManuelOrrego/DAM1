package e0501;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class RWTexto {

	private static Scanner scan;

	private static boolean eleccionUsuario() {
		System.out.print("Desea leer[L] / escribir[E] / salir[X]: ");
		String teclado = scan.next();
		if (teclado.equalsIgnoreCase("L")) {
			leer(nombreFichero());
		} else if (teclado.equalsIgnoreCase("E")) {
			escribir(nombreFichero());
		} else if (teclado.equalsIgnoreCase("X")) {
			return false;
		}
		return true;
	}

	private static void escribir(String nombreFichero) {
		boolean existe= leer(nombreFichero);
		PrintWriter out = null;
		try {
			out = new PrintWriter(nombreFichero);
			String lectura = "";
			boolean fin = false;
			if(existe)
				System.out.println("Sobreescribiendo '"+nombreFichero+"'");
			while (!fin) {
				System.out.print("- ");
				lectura = scan.next();
				if (lectura.equalsIgnoreCase("EOF"))
					fin = true;
				else
					out.println(lectura);
			}
		} catch (IOException ex) {
			System.out.println("IOException al escribir:" + ex.getMessage());
		} finally {
			if (out != null) {
				out.close();
			}
		}
	}

	private static boolean leer(String nombreFichero) {
		BufferedReader in = null;
		boolean existe = false;
		try {
			in = new BufferedReader(new FileReader(nombreFichero));
			String linea;
			existe=true;
			System.out.println("Contenido de '"+nombreFichero+"'");
			while ((linea = in.readLine()) != null) {
				System.out.println("-" + linea);
			}
		} catch (IOException ex) {
			System.out.println("El fichero " + nombreFichero + " no existe");
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException ex) {
					System.out.println("IOException al cerrar:		" + ex.getMessage());
				}
			}
		}
		return existe;
	}

	private static String nombreFichero() {
		System.out.print("Introduzca el nombre del fichero: ");
		String nombreFichero = scan.next() + ".txt";
		return nombreFichero;
	}

	public static void main(String[] args) {
		System.out.println("Iniciando programa.");
		scan = new Scanner(System.in);
		while (eleccionUsuario());
		scan.close();
		System.out.print("Terminando programa.");
	}
}