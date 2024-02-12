package controles;

public class Telefono extends ProductoElectronico
{
	private double tamannoPantalla;
	private String OS;
	
	public Telefono (String marca, String modelo, double precio, int annoFabricacion, double tamannoPantalla, String OS)
	{
		super(marca, modelo, precio, annoFabricacion);
		this.tamannoPantalla = tamannoPantalla;
		this.OS = OS;
	}

	public void getDetalles() 
	{
		System.out.println();
		super.getDetalles();
		System.out.println("Tamaño de la pantalla -> " + getTamannoPantalla() + "\nSistemaOperativo -> " + getOS());
		System.out.println();

	}

	public double getTamannoPantalla() {
		return tamannoPantalla;
	}

	public void setTamannoPantalla(double tamannoPantalla) {
		this.tamannoPantalla = tamannoPantalla;
	}

	public String getOS() {
		return OS;
	}

	public void setOS(String oS) {
		OS = oS;
	}
	
	
}
