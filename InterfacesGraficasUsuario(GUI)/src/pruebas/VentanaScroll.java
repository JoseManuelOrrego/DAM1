package pruebas;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class VentanaScroll extends JFrame {

	public VentanaScroll() {
		super("Ejemplo de JScrollPane con Botones");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(200, 200);
		Container cp = getContentPane();
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

		for (int i = 1; i <= 50; i++) {
			panel.add(new JButton("Botón " + i));
		}

		JScrollPane scrollPane = new JScrollPane(panel);
		cp.add(scrollPane);

		setVisible(true);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		new VentanaScroll();
	}
}