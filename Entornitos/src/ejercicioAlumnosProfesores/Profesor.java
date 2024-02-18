package ejercicioAlumnosProfesores;

public class Profesor {
	private String nombre;
	private String departamento;
	private Alumno alumno;

	public Profesor (String nombre, String departamento, Alumno alumno)
	{
	this.nombre = nombre;
	this.departamento = departamento;
	this.alumno = alumno;
	
	}
	
	public void asignarNota (int nota) {
		alumno.setNota(nota);
	}
		
	public void datosAlumno() {
	System.out.println("Nombre del alumno: "+alumno.getNombre());
	System.out.println("Nota del alumno: "+alumno.getNota());
	}

}

