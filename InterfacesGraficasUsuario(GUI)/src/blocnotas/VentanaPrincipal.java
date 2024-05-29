package blocnotas;

import javax.swing.*;

import blocnotas.listeners.AbrirListener;
import blocnotas.listeners.GuardarListener;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class VentanaPrincipal extends JFrame {
	
	private final int tamX=600;
	private final int tamY=400;
	
	public VentanaPrincipal() {
		super("Bloc de notas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		setSize(tamX,tamY);		
		Container cp = getContentPane();
		JPanel panel = new JPanel();
		
		panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
		
		
		JTextArea area = new JTextArea(tamX,tamY);
		
		JPanel panelBotones = new JPanel();
		JButton botonNuevo = new JButton("Nuevo");
		JButton botonAbrir = new JButton("Abrir");
		JButton botonGuardar= new JButton("Guardar");
		
		botonNuevo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				area.setText("");				
			}});
		
		botonAbrir.addActionListener(new AbrirListener(area));
		botonGuardar.addActionListener(new GuardarListener(area));
		
		panelBotones.setLayout(new FlowLayout());
		panelBotones.add(botonNuevo);
		panelBotones.add(botonAbrir);
		panelBotones.add(botonGuardar);		
		
		JScrollPane scrollPane = new JScrollPane(area);
		panel.add(scrollPane);
		panel.add(panelBotones);
		cp.add(panel);
		
		setVisible(true);
		setLocationRelativeTo(null);
	}
	
	
}
