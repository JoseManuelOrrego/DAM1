package arrayDinamico;

import java.util.Scanner;

public class ArrayDinamicoEnteros 
{
	private int [] array;
	private int tamMax;
	private int numElementos = 0;
	
	public ArrayDinamicoEnteros(int longitud)
	{
		this.array = new int[longitud];
		this.tamMax = longitud;
		numElementos = 0;
	}
	
	public ArrayDinamicoEnteros(ArrayDinamicoEnteros arrayCopia)
	{
		this.array = new int[arrayCopia.array.length];
		this.tamMax = arrayCopia.array.length;
        for (int i = 0; i < arrayCopia.array.length; i++) 
        {
            this.array[i] = arrayCopia.array[i];
            numElementos++;
        }
	}
	
	public ArrayDinamicoEnteros() 
	{
	       Scanner entrada = new Scanner(System.in);
	       System.out.print("Introduce la longitud del array: ");
	       int longitud = entrada.nextInt();
	       this.array = new int[longitud];
	       this.tamMax = longitud;

	       boolean salida = false;
	       while (!salida) 
	       {
		       System.out.print("Introduce numeros para el array o introduce 999 para salir: ");
	           int numero = entrada.nextInt();
	           if (numero == 999)
	               salida = true;
	           else
	           {
	        	   array[numElementos] = numero;
	        	   numElementos++;
	           }
	           if (numElementos == tamMax) 
	           {
	               salida = true;
	           }
	       }
	}

	public void mostrar()
	{
		for(int i = 0; i < tamMax; i++)
		{
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	public boolean arrayLleno()
	{
		return numElementos == tamMax;
	}
	
	public boolean insertar(int numero)
	{
		if(arrayLleno())
		{
			unoMas();
			array[tamMax-1] = numero;
			numElementos ++;
			return true;
		}
		else
		{
			for(int i = 0; i < array.length; i++)
			{
				if(array[i] == 0)
				{
					array[i] = numero;
					numElementos++;
					return true;
				}
			}
		}
		return false;
	}
	 
	public void unoMas()
	{
		int [] aux = new int[tamMax+1];
		for(int i = 0; i < array.length; i++)
		{
			aux[i] = array[i];
		}
		array = aux;
		tamMax++;
	}
	
	public boolean insertar(int numero, int posicion)
	{
		if(array[numero] == 0)
		{
			array[posicion] = numero;
			numElementos++;
			return true;
		}
		else
			System.out.println("La posicion elegida ya esta ocupada.");
		return false;
	}
	
	public void ordenar()
	{
		Scanner entrada = new Scanner(System.in);
		System.out.print("Ordenar de mayor a menor / Ordenar de menor a mayor (1/2) --> ");
		int opcion = entrada.nextInt();
		if(opcion == 1)
		{
			int aux;
			for(int i = 0; i < array.length-1; i++)
			{
				for(int j = 0; j < array.length-1-i; j++)
				{
					if(array[j] < array[j+1])
					{
						aux = array[j];
						array[j] = array[j+1];
						array[j+1] = aux;
					}
				}
			}
		}
		else
		{
			int aux;
			for(int i = 0; i < array.length-1; i++)
			{
				for(int j = 0; j < array.length-1-i; j++)
				{
					if(array[j] > array[j+1])
					{
						aux = array[j];
						array[j] = array[j+1];
						array[j+1] = aux;
					}
				}
			}
		}
	}
	
	public int buscar(int buscado)
	{
		for(int i = 0; i < array.length; i++)
		{
			if(array[i] == buscado)
				return i;
		}
		return -1;
	}
	
	public void numVeces(int buscado)
	{
		int numVeces = 0;
		for(int i = 0; i < array.length; i++)
		{
			if(array[i] == buscado)
			{
				numVeces += 1;
			}
		}
		System.out.println("El elemento se ha encontrado " + numVeces + " veces.");
	}
	
	public void eliminar()
	{
		Scanner entrada = new Scanner(System.in);
		int posicion = -1;
		boolean encontrado = false;
		while(!encontrado)
		{
			System.out.print("Introduce una posicion valida que quieres eliminar: ");
			posicion = entrada.nextInt();
			if (posicion >= 0 && posicion <= array.length) 
			{
				unoMenos(posicion);
                encontrado = true;
			}
			if(!encontrado)
				System.out.println("Posicion no valida");
		}
		System.err.println("Elemento eliminado");
	}

	public void unoMenos(int posicion)
	{
		int [] aux = new int[tamMax-1];
		for(int i = 0; i < aux.length; i++)
		{
			if(i < posicion)
			{
				aux[i] = array[i];
			}
			else if(i >= posicion)
			{
				aux[i] = array[i+1];
			}
		}
		array = aux;
		tamMax --;
		numElementos--;
	}
	
	public ArrayDinamicoEnteros fusionar(ArrayDinamicoEnteros array2)
	{
		ArrayDinamicoEnteros arrayFusionado = new ArrayDinamicoEnteros(array.length+array2.array.length);
		arrayFusionado.tamMax = tamMax + array2.tamMax;
		arrayFusionado.numElementos = numElementos + array2.numElementos;
		for(int i = 0; i < arrayFusionado.array.length; i++)
		{
			if(i < array.length)
			{
				arrayFusionado.array[i] = array[i];
			}
			else if(i >= array.length)
			{
				arrayFusionado.array[i] = array2.array[i-array.length];
			}
		}
		return arrayFusionado;
	}
	
	public void paresImpares()
	{
		int pares = 0, impares = 0;
		for(int i = 0; i < array.length; i++)
		{
			if(array[i] % 2 == 0)
				pares++;
			else if(array[i] % 2 != 0)
				impares++;
		}
		System.out.println("Numero de pares del array: " + pares + "\nNumero de impares del array: " + impares);
	}
	
	public void media()
	{
		int suma = 0, elementos = 0;
		for(int i = 0; i < array.length; i++)
		{
			elementos++;
			suma += array[i];
		}
		System.out.println("Media de los elementos del array: " + suma/elementos);
	}
}