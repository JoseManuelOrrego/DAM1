package pruebas;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class VentanaTextArea extends JFrame {

	public VentanaTextArea() {
		super("Ejemplo Simple de JTextArea");

		JTextArea textArea = new JTextArea(30, 50);

		JScrollPane scrollPane = new JScrollPane(textArea);

		getContentPane().add(scrollPane, BorderLayout.CENTER);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		pack();

		setVisible(true);
	}

	public static void main(String[] args) {
        new VentanaTextArea();
    }
}