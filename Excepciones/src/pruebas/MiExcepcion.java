package pruebas;

@SuppressWarnings("serial")
public class MiExcepcion extends Exception {
	
	public MiExcepcion(String mensaje) {
		super(mensaje);
	}
	public static void main(String []args) throws MiExcepcion {
		throw new MiExcepcion("Esta es mi excepcion");
		}
}