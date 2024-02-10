package ejercicios;

import java.util.Scanner;

public class AjedrezPeones 
{
	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) 
	{
		char [][] tablero = crearAjedrez();
		imprimirArray(tablero);
		for(int i = 0; i < 5; i++)
		{
			System.out.println("Turno " + (i+1));
			intentoMovimiento(tablero);
		}
		System.out.println("Fin de los turnos");
	}
	
	public static char[][] crearAjedrez() 
	{
		char[][] ajedrez = new char[8][8];
		for (int i = 0; i < 2; i++) 
		{
			i *= 7;
			ajedrez[i][0] = 'T';
			ajedrez[i][1] = 'C';
			ajedrez[i][2] = 'A';
			ajedrez[i][3] = 'D';
			ajedrez[i][4] = 'R';
			ajedrez[i][5] = 'A';
			ajedrez[i][6] = 'C';
			ajedrez[i][7] = 'T';
		}
		for (int i = 0; i < 8; i++) 
		{
			ajedrez[1][i] = 'P';
			ajedrez[6][i] = 'P';
		}
		for (int i = 2; i < 6; i++) 
		{
			for (int j = 0; j < 8; j++) 
			{
				ajedrez[i][j] = 'X';
			}
		}
		return ajedrez;
	}
	
	public  static void imprimirArray(char[][]tablero) 
	{
		for(int i=0;i<tablero.length;i++) 
		{				
			System.out.println();				
			for(int j = 0 ; j< tablero[i].length;j++) 
			{
				System.out.print(tablero[i][j]+" ");
			}
			System.out.print(" " + (tablero.length-i));
		}
		System.out.println("\n");
		System.out.println("A B C D E F G H");
		System.out.println();
	}
	
	public  static void imprimirArrayExtra(char[][]tablero, String posicionMarcada) 
	{
		for(int i=0;i<tablero.length;i++) 
		{				
			System.out.println();				
			for(int j = 0 ; j< tablero[i].length;j++) 
			{
				if(posicionMarcada.charAt(0) - '0' == j && posicionMarcada.charAt(1) - '0' == i)
				{
					System.out.print("@ ");
				}
				else
					System.out.print(tablero[i][j]+" ");
			}
			System.out.print(" " + (tablero.length-i));
		}
		System.out.println("\n");
		System.out.println("A B C D E F G H				Ficha marcada con @");
		System.out.println();
	}
	
	public static void intentoMovimiento(char[][]tablero)
	{
		boolean bingo = false;
		while(!bingo)
		{
			String posicionReal = "";
			System.out.print("¿Que peon quieres mover?  --> ");
			String posicion = entrada.next();
			posicionReal += Character.toUpperCase(posicion.charAt(0));
			posicionReal += posicion.charAt(1);
			posicion = convertirPosicion(posicionReal);
			if(tablero[posicion.charAt(1) - '0'][posicion.charAt(0) - '0'] == 'P')
			{
				bingo = true;
				imprimirArrayExtra(tablero, posicion);
				movimientoPeon(tablero, posicion);
			}
			else
			{
				System.out.println("No se encuentra ningun peon en la posicion indicada");
			}
		}
	}
	
	public static String convertirPosicion(String posicion)
	{
		String posicionConvertida = "";
		posicionConvertida += posicion.charAt(0)- 65;
		int segundon = posicion.charAt(1) - '0';
		posicionConvertida += Math.abs(segundon - 8);
		
		return posicionConvertida;
	}

	public static void movimientoPeon(char [][] tablero, String posicion)
	{
		boolean cambioCorrecto = false;
		while(!cambioCorrecto)
		{
			String posicionReal = "";
			System.out.print("Inserta la casilla a la que quieres mover el peon --> ");
			String posicionNueva = entrada.next();
			posicionReal += Character.toUpperCase(posicionNueva.charAt(0));
			posicionReal += posicionNueva.charAt(1);
			posicionNueva = convertirPosicion(posicionReal);
			
			if(tablero[posicionNueva.charAt(1)-'0'][posicionNueva.charAt(0)-'0'] == 'X')
			{
				if(Math.abs((posicionNueva.charAt(1) - '0') - (posicion.charAt(1) - '0')) <= 2)
				{
					if(posicionNueva.charAt(0) == posicion.charAt(0))
					{
						cambioFichas(tablero, posicion, posicionNueva);
						cambioCorrecto = true;
						imprimirArray(tablero);
					}
					else
					{
						System.out.println("Tienen que ser de la misma columna");
					}
				}
				else
				{
					System.out.println("No se puede mover mas de dos casillas");
				}
			}
			else
			{
				System.out.println("La casilla introducida esta ocupada");
			}
		}
	}
	
	public static boolean cambioFichas(char [][] tablero, String posicion, String posicionNueva)
	{
		char aux = tablero[posicionNueva.charAt(1)-'0'][posicionNueva.charAt(0)-'0'];
		tablero[posicionNueva.charAt(1)-'0'][posicionNueva.charAt(0)-'0'] = tablero[posicion.charAt(1)-'0'][posicion.charAt(0)-'0'];
		tablero[posicion.charAt(1)-'0'][posicion.charAt(0)-'0'] = aux;
		return true;
	}
}