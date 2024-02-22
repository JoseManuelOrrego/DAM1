package arrayEnteros;

public class Main 
{
	public static void main(String[] args) 
	{
		ArrayEnteros array1 = new ArrayEnteros(5);
		ArrayEnteros array2 = new ArrayEnteros();
		
		array1.insertar(500);
		array1.insertar(300);
		array1.insertar(200);
		array1.insertar(400);
		array1.insertar(100, 4);
		
		array1.mostrar();
		array2.mostrar();
		
		array1.ordenar();
		array1.mostrar();
		System.out.println(array1.buscar(200));
		array2.numVeces(2);
		
		ArrayEnteros array3 = new ArrayEnteros(array1);
		array3.mostrar();
		
		ArrayEnteros arrayFusionado = array1.fusionar(array2);
		arrayFusionado.mostrar();
		
		array1.eliminar();
		array1.mostrar();
		
		array1.paresImpares();
		array2.media();
	}
}