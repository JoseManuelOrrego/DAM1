package ejercicioAlumnosProfesores;

public class Fecha {
	private int dia;
	private int mes;
	private int anno;
	
	public Fecha(int dia, int mes, int anno) {
		this.dia=dia;
		this.mes=mes;
		if(anno <= 2008) {
			this.anno=2008;
		}else {
			this.anno=anno;	
		}		
	}
	public int getDia() {
		return dia;
	}
	public int getMes() {
		return mes;
	}
	public int getAnno() {
		return anno;
	}
	

}
