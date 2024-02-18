package tresEnRaya;

import java.util.Scanner;

public class Juego 
{
	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("TRESENRAYA TRESENRAYA TRESENRAYA TRESENRAYA TRESENRAYA TRESENRAYA");
		System.out.println("Comienza el juego!");
		char [][] tresenraya = crearJuego();
		imprimirJuego(tresenraya);
		System.out.print("Jugador 1 -> ");
		Jugador player1 = new Jugador(introNombre(), 'X');
		System.out.print("Jugador 2 -> ");
		Jugador player2 = new Jugador(introNombre(), 'O');
		
		System.out.println();
		boolean ganado = false;
		int contador = 0;
		while(!ganado)
		{
			contador += 1;
			if(contador%2 != 0)
			{
				insertar(introCasilla(player1, tresenraya), player1.getFicha(), tresenraya);
			}
			else
			{
				insertar(introCasilla(player2, tresenraya), player2.getFicha(), tresenraya);
			}
			imprimirJuego(tresenraya);
			if(comprobar(tresenraya))
			{
				ganado = true;
			}
			else if(comprobarLleno(tresenraya))
			{
				ganado = true;
				contador = 0;
			}
		}
		if(contador == 0)
		{
			System.err.println("EMPATE");
		}
		else if(contador % 2 != 0)
		{
			System.out.println("Juego terminado! Ha ganado " + player1.getNombre());
		}
		else if (contador % 2 == 0)
		{
			System.out.println("Juego terminado! Ha ganado " + player2.getNombre());
		}
		
	}
	
	public static boolean comprobarLleno(char [][] tresenraya)
	{
		String interior = "";
		for(int i = 0; i < tresenraya.length; i++)
		{
			for(int j = 0; j < tresenraya.length; j++)
			{
				interior += tresenraya[i][j];
			}
		}
		if(!interior.contains("*"))
			return true;
		return false;
	}
	
	public static boolean comprobar(char [][] tresenraya)
	{
		boolean ganado = false;
		for(int i = 0; i < 3; i++)
		{
			if(tresenraya[i][0] == tresenraya[i][1] && tresenraya[i][0] == tresenraya[i][2] && tresenraya[i][1] != '*')
			{
				ganado = true;
			}
			if(tresenraya[0][i] == tresenraya[1][i] && tresenraya[0][i] == tresenraya[2][i] && tresenraya[1][i] != '*')
			{
				ganado = true;
			}
		}
		if(!ganado)
		{
			if(tresenraya[0][0] == tresenraya[1][1] && tresenraya[0][0] == tresenraya[2][2] && tresenraya[0][0] != '*')
			{
				ganado = true;
			}
			if(tresenraya[0][2] == tresenraya[1][1] && tresenraya[0][2] == tresenraya[2][0] && tresenraya[0][2] != '*')
			{
				ganado = true;
			}
		}
		
		return ganado;
	}
	
	public static void insertar(int [] posicion, char ficha, char[][] tresenraya)
	{
		tresenraya[posicion[0]][posicion[1]] = ficha;
	}
	
	
	public static int[] introCasilla(Jugador jugador, char [][] tresenraya)
	{
		Scanner entrada = new Scanner(System.in);
		boolean correcto = false;
		int [] posicionArray = new int[2];
		while(!correcto)
		{
			System.out.print(jugador.getNombre() + " es tu turno, introduce la casilla para colocar tu ficha: ");
			String posicion = entrada.next();
			posicion = posicion.toUpperCase();
			if(posicionValida(posicion))
			{
				posicion = convertirPosicion(posicion);
				posicionArray[0] = posicion.charAt(1)-'0';
				posicionArray[1] = posicion.charAt(0)-'0';
				if(tresenraya[posicionArray[0]][posicionArray[1]] == '*')
				{
					correcto = true;
				}
				else
				{
					System.err.println("La casilla no está vacia");
				}
			}
			else
			{
				System.err.println("La casilla no es correcta, haz uso de las coordenas del tablero");
			}
		}
		return posicionArray;
	}
	
	public static String convertirPosicion(String posicion)
	{
		String posicionNueva = "";
		posicionNueva += posicion.charAt(0) - 65;
		posicionNueva += (posicion.charAt(1) - '0') - 1;
		return posicionNueva;
	}
	
	public static boolean posicionValida(String posicion)
	{
		if(posicion.charAt(0) == 'A' || posicion.charAt(0) == 'B' || posicion.charAt(0) == 'C')
		{
			if(posicion.charAt(1)-'0' == 1 || posicion.charAt(1)-'0' == 2 || posicion.charAt(1)-'0' == 3)
			{
				return true;
			}
		}
		return false;
	}
	

	public static String introNombre() 
	{
		System.out.print("Introduce tu nombre: ");
		return entrada.next();
	}

	public static char[][] crearJuego()
	{
		char [][] tresenraya = new char[3][3];
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				tresenraya[i][j] = '*';
			}
		}
		return tresenraya;
	}
	
	public static void imprimirJuego(char [][] tresenraya)
	{
		System.out.println();
		System.out.println("\t  A B C");
		for(int i = 0; i < 3; i++)
		{
			System.out.print("\t" + (i+1) + " ");
			for(int j = 0; j < 3; j++)
			{
				System.out.print(tresenraya[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
