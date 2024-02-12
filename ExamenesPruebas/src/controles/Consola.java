package controles;

public class Consola extends ProductoElectronico
{
	private String color;
	private String resolucion;
	
	public Consola(String marca, String modelo, double precio, int annoFabricacion, String color, String resolucion) 
	{
		super(marca, modelo, precio, annoFabricacion);
		this.color = color;
		this.resolucion = resolucion;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getResolucion() {
		return resolucion;
	}

	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}

	public void getDetalles() 
	{
		System.out.println();
		super.getDetalles();
		System.out.println("Color -> " + getColor() + "\nResolucion -> " + getResolucion());
		System.out.println();

	}
	
	
}
