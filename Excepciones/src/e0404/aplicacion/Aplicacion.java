package e0404.aplicacion;

import java.util.ArrayList;
import java.util.Scanner;

import e0404.excepciones0404.ConductorException;
import e0404.excepciones0404.ConductorMenorException;
import e0404.excepciones0404.ConductorMenorYNombreInsfException;
import e0404.excepciones0404.ConductorNombreInsuficienteException;
import e0404.excepciones0404.ConductorSinCarnetException;
import e0404.libreria.Conductor;
import e0404.libreria.Utilidades;

public class Aplicacion {
	private static ArrayList<Conductor> crearConductores(int numeroConductores) {
		ArrayList<Conductor> conductores = new ArrayList<Conductor>();
		Scanner scan = new Scanner(System.in);
		int numNoValidos = 0;
		do {
			Conductor c = null;
			int edad = Utilidades.numeroAleatorio(25);
			String nombre = Utilidades.cadenaAleatoria(5);
			boolean tieneCarnet = Utilidades.booleanoAleatorio();
			boolean conductorValido = false;
			try {
				c = new Conductor(tieneCarnet, edad, nombre);
				conductorValido = true;
			} catch (ConductorSinCarnetException e) {
				System.out.println(e.getMessage());
				numNoValidos++;
			} catch (ConductorMenorYNombreInsfException e) {
				System.out.println(e.getMessage());
				numNoValidos++;
			} catch (ConductorMenorException e) {
				System.out.println(e.getMessage());
				do {
					System.out.print("Introduce la nueva edad: ");
					edad = scan.nextInt();
				}
				while (edad < Conductor.EDAD_VALIDA) ;
				conductorValido = true;
			} catch (ConductorNombreInsuficienteException e) {
				System.out.println(e.getMessage());
				do {
					System.out.print("Introduce el nuevo nombre: ");
					nombre = scan.next();
				}
				while (nombre.length() < Conductor.LONGITUD_NOMBRE_VALIDO) ;
				conductorValido = true;
			} finally {
				if (conductorValido) {
					try {
						c = new Conductor(tieneCarnet, edad, nombre);
					} catch (ConductorException e) {
						System.out.println(e.getMessage());
					}
					conductores.add(c);
				}
			}
		} while (conductores.size() < numeroConductores);
		scan.close();
		System.out.println("Lista de conductores válidos");
		for (int i = 0; i < conductores.size(); i++) {
			System.out.println("CONDUCTOR[" + (i + 1) + "]:" + conductores.get(i).getNombre() + " "
					+ conductores.get(i).getEdad() + " años.");
		}
		System.out.println("Hubo un total de " + numNoValidos + " conductores no válidos");
		return conductores;
	}

	public static void main(String[] args) {
		crearConductores(10);
	}
}