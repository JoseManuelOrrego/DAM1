package blocnotas.listeners;

import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JTextArea;

public class AbrirListener extends PadreListener{

	public AbrirListener(JTextArea area) {
		super(area);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		BufferedReader in = null;		
		try {
			in = new BufferedReader(new FileReader(getNombreFichero()));
			String linea;
			while ((linea = in.readLine()) != null) {
				getArea().append(linea+'\n');			
			}
		} catch (IOException ex) {
			System.out.println("IOExceptional leer: " + ex.getMessage());			
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException ex) {
					System.out.println("IOExceptional cerrar: " + ex.getMessage());
				}
			}
		}		
	}

}
