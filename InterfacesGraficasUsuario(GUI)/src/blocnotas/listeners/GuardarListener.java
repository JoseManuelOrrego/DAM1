package blocnotas.listeners;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JTextArea;

public class GuardarListener extends PadreListener {
	
	public GuardarListener(JTextArea area) {
		super(area);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		PrintWriter out = null;
		try {
			out = new PrintWriter(getNombreFichero());
			out.println(getArea().getText());

		} catch (IOException ex) {
			System.out.println("IOExceptional escribir:" + ex.getMessage());
		} finally {
			if (out != null)
				out.close();
		}

	}

}
