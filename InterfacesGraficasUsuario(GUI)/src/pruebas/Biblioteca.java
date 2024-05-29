package pruebas;

import java.awt.*;
import java.util.LinkedList;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class Biblioteca extends JFrame
{
	private LinkedList<Libro> lista;
	
	private JTextField campoISBN;
	private JTextField campoTitulo;
	private JTextField campoAutor;
	private JTextField campoGenero;
	
	public Biblioteca()
	{
		super("Biblioteca");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setSize(500,500);
		setLocationRelativeTo(null);
		
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(5,5,5,5);
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.anchor = GridBagConstraints.WEST;
		
		JPanel panelPrincipal = new JPanel(new BorderLayout());
		panelPrincipal.setBorder(new EmptyBorder(10, 10, 10, 10));

		JPanel panelContenido = new JPanel(new GridBagLayout());
		panelContenido.setBorder(new EmptyBorder(10, 10, 10, 10));
		panelPrincipal.add(panelContenido, BorderLayout.CENTER);
		
		JLabel etiquetaISBN = new JLabel("ISBN: ");
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.weightx = 1;
		panelPrincipal.add(etiquetaISBN, gbc);
		

		campoISBN = new JTextField();
		panelPrincipal.add(campoISBN,gbc);
		
		gbc.gridx = 0;
		gbc.gridy++;
		JLabel etiquetaTitulo = new JLabel("Titulo: ");
		panelPrincipal.add(etiquetaTitulo,gbc);
		
		add(panelPrincipal);

		pack();
	}
	
	public static void main(String[] args) 
	{
		new Biblioteca();
	}

}

class Libro
{
	private String titulo;
	private String autor;
	private String ISBN;
	private String genero;
	
	public Libro(String titulo,String autor,String ISBN,String genero)
	{
		this.titulo = titulo;
		this.autor = autor;
		this.ISBN = ISBN;
		this.genero = genero;
	}
}