package gui.listeners;

import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import gui.Usuario;
import gui.VentanaFormulario;

public abstract class UsuarioListener implements ActionListener {

	private VentanaFormulario ventana;

	public UsuarioListener(VentanaFormulario ventana) {
		this.ventana = ventana;
	}

	public VentanaFormulario getVentana() {
		return ventana;
	}

	protected Usuario crearUsuario() {		
		String nombre = ventana.getCampoNombre().getText();
		String apellido = ventana.getCampoApellido().getText();
		String correo = ventana.getCampoEmail().getText();
		String pw = String.valueOf(ventana.getCampoPw().getPassword());
		int edad = ventana.getSliderEdad().getValue();
		String comentario = ventana.getAreaComentarios().getText();
		String genero = "";
		if (ventana.getBotonM().isSelected()) {
			genero = "Masculino";
		} else if (ventana.getBotonF().isSelected()) {
			genero = "Femenino";
		} else if (ventana.getBotonO().isSelected()) {
			genero = "Otro";
		}
		String intereses = "";
		if (ventana.getCheckDeportes().isSelected())
			intereses += "Deportes ";
		if (ventana.getCheckMusica().isSelected())
			intereses += "Música ";
		if (ventana.getCheckViajes().isSelected())
			intereses += "Viajes ";
		if (nombre.isEmpty() || apellido.isEmpty() || correo.isEmpty() || pw.isEmpty() || genero.isEmpty()) {			
			JOptionPane.showMessageDialog(getVentana(), "Rellena todos los campos.", "Campos sin rellenar.",
					JOptionPane.WARNING_MESSAGE);
			return null;

		} else {
			return new Usuario(nombre, apellido, correo, pw, genero, intereses, edad, comentario);
		}
	}

}
