package e0403;

public class SaldoInsuficienteException extends CuentaBancariaException
{
	public SaldoInsuficienteException(String mensaje)
	{
		super(mensaje);
	}
}
