package ventanaOrdinaria.interfaz;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import ventanaOrdinaria.alumno.Alumno;
import ventanaOrdinaria.alumno.ListaAlumnos;

@SuppressWarnings("serial")
public class PanelAlumno extends JPanel {

	public PanelAlumno(Alumno alumno,ListaAlumnos lista) {
		super();
		setLayout(new FlowLayout());
		JTextField tNombre = new JTextField(alumno.getNombre(), 5);
		tNombre.setEnabled(false);
		JTextField tApellido1 = new JTextField(alumno.getApellido1(), 5);
		JTextField tApellido2 = new JTextField(alumno.getApellido2(), 5);
		JTextField tAsignatura = new JTextField(alumno.getAsignatura(), 5);
		JTextField tNota = new JTextField("" + alumno.getNota(), 2);

		JButton botonModificar = new JButton("Modificar");
		JButton botonExportar = new JButton("Exportar");
		JButton botonEliminar = new JButton("Eliminar");

		add(tNombre);
		add(tApellido1);
		add(tApellido2);
		add(tAsignatura);
		add(tNota);
		add(botonModificar);
		add(botonExportar);
		add(botonEliminar);

		botonModificar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {				
				alumno.setApellido1(tApellido1.getText());
				alumno.setApellido2(tApellido2.getText());
				alumno.setAsignatura(tAsignatura.getText());
				String nota = tNota.getText();				
				alumno.setNota(Integer.parseInt(nota));				
			}
		});
		botonExportar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String nombreFichero = alumno.getNombre()+"_"+alumno.getApellido1()+".txt";
				PrintWriter out=null;
				try {
					out = new PrintWriter(nombreFichero);
					out.print(alumno);
				} catch (FileNotFoundException e1) {					
					e1.printStackTrace();
				}finally {
					if(out !=null) {
						out.close();
					}
					
				}

			}
		});
		botonEliminar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				lista.eliminar(alumno);
				PanelAlumno.this.removeAll();
				PanelAlumno.this.setVisible(false);
			}
		});

	}

}
