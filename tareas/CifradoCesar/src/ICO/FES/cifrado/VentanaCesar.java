/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ICO.FES.cifrado;

import ICO.FES.algoritmo.Cesar;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author luisyuyots
 */
public class VentanaCesar extends JFrame{
    private JTextField cuadroTexto;
    private JButton boton;
    private JLabel cifrado;
    
    //constructor por defecto 

    public VentanaCesar() throws HeadlessException {
        //definiendo titulo de la ventana emergente
        setTitle("Cifrado Cesar");
        setSize(800, 200);//Dimensiones de la ventana
        setLayout(new FlowLayout(FlowLayout.CENTER));
        cuadroTexto = new JTextField(10);
        
        boton = new JButton("Cifrar");
        boton.setBackground(Color.MAGENTA);//definiendo color al boton
        boton.setOpaque(true);
        boton.setToolTipText("Clic para cifrar");
        
        cifrado = new JLabel("Resultado");
        
        this.getContentPane().add(cuadroTexto);
        this.getContentPane().add(boton);
        this.getContentPane().add(cifrado);
        this.validate();
        
        this.setVisible(true);
        
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);//cerrando ventana
            }
        });
        
        this.boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
                String cifra = "";
                
                try {
                    Cesar cs = new Cesar();
                    cifrado.setText(cifra);
                    
                } catch (Exception ex) {
                    System.out.println(e.toString());
                    JOptionPane.showMessageDialog(null, "No introducir numeros", "Error de captura", JOptionPane.ERROR_MESSAGE);
                    
                }
            
            }
            
        });
        
        
    }
    
}
