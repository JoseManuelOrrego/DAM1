package pilaGenerica;

public class Nodo <T>
{
	T info;
	Nodo<T> enlace;
	
	public Nodo(T info, Nodo<T> enlace)
	{
		this.info = info;
		this.enlace = enlace;
	}
}
