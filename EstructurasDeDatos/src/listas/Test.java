package listas;

import java.security.SecureRandom;

public class Test {

	public static void main(String[] args) {

		ArrayDinamico<String> listaArray = new ArrayDinamico<String>();
		ListaEnlazada<String> listaEnlazada = new ListaEnlazada<String>();
		System.out.println("||||Insertar");
		listaArray.insertar("---LISTA ARRAY---");
		listaArray.insertar("Hola");
		listaArray.insertar("me");
		listaArray.insertar("llamo");
		listaArray.insertar("pedro");
		listaArray.insertar("---FIN LISTA ARRAY---");
		listaEnlazada.insertar("---LISTA ENLAZADA---");
		listaEnlazada.insertar("Pues");
		listaEnlazada.insertar("yo");
		listaEnlazada.insertar("soy");
		listaEnlazada.insertar("Jose");
		listaEnlazada.insertar("---FIN LISTA ENLAZADA---");
		mostrar(listaArray);
		mostrar(listaEnlazada);

		System.out.println("||||Concatenar y vaciar");
		ListaEnlazada<String> concatenada = new ListaEnlazada<String>();
		concatenada.insertar("---LISTA CONCATENADA---");
		concatenada.concatenar(listaEnlazada);
		concatenada.concatenar(listaArray);
		concatenada.insertar("---FIN LISTA CONCATENADA---");
		mostrar(concatenada);
		concatenada.vaciar();
		mostrar(concatenada);

		System.out.println("||||Insertar por posicion");
		listaArray.insertar(3, "Insertado en 3");
		listaEnlazada.insertar(3, "Insertado en 3");
		mostrar(listaArray);
		mostrar(listaEnlazada);

		System.out.println("||||Modificar");
		listaArray.set(4, "Modificado el 4");
		listaEnlazada.set(4, "Modificado el 4");
		mostrar(listaArray);
		mostrar(listaEnlazada);

		System.out.println("||||Eliminar por posicion");
		listaArray.eliminar(4);
		//listaEnlazada.eliminar(4);
		mostrar(listaArray);
		//mostrar(listaEnlazada);

		System.out.println("||||Eliminar por elemento");
		listaArray.eliminar("Insertado en 3");
		//listaEnlazada.eliminar("Insertado en 3");
		mostrar(listaArray);
		//mostrar(listaEnlazada);

		System.out.println("||||Sublistas");
		mostrar(listaArray.sublista(0, 3));
		//mostrar(listaEnlazada.sublista(2, 4));

		// Juega un poco con esto
		System.out.println("||||Poblando");
		poblar(100000, listaArray);
		System.out.println("||||Poblada");
		//poblar(100000, listaEnlazada);
		System.out.println("||||Poblada");
		// listaArray.concatenar(listaEnlazada);
		// System.out.println("||||Poblada");
		mostrar(listaArray.sublista(3532, 3542));
		//mostrar(listaEnlazada.sublista(3532, 3542));
	}

	public static void mostrar(Lista<String> arr) {
		for (int i = 0; i < arr.tamanno(); i++) {
			System.out.println(arr.get(i));
		}
	}

	public static void poblar(int numElementos, Lista<String> lista) {
		for (int i = 0; i < numElementos; i++) {
			lista.insertar(generarCadenaAleatoria(4,12));
		}
	}

	public static String generarCadenaAleatoria(int longitudMinima, int longitudMaxima) {
		String validos = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		SecureRandom random = new SecureRandom();
		int longitud = random.nextInt(longitudMaxima - longitudMinima + 1) + longitudMinima;
		StringBuilder sb = new StringBuilder(longitud);
		for (int i = 0; i < longitud; i++) {
			int indice = random.nextInt(validos.length());
			sb.append(validos.charAt(indice));
		}
		return sb.toString();
	}

}