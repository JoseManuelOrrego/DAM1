package main;

import clases.Camiones;
import clases.Clientes;
import clases.Coches;
import clases.Motocicletas;
import clases.Vehiculos;
import otros.CreadorDeAleatorios;

public class Concesionario 
{
	public static void main(String[] args) 
	{
		Vehiculos [] catalogo = 
			{new Motocicletas("Hyosung", "Bobber GV125S", 3987, "Cadena", false),
			new Motocicletas("Yamaha", "NMAX 125", 3499, "Corera", false),
			new Coches("Citroen", "C4", 21055, 5, false, true),
			new Coches("Tesla", "Model 3", 49990, 5, true, false),
			new Camiones("Iveco", "S-WAY", 36230, 3113),
			new Camiones("Mercedes-Benz", "Actros", 48699, 2770)};
		
		String [] nombresClientes = {"Juan", "Jose", "David", "Antonio", "Lucas", "Sofia",
				"Maria", "Denisse", "Shakira", "Yoshi"};
		
		Clientes cliente;
		Vehiculos vehiculo;
		for(int i = 0; i < 7000; i++)
		{
			cliente = new Clientes(nombresClientes[CreadorDeAleatorios.aleatorio(10)]);
			if(cliente.getQuiereComprar())
			{
				vehiculo = catalogo[CreadorDeAleatorios.aleatorio(2,5)];
				if(vehiculo instanceof Camiones)
				{
					System.out.print("Pedido Nº " + (i+1) + "\nCliente -> " + cliente.getNombre()
					+ "\nConcepto -> ");
					((Camiones) vehiculo).comprar();
					System.out.println();
				}
				if(vehiculo instanceof Coches)
				{
					System.out.print("Pedido Nº " + (i+1) + "\nCliente -> " + cliente.getNombre()
					+ "\nConcepto -> ");
					((Coches) vehiculo).comprar();
					System.out.println();
				}
			}
			else
			{
				vehiculo = catalogo[CreadorDeAleatorios.aleatorio(0,3)];
				if(vehiculo instanceof Motocicletas)
				{
					System.out.print("Pedido Nº " + (i+1) + "\nCliente -> " + cliente.getNombre()
					+ "\nConcepto -> ");
					((Motocicletas)vehiculo).alquilar();
					System.out.println();
				}
				if(vehiculo instanceof Coches)
				{
					System.out.print("Pedido Nº " + (i+1) + "\nCliente -> " + cliente.getNombre()
					+ "\nConcepto -> ");
					((Coches)vehiculo).alquilar();
					System.out.println();
				}
			}
		}
	}
}