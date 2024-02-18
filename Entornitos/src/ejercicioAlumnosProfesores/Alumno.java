package ejercicioAlumnosProfesores;

public class Alumno {

	private String nombre;
	private int edad;
	private int matriculas;
	private int nota;
	private Fecha fecha;


	public Alumno(String nombre, int edad, int matriculas, Fecha fecha) 
	{
			this.nombre = nombre;
			this.edad = edad;
			this.matriculas = matriculas;
			this.nota=0;
			this.fecha=fecha;
	}
	
	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void setNota(int nota) {
		this.nota = nota;
	}
	
	public int getNota(){
		return this.nota;
	}
	
	public void setMatriculas(int matriculas) {
		this.matriculas = matriculas;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	public int getMatriculas() {
		return this.matriculas;
		
	}
	
	public Fecha getFecha() {
		return this.fecha;
	}
	
	public void getDatos() {
		System.out.println("Nombre: "+nombre);
		System.out.println("Edad: "+edad);
		System.out.println("Asignaturas: "+matriculas);
		System.out.println("Nota: "+nota);
		System.out.println("Fecha de matriculación: "+fecha.toString());
	}


}


	
