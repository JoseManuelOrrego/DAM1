package calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class ListenerBotones implements ActionListener{
	private JTextField campoPrincipal;
	public ListenerBotones(JTextField campoPrincipal) {
		this.campoPrincipal=campoPrincipal;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String texto = campoPrincipal.getText();
		campoPrincipal.setText(texto+e.getActionCommand());		
		
	}

}
