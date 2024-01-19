package concesionarioTrabajo;

public class Coches extends Vehiculos implements Alquilable, Comprable
{
	protected int numeroPuertas;
	protected boolean esElectrico;
	protected boolean esTermico;
	
	public Coches(String marca, String modelo, double precio, int numeroPuertas, boolean esElectrico, boolean esTermico) 
	{
		super(marca, modelo, precio);
		this.numeroPuertas = numeroPuertas;
		this.esElectrico = esElectrico;
		this.esTermico = esTermico;
	}

	@Override
	public void comprar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calcPrecioCompra() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alquilar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calcPrecioAlquiler() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calcularImpuestos() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calcularDepreciacion(int annos) {
		// TODO Auto-generated method stub
		
	}
	
}
