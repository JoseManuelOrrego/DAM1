package pruebas;

import java.lang.Exception;
import java.util.Random;

public class CreacionExcepciones 
{	
	public static void main(String[] args) throws InterruptedException 
	{
		while(true)
		{
			Thread.sleep(2000);
			try
			{
				Random random = new Random();
				lanzarExcepcion(random.nextInt(6)+1);
			}
			catch(ExceptionOne e)
			{
				System.out.println("Excepcion capturada: ");
				System.out.println("Mensaje: " + e.getMessage());
			}
			catch(ExceptionTwo e)
			{
				System.out.println("Excepcion capturada: ");
				System.out.println("Mensaje: " + e.getMessage());
			}
			catch(ExceptionThree e)
			{
				System.out.println("Excepcion capturada: ");
				System.out.println("Mensaje: " + e.getMessage());
			}
			catch(ExceptionFour e)
			{
				System.out.println("Excepcion capturada: ");
				System.out.println("Mensaje: " + e.getMessage());
			}
			catch(ExceptionFive e)
			{
				System.out.println("Excepcion capturada: ");
				System.out.println("Mensaje: " + e.getMessage());
			}
			catch(ExceptionSix e)
			{
				System.out.println("Excepcion capturada: ");
				System.out.println("Mensaje: " + e.getMessage());
			}
			catch(BaseException e)
			{
				System.out.println("Excepcion capturada: ");
				System.out.println("Mensaje: " + e.getMessage());
			}
		}
	}
	
	public static void lanzarExcepcion(int numero) throws BaseException
	{
		switch(numero)
		{
		case 1:
			throw new ExceptionOne("Has introducido el 1");
		case 2:
			throw new ExceptionTwo("Has introducido el 2");
		case 3:
			throw new ExceptionThree("Has introducido el 3");
		case 4:
			throw new ExceptionFour("Has introducido el 4");
		case 5:
			throw new ExceptionFive("Has introducido el 5");
		case 6:
			throw new ExceptionSix("Has introducido el 6");
		default:
			throw new BaseException("No es un numero entre 1 y 6");
		}
	}

}

@SuppressWarnings("serial")
class BaseException extends Exception
{
	public BaseException(String mensaje)
	{
		super(mensaje);
	}
}

@SuppressWarnings("serial")
class ExceptionOne extends BaseException
{
	public ExceptionOne(String mensaje) 
	{
		super(mensaje);
	}
}

@SuppressWarnings("serial")
class ExceptionTwo extends BaseException
{
	public ExceptionTwo(String mensaje) 
	{
		super(mensaje);
	}
}

@SuppressWarnings("serial")
class ExceptionThree extends BaseException
{
	public ExceptionThree(String mensaje) 
	{
		super(mensaje);
	}
}

@SuppressWarnings("serial")
class ExceptionFour extends BaseException
{
	public ExceptionFour(String mensaje) 
	{
		super(mensaje);
	}
}

@SuppressWarnings("serial")
class ExceptionFive extends BaseException
{
	public ExceptionFive(String mensaje) 
	{
		super(mensaje);
	}
}

@SuppressWarnings("serial")
class ExceptionSix extends BaseException
{
	public ExceptionSix(String mensaje) 
	{
		super(mensaje);
	}
}