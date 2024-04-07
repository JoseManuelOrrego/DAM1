package listas;

public interface Lista <T>
{
	public void insertar(int posicion, T elemento);
	
	public void insertar(T elemento);
	
	public void vaciar();
	
	public T get(int posicion);
	
	public boolean estaVacia();
	
	public int indice(T elemento);
	
	public T[] aArray();
	
	public T eliminar(int posicion);
	
	public boolean eliminar(T elemento);
	
	public T set(int posicion, T elemento);
	
	public int tamanno();
	
	public Lista<T> sublista(int desde, int hasta);
	
	public void concatenar(Lista<T> listaNueva);
}