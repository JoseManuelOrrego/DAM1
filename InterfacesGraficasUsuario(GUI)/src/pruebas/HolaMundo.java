package pruebas;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HolaMundo {

	public static void main(String[] args) 
	{
		miVentana mi = new miVentana();
	}
}

class miVentana extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public miVentana()
	{
		super("Ventana");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		Container contenedor =  getContentPane();
		contenedor.setLayout(new FlowLayout());
		JLabel etiqueta = new JLabel("Hola mundo!");
		contenedor.add(etiqueta);
	}
}