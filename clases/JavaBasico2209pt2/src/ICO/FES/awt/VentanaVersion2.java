
package ICO.FES.awt;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author luisyuyots
 */
public class VentanaVersion2 extends Frame{
    private TextField cuadroTexto;
    private Button boton1;
    private Label etiqueta;
    private FlowLayout layout;

    //todo lo que se tiene que generar en nuestra interfaz grafica
    /*se lleva a acabo en nuestro constructor por defecto*/
    public VentanaVersion2() throws HeadlessException {
        this.setTitle("Ventana con eventos v2");
        this.setSize(400, 200);
        layout = new FlowLayout(FlowLayout.LEFT);
        //gerenando el Layout -> esto se debe generar antes
        //de todo de la interfaz grafica
        this.setLayout(layout);
        //generando el cuadro de texto
        cuadroTexto = new TextField(20);
        this.add(cuadroTexto);//agregando a la interfaz grafica
        boton1 = new Button("Presioname");
        this.add(boton1);//agregando boton a la interfaz grafica
        etiqueta = new Label("Texto inicial");
        this.add(etiqueta);
        
        //generando un MouseAdapter  en nuestro boton-> clase anonima
        this.boton1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //generando eventos en la interfaz grafica
                etiqueta.setText("Holi " + cuadroTexto.getText());
                System.out.println("Coordenadas x = " + e.getX());
                System.out.println("Coordenadas y = " + e.getY());
                System.out.println("Boton presionado: " + e.getButton());
                
            }
        });
        
        
        //gerando windows adapter para cerrar ventana
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);//funcion para que el boton se cierre
            }   
        });
        
        this.cuadroTexto.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                System.out.println(e.getKeyChar());
            }
            
        });
        
        this.setVisible(true);//funcion para ser visible la interfaz
    }
}
