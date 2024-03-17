package pilaNodos;

public class Mains 
{
	public static void main(String[] args) 
	{
		String s1="-Hola";
		String s2=" don";
		String s3=" Pepito.";
		String s4="\n";
		String s5="-Hola";
		String s6=" don";
		String s7=" José.";
		
		PilaNodos pila = new PilaNodos();
		pila.apilar(s7);
		pila.apilar(s6);
		pila.apilar(s5);
		pila.apilar(s4);
		pila.apilar(s3);
		pila.apilar(s2);
		pila.apilar(s1);
		
		vaciar(pila);
	}
	public static void vaciar(PilaNodos pila)
	{
		while(!pila.pilaVacia())
		{
			System.out.print((String)pila.desapilar().info);
		}
	}
}