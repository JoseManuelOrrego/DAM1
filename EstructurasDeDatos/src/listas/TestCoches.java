package listas;

import java.util.Random;

/*
 * Instancia un objeto de la clase ArrayDinamico y otro de la clase ListaEnlazada, guarda las referencias en una variable de la interfaz Lista. 
 * Prueba a añadir 500mil coches  en ambas listas, después haz uso de todos los métodos disponibles para ambos objetos utilizando las variables de Lista.
 */

public class TestCoches
{
	public static void main(String[] args)
	{
		Random random = new Random();
		
		Lista<Coche> listaArray = new ArrayDinamico<Coche>();
		Lista<Coche> listaEnlazada = new ListaEnlazada<Coche>();
		
		for(int i = 0; i < 500000; i++)
		{
			Coche cochecito = new Coche(elegirMarcaModelo(random),(random.nextInt(6 - 3 + 1) + 3),(random.nextInt(100000 - 10000 + 1) + 10000));
			listaArray.insertar(cochecito);
			listaEnlazada.insertar(cochecito);
		}
		
		listaArray.concatenar(listaEnlazada);
		mostrar(listaArray);
	}
	
	public static void mostrar(Lista<Coche> listaArray)
	{
		for (int i = 0; i < listaArray.tamanno(); i++)
		{
			listaArray.get(i).mostarDatos();
			System.out.println("-----------------");
		}
	}
	
	public static String elegirMarcaModelo(Random random)
	{
		String[] array = {
			    "Abarth 124 Spider", "Abarth 500", "Abarth 595", "Abarth 695", "Alfa Romeo Giulia", "Alfa Romeo Giulietta",
			    "Alfa Romeo MiTo", "Alfa Romeo Stelvio", "Alfa Romeo Tonale", "Aston Martin DB11", "Aston Martin DBS Superleggera",
			    "Aston Martin DBX", "Aston Martin Vanquish", "Aston Martin Vantage", "Audi A3", "Audi A4", "Audi Q2", "Audi Q3",
			    "Audi Q5", "Bentley Bentayga", "Bentley Continental GT", "Bentley Flying Spur", "Bentley Mulsanne", "BMW Serie 1",
			    "BMW Serie 3", "BMW X1", "BMW X3", "BMW X5", "Bugatti Bolide", "Bugatti Centodieci", "Bugatti Chiron", "Bugatti Divo",
			    "Citroën C3", "Citroën C3 Aircross", "Citroën C4", "Citroën C5", "Citroën C5 Aircross", "Cupra Born", "Cupra Formentor",
			    "Cupra Raval", "Cupra Tavascan", "Cupra Terramar", "Dacia Dokker", "Dacia Duster", "Dacia Jogger", "Dacia Lodgy",
			    "Dacia Sandero", "DFSK 500", "DFSK 580", "DFSK F5", "DFSK ix5"
			    };
		return array[random.nextInt(51)];
	}
}