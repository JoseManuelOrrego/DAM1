package calculadora;

public class Operacion {
	private double num;
	private String operacion;

	public Operacion(String numeros, String operacion) {
		num = Double.parseDouble(numeros);
		this.operacion = operacion;
	}

	public double getNum() {
		return num;
	}

	public String getOperacion() {
		return operacion;
	}

}
