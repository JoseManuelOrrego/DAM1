package ventanaOrdinaria.interfaz;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import ventanaOrdinaria.alumno.*;

import javax.swing.*;

@SuppressWarnings("serial")
public class Ventana extends JFrame {
	private final String nombreFichero="alumnos.dat";
	private ListaAlumnos lista;

	public Ventana() {
		super("Examen Ordinaria");		
		setSize(600, 500);
		setLocationRelativeTo(null);
		setVisible(true);
		Container cp = getContentPane();
		cp.setLayout(new BoxLayout(cp, BoxLayout.Y_AXIS));
		JPanel panelDeAlumnos = new JPanel();
		panelDeAlumnos.setLayout(new BoxLayout(panelDeAlumnos, BoxLayout.Y_AXIS));
		JScrollPane scroll = new JScrollPane(panelDeAlumnos);
		cp.add(scroll);		
		
		lista = cargarAlumnos();
		if(lista == null || lista.vacia()) {
			lista = new ListaAlumnos();
		}else {
			Alumno[] alumnos=lista.getAlumnos();
			for(int i = 0;i<alumnos.length;i++) {
				panelDeAlumnos.add(new PanelAlumno(alumnos[i], lista));
			}			
		}
		
		JButton botonNuevo = new JButton("Nuevo");
		cp.add(botonNuevo);
		botonNuevo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String nombre;
				do {
					nombre = JOptionPane.showInputDialog(Ventana.this, "Introduce el nombre");
				} while (lista.existe(nombre));
				String apellido1 = JOptionPane.showInputDialog(Ventana.this, "Introduce el apellido1");
				String apellido2 = JOptionPane.showInputDialog(Ventana.this, "Introduce el apellido2");
				String asignatura = JOptionPane.showInputDialog(Ventana.this, "Introduce la asignatura");
				String nota = JOptionPane.showInputDialog(Ventana.this, "Introduce la nota");
				int notaInt = Integer.parseInt(nota);
				Alumno alumno = new Alumno(nombre, apellido1, apellido2, asignatura, notaInt);
				lista.insertar(alumno);
				panelDeAlumnos.add(new PanelAlumno(alumno, lista));
				panelDeAlumnos.revalidate();
				panelDeAlumnos.repaint();
			}
		});
		JButton botonGuardar = new JButton("Guardar");
		cp.add(botonGuardar);
		
		botonGuardar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {				
				ObjectOutputStream salida = null;
				boolean guardadoCorrecto = false;
				try {
					salida = new ObjectOutputStream(new FileOutputStream(nombreFichero));
					salida.writeObject(lista);
					guardadoCorrecto=true;
				} catch (IOException ex) {
					ex.getStackTrace();
				} finally {
					if (salida != null) {
						try {
							salida.close();
						} catch (IOException ex) {
							salida = null;
						}
					}
				}
				if(guardadoCorrecto) {
					JOptionPane.showMessageDialog(Ventana.this, "Guardado con éxito");
				}else {
					JOptionPane.showMessageDialog(Ventana.this, "No se ha podido guardar");
				}
			}
		});
		
		validate();
		repaint();

	}

	private ListaAlumnos cargarAlumnos() {		
		ObjectInputStream entrada = null;
		ListaAlumnos lista = null;
		try {
			entrada = new ObjectInputStream(new FileInputStream(nombreFichero));
			lista = (ListaAlumnos) entrada.readObject();
		} catch (IOException | ClassNotFoundException e) {
			e.getMessage();
		} finally {
			if (entrada != null) {
				try {
					entrada.close();
				} catch (IOException e) {
					entrada = null;
				}
			}
		}	
		return lista;
		
	}

}
