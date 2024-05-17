package pruebas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ClickBoton implements ActionListener {
	private JLabel etiqueta;
	
	
	public ClickBoton(JLabel etiqueta) {
		super();
		this.etiqueta=etiqueta;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		etiqueta.setText("Hola Mundo");
		
		
	}

}