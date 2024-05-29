package gui.listeners;

import java.awt.event.ActionEvent;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JOptionPane;

import gui.Usuario;
import gui.VentanaFormulario;

public class RegistrarListener extends UsuarioListener {

	public RegistrarListener(VentanaFormulario ventana) {
		super(ventana);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Usuario usuario = crearUsuario();
		if (usuario != null) {
			ObjectOutputStream out = null;
			try {
				out = new ObjectOutputStream(new FileOutputStream("registro.bin"));
				out.writeObject(usuario);
				JOptionPane.showMessageDialog(getVentana(), usuario.toString(), "Información registrada",
						JOptionPane.INFORMATION_MESSAGE);
			} catch (IOException ex) {
				ex.printStackTrace();
			} finally {
				if (out != null) {
					try {
						out.close();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
			}
		}
	}

}
