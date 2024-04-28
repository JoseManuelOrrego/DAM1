package ud7;

public class FraccionesMain 
{

	public static void main(String[] args) 
	{
		Fracciones f1 = new Fracciones(10,5);
		Fracciones f2 = new Fracciones(4,3);
		
		Fracciones f3 = f1.Divi(f2);
		f3.Mostrar();
	}

}
