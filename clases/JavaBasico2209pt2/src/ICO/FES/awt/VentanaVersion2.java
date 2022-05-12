/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ICO.FES.awt;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author luisyuyots
 */
public class VentanaVersion2 {
    private TextField cuadroTexto;
    private Button boton1;
    private Label etiqueta;
    private FlowLayout layout;

    public VentanaVersion2() throws HeadlessException {
        this.setTitle("Ventana con eventos v2");
        this.setSize(300,200);
        layout = new FlowLayout(FlowLayout.LEFT);
        this.setLayout(layout);
        cuadroTexto = new TextField(15);
        this.add(cuadroTexto);
        boton1 = new Button("Presioname");
        this.add(boton1);
        etiqueta = new Label("Texto Inicial");
        this.add(etiqueta);
        
        //Objeto anónimo
        this.boton1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                etiqueta.setText("Hola " + cuadroTexto.getText());
                System.out.println("Coordenadas x = " + e.getX());
                System.out.println("Coordenadas y = " + e.getY());
                System.out.println("Boton mencionado: " + e.getButton());
                
                
            }
            
        });
        
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
            
        });
        
        this.cuadroTexto.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                System.out.println(e.getKeyChar());
                System.out.println(e.getKeyCode());
                
                
            }
            
        });
        
        this.setVisible(true);
    }

    private void setTitle(String ventana_con_eventos_v2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setSize(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setLayout(FlowLayout layout) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void add(TextField cuadroTexto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void add(Button boton1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void add(Label etiqueta) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void addWindowListener(WindowAdapter windowAdapter) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
