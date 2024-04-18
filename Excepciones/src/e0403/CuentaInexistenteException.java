package e0403;

public class CuentaInexistenteException extends CuentaBancariaException
{
	public CuentaInexistenteException(String mensaje)
	{
		super(mensaje);
	}
}
