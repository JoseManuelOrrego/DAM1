package encuesta;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ventana extends JFrame{
	
	private String nombreAlumno;
	private String emailAlumno;
	
	public Ventana()
	{
		super("Encuesta!");
		setSize(500,500);
		setVisible(true);
		setLocationRelativeTo(null);
		
		Container cp = getContentPane();
		cp.setLayout(new BoxLayout(cp, BoxLayout.PAGE_AXIS));
		
		JPanel panelEncuesta = new JPanel();
		panelEncuesta.setLayout(new BoxLayout(panelEncuesta, BoxLayout.Y_AXIS));
		cp.add(panelEncuesta);
		
		JButton nuevo = new JButton("Nueva encuesta");
		cp.add(nuevo);
		nuevo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				nombreAlumno = JOptionPane.showInputDialog(Ventana.this,"Introduce tu nombre");
				emailAlumno = JOptionPane.showInputDialog(Ventana.this, "Introduce tu e-mail");
				
				panelEncuesta.add(new JLabel("Pregunta 1"));
				panelEncuesta.revalidate();
				panelEncuesta.repaint();
			}
			
		});
		
		
		validate();
		repaint();
	}
}
