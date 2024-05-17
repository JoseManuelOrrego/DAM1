package pruebas;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

@SuppressWarnings("serial")
public class VentanaSlider extends JFrame {

    public VentanaSlider() {
        super("Ejemplo Simple de JSlider");
        // Crear un JSlider con un rango de 0 a 100 y valor inicial de 50
        JSlider slider = new JSlider(0, 100, 50);

        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                System.out.println("Se ha interactuado con la barra.");
            }
        });

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(slider, BorderLayout.CENTER);

        getContentPane().add(panel, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        pack();

        setVisible(true);
    }

    public static void main(String[] args) {
        new VentanaSlider();
    }
}
