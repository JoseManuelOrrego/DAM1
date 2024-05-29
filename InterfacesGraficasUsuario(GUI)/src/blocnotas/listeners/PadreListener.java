package blocnotas.listeners;

import java.awt.event.ActionListener;

import javax.swing.JTextArea;

public abstract class PadreListener implements ActionListener {
	private final String nombreFichero;
	private JTextArea area;
	protected PadreListener(JTextArea area) {
		this.area = area;
		nombreFichero="fichero.txt";
	}
	protected JTextArea getArea() {
		return area;
	}
	protected String getNombreFichero() {
		return nombreFichero;
	}
}
