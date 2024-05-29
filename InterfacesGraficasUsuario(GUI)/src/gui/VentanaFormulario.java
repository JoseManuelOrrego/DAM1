package gui;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import gui.listeners.CargarListener;
import gui.listeners.ExportarListener;
import gui.listeners.RegistrarListener;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class VentanaFormulario extends JFrame {

	private JTextField campoNombre;
	private JTextField campoApellido;
	private JTextField campoEmail;
	private JPasswordField campoPw;
	private JCheckBox checkDeportes;
	private JCheckBox checkMusica;
	private JCheckBox checkViajes;
	private JSlider sliderEdad;
	private JTextArea areaComentarios;
	private JRadioButton botonM;
	private JRadioButton botonF;
	private JRadioButton botonO;

	public VentanaFormulario() {
		super("Registro de Usuarios");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 500);
		setLocationRelativeTo(null);

		JMenuBar barraMenu = new JMenuBar();

		JMenu menuArchivo = new JMenu("Archivo");
		JMenu menuAyuda = new JMenu("Ayuda");
		barraMenu.add(menuArchivo);
		barraMenu.add(menuAyuda);

		JMenuItem nuevoItem = new JMenuItem("Nuevo");
		JMenuItem cargarItem = new JMenuItem("Cargar");
		JMenuItem exportarItem = new JMenuItem("Exportar");
		JMenuItem salirItem = new JMenuItem("Salir");
		menuArchivo.add(nuevoItem);
		menuArchivo.add(cargarItem);
		menuArchivo.add(exportarItem);
		menuArchivo.add(salirItem);

		JMenuItem acercaItem = new JMenuItem("Acerca de");
		menuAyuda.add(acercaItem);

		setJMenuBar(barraMenu);

		JPanel panelPrincipal = new JPanel(new BorderLayout());
		panelPrincipal.setBorder(new EmptyBorder(10, 10, 10, 10));

		JPanel panelContenido = new JPanel(new GridBagLayout());
		panelContenido.setBorder(new EmptyBorder(10, 10, 10, 10));
		panelPrincipal.add(panelContenido, BorderLayout.CENTER);

		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(5, 5, 5, 5);
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.anchor = GridBagConstraints.WEST;

		JLabel etiquetaIngrese = new JLabel("Ingrese su información:");
		etiquetaIngrese.setFont(new Font("Arial", Font.BOLD, 16));
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 2;
		panelContenido.add(etiquetaIngrese, gbc);

		gbc.gridwidth = 1;
		gbc.gridy++;
		panelContenido.add(new JLabel("Nombre:"), gbc);

		campoNombre = new JTextField(20);
		gbc.gridx = 1;
		panelContenido.add(campoNombre, gbc);

		gbc.gridx = 0;
		gbc.gridy++;
		panelContenido.add(new JLabel("Apellido:"), gbc);

		campoApellido = new JTextField(20);
		gbc.gridx = 1;
		panelContenido.add(campoApellido, gbc);

		gbc.gridx = 0;
		gbc.gridy++;
		panelContenido.add(new JLabel("Correo Electrónico:"), gbc);

		campoEmail = new JTextField(20);
		gbc.gridx = 1;
		panelContenido.add(campoEmail, gbc);

		gbc.gridx = 0;
		gbc.gridy++;
		panelContenido.add(new JLabel("Contraseña:"), gbc);

		campoPw = new JPasswordField(20);
		gbc.gridx = 1;
		panelContenido.add(campoPw, gbc);

		gbc.gridx = 0;
		gbc.gridy++;
		gbc.gridwidth = 2;
		panelContenido.add(new JLabel("Género:"), gbc);
		gbc.gridwidth = 1;
		gbc.gridy++;

		botonM = new JRadioButton("Masculino");
		botonF = new JRadioButton("Femenino");
		botonO = new JRadioButton("Otro");
		ButtonGroup grupoBotones = new ButtonGroup();
		grupoBotones.add(botonM);
		grupoBotones.add(botonF);
		grupoBotones.add(botonO);
		JPanel panelGenero = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panelGenero.add(botonM);
		panelGenero.add(botonF);
		panelGenero.add(botonO);
		gbc.gridx = 1;
		panelContenido.add(panelGenero, gbc);

		gbc.gridx = 0;
		gbc.gridy++;
		gbc.gridwidth = 2;
		panelContenido.add(new JLabel("Intereses:"), gbc);
		gbc.gridwidth = 1;
		gbc.gridy++;
		checkDeportes = new JCheckBox("Deportes");
		checkMusica = new JCheckBox("Música");
		checkViajes = new JCheckBox("Viajes");
		JPanel panelIntereses = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panelIntereses.add(checkDeportes);
		panelIntereses.add(checkMusica);
		panelIntereses.add(checkViajes);
		gbc.gridx = 1;
		panelContenido.add(panelIntereses, gbc);

		gbc.gridx = 0;
		gbc.gridy++;
		gbc.gridwidth = 2;
		panelContenido.add(new JLabel("Edad:"), gbc);
		gbc.gridy++;
		sliderEdad = new JSlider(0, 100, 25);
		sliderEdad.setMajorTickSpacing(25);
		sliderEdad.setMinorTickSpacing(5);
		sliderEdad.setPaintTicks(true);
		sliderEdad.setPaintLabels(true);
		gbc.gridx = 1;
		panelContenido.add(sliderEdad, gbc);

		gbc.gridx = 0;
		gbc.gridy++;
		gbc.gridwidth = 2;
		panelContenido.add(new JLabel("Comentarios:"), gbc);
		gbc.gridy++;
		areaComentarios = new JTextArea(5, 20);
		JScrollPane scrollArea = new JScrollPane(areaComentarios);
		gbc.gridx = 1;
		panelContenido.add(scrollArea, gbc);

		gbc.gridx = 0;
		gbc.gridy++;
		gbc.gridwidth = 2;
		JButton botonRegistrar = new JButton("Registrar");
		botonRegistrar.setAlignmentX(Component.CENTER_ALIGNMENT);
		gbc.anchor = GridBagConstraints.CENTER;
		panelContenido.add(botonRegistrar, gbc);

		add(panelPrincipal);

		nuevoItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				campoNombre.setText("");
				campoApellido.setText("");
				campoEmail.setText("");
				campoPw.setText("");
				grupoBotones.clearSelection();
				checkDeportes.setSelected(false);
				checkMusica.setSelected(false);
				checkViajes.setSelected(false);
				sliderEdad.setValue(25);
				areaComentarios.setText("");
			}
		});

		salirItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		acercaItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(VentanaFormulario.this,
						"DAM 1 IES Francisco de Goya.");
			}
		});

		exportarItem.addActionListener(new ExportarListener(this));
		cargarItem.addActionListener(new CargarListener(this));
		botonRegistrar.addActionListener(new RegistrarListener(this));

		setVisible(true);
		pack();
	}

	public JTextField getCampoNombre() {
		return campoNombre;
	}

	public JTextField getCampoEmail() {
		return campoEmail;
	}

	public JTextField getCampoApellido() {
		return campoApellido;
	}

	public JPasswordField getCampoPw() {
		return campoPw;
	}

	public JCheckBox getCheckDeportes() {
		return checkDeportes;
	}

	public JCheckBox getCheckViajes() {
		return checkViajes;
	}

	public JCheckBox getCheckMusica() {
		return checkMusica;
	}

	public JSlider getSliderEdad() {
		return sliderEdad;
	}

	public JTextArea getAreaComentarios() {
		return areaComentarios;
	}

	public JRadioButton getBotonM() {
		return botonM;
	}

	public JRadioButton getBotonF() {
		return botonF;
	}

	public JRadioButton getBotonO() {
		return botonO;
	}

}
