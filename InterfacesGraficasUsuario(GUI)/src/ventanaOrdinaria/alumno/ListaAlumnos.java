package ventanaOrdinaria.alumno;

import java.io.Serializable;
import java.util.ArrayList;

@SuppressWarnings("serial")
public class ListaAlumnos implements Serializable {
	
	private ArrayList<Alumno> lista;
	public ListaAlumnos() {
		lista = new ArrayList<Alumno>();
	}
	public void insertar (Alumno alumno) {
		lista.add(alumno);
	}
	public void eliminar (Alumno alumno) {
		lista.remove(alumno);
	}
	public Alumno getAlumno(String nombre) {		
		for(int i = 0 ; i < lista.size();i++) {
			Alumno alumnoLista = lista.get(i);
			if(alumnoLista.getNombre().equalsIgnoreCase(nombre)) {
				return alumnoLista;
			}
		}
		return null;
	}
	public boolean existe(String nombre) {
		if (getAlumno(nombre)==null)
			return false;
		else
			return true;
	}
	public boolean vacia() {
		return lista.size()==0;
	}
	public Alumno[] getAlumnos() {
		int tamano = lista.size();
		Alumno[] alumnos = new Alumno[tamano];
		for(int i = 0 ; i < lista.size();i++) {
			alumnos[i] = lista.get(i);			
		}
		return alumnos;
	}
	

}
