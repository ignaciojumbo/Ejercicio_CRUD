
package com.istl.vista;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class GestionPersona extends JFrame implements ActionListener{
    
    private JPanel panel = new JPanel();
    
    private JPanel PanelTitulo = new JPanel();
    private JPanel PanelCuerpo = new JPanel();
    private JPanel PanelButton = new JPanel();
            
    public GestionPersona(){
        //mostrar pantalla
        this.show();
        //titulo de la ventana
        this.setTitle("REGISTRO");
        //tmaño de la ventana
        this.setSize(450,250);
        //panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        
        //EL layout se encarga de ordenar o Distribuir los componentes
        
        panel.setLayout(new FlowLayout());        
        JLabel label = new JLabel("Registro de Usuarios.");
        
        PanelTitulo.add(label);
        panel.add(PanelTitulo);
        panel.add(label);
        
        
        
        PanelCuerpo.setLayout(new GridLayout(7,2));
        PanelCuerpo.add(new JLabel("Cédula"));
        PanelCuerpo.add(new JTextField("1105201527"));
        PanelCuerpo.add(new JLabel("Nombre"));
        PanelCuerpo.add(new JTextField("Ignacio"));
        PanelCuerpo.add(new JLabel("Apellido"));
        PanelCuerpo.add(new JTextField("Jumbo"));
        PanelCuerpo.add(new JLabel("Dirección"));
        PanelCuerpo.add(new JTextField("El plateado"));
        PanelCuerpo.add(new JLabel("Correo"));
        PanelCuerpo.add(new JTextField("ignaciojumbo@gmail.com"));
        PanelCuerpo.add(new JLabel("Teléfono"));
        PanelCuerpo.add(new JTextField("098092113"));
        panel.add(PanelCuerpo);
        
        PanelButton.setLayout(new FlowLayout(FlowLayout.CENTER));
        PanelButton.add(new JButton("Agregar"));
        PanelButton.add(new JButton("Editar"));
        PanelButton.add(new JButton("Eliminar"));
        PanelButton.add(new JButton("Ver registro"));
        
        panel.add(PanelButton);
        
        //Agrega el panel al JFrame
        this.add(panel);
        //Centrar la pantalla
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        //Cerrar o dar fin a la ventana
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }

   

        
}