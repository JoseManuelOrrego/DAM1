package prueba;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class EscrituraTexto {
	
	private static void pruebaEscritura() {
		PrintWriter out = null;
		try {
			out = new PrintWriter("fichero.txt");
			out.print(1);
			out.print(':');
			out.print(" juan =");
			out.println(5.54);
			out.println(2 + ":jose =" + 7.2);
		} catch (IOException ex) {
			System.out.println("IOException al escribir:" + ex.getMessage());
		} finally {
			if (out != null) {
				out.close();
			}
		}
	}

	private static void pruebaLectura() {
		BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader("fichero.txt"));
			String linea;
			while ((linea = in.readLine()) != null) {
				System.out.println(linea);
			}
		} catch (IOException ex) {
			System.out.println("IOExceptional leer:		" + ex.getMessage());
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException ex) {
					System.out.println("IOExceptional cerrar:		" + ex.getMessage());
				}
			}
		}
	}

	public static void main(String[] args) {
		pruebaEscritura();
		pruebaLectura();
	}

}