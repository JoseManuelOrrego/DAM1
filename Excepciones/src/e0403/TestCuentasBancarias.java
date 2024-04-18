package e0403;

public class TestCuentasBancarias 
{
	public static void main(String[] args) 
	{
		CuentaBancaria cuentaKirby = new CuentaBancaria(10000, "KKYY74567");
		CuentaBancaria cuentaYoshi = null;
		
		try
		{
			cuentaKirby.depositar(5000);
			cuentaKirby.depositar(-2345);
		}
		catch(CantidadIncorrectaException e)
		{
			System.out.println(e.getMessage());
		}
		
		
		
		try
		{
			cuentaKirby.retirar(10000);
			cuentaKirby.retirar(17000);
		}
		catch(CantidadIncorrectaException e)
		{
			System.out.println(e.getMessage());
		}
		catch(SaldoInsuficienteException e)
		{
			System.out.println(e.getMessage());
		}
		catch(CuentaBancariaException e)
		{
			System.out.println(e.getMessage());
		}
		
		
		
		try
		{
			cuentaKirby.transferencia(cuentaYoshi, 5000);
		}
		catch(CantidadIncorrectaException e)
		{
			System.out.println(e.getMessage());
		}
		catch(SaldoInsuficienteException e)
		{
			System.out.println(e.getMessage());
		}
		catch(CuentaInexistenteException e)
		{
			System.out.println(e.getMessage());
		}
		catch(CuentaBancariaException e)
		{
			System.out.println(e.getMessage());
		}
	}
}