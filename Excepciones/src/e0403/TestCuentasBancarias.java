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
			cuentaKirby.retirar(6000);
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
			cuentaKirby.transferencia(cuentaYoshi, 3000);
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
		
		cuentaYoshi = new CuentaBancaria(0, "KJEB72052");
		try
		{
			cuentaKirby.transferencia(cuentaYoshi, 3000);
		} 
		catch (CuentaBancariaException e) 
		{
			System.out.println(e.getMessage());
		}
	}
}