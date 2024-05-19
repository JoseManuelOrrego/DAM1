package e0602;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

@SuppressWarnings("serial")
public class Adivino extends JFrame
{
	int numeroMin = 1;
	int numeroMay = 100;
	int numero = 50;
	
	JTextArea texto;
	
	ActionListener a1;
	ActionListener a2;
	ActionListener a3;
	
	public Adivino()
	{
		super("Adivino");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(500,500);
		
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		
		texto = new JTextArea("¿Es tu numero " + numero + "?");
		
		JButton boton1 = new JButton("Es menor");
		JButton boton2 = new JButton("Has acertado");
		JButton boton3 = new JButton("Es mayor");
		
		cp.add(texto);
		
		cp.add(boton3);
		cp.add(boton2);
		cp.add(boton1);
		
		setContentPane(cp);
		setLocationRelativeTo(null);
		
		inicializarAL();
		
		pack();
		
		boton1.addActionListener(a1);
		boton2.addActionListener(a2);
		boton3.addActionListener(a3);
	}
	
	public void inicializarAL()
	{
		a1 = new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				numeroMay = numero;
				numero -= (numeroMay-numeroMin)/2;
				texto.setText("¿Es tu numero " + numero + "?");
			}
		};

		
		a2 = new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				texto.setText("He acertado");
			}
		};
		
		a3 = new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				numeroMin = numero;
				numero += (numeroMay-numeroMin)/2;
				texto.setText("¿Es tu numero " + numero + "?");
			}
		};
	}
	
	
	public static void main(String[] args) 
	{
		new Adivino();
	}
}