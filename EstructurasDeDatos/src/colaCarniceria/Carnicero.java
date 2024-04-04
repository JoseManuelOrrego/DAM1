package colaCarniceria;

public class Carnicero
{
	private ColaGenerica colaDeClientes;

	public Carnicero()
	{
		colaDeClientes = new ColaGenerica();
	}
	
	public void llegaCliente(Cliente cl)
	{
		cl.llega();
		//colaDeClientes.
		//colaDeClientes.encolar(cl);
	}
}
