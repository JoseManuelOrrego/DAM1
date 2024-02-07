package ejercicios;

import java.util.Scanner;

public class AjedrezPeones 
{
	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) 
	{
		char [][] tablero = crearAjedrez();
		imprimirArray(tablero);
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
		System.out.println("a b c d e f g h");
		System.out.println();
	}
	
	public static void movimiento(char[][]tablero)
	{
		for(int i = 0; i < 5; i++)
		{
			boolean bingo = false;
			while(!bingo)
			{
				System.out.print("¿Qué peon quieres mover?  --> ");
				String posicion = entrada.next();
				String posicionConvertida = convertirPosicion(posicion);
			}
		}
	}
	
	public static String convertirPosicion(String posicion)
	{
		String posicionConvertida = "";
		switch(posicion.charAt(0))
		{
		case 'a':
			posicionConvertida += "0";
		case 'b':
			posicionConvertida += "1";
		case 'c':
			posicionConvertida += "2";
		case 'd':
			posicionConvertida += "3";
		case 'e':
			posicionConvertida += "4";
		case 'f':
			posicionConvertida += "5";
		case 'g':
			posicionConvertida += "6";
		case 'h':
			posicionConvertida += "7";
		}
		
		return posicionConvertida;
	}

}