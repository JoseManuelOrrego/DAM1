package arrayDinamico;

public class Main
{
	public static void main(String[] args)
	{
		ArrayDinamicoEnteros array1 = new ArrayDinamicoEnteros();
		ArrayDinamicoEnteros array2 = new ArrayDinamicoEnteros(array1);
		
		array1.mostrar();
		array1.insertar(100);
		array1.mostrar();
		
		System.out.println("Array Segundo -> ");
		array2.mostrar();
		array2.ordenar();
		array2.mostrar();
		
		System.out.println();
		System.out.println("Eleminiar la posicion segunda de un array -> ");
		array1.eliminar();
		array1.mostrar();
	}
}