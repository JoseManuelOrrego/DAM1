package pruebas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class VentanaRadioButton extends JFrame {

    public VentanaRadioButton() {
        super("Ejemplo Simple de JRadioButton");

        JRadioButton option1 = new JRadioButton("Opción 1");
        JRadioButton option2 = new JRadioButton("Opción 2");
        JRadioButton option3 = new JRadioButton("Opción 3");

        ButtonGroup group = new ButtonGroup();
        group.add(option1);
        group.add(option2);
        group.add(option3);

        JLabel seleccionada = new JLabel("Selecciona una opción");

        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JRadioButton seleccionado = (JRadioButton) e.getSource();
                seleccionada.setText("Seleccionado: " + seleccionado.getText());
                VentanaRadioButton.this.pack();
            }
        };
        
        option1.addActionListener(actionListener);
        option2.addActionListener(actionListener);
        option3.addActionListener(actionListener);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1));
        panel.add(option1);
        panel.add(option2);
        panel.add(option3);
        panel.add(seleccionada);

        getContentPane().add(panel, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        pack();

        setVisible(true);
    }

    public static void main(String[] args) {
       new VentanaRadioButton();
    }
}