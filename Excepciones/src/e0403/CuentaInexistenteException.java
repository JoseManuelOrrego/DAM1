package e0403;

@SuppressWarnings("serial")
public class CuentaInexistenteException extends CuentaBancariaException
{
	public CuentaInexistenteException(String mensaje)
	{
		super(mensaje);
	}
}
