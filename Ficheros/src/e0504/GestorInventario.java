package e0504;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.LinkedList;

public class GestorInventario implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private LinkedList<Producto> lista;
	
	public GestorInventario()
	{
		lista = new LinkedList<Producto>();
	}
	
	public void agregar(Producto producto)
	{
		lista.add(producto);
	}
	
	public void actualizarCantidad(String nombre, int stockNuevo)
	{
		Producto producto = buscar(nombre);
		lista.remove(producto);
		producto.setStock(stockNuevo);
		lista.add(producto);
	}
	
	public void mostrarTodos()
	{
		int contador = 1;
		for (Producto producto : lista) 
		{
			System.out.println("PRODUCTO " + contador++);
            System.out.println("Nombre -> " + producto.getNombre());
            System.out.println("Descripcion -> " + producto.getDescripcion());
            System.out.println("Precio -> " + producto.getPrecio());
            System.out.println("Cantidad/Stock -> " + producto.getStock());
            System.out.println();
        }
	}
	
	public Producto buscar(String nombre)
	{
		for(int i = 0; i < lista.size(); i++)
		{
			String nombreValorar = lista.get(i).getNombre();
			if(nombre.equalsIgnoreCase(nombreValorar))
			{
				return lista.get(i);
			}
		}
		return null;
	}
	
	public void guardar(String nombreFichero)
	{
		PrintWriter out = null;
		try
		{
			out = new PrintWriter(nombreFichero);
			out.println("-------LISTA DE PRODUCTOS-------");
			for(Producto producto : lista)
			{
				out.println("---------------------------------");
				out.println("Nombre -> " + producto.getNombre());
				out.println("Descripcion -> " + producto.getDescripcion());
				out.println("Precio -> " + producto.getPrecio());
				out.println("Cantidad/Stock -> " + producto.getStock());
			}
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			if(out != null)
			{
				out.close();
			}
		}
	}
}
