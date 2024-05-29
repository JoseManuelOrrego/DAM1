package calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ListenerOperadores implements ActionListener {
	private JTextField campoPrincipal;
	private JTextField campoOperacion;
	private Operacion operacion;

	public ListenerOperadores(JTextField campoPrincipal, JTextField campoOperacion) {
		this.campoPrincipal = campoPrincipal;
		this.campoOperacion = campoOperacion;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String operador = e.getActionCommand();
		String numeros = campoPrincipal.getText();
		String numerosPrevios = campoOperacion.getText();
		if (numeros.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Introduzca valores", "Error", JOptionPane.ERROR_MESSAGE);
			return;
		}
		if (operador == "=") {
			if (numerosPrevios.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Introduzca valores", "Error", JOptionPane.ERROR_MESSAGE);
				return;
			}
			double num1 = operacion.getNum();
			double num2 = Double.parseDouble(numeros);
			double resultado = 0;
			switch (operacion.getOperacion()) {
			case "+":
				resultado = num1 + num2;
				break;
			case "-":
				resultado = num1 - num2;
				break;
			case "*":
				resultado = num1 * num2;
				break;
			case "/":
				if (num2 != 0) {
					resultado = num1 / num2;
				} else {
					JOptionPane.showMessageDialog(null, "No se puede dividir por cero", "Error",
							JOptionPane.ERROR_MESSAGE);
					campoPrincipal.setText("");
					return;
				}
				break;
			}
			campoOperacion.setText(numerosPrevios + numeros + "=" + resultado);
		} else {
			campoOperacion.setText(numeros + operador);
			operacion = new Operacion(numeros, operador);
		}
		campoPrincipal.setText("");

	}

}
