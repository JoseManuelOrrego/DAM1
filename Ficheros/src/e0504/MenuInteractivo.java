package e0504;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class MenuInteractivo 
{
	private static final String ficheroEscrituraLectura = "Tienda.bin";
	static GestorInventario inventario = null;
	static GestorVentas ventas = null;
	
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		boolean salida = false;
		do
		{
			System.out.print("¿Quieres cargar el programa(1) o comenzar uno nuevo(2)?: ");
			int opcion = entrada.nextInt();
			if(opcion == 1)
			{
				leerFicheroBinario();
				salida = true;
			}
			else if(opcion == 2)
			{
				System.out.print("¿Estas seguro? Si ya hay un programa, se sobreescribira(s/n): ");
				String seguro = entrada.next();
				if(seguro.equalsIgnoreCase("s"))
				{
					inventario = new GestorInventario();
					ventas = new GestorVentas();
					salida = true;
				}
				else if(seguro.equalsIgnoreCase("n"))
				{
					System.out.println("Se te redirige al inicio");
				}
				else
				{
					System.out.println("No has introducido una opcion valida. Se te redirige al inicio.");
				}
			}
			else
			{
				System.out.println("Vuelve a intentarlo(1-2)");
			}
		} while(!salida);
		
		inicio(inventario,ventas,entrada);
		entrada.close();
		System.out.println("FIN DEL PROGRAMA");
	}
	
	public static void leerFicheroBinario() 
	{
		System.out.println("Leyendo...");
		ObjectInputStream ois = null;
		try
		{
			ois = new ObjectInputStream(new FileInputStream(ficheroEscrituraLectura));
			inventario = (GestorInventario) ois.readObject();
			ventas = (GestorVentas) ois.readObject();
		}
		catch (ClassNotFoundException ex) 
		{
			System.out.println("IOExceptional no se encontro la clase especificada: " + ex.getMessage());
		} 
		catch (IOException e) 
		{
			System.out.println("IOExceptional: " + e.getMessage());
		} 
		finally 
		{
			if (ois != null) 
			{
				try 
				{
					ois.close();
				} 
				catch (IOException ex) 
				{
					System.out.println("IOExceptional cerrar: " + ex.getMessage());
				}
			}
		}
	}
	
	public static void guardar()
	{
		System.out.println("Guardando...");
		ObjectOutputStream oos = null;
		try
		{
			oos = new ObjectOutputStream(new FileOutputStream(ficheroEscrituraLectura));
			oos.writeObject(inventario);
			oos.writeObject(ventas);
		}
		catch (IOException ex) 
		{
			System.out.println("IOExceptional escribir:" + ex.getMessage());
		}
		finally 
		{
			if (oos != null)
			{
				try 
				{
					oos.close();
				}
				catch (IOException e)
				{
					System.out.println("IOExceptional al cerrar:" + e.getMessage());
				}
			}
		}
	}

	public static void inicio(GestorInventario inventario, GestorVentas ventas, Scanner entrada)
	{
		boolean salir = false;
		while(!salir)
		{
			System.out.println("\nGESTOR DE PRODUCTOS Y VENTAS \n");
			System.out.println("Elige una accion: \n1 -> Agregar producto nuevo \n2 -> Actualizar stock de producto"
					+ "\n3 -> Mostrar productos \n4 -> Buscar producto \n5 -> Registrar venta nueva"
					+ "\n6 -> Mostrar ventas \n7 -> Crear fichero de productos \n8 -> Crear fichero de ventas"
					+ "\n9 -> Salir");
			System.out.print("Numero de la accion: ");
			int accion = entrada.nextInt();
			switch(accion)
			{
			case 1:
				agregarProducto(entrada);
				guardar();
				break;
			case 2:
				actualizarStock(entrada);
				guardar();
				break;
			case 3:
				mostrarProductos();
				guardar();
				break;
			case 4:
				buscarProducto(entrada);
				guardar();
				break;
			case 5:
				agregarVenta(entrada);
				guardar();
				break;
			case 6:
				mostrarVentas();
				guardar();
				break;
			case 7:
				crearFicheroProductos(entrada);
				guardar();
				break;
			case 8:
				crearFicheroVentas(entrada);
				guardar();
				break;
			case 9:
				salir = true;
				break;
			default:
				System.out.println("No has elegido un numero correcto(1-9). Vuelve a intentarlo");
			}
		}
	}

	private static void agregarProducto(Scanner entrada)
	{
		System.out.println("Ingresa la informacion del producto nuevo");
		System.out.print("Nombre:  ");
		String nombre = entrada.next();
		System.out.print("Descripcion: ");
		String descripcion = entrada.next();
		System.out.print("Precio: ");
		double precio = entrada.nextDouble();
		System.out.print("Cantidad/Stock: ");
		int cantidad = entrada.nextInt();
		
		inventario.agregar(new Producto(nombre, descripcion, precio, cantidad));
	}

	private static void actualizarStock(Scanner entrada) 
	{
		System.out.print("Introduce el nombre del producto(tiene que estar en el inventario): ");
		String nombre = entrada.next();
		System.out.print("Ahora, la cantidad de stock nueva: ");
		int nuevaCantidad = entrada.nextInt();
		inventario.actualizarCantidad(nombre, nuevaCantidad);
	}

	private static void mostrarProductos()
	{
		System.out.println("LISTA DE PRODUCTOS");
		inventario.mostrarTodos();
		System.out.println("FIN DE LA LISTA");
	}

	private static void buscarProducto(Scanner entrada) 
	{
		System.out.print("Ingresa el nombre del producto a buscar: ");
		String nombre = entrada.next();
		Producto producto = inventario.buscar(nombre);
		System.out.println("Nombre -> " + producto.getNombre());
        System.out.println("Descripcion -> " + producto.getDescripcion());
        System.out.println("Precio -> " + producto.getPrecio());
        System.out.println("Cantidad/Stock -> " + producto.getStock());
        System.out.println();
	}

	private static void agregarVenta(Scanner entrada)
	{
		System.out.println("Ingresa la informacion de la nueva venta");
		System.out.println("Nombre del producto: ");
		String nombre = entrada.next();
		System.out.println("Cantidad vendida: ");
		int cantidad = entrada.nextInt();
		System.out.println("Precio total: ");
		double precio = entrada.nextDouble();
		
		ventas.nuevaVenta(new Venta(nombre,cantidad,precio));
	}

	private static void mostrarVentas()
	{
		System.out.println("Ventas realizadas en total -> " + ventas.totaldeVentas());
		System.out.println();
	}

	private static void crearFicheroProductos(Scanner entrada) 
	{
		System.out.print("Introduce el nombre del nuevo fichero del inventario: ");
		String nombreFichero = entrada.next();
		inventario.guardar(nombreFichero);
		System.out.println("Fichero creado y guardado");
	}

	private static void crearFicheroVentas(Scanner entrada) 
	{
		System.out.print("Introduce el nombre del nuevo fichero de ventas: ");
		String nombreFichero = entrada.next();
		ventas.guardar(nombreFichero);
		System.out.println("Fichero creado y guardado");
	}
}
