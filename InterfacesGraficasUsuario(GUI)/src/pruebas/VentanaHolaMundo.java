package pruebas;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

@SuppressWarnings("serial")
public class VentanaHolaMundo extends JFrame {

	public VentanaHolaMundo() {
		super("Ejemplo Hola Mundo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		Container cp = getContentPane();
		setSize(300, 100);
		cp.setLayout(new FlowLayout());
		JLabel etiqueta = new JLabel();
		JButton boton = new JButton("Pulsar");
		
		cp.add(boton);
		cp.add(etiqueta);
		setContentPane(cp);
		
		setLocationRelativeTo(null);
		
		boton.addActionListener(new ClickBoton(etiqueta));

	}

	public static void main(String[] args) {
		new VentanaHolaMundo();
	}
}