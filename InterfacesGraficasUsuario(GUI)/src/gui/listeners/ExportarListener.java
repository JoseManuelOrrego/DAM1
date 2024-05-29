package gui.listeners;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

import gui.Usuario;
import gui.VentanaFormulario;

public class ExportarListener extends UsuarioListener {

	public ExportarListener(VentanaFormulario ventana) {
		super(ventana);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Usuario usuario = crearUsuario();
		if (usuario != null) {
			String infoUsuario = usuario.toString();
			JOptionPane.showMessageDialog(getVentana(), infoUsuario, "Información Exportada a 'usuario.txt'",
					JOptionPane.INFORMATION_MESSAGE);
			PrintWriter out = null;
			try {
				out = new PrintWriter("usuario.txt");
				out.print(infoUsuario);
			} catch (IOException ex) {
				System.out.println("IOException al escribir:" + ex.getMessage());
			} finally {
				if (out != null) {
					out.close();
				}
			}
		}
	}

}
