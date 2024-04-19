package e0403;

@SuppressWarnings("serial")
public class SaldoInsuficienteException extends CuentaBancariaException
{
	public SaldoInsuficienteException(String mensaje)
	{
		super(mensaje);
	}
}
