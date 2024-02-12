package controles;

public class ProductoElectronico
{
	private String marca;
	private String modelo;
	private double precio;
	private int annoFabricacion;
	
	public ProductoElectronico(String marca, String modelo, double precio, int annoFabricacion)
	{
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		this.annoFabricacion = annoFabricacion;
	}
	
	
	
	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	public String getModelo() {
		return modelo;
	}



	public void setModelo(String modelo) {
		this.modelo = modelo;
	}



	public double getPrecio() {
		return precio;
	}



	public void setPrecio(double precio) {
		this.precio = precio;
	}



	public int getAnnoFabricacion() {
		return annoFabricacion;
	}



	public void setAnnoFabricacion(int annoFabricacion) {
		this.annoFabricacion = annoFabricacion;
	}



	public void getDetalles()
	{
		System.out.println("Marca -> " + getMarca() + "\nModelo -> " + getModelo() + "\nPrecio - > " + getPrecio() + "\nAñoFabricacion -> " +
				getAnnoFabricacion());
	}
	
	public static void encender()
	{
		System.out.println("Aparato encendido");
	}
	
	public static void apagar()
	{
		System.out.println("Aparato apagado");
	}
	
}
