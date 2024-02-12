package controles;

public class Portatil extends ProductoElectronico
{
	private double capacidad;
	private String procesador;
	
	public Portatil(String marca, String modelo, double precio, int annoFabricacion, double capacidad, String procesador) 
	{
		super(marca, modelo, precio, annoFabricacion);
	}


	public double getCapacidad() {
		return capacidad;
	}


	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}


	public String getProcesador() {
		return procesador;
	}


	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}


	public void getDetalles() 
	{
		System.out.println();
		super.getDetalles();
		System.out.println("Capacidad -> " + getCapacidad() + "\nProcesador -> " + getProcesador());
		System.out.println();

	}
	
}
