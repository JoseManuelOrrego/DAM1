package depuracion;

//Utilizar el depurador para seguir el valor de una variable a medida que el bucle se ejecuta. Hacer una tabla.

public class Ejercicio2
{
	public static void main(String[] args) 
	{
		int n = 5;
		int sum = 0;
		for (int i = 1; i <= n; i++) 
		{
			sum += i;
			System.out.println("Valor de 'i': " + i);
			System.out.println("Valor de 'sum': " + sum);
		}
		System.out.println("La suma de los números del 1 al " + n + " es: " + sum);
	}
}