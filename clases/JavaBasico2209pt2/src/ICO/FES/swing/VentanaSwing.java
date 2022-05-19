/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ICO.FES.swing;

import ICO.FES.herencia.Persona;
import ICO.FES.modelo.ModeloPersonaCombo;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author luisyuyots
 */
public class VentanaSwing extends JFrame {
    private JTextField cuadro;
    private JButton boton;
    private JLabel resultado;
    private JComboBox<Persona> lista; 
//generando combobox, debemos importar a la clase deseada, en este caso es la clase persona
    private ModeloPersonaCombo modelo;

    public VentanaSwing() throws HeadlessException {
        setTitle("Conversion de °C a °F");//estableciendo titulo
        setSize(400, 300);//dimensiones de la aplicacion
        setLayout(new FlowLayout(FlowLayout.CENTER));
        cuadro = new JTextField(5);
        
        //icono
        ImageIcon icono = new ImageIcon( System.getProperty("user.dir")  + "/src/ico/fes/swing/carrito.png");
        
        boton = new JButton(icono);
        boton.setBackground(Color.GREEN);//cambia de color
        boton.setOpaque(true);
        boton.setToolTipText("Clic para convertir °F");//cuando selecionas el boton, sale un mensaje 
        resultado = new JLabel("°F");
        lista = new JComboBox();//generando atributo a la interfaz
        
        //agregando informacion al comboBox, esto se agrega al modelo
        /*lista.addItem("ingenieria");
        lista.addItem("derecho");
        lista.addItem("periodismo");
        lista.addItem("arquitectura");*/
        
        //ingresando elementos de la clase ModeloPersonaCombo a la interfaz grafica
        modelo = new ModeloPersonaCombo();
        modelo.consultarBaseDatos();//llamando al metodo de la clase ModeloPersona
        lista.setModel(modelo);//metemos los datos de modelo a la lista
        
        //empaquetando elementos a la interfaz grafica por swing
        this.getContentPane().add(cuadro);
        this.getContentPane().add(boton);
        this.getContentPane().add(resultado);
        this.getContentPane().add(lista);//agregando elemento combobox
        this.validate();
        this.setVisible(true);
        
        //evento para cerrar ventana
        this.addWindowListener( new WindowAdapter() {
            //windowClosing ctrl + space para que salga en las opciones
            @Override
            public void windowClosing(WindowEvent e) {//funcion para cerrar ventana
                System.exit(0);
            }
            
        });
        
        //evento para la conversion de grados
        this.boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                float gradosFarenheit = 0.0f;
                float celcius = 0.0f;
                try {
                    celcius = Float.parseFloat(cuadro.getText());
                    gradosFarenheit = (celcius * (9.0f/5.0f))+32.0f;
                    resultado.setText(gradosFarenheit + " °F");
                } catch (Exception ex) {
                    System.out.println(e.toString());
                    JOptionPane.showMessageDialog(null, "Introduce un valor numerico", "Error de captura", JOptionPane.ERROR_MESSAGE);
                }
            
            }
            
        });
    }
    
    
}
