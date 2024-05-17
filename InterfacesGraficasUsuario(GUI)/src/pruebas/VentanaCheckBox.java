package pruebas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

@SuppressWarnings("serial")
public class VentanaCheckBox extends JFrame {

	
	public VentanaCheckBox() {
		super("Ejemplo Simple de JCheckBox");

		JCheckBox checkBox = new JCheckBox("Aceptar términos y condiciones");


		checkBox.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				System.out.println("Se ha cambiado a "+e.getStateChange());				
			}
		});

		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.add(checkBox, BorderLayout.CENTER);

		getContentPane().add(panel, BorderLayout.SOUTH);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		pack();

		setVisible(true);
	}

	public static void main(String[] args) {
		new VentanaCheckBox();
	}
}