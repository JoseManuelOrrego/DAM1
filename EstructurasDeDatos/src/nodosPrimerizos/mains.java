package nodosPrimerizos;

public class mains 
{
	public static void main(String[] args) 
	{
		Nodo n1 = new Nodo("Lolo", null);
		Nodo n2 = new Nodo("Lola", n1);
		Nodo n3 = new Nodo("Lele", n2);
		
		Nodo n4 = new Nodo(new Alumno("Yoshi", 9), null);
		Nodo n5 = new Nodo(new Alumno("Kirby", 6), n4);
		Nodo n6 = new Nodo(new Alumno("Toad", 8), n5);

		mostrar(n3);
		System.out.println();
		mostrar(n6);
	}
	
	public static void mostrar(Nodo nodo)
	{
		while(nodo != null)
		{
			if(nodo.info instanceof String)
			{
				String cadena = (String) nodo.info;
				System.out.print(cadena + " ");
			}
			else if(nodo.info instanceof Alumno)
			{
				Alumno alumno = (Alumno) nodo.info;
				alumno.mostrarDatos();
			}
			nodo = nodo.enlace;
		}
	}
}
