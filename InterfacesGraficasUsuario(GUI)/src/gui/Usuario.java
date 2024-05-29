package gui;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Usuario implements Serializable {
	private String nombre;
	private String apellido;
	private String correo;
	private String password;
	private String genero;
	private String intereses;
	private int edad;
	private String comentario;

	public Usuario(String nombre, String apellido, String correo, String password, String genero, String intereses,
			int edad, String comentario) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.password = password;
		this.genero = genero;
		this.intereses = intereses;
		this.edad = edad;
		this.comentario = comentario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getIntereses() {
		return intereses;
	}

	public void setIntereses(String intereses) {
		this.intereses = intereses;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String toString() {
		String resultado = "Nombre: " + nombre + "\n" +
                "Apellido: " + apellido + "\n" +
                "Correo Electrónico: " + correo + "\n" +
                "Contraseña: " + password + "\n"+
                "Género: " + genero + "\n"+
                "Intereses: " + intereses + "\n"+
                "Edad: " + edad + "\n"+
                "Comentarios: " + comentario + "\n"; 
		return resultado;
	}

}
