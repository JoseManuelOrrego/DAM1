package calculadora;


import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class CalculadoraWindows extends JFrame {
	
	public CalculadoraWindows() {
		setTitle("Calculadora");
		setSize(300, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());	
		setLocationRelativeTo(null);
		setFocusable(true);
		
		JTextField campoOperacion = new JTextField();		
		campoOperacion.setEditable(false);
		campoOperacion.setHorizontalAlignment(JTextField.RIGHT);		
		
		JTextField campoPrincipal = new JTextField();
		campoPrincipal.setEditable(false);
		campoPrincipal.setHorizontalAlignment(JTextField.RIGHT);		
		
        JPanel panelCampos = new JPanel();
        panelCampos.setLayout(new GridLayout(2, 1));
        panelCampos.add(campoOperacion);
        panelCampos.add(campoPrincipal);        
        add(panelCampos, BorderLayout.NORTH); 
        
		ListenerBotones listenerBotones = new ListenerBotones(campoPrincipal);
		ListenerOperadores listenerOperadores = new ListenerOperadores(campoPrincipal,campoOperacion);
		
		JPanel panelBotones = new JPanel();
		panelBotones.setLayout(new GridLayout(4, 4));
		
		JButton[]botonesNumeros = new JButton[10];
		for (int i = 0; i < 10; i++) {
			botonesNumeros[i] = new JButton(String.valueOf(i));
			botonesNumeros[i].addActionListener(listenerBotones);	
			botonesNumeros[i].setFocusable(false);
		}
		
		JButton botonSumar = new JButton("+");
		JButton botonRestar = new JButton("-");
		JButton botonMultiplicar = new JButton("*");
		JButton botonDividir = new JButton("/");
		JButton botonIgual = new JButton("=");
		JButton botonC = new JButton("C");
		
		//esta parte es para que funcione el keylistener
		botonSumar.setFocusable(false);
		botonRestar.setFocusable(false);
		botonMultiplicar.setFocusable(false);
		botonDividir.setFocusable(false);
		botonIgual.setFocusable(false);
		botonC.setFocusable(false);
		
		botonSumar.addActionListener(listenerOperadores);
		botonRestar.addActionListener(listenerOperadores);
		botonMultiplicar.addActionListener(listenerOperadores);
		botonDividir.addActionListener(listenerOperadores);		
		botonIgual.addActionListener(listenerOperadores);
		
		botonC.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				campoOperacion.setText("");
				campoPrincipal.setText("");				
			}});
		
		panelBotones.add(botonesNumeros[7]);
		panelBotones.add(botonesNumeros[8]);
		panelBotones.add(botonesNumeros[9]);
		panelBotones.add(botonDividir);
		
		panelBotones.add(botonesNumeros[4]);
		panelBotones.add(botonesNumeros[5]);
		panelBotones.add(botonesNumeros[6]);
		panelBotones.add(botonMultiplicar);
		
		panelBotones.add(botonesNumeros[1]);
		panelBotones.add(botonesNumeros[2]);
		panelBotones.add(botonesNumeros[3]);
		panelBotones.add(botonSumar);	
		
		panelBotones.add(botonC);			
		panelBotones.add(botonesNumeros[0]);
		panelBotones.add(botonIgual);
		panelBotones.add(botonRestar);		
		
		add(panelBotones);
		addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
				String texto = campoPrincipal.getText();
				char pulsacion = e.getKeyChar();
				if (pulsacion >='0' && pulsacion <= '9') {
					campoPrincipal.setText(texto+e.getKeyChar());	
				}				
			}
			@Override
			public void keyPressed(KeyEvent e) {
			}

			@Override
			public void keyReleased(KeyEvent e) {
			}
		});
		
	}	

	public static void main(String[] args) {
		CalculadoraWindows calculadora = new CalculadoraWindows();
		calculadora.setVisible(true);
	}
}
