package e0504;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.ArrayList;

public class GestorVentas implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<Venta> lista;
	
	public GestorVentas()
	{
		lista = new ArrayList<Venta>();
	}
	
	public void nuevaVenta(Venta venta)
	{
		lista.add(venta);
	}
	
	public int totaldeVentas()
	{
		return lista.size();
	}
	
	public void guardar(String nombreFichero)
	{
		PrintWriter out = null;
		try
		{
			out = new PrintWriter(nombreFichero);
			out.println("-------LISTA DE VENTAS-------");
			for(Venta venta : lista)
			{
				out.println("---------------------------------");
				out.println("Nombre Producto -> " + venta.getNombreProducto());
				out.println("Cantidad Vendida -> " + venta.getCantidadVendida());
				out.println("Precio Venta -> " + venta.getPrecioVenta());
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
