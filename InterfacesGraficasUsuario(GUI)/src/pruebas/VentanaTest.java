package pruebas;


import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.*;


@SuppressWarnings("serial")

public class VentanaTest extends JFrame{
	
	public VentanaTest() {
		 super("Titulo de ventana");
		 setSize(400, 300);
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 setVisible(true);
		 Container cp = getContentPane();
		 cp.setLayout(new FlowLayout());
		 JLabel etiqueta = new JLabel("Nombre: ");
		 JTextField texto = new JTextField(20);
		 JButton boton = new JButton("Saludar");
		 cp.add(etiqueta);
		 cp.add(texto);
		 cp.add(boton);
		 setContentPane(cp);
		 setContentPane(null);
		 }
	
	public static void main(String[] args) {
		new VentanaTest();
	}
}