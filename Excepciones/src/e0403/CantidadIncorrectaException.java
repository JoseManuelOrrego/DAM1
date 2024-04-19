package e0403;

@SuppressWarnings("serial")
public class CantidadIncorrectaException extends CuentaBancariaException
{
	public CantidadIncorrectaException(String mensaje)
	{
		super(mensaje);
	}
}
