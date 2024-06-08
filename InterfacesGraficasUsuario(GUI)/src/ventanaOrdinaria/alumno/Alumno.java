package ventanaOrdinaria.alumno;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Alumno implements Serializable {
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String asignatura;
	private int nota;

	public Alumno(String nombre, String apellido1, String apellido2, String asignatura, int nota) {
		this.nombre = nombre;
		this.setApellido1(apellido1);
		this.apellido2 = apellido2;
		this.asignatura = asignatura;
		this.nota = nota;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public String toString() {
		return "Nombre: " + nombre + " | Apellido1: " + apellido1 + " | Apellido2: " + apellido2 + " | Asignatura: " + asignatura
				+ " | Nota:" + nota;

	}

}
