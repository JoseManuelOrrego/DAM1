package listas;

public interface Lista <T>
{
	public void añadir(int posicion, T elemento);
	
	public void añadir(T elemento);
	
	public void vaciar();
	
	public T get(int posicion);
	
	public boolean estaVacia();
	
	public int indice(T elemento);
	
	public T[] aArray();
	
	public T eliminar(int posicion);
	
	public boolean eliminar(T elemento);
	
	public T set(int posicion, T elemento);
	
	public int tamaño();
	
	public Lista<T> sublista(int desde, int hasta);
	
	public void concatenar(Lista<T> listaNueva);
}