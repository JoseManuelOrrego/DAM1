package areas;

import java.util.Scanner;

public class AreaTriangulo 
{
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce la base del triángulo: ");
		double base = entrada.nextDouble();
		System.out.println("Introduce la altura del triangulo: ");
		double altura = entrada.nextDouble();
		
		double resultado = calcularArea(base, altura);
		System.out.println("El area del triangulo es: " + resultado);
	}

	public static double calcularArea(double base, double altura) 
	{
		return (base*altura)/2;
	}
}