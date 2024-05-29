package gui.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JOptionPane;

import gui.Usuario;
import gui.VentanaFormulario;

public class CargarListener implements ActionListener {
	private VentanaFormulario ventana;

	public CargarListener(VentanaFormulario ventana) {
		this.ventana = ventana;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		ObjectInputStream in = null;
		Usuario usuario = null;
		try {
			in = new ObjectInputStream(new FileInputStream("registro.bin"));
			usuario = (Usuario) in.readObject();
		} catch (IOException | ClassNotFoundException ex) {
			ex.printStackTrace();
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}
		ventana.getCampoNombre().setText(usuario.getNombre());
		ventana.getCampoApellido().setText(usuario.getApellido());
		ventana.getCampoEmail().setText(usuario.getCorreo());
		ventana.getCampoPw().setText(usuario.getPassword());
		ventana.getAreaComentarios().setText(usuario.getComentario());
		ventana.getSliderEdad().setValue(usuario.getEdad());

		switch (usuario.getGenero()) {
		case "Masculino":
			ventana.getBotonM().setSelected(true);
			break;
		case "Femenino":
			ventana.getBotonF().setSelected(true);
			break;
		case "Otro":
			ventana.getBotonO().setSelected(true);
			break;
		default:
			break;
		}
		String intereses = usuario.getIntereses();
		if (intereses.contains("Deportes")) {
			ventana.getCheckDeportes().setSelected(true);
		}
		if (intereses.contains("Música")) {
			ventana.getCheckMusica().setSelected(true);
		}
		if (intereses.contains("Viajes")) {
			ventana.getCheckViajes().setSelected(true);
			}

		JOptionPane.showMessageDialog(ventana, usuario.toString(), "Información Cargada",
				JOptionPane.INFORMATION_MESSAGE);
	}

}
