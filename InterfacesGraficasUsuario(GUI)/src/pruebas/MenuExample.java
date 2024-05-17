package pruebas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class MenuExample extends JFrame{
	public MenuExample() {
		super("Prueba Menús");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);

        
        JMenuBar barraMenus = new JMenuBar();

        
        JMenu menuArchivo = new JMenu("Archivo");

       
        JMenuItem itemNuevo = new JMenuItem("Nuevo");
        JMenuItem itemAbrir = new JMenuItem("Abrir");
        JMenuItem itemGuardar = new JMenuItem("Guardar");
        JMenuItem itemSalir = new JMenuItem("Salir");

       
        menuArchivo.add(itemNuevo);
        menuArchivo.add(itemAbrir);
        menuArchivo.add(itemGuardar);
        menuArchivo.addSeparator(); 
        menuArchivo.add(itemSalir);

       
        JMenu menuAyuda = new JMenu("Ayuda");

       
        JMenuItem itemAcercaDe = new JMenuItem("Acerca de");

        
        menuAyuda.add(itemAcercaDe);

        
        barraMenus.add(menuArchivo);
        barraMenus.add(menuAyuda);

        
        setJMenuBar(barraMenus);

        
        itemNuevo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Nuevo seleccionado");
            }
        });

        itemAbrir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	System.out.println("Abrir seleccionado");
            }
        });

        itemGuardar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	System.out.println("Guardar seleccionado");
            }
        });

        itemSalir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	System.out.println("Saliendo");
                System.exit(0);
            }
        });

        itemAcercaDe.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	System.out.println("Acerca de seleccionado");
            }
        });

       setVisible(true);
       this.setLocationRelativeTo(null);
       }
	
    public static void main(String[] args) {
        new MenuExample();
    }
}