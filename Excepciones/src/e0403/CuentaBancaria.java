package e0403;

import java.lang.invoke.StringConcatFactory;

public class CuentaBancaria 
{
	private double saldo;
	private String numCuenta;
	
	public CuentaBancaria(double saldo, String numCuenta)
	{
		this.saldo = saldo;
		this.numCuenta = numCuenta;
	}
	
	public void depositar(double deposito) throws CantidadIncorrectaException
	{
		if(deposito >= 0)
		{
			this.saldo += deposito;
			System.out.println("Se ha depositado correctamente en la cuenta \nSaldo -> " + saldo);
		}
		else
			throw new CantidadIncorrectaException("Cantidad introducida negativa");
	}
	
	public void retirar(double retiro) throws CuentaBancariaException
	{
		if(retiro <= 0)
		{
			throw new CantidadIncorrectaException("Cantidad introducida negativa");
		}
		else
		{
			if((saldo-retiro) < 0)
			{
				throw new SaldoInsuficienteException("Cantidad erronea. Saldo negativo si se realiza");
			}
			else
			{
				this.saldo -= retiro;
				System.out.println("Se ha retirado correctamente el saldo indicado \nSaldo -> " + saldo);
			}
		}
	}
	
	public void transferencia(CuentaBancaria destino, double cantidad) throws CuentaBancariaException
	{
		if(cantidad < 0)
		{
			throw new CantidadIncorrectaException("Cantidad introducida negativa");
		}
		else
		{
			if(cantidad > this.saldo)
			{
				throw new SaldoInsuficienteException("Cantidad erronea. Saldo negativo si se realiza");
			}
			else
			{
				if(destino == null)
				{
					throw new CuentaInexistenteException("Cuenta destino inexistente");
				}
				else
				{
					this.saldo -= cantidad;
					destino.saldo += cantidad;
					System.out.println("Se ha realizado correctamente la transferencia \nSaldo -> " + saldo);
				}
			}
		}
	}
}
